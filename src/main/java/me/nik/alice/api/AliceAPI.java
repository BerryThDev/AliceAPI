package me.nik.alice.api;

import org.bukkit.entity.Player;

public interface AliceAPI {

    /**
     * Make the player bypass internally without permissions for a few seconds
     *
     * @param player  The player
     * @param seconds The seconds to bypass
     */
    void setTempBypass(Player player, long seconds);

    /**
     * Gets the Server's last TPS
     *
     * @return The server's last TPS
     */
    double getTPS();

    /**
     * Get if a player is currently bypassing using permissions
     *
     * @param player The player
     * @return Whether or not the player is bypassing
     */
    boolean isBypassing(Player player);

    /**
     * Get if a player is temporarily bypassing without permissions
     *
     * @param player The player
     * @return Whether or not the player is temporarily bypassing
     */
    boolean isTempBypassing(Player player);

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
     *
     * @param player  The player to Flag
     * @param check   The check to flag that player for
     * @param verbose The verbose message
     */
    void flag(Player player, String check, String verbose);

    /**
     * Add violations to a Player for a specific Check and Type
     *
     * @param player  The player to Flag
     * @param check   The check to flag that player for
     * @param type    The check type to flag that player for
     * @param verbose The verbose message
     */
    void flag(Player player, String check, String type, String verbose);

    /**
     * Set the violations to a player for a specific Check and Type
     *
     * @param player The player
     * @param check  The check to set the violations
     * @param type   The check type to set the violations
     * @param vl     The violations to set
     */
    void setViolations(Player player, String check, String type, int vl);

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

    /**
     * Get the Violations of a Player for all combat checks
     *
     * @param player The player to get the Violations from
     * @return The player's Violations
     */
    int getCombatViolations(Player player);

    /**
     * Get the Violations of a Player for all movement checks
     *
     * @param player The player to get the Violations from
     * @return The player's Violations
     */
    int getMovementViolations(Player player);

    /**
     * Get the Violations of a Player for all world checks
     *
     * @param player The player to get the Violations from
     * @return The player's Violations
     */
    int getWorldViolations(Player player);

    /**
     * Set the server name that Alice is going to use for Discord Notifications or player logs
     * Internally
     * <p>
     * (NOTE: This is also going to reload the whole plugin)
     *
     * @param name The server name
     */
    void setServerName(String name);
}