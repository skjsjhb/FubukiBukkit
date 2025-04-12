package org.bukkit.entity;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Represents a dropped item.
 */
public interface Item extends Entity {

    /**
     * Gets the item stack associated with this item drop.
     *
     * @return An item stack.
     */
    @NotNull
    public ItemStack getItemStack();

    /**
     * Sets the item stack associated with this item drop.
     *
     * @param stack An item stack.
     */
    public void setItemStack(@NotNull ItemStack stack);

    /**
     * Gets the delay before this Item is available to be picked up by players
     *
     * @return Remaining delay
     */
    public int getPickupDelay();

    /**
     * Sets the delay before this Item is available to be picked up by players
     *
     * @param delay New delay
     */
    public void setPickupDelay(int delay);

    /**
     * Gets if this Item lives forever
     *
     * @return true if the lifetime is unlimited
     */
    public boolean isUnlimitedLifetime();

    /**
     * Sets if this Item should live forever
     *
     * @param unlimited true if the lifetime is unlimited
     */
    public void setUnlimitedLifetime(boolean unlimited);

    /**
     * Get the owner of this item.
     *
     * @return UUID of owner
     */
    @Nullable
    public UUID getOwner();

    /**
     * Sets the owner of this item.
     * <p>
     * Other entities will not be able to pickup this item when an owner is set.
     *
     * @param owner UUID of new owner
     */
    public void setOwner(@Nullable UUID owner);

    /**
     * Get the thrower of this item.
     * <p>
     * The thrower is the entity which dropped the item.
     *
     * @return UUID of thrower
     */
    @Nullable
    public UUID getThrower();

    /**
     * Set the thrower of this item.
     * <p>
     * The thrower is the entity which dropped the item. This affects the
     * trigger criteria for item pickups, for things such as advancements.
     *
     * @param uuid UUID of thrower
     */
    public void setThrower(@Nullable UUID uuid);
}
