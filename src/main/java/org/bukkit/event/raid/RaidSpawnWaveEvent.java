package org.bukkit.event.raid;

import org.bukkit.Raid;
import org.bukkit.World;
import org.bukkit.entity.Raider;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * Called when a raid wave spawns.
 */
public class RaidSpawnWaveEvent extends RaidEvent {

    private static final HandlerList handlers = new HandlerList();
    //
    private final List<Raider> raiders;
    private final Raider leader;

    public RaidSpawnWaveEvent(@NotNull Raid raid, @NotNull World world, @Nullable Raider leader, @NotNull List<Raider> raiders) {
        super(raid, world);
        this.raiders = raiders;
        this.leader = leader;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * Returns the patrol leader.
     *
     * @return {@link Raider}
     */
    @Nullable
    public Raider getPatrolLeader() {
        return leader;
    }

    /**
     * Returns all {@link Raider} that spawned in this wave.
     *
     * @return an immutable list of raiders
     */
    @NotNull
    public List<Raider> getRaiders() {
        return Collections.unmodifiableList(raiders);
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
