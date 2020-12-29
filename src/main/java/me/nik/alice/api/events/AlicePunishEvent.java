package me.nik.alice.api.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class AlicePunishEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final OfflinePlayer player;
    private final String from;
    private final String reason;

    public AlicePunishEvent(OfflinePlayer player, String from, String reason) {
        this.player = player;
        this.from = from;
        this.reason = reason;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return The player involved in this event
     */
    public OfflinePlayer getPlayer() {
        return player;
    }

    /**
     * @return The punisher
     */
    public String getFrom() {
        return from;
    }

    /**
     * @return The reason
     */
    public String getReason() {
        return reason;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}