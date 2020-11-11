package me.nik.alice.api;

public class AliceAPIProvider {
    private static AliceAPI API = null;

    public AliceAPIProvider() {
    }

    public static AliceAPI getAPI() {
        return API;
    }

    /**
     * Internal use by Alice only!
     *
     * @param api AliceAPI
     */
    @Deprecated
    public static void register(AliceAPI api) {
        API = api;
    }
}