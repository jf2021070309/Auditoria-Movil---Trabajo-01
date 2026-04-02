package com.amazon.aps.iva.gr;

import android.app.Activity;
import androidx.fragment.app.Fragment;
/* compiled from: FragmentViewTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class k extends d implements q {
    public final f<Fragment> c;
    public final f<android.app.Fragment> d;
    public final boolean b = true;
    public final com.amazon.aps.iva.kb0.m e = com.amazon.aps.iva.kb0.f.b(new h(this));
    public final com.amazon.aps.iva.kb0.m f = com.amazon.aps.iva.kb0.f.b(new j(this));

    public k(f fVar, f fVar2) {
        this.c = fVar;
        this.d = fVar2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!com.amazon.aps.iva.yb0.j.a(k.class, cls)) {
            return false;
        }
        if (obj != null) {
            k kVar = (k) obj;
            if (this.b == kVar.b && com.amazon.aps.iva.yb0.j.a(this.c, kVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, kVar.d)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.tracking.FragmentViewTrackingStrategy");
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (Boolean.hashCode(this.b) * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (androidx.fragment.app.h.class.isAssignableFrom(activity.getClass())) {
            ((com.amazon.aps.iva.dr.b) this.e.getValue()).a((androidx.fragment.app.h) activity);
        } else {
            ((com.amazon.aps.iva.dr.b) this.f.getValue()).a(activity);
        }
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (androidx.fragment.app.h.class.isAssignableFrom(activity.getClass())) {
            ((com.amazon.aps.iva.dr.b) this.e.getValue()).b((androidx.fragment.app.h) activity);
        } else {
            ((com.amazon.aps.iva.dr.b) this.f.getValue()).b(activity);
        }
    }
}
