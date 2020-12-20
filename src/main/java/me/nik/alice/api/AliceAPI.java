package me.nik.alice.api;

import me.nik.alice.api.enums.CheckType;
import org.bukkit.entity.Player;

public interface AliceAPI {

    /**
     * Gets a Player's Ping
     *
     * @param player the Player
     * @return The player's ping
     */
    int getPing(Player player);

    /**
     * Gets the Server's last TPS
     *
     * @return The server's last TPS
     */
    double getTPS();

    /**
     * Get if a player is currently bypassing
     *
     * @param player The player
     * @return Whether or not the player is bypassing
     */
    boolean isBypassing(Player player);

    /**
     * Punish a player
     *
     * @param player The player
     */
    void punish(String player, String reason);

    /**
     * Get if a player is temporarily bypassing
     *
     * @param player The player
     * @return Whether or not the player is temporarily bypassing
     */
    boolean isTempBypassing(Player player);

    /**
     * Give a player the permission to bypass
     * For a specific amount of seconds
     *
     * @param player  The player
     * @param seconds Seconds
     */
    void setTempBypass(Player player, long seconds);

    /**
     * Register a Punish Animation
     *
     * @param punishAnimation Punish Animation
     */
    void registerPunishAnimation(PunishAnimation punishAnimation);

    /**
     * Add violations to a Player for a specific Check
     *
     * The amount of Violations to add is the configured
     * VL Weight for the specified check.
     *
     * @param player The player to Flag
     * @param checkType The check to flag that player for
     * @param verbose The verbose message
     */
    void flag(Player player, CheckType checkType, String verbose);

    /**
     * Get the Violations of a Player for a specific Check
     *
     * @param player    The player to get the Violations from
     * @param checkType The check to get the Violations from
     * @return The player's Violations for that check
     */
    int getViolations(Player player, CheckType checkType);

    /**
     * Get the Violations of a Player for all Checks
     *
     * @param player The player to get the Violations from
     * @return The player's Violations
     */
    int getTotalViolations(Player player);
}