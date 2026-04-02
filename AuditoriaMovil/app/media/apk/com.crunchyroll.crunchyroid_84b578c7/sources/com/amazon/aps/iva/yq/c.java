package com.amazon.aps.iva.yq;

import android.app.Activity;
import com.amazon.aps.iva.dr.e;
import com.amazon.aps.iva.gr.d;
import com.amazon.aps.iva.yb0.j;
/* compiled from: UserActionTrackingStrategyLegacy.kt */
/* loaded from: classes2.dex */
public final class c extends d implements e {
    public final com.amazon.aps.iva.zq.c b;

    public c(com.amazon.aps.iva.zq.a aVar) {
        this.b = aVar;
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
        if (!j.a(c.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (j.a(this.b, ((c) obj).b)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy");
    }

    @Override // com.amazon.aps.iva.dr.e
    public final com.amazon.aps.iva.zq.c g() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
        this.b.b(activity, activity.getWindow());
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j.f(activity, "activity");
        this.b.a(activity, activity.getWindow());
    }

    public final String toString() {
        return "UserActionTrackingStrategyLegacy(" + this.b + ")";
    }
}
