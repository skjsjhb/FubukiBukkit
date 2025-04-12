package org.bukkit.event.player;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when the GameMode of the player is changed.
 */
public class PlayerGameModeChangeEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final GameMode newGameMode;
    private boolean cancelled;

    public PlayerGameModeChangeEvent(@NotNull final Player player, @NotNull final GameMode newGameMode) {
        super(player);
        this.newGameMode = newGameMode;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * Gets the GameMode the player is switched to.
     *
     * @return player's new GameMode
     */
    @NotNull
    public GameMode getNewGameMode() {
        return newGameMode;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
