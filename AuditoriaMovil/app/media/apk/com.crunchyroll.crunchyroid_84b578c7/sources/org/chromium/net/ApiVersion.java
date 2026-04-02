package org.chromium.net;
/* loaded from: classes4.dex */
public class ApiVersion {
    private static final int API_LEVEL = 14;
    private static final String CRONET_VERSION = "98.0.4758.101";
    private static final String LAST_CHANGE = "9883bca270e5c0fdf116b98ce040ce741100a171-refs/branch-heads/4758@{#1144}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "98.0.4758.101@9883bca2";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 14;
    }
}
