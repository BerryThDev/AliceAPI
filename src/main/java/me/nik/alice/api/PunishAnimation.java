package me.nik.alice.api;

import org.bukkit.entity.Player;

public abstract class PunishAnimation {

    private final String name;

    public PunishAnimation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(Player player, String command);
}