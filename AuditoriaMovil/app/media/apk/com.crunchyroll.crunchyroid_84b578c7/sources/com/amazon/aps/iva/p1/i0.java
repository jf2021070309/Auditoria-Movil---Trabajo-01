package com.amazon.aps.iva.p1;
/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class i0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        if (this.a != ((i0) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
