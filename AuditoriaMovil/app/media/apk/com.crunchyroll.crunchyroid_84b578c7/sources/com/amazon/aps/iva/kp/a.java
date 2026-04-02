package com.amazon.aps.iva.kp;
/* compiled from: BatchSize.kt */
/* loaded from: classes2.dex */
public enum a {
    SMALL(5000),
    MEDIUM(15000),
    LARGE(60000);
    
    private final long windowDurationMs;

    a(long j) {
        this.windowDurationMs = j;
    }

    public final long getWindowDurationMs$dd_sdk_android_release() {
        return this.windowDurationMs;
    }
}
