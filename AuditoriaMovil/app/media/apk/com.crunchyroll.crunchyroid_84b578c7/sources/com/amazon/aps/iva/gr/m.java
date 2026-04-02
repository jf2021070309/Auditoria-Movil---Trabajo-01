package com.amazon.aps.iva.gr;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: MixedViewTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class m extends d implements q {
    public final e b;
    public final k c;

    public m() {
        throw null;
    }

    public m(com.amazon.aps.iva.bg.a aVar) {
        a aVar2 = new a();
        b bVar = new b();
        e eVar = new e(true, aVar2);
        k kVar = new k(aVar, bVar);
        this.b = eVar;
        this.c = kVar;
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
        if (!com.amazon.aps.iva.yb0.j.a(m.class, cls)) {
            return false;
        }
        if (obj != null) {
            m mVar = (m) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, mVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, mVar.c)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.tracking.MixedViewTrackingStrategy");
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b.onActivityCreated(activity, bundle);
        this.c.getClass();
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b.onActivityDestroyed(activity);
        this.c.getClass();
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b.onActivityPaused(activity);
        this.c.getClass();
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b.onActivityResumed(activity);
        this.c.getClass();
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b.onActivityStarted(activity);
        this.c.onActivityStarted(activity);
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        this.b.getClass();
        this.c.onActivityStopped(activity);
    }
}
