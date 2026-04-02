package com.amazon.aps.iva.p1;
/* compiled from: PointerIcon.android.kt */
/* loaded from: classes.dex */
public final class a implements p {
    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(a.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        a aVar = (a) obj;
        return com.amazon.aps.iva.yb0.j.a(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
