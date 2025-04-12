package org.bukkit.event.player;

import org.bukkit.Warning;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * Used to format chat for chat preview. If this event is used, then the result
 * of the corresponding {@link AsyncPlayerChatEvent} <b>must</b> be formatted in
 * the same way.
 *
 * @deprecated chat previews have been removed
 */
@Deprecated(since = "1.19.1")
@Warning(false)
public class AsyncPlayerChatPreviewEvent extends AsyncPlayerChatEvent {

    private static final HandlerList handlers = new HandlerList();

    public AsyncPlayerChatPreviewEvent(final boolean async, @NotNull final Player who, @NotNull final String message, @NotNull final Set<Player> players) {
        super(async, who, message, players);
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
