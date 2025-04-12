package org.bukkit;

import com.google.common.collect.Maps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.Map;

/**
 * Represents various types of worlds that may exist
 */
public enum WorldType {
    NORMAL("DEFAULT"),
    FLAT("FLAT"),
    LARGE_BIOMES("LARGEBIOMES"),
    AMPLIFIED("AMPLIFIED");

    private static final Map<String, WorldType> BY_NAME = Maps.newHashMap();

    static {
        for (WorldType type : values()) {
            BY_NAME.put(type.name, type);
        }
    }

    private final String name;

    private WorldType(/*@NotNull*/ String name) {
        this.name = name;
    }

    /**
     * Gets a WorldType by its name
     *
     * @param name Name of the WorldType to get
     * @return Requested WorldType, or null if not found
     */
    @Nullable
    public static WorldType getByName(@NotNull String name) {
        return BY_NAME.get(name.toUpperCase(Locale.ROOT));
    }

    /**
     * Gets the name of this WorldType
     *
     * @return Name of this type
     */
    @NotNull
    public String getName() {
        return name;
    }
}
