package com.amazon.aps.iva.r4;
/* compiled from: CheckBox.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.ab.a {
    public final com.amazon.aps.iva.x4.a a;

    public f(com.amazon.aps.iva.x4.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        if (com.amazon.aps.iva.yb0.j.a(this.a, ((f) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CheckBoxColorsImpl(checkBox=" + this.a + ')';
    }
}
