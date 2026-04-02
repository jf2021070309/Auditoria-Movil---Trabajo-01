package com.amazon.aps.iva.x60;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.h;
import androidx.fragment.app.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x60.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: TrackActivityLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public final l<String, q> b;
    public final b c = new b();
    public final e d;

    public d(a.b bVar, a.c cVar) {
        this.b = bVar;
        this.d = new e(cVar);
    }

    public final void a(String str) {
        boolean z;
        b bVar = this.c;
        bVar.getClass();
        StringBuilder sb = bVar.a;
        if (sb.length() > 2) {
            if (!j.a("paused", str) && !j.a("resumed", str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (sb.charAt(sb.length() - 2) == '(') {
                    sb.insert(com.amazon.aps.iva.oe0.q.n0(sb), str);
                } else {
                    sb.insert(com.amazon.aps.iva.oe0.q.n0(sb), "|".concat(str));
                }
            }
        }
        String sb2 = sb.toString();
        j.e(sb2, "activityList.toString()");
        this.b.invoke(sb2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        String e;
        j.f(activity, "activity");
        b bVar = this.c;
        bVar.getClass();
        StringBuilder sb = bVar.a;
        if (sb.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e = com.amazon.aps.iva.c80.a.f(activity.getComponentName().getClassName(), "()");
        } else {
            e = defpackage.e.e(",", activity.getComponentName().getClassName(), "()");
        }
        sb.append(e);
        String sb2 = sb.toString();
        j.e(sb2, "activityList.toString()");
        this.b.invoke(sb2);
        if (activity instanceof h) {
            ((h) activity).getSupportFragmentManager().n.a.add(new l.a(this.d, true));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j.f(activity, "activity");
        if (activity instanceof h) {
            ((h) activity).getSupportFragmentManager().h0(this.d);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
        a("paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j.f(activity, "activity");
        a("resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        j.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j.f(activity, "activity");
    }
}
