package com.cucumber.practise.config;

public class ConfigSetup {

    public void getPropertyFile(){
        System.getProperty("user.dir");
    }
    public static String getUsername() {
        return System.getProperty("USERNAME_PARAM", "defaultUser");
    }
    public static String getPassword() {
        return System.getProperty("PASSWORD_PARAM", "defaultPass");
    }
}
