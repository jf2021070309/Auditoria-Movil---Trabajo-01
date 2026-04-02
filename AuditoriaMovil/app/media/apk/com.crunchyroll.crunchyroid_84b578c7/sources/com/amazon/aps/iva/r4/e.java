package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.y4.a;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class e {
    public final c1 a;
    public final int b;
    public final int c;

    public e(c1 c1Var, int i, int i2) {
        this.a = c1Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a != eVar.a) {
            return false;
        }
        if (this.b == eVar.b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.c == eVar.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) a.C0884a.b(this.b)) + ", verticalAlignment=" + ((Object) a.b.b(this.c)) + ')';
    }
}
