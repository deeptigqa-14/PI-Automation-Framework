package com.verifypolicy.framework.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private final Properties properties;

    public ConfigReader() {
        properties = new Properties();
        String configFilePath = "config/qa.properties"; // can be updated for different environments
        try(var inputStream = getClass().getClassLoader().getResourceAsStream(configFilePath)) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new RuntimeException("Configuration file not found: " + configFilePath);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file: " + configFilePath, e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getBaseUrl() {
        return properties.getProperty("base.url");
    }

    public String getEnvironmentId() {
        return properties.getProperty("environment.id");
    }

    public String getAuthToken() {
        return properties.getProperty("auth.token");
    }

    public String getAuthUrl(){
        return properties.getProperty("auth.url");
    }
    public String getClientId() {
        return properties.getProperty("client.id");
    }
    public String getClientSecret() {
        return properties.getProperty("client.secret");
    }

    public String GetPIAdminConsoleUrl() {
        return properties.getProperty("admin.console.url");
    }

}
