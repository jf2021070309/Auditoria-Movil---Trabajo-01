package com.amazon.aps.iva.gr;

import android.app.Fragment;
/* compiled from: AcceptAllDefaultFragment.kt */
/* loaded from: classes2.dex */
public final class b implements f<Fragment> {
    @Override // com.amazon.aps.iva.gr.f
    public final boolean a(Fragment fragment) {
        com.amazon.aps.iva.yb0.j.f(fragment, "component");
        return true;
    }

    @Override // com.amazon.aps.iva.gr.f
    public final void b(Object obj) {
        com.amazon.aps.iva.yb0.j.f((Fragment) obj, "component");
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
        if (com.amazon.aps.iva.yb0.j.a(b.class, cls)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }
}
