package me.nik.alice.api.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class AliceViolationEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final String checkName;
    private final String description;
    private final String type;
    private final String information;
    private final int vl;
    private final int totalVl;
    private final double buffer;
    private final boolean experimental;
    private boolean cancel = false;

    /**
     * This event will not always be called Async, So beware.
     */
    public AliceViolationEvent(Player player, String checkName, String description, String type, String information, int vl, int totalVl, double buffer, boolean experimental) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
        this.checkName = checkName;
        this.description = description;
        this.type = type;
        this.information = information;
        this.vl = vl;
        this.totalVl = totalVl;
        this.buffer = buffer;
        this.experimental = experimental;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @return The check included in this event
     */
    public String getCheck() {
        return checkName;
    }

    /**
     * @return The check's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return The type of the check included in this event
     */
    public String getType() {
        return type;
    }

    /**
     * @return The violations added in this event
     */
    public int getVl() {
        return vl;
    }

    /**
     * @return The total violations
     */
    public int getTotalVl() {
        return totalVl;
    }

    /**
     * @return The player's buffer
     */
    public double getBuffer() {
        return buffer;
    }

    /**
     * @return The information of why the player failed this check
     */
    public String getInformation() {
        return information;
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

    public boolean isExperimental() {
        return experimental;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}