package com.amazon.aps.iva.x50;

import android.app.Activity;
import androidx.lifecycle.g;
import com.amazon.aps.iva.yb0.e0;
/* compiled from: CurrentActivityProvider.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.ys.q implements e {
    public Activity b;
    public final com.amazon.aps.iva.i5.v<Activity> c = new com.amazon.aps.iva.i5.v<>();
    public com.amazon.aps.iva.fc0.d<? extends Activity> d;

    @Override // com.amazon.aps.iva.x50.e
    public final Activity a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.x50.e
    public final boolean b() {
        com.amazon.aps.iva.i5.o oVar;
        boolean z;
        androidx.lifecycle.g lifecycle;
        g.b currentState;
        Activity activity = this.b;
        if (activity == null) {
            return false;
        }
        if (activity instanceof com.amazon.aps.iva.i5.o) {
            oVar = (com.amazon.aps.iva.i5.o) activity;
        } else {
            oVar = null;
        }
        if (oVar != null && (lifecycle = oVar.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null) {
            z = currentState.isAtLeast(g.b.RESUMED);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x50.e
    public final com.amazon.aps.iva.i5.v c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.x50.e
    public final com.amazon.aps.iva.fc0.d<? extends Activity> d() {
        return this.d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b = null;
        this.c.k(null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b = activity;
        this.c.k(activity);
        this.d = e0.a(activity.getClass());
    }
}
