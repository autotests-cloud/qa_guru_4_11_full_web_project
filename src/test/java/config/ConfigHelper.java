package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    public static String getGoogleUsername() {
        return getAuthorizationConfig().googleUsername();
    }

    public static String getGooglePassword() {
        return getAuthorizationConfig().googlePassword();
    }

    private static AuthorizationConfig getAuthorizationConfig() {
        return ConfigFactory.newInstance().create(
                AuthorizationConfig.class, System.getProperties());
    }
}
