package me.nik.alice.api;

public class AliceAPIProvider {
    private static AliceAPI aliceAPI = null;

    public AliceAPIProvider() {
    }

    public static AliceAPI getAPI() {
        return aliceAPI;
    }

    /**
     * Internal use by Alice only!
     *
     * @param api AliceAPI
     */
    @Deprecated
    public static void register(AliceAPI api) {
        aliceAPI = api;
    }
}