package com.amazon.aps.iva.gr;

import androidx.fragment.app.Fragment;
/* compiled from: AcceptAllSupportFragments.kt */
/* loaded from: classes2.dex */
public class c implements f<Fragment> {
    @Override // com.amazon.aps.iva.gr.f
    public final void b(Object obj) {
        com.amazon.aps.iva.yb0.j.f((Fragment) obj, "component");
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (com.amazon.aps.iva.yb0.j.a(cls2, cls)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
