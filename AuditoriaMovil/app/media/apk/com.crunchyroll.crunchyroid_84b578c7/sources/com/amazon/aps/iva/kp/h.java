package com.amazon.aps.iva.kp;

import com.google.android.gms.cast.framework.media.NotificationOptions;
/* compiled from: UploadFrequency.kt */
/* loaded from: classes2.dex */
public enum h {
    FREQUENT(1000),
    AVERAGE(5000),
    RARE(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
    
    private final long baseStepMs;

    h(long j) {
        this.baseStepMs = j;
    }

    public final long getBaseStepMs$dd_sdk_android_release() {
        return this.baseStepMs;
    }
}
