package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a bell is being rung.
 */
public class BellRingEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final BlockFace direction;
    private final Entity entity;
    private boolean cancelled;

    public BellRingEvent(@NotNull Block theBlock, @NotNull BlockFace direction, @Nullable Entity entity) {
        super(theBlock);
        this.direction = direction;
        this.entity = entity;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * Get the direction in which the bell was rung.
     *
     * @return the direction
     */
    @NotNull
    public BlockFace getDirection() {
        return direction;
    }

    /**
     * Get the {@link Entity} that rang the bell (if there was one).
     *
     * @return the entity
     */
    @Nullable
    public Entity getEntity() {
        return entity;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
