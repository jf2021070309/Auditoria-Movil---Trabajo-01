package com.amazon.aps.iva.qq;
/* compiled from: Feature.kt */
/* loaded from: classes2.dex */
public enum d {
    LOG("Logging"),
    CRASH("Crash Reporting"),
    TRACE("Tracing"),
    RUM("RUM");
    
    private final String featureName;

    d(String str) {
        this.featureName = str;
    }

    public final String getFeatureName$dd_sdk_android_release() {
        return this.featureName;
    }
}
