package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.y4.a;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class k {
    public final c1 a;
    public final int b;
    public final a.C0884a c;
    public final a.b d;

    public k(c1 c1Var, int i, a.C0884a c0884a, a.b bVar) {
        this.a = c1Var;
        this.b = i;
        this.c = c0884a;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.a && this.b == kVar.b && com.amazon.aps.iva.yb0.j.a(this.c, kVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, kVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        a.C0884a c0884a = this.c;
        if (c0884a == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(c0884a.a);
        }
        int i2 = (a + hashCode) * 31;
        a.b bVar = this.d;
        if (bVar != null) {
            i = Integer.hashCode(bVar.a);
        }
        return i2 + i;
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public /* synthetic */ k(c1 c1Var, int i, a.C0884a c0884a, a.b bVar, int i2) {
        this(c1Var, i, (i2 & 4) != 0 ? null : c0884a, (i2 & 8) != 0 ? null : bVar);
    }
}
