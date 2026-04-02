package com.amazon.aps.iva.y60;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.k2.j;
/* compiled from: UserActivityLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public final j b = new j(new r());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
        j jVar = this.b;
        if (((b) jVar.b) != null) {
            jVar.c = activity.getClass().getSimpleName();
            View decorView = activity.getWindow().getDecorView();
            com.amazon.aps.iva.yb0.j.e(decorView, "activity.window.decorView");
            com.amazon.aps.iva.p3.e eVar = new com.amazon.aps.iva.p3.e(activity, new a(jVar, decorView));
            Window.Callback callback = activity.getWindow().getCallback();
            if (callback instanceof e) {
                ((e) callback).c = eVar;
            } else {
                activity.getWindow().setCallback(new e(callback, eVar));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        e eVar;
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        Window.Callback callback = activity.getWindow().getCallback();
        if (callback instanceof e) {
            eVar = (e) callback;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.c = null;
        }
    }
}
