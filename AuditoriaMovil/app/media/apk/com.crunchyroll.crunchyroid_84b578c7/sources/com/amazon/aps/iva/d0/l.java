package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
/* compiled from: BoxWithConstraints.kt */
/* loaded from: classes.dex */
public final class l implements k, h {
    public final com.amazon.aps.iva.o2.c a;
    public final long b;
    public final /* synthetic */ androidx.compose.foundation.layout.b c;

    public l(com.amazon.aps.iva.o2.c cVar, long j) {
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        this.a = cVar;
        this.b = j;
        this.c = androidx.compose.foundation.layout.b.a;
    }

    @Override // com.amazon.aps.iva.d0.k
    public final float a() {
        long j = this.b;
        if (com.amazon.aps.iva.o2.a.d(j)) {
            return this.a.I0(com.amazon.aps.iva.o2.a.h(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // com.amazon.aps.iva.d0.k
    public final long b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.d0.h
    public final com.amazon.aps.iva.a1.f c(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.b bVar) {
        return this.c.c(f.a.c, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, lVar.a) && com.amazon.aps.iva.o2.a.b(this.b, lVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) com.amazon.aps.iva.o2.a.k(this.b)) + ')';
    }
}
