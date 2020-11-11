package me.nik.alice.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final String check;
    private final int vl;

    public PlayerViolationEvent(Player player, String check, int vl) {
        this.player = player;
        this.check = check;
        this.vl = vl;
    }

    /**
     * @return The check included in this event
     */
    public String getCheck() {
        return check;
    }

    /**
     * @return The violations added in this event
     */
    public int getVl() {
        return vl;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return The player involved in this event
     */
    public Player getPlayer() {
        return player;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}