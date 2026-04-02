package com.amazon.aps.iva.c2;
/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes.dex */
public final class s {
    public final r a;
    public final q b;

    public s(r rVar, q qVar) {
        this.a = rVar;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, sVar.b) && com.amazon.aps.iva.yb0.j.a(this.a, sVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        r rVar = this.a;
        if (rVar != null) {
            i = rVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        q qVar = this.b;
        if (qVar != null) {
            i2 = qVar.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public s(boolean z) {
        this(null, new q(z));
    }
}
