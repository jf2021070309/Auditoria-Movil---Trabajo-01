package com.amazon.aps.iva.yq;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.iva.dr.e;
import com.amazon.aps.iva.gr.d;
import com.amazon.aps.iva.yb0.j;
/* compiled from: UserActionTrackingStrategyApi29.kt */
/* loaded from: classes2.dex */
public final class b extends d implements e {
    public final com.amazon.aps.iva.zq.c b;

    public b(com.amazon.aps.iva.zq.a aVar) {
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
        if (!j.a(b.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (j.a(this.b, ((b) obj).b)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29");
    }

    @Override // com.amazon.aps.iva.dr.e
    public final com.amazon.aps.iva.zq.c g() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        this.b.a(activity, activity.getWindow());
        super.onActivityPreCreated(activity, bundle);
    }

    public final String toString() {
        return "UserActionTrackingStrategyApi29(" + this.b + ")";
    }
}
