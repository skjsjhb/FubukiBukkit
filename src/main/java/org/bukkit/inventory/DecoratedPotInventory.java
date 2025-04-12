package org.bukkit.inventory;

import org.bukkit.block.DecoratedPot;
import org.jetbrains.annotations.Nullable;

/**
 * Interface to the inventory of a DecoratedPot.
 */
public interface DecoratedPotInventory extends Inventory {

    /**
     * Get the item stack in the decorated pot.
     *
     * @return the current item stack
     */
    @Nullable
    public ItemStack getItem();

    /**
     * Set the item stack in the decorated pot.
     *
     * @param item the new item stack
     */
    public void setItem(@Nullable ItemStack item);

    @Nullable
    @Override
    public DecoratedPot getHolder();
}
