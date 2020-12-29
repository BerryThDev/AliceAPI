package me.nik.alice.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Collection;

public final class AlicePunishWaveEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Collection<String> punishedPlayers;

    public AlicePunishWaveEvent(Collection<String> punishedPlayers) {
        this.punishedPlayers = punishedPlayers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public Collection<String> getPunishedPlayers() {
        return punishedPlayers;
    }
}