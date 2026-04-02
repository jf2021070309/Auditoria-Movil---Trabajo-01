package com.sdk.ksdk.util;
/* loaded from: classes3.dex */
public class AllAdConfig {
    private GroAdConfig groAdConfig;
    private int looperTime = 90;

    public AllAdConfig(GroAdConfig groAdConfig) {
        this.groAdConfig = groAdConfig;
    }

    public void setLooperTime(int looperTime) {
        this.looperTime = looperTime;
    }

    public GroAdConfig getGromoreAdConfig() {
        return this.groAdConfig;
    }

    public int getLooperTime() {
        return this.looperTime;
    }
}
