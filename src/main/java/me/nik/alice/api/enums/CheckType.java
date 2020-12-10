package me.nik.alice.api.enums;

public enum CheckType {
    AIMBOT("Aimbot"),
    AUTOCLICKER("AutoClicker"),
    BADPACKETS("BadPackets"),
    CRITICALS("Criticals"),
    FLY("Fly"),
    AUTOFISH("AutoFish"),
    KILLAURA("KillAura"),
    SCAFFOLD("Scaffold"),
    SPEED("Speed"),
    MOTION("Motion"),
    NOFALL("NoFall"),
    PHASE("Phase"),
    JESUS("Jesus"),
    FASTBOW("FastBow"),
    PLAYERESP("PlayerESP"),
    VEHICLE("Vehicle"),
    ELYTRA("Elytra"),
    FASTEAT("FastEat"),
    FASTREGEN("FastRegen"),
    REACH("Reach"),
    VELOCITY("Velocity"),
    INVENTORY("Inventory"),
    INTERACT("Interact"),
    XRAY("XRay"),
    HITBOX("Hitbox");

    private final String checkName;

    CheckType(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckName() {
        return checkName;
    }
}