package com.amazon.aps.iva.ys;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: SimpleActivityLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public class q implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        com.amazon.aps.iva.yb0.j.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }
}
