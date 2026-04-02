package com.amazon.aps.iva.xc0;
/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* loaded from: classes4.dex */
public final class x {
    public static final x d = new x(h0.STRICT, 6);
    public final h0 a;
    public final com.amazon.aps.iva.kb0.d b;
    public final h0 c;

    public x(h0 h0Var, com.amazon.aps.iva.kb0.d dVar, h0 h0Var2) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "reportLevelBefore");
        com.amazon.aps.iva.yb0.j.f(h0Var2, "reportLevelAfter");
        this.a = h0Var;
        this.b = dVar;
        this.c = h0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.a == xVar.a && com.amazon.aps.iva.yb0.j.a(this.b, xVar.b) && this.c == xVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        com.amazon.aps.iva.kb0.d dVar = this.b;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.e;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public x(h0 h0Var, int i) {
        this(h0Var, (i & 2) != 0 ? new com.amazon.aps.iva.kb0.d(0, 0) : null, (i & 4) != 0 ? h0Var : null);
    }
}
