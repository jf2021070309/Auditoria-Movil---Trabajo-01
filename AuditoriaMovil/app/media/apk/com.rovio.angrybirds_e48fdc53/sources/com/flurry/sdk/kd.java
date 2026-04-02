package com.flurry.sdk;

import android.app.Activity;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class kd extends ki {
    public WeakReference<Activity> a;
    public a b;

    /* loaded from: classes2.dex */
    public enum a {
        kCreated,
        kDestroyed,
        kPaused,
        kResumed,
        kStarted,
        kStopped,
        kSaveState
    }

    public kd() {
        super("com.flurry.android.sdk.ActivityLifecycleEvent");
        this.a = new WeakReference<>(null);
    }
}
