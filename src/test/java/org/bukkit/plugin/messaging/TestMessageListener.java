package org.bukkit.plugin.messaging;

import org.bukkit.entity.Player;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageListener implements PluginMessageListener {
    private final String channel;
    private final byte[] message;
    private boolean received = false;

    public TestMessageListener(String channel, byte[] message) {
        this.channel = channel;
        this.message = message;
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        assertEquals(this.channel, channel);
        assertArrayEquals(this.message, message);
        this.received = true;
    }

    public boolean hasReceived() {
        return received;
    }

    public void reset() {
        received = false;
    }
}
