package org.bukkit.inventory;

import org.bukkit.Keyed;

/**
 * Represents a complex recipe which has imperative server-defined behavior, eg
 * armor dyeing.
 * <p>
 * Note: Since a complex recipe has dynamic outputs, {@link #getResult()} will
 * sometimes return an AIR ItemStack.
 */
public interface ComplexRecipe extends Recipe, Keyed {
}
