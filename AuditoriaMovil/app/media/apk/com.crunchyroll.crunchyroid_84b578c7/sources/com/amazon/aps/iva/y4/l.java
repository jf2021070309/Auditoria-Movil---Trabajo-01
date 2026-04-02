package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class l {
    public final float a;
    public final List<Integer> b;

    static {
        new l(0.0f, 3);
    }

    public l(float f, List list) {
        this.a = f;
        this.b = list;
    }

    public final l a(l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "other");
        return new l(this.a + lVar.a, x.L0(lVar.b, this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (com.amazon.aps.iva.o2.e.a(this.a, lVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, lVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) com.amazon.aps.iva.o2.e.b(this.a)) + ", resourceIds=" + this.b + ')';
    }

    public l(float f, int i) {
        this((i & 1) != 0 ? 0 : f, (i & 2) != 0 ? z.b : null);
    }
}
