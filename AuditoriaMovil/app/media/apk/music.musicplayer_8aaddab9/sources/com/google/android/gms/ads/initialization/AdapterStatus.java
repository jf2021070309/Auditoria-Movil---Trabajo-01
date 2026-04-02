package com.google.android.gms.ads.initialization;

import androidx.annotation.RecentlyNonNull;
/* loaded from: classes.dex */
public interface AdapterStatus {

    /* loaded from: classes.dex */
    public enum State {
        NOT_READY,
        READY
    }

    @RecentlyNonNull
    String getDescription();

    @RecentlyNonNull
    State getInitializationState();

    int getLatency();
}
