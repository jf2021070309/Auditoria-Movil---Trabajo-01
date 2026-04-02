package com.fyber.inneractive.sdk.config;
/* loaded from: classes.dex */
public final class f {
    static {
        System.setProperty("ia.testEnvironmentConfiguration.removeInClose", "true");
    }

    public static String a() {
        return System.getProperty("ia.testEnvironmentConfiguration.name");
    }

    public static String b() {
        return System.getProperty("ia.testEnvironmentConfiguration.logger");
    }

    public static String c() {
        return System.getProperty("ia.testEnvironmentConfiguration.number");
    }

    public static String d() {
        return System.getProperty("ia.testEnvironmentConfiguration.device");
    }

    public static String e() {
        return System.getProperty("ia.testEnvironmentConfiguration.response");
    }

    public static String f() {
        return System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
    }

    public static String g() {
        return System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
    }

    public static String h() {
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }

    public static String i() {
        return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }

    public static Boolean j() {
        return Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false)));
    }

    public static String k() {
        return System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
    }
}
