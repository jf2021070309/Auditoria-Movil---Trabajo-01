package com.amazon.aps.iva.gr;

import android.app.Activity;
/* compiled from: AcceptAllActivities.kt */
/* loaded from: classes2.dex */
public final class a implements f<Activity> {
    @Override // com.amazon.aps.iva.gr.f
    public final boolean a(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "component");
        return true;
    }

    @Override // com.amazon.aps.iva.gr.f
    public final void b(Object obj) {
        com.amazon.aps.iva.yb0.j.f((Activity) obj, "component");
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
        if (com.amazon.aps.iva.yb0.j.a(a.class, cls)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
