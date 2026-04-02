package com.amazon.aps.iva.n2;

import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.s0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.q.c0;
/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public final class b implements k {
    public final s0 a;
    public final float b;

    public b(s0 s0Var, float f) {
        com.amazon.aps.iva.yb0.j.f(s0Var, "value");
        this.a = s0Var;
        this.b = f;
    }

    @Override // com.amazon.aps.iva.n2.k
    public final float a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.n2.k
    public final long b() {
        int i = x.h;
        return x.g;
    }

    @Override // com.amazon.aps.iva.n2.k
    public final s d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return c0.b(sb, this.b, ')');
    }
}
