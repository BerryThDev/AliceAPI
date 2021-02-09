package me.nik.alice.api;

import org.bukkit.entity.Player;

public interface AliceAPI {

    /**
     * Make the player bypass internally without permissions
     *
     * @param player The player
     */
    void setBypassing(Player player);

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
     * Send an alert to the Online Admins
     *
     * @param message The message
     */
    void sendAlert(String message);

    /**
     * Register a Punish Animation
     *
     * @param punishAnimation Punish Animation
     */
    void registerPunishAnimation(PunishAnimation punishAnimation);

    /**
     * Add violations to a Player for a specific Check
     * <p>
     * The amount of Violations to add is the configured
     * VL Weight for the specified check.
     *
     * @param player  The player to Flag
     * @param check   The check to flag that player for
     * @param verbose The verbose message
     */
    void flag(Player player, String check, String verbose);

    /**
     * Add violations to a Player for a specific Check and Type
     * <p>
     * The amount of Violations to add is the configured
     * VL Weight for the specified check.
     *
     * @param player  The player to Flag
     * @param check   The check to flag that player for
     * @param type    The check type to flag that player for
     * @param verbose The verbose message
     */
    void flag(Player player, String check, String type, String verbose);

    /**
     * Get the Violations of a Player for a specific Check
     *
     * @param player The player to get the Violations from
     * @param check  The check to get the Violations from
     * @return The player's Violations for that check
     */
    int getViolations(Player player, String check);

    /**
     * Get the Violations of a Player for all Checks
     *
     * @param player The player to get the Violations from
     * @return The player's Violations
     */
    int getTotalViolations(Player player);
}