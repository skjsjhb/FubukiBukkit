package org.bukkit;

import org.junit.jupiter.api.Test;

import static org.bukkit.support.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class EffectTest {
    @Test
    public void getById() {
        for (Effect effect : Effect.values()) {
            assertThat(Effect.getById(effect.getId()), is(effect));
        }
    }
}
