package com.kwad.sdk.api.core.lifecycle;

import android.arch.lifecycle.LifecycleObserver;
/* loaded from: classes.dex */
public class KsLifecycleObserver {
    LifecycleObserver mBase;

    public LifecycleObserver getBase() {
        return this.mBase;
    }

    public void setBase(LifecycleObserver lifecycleObserver) {
        this.mBase = lifecycleObserver;
    }
}
