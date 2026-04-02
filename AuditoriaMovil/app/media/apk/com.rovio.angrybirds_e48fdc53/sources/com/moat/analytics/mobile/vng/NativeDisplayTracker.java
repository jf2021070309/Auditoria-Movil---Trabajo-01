package com.moat.analytics.mobile.vng;

import android.app.Activity;
/* loaded from: classes2.dex */
public interface NativeDisplayTracker {

    /* loaded from: classes2.dex */
    public enum MoatUserInteractionType {
        TOUCH,
        CLICK
    }

    void reportUserInteractionEvent(MoatUserInteractionType moatUserInteractionType);

    @Deprecated
    void setActivity(Activity activity);

    void startTracking();

    void stopTracking();
}
