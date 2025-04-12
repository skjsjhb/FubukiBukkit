package org.bukkit.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Sent when an entity's swimming status is toggled.
 */
public class EntityToggleSwimEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final boolean isSwimming;
    private boolean cancel = false;

    public EntityToggleSwimEvent(@NotNull LivingEntity who, final boolean isSwimming) {
        super(who);
        this.isSwimming = isSwimming;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Returns true if the entity is now swims or
     * false if the entity stops swimming.
     *
     * @return new swimming state
     */
    public boolean isSwimming() {
        return isSwimming;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
