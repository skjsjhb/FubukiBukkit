package org.bukkit.event.server;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * Event triggered for server broadcast messages such as from
 * {@link org.bukkit.Server#broadcast(String, String)}.
 *
 * <b>This event behaves similarly to {@link AsyncPlayerChatEvent} in that it
 * should be async if fired from an async thread. Please see that event for
 * further information.</b>
 */
public class BroadcastMessageEvent extends ServerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Set<CommandSender> recipients;
    private String message;
    private boolean cancelled = false;

    @Deprecated(since = "1.14")
    public BroadcastMessageEvent(@NotNull String message, @NotNull Set<CommandSender> recipients) {
        this(false, message, recipients);
    }

    public BroadcastMessageEvent(boolean isAsync, @NotNull String message, @NotNull Set<CommandSender> recipients) {
        super(isAsync);
        this.message = message;
        this.recipients = recipients;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * Get the message to broadcast.
     *
     * @return Message to broadcast
     */
    @NotNull
    public String getMessage() {
        return message;
    }

    /**
     * Set the message to broadcast.
     *
     * @param message New message to broadcast
     */
    public void setMessage(@NotNull String message) {
        this.message = message;
    }

    /**
     * Gets a set of recipients that this chat message will be displayed to.
     * <p>
     * The set returned is not guaranteed to be mutable and may auto-populate
     * on access. Any listener accessing the returned set should be aware that
     * it may reduce performance for a lazy set implementation.
     * <p>
     * Listeners should be aware that modifying the list may throw {@link
     * UnsupportedOperationException} if the event caller provides an
     * unmodifiable set.
     *
     * @return All CommandSenders who will see this chat message
     */
    @NotNull
    public Set<CommandSender> getRecipients() {
        return recipients;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
