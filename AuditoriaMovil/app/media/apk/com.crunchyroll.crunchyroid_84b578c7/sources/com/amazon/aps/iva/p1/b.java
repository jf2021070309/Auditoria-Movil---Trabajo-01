package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.d0.b2;
/* compiled from: PointerIcon.android.kt */
/* loaded from: classes.dex */
public final class b implements p {
    public final int c;

    public b(int i) {
        this.c = i;
    }

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
        if (!com.amazon.aps.iva.yb0.j.a(b.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.c == ((b) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return b2.b(new StringBuilder("AndroidPointerIcon(type="), this.c, ')');
    }
}
