package org.bukkit;

import org.bukkit.support.AbstractTestingBase;
import org.junit.jupiter.api.Test;

import static org.bukkit.support.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class InstrumentTest extends AbstractTestingBase {
    @Test
    public void getByType() {
        for (Instrument instrument : Instrument.values()) {
            if (instrument.getType() < 0) {
                continue;
            }

            assertThat(Instrument.getByType(instrument.getType()), is(instrument));
        }
    }
}
