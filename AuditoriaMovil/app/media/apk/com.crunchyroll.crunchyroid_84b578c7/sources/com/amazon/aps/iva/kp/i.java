package com.amazon.aps.iva.kp;
/* compiled from: VitalsUpdateFrequency.kt */
/* loaded from: classes2.dex */
public enum i {
    FREQUENT(100),
    AVERAGE(500),
    RARE(1000),
    NEVER(0);
    
    private final long periodInMs;

    i(long j) {
        this.periodInMs = j;
    }

    public final long getPeriodInMs$dd_sdk_android_release() {
        return this.periodInMs;
    }
}
