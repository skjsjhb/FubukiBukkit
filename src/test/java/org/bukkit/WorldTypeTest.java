package org.bukkit;

import org.junit.jupiter.api.Test;

import static org.bukkit.support.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class WorldTypeTest {
    @Test
    public void getByName() {
        for (WorldType worldType : WorldType.values()) {
            assertThat(WorldType.getByName(worldType.getName()), is(worldType));
        }
    }
}
