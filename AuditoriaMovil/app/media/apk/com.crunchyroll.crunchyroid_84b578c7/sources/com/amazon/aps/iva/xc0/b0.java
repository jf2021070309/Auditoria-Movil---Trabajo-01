package com.amazon.aps.iva.xc0;

import java.util.Map;
/* compiled from: Jsr305Settings.kt */
/* loaded from: classes4.dex */
public final class b0 {
    public final h0 a;
    public final h0 b;
    public final Map<com.amazon.aps.iva.nd0.c, h0> c;
    public final boolean d;

    public b0() {
        throw null;
    }

    public b0(h0 h0Var, h0 h0Var2) {
        com.amazon.aps.iva.lb0.a0 a0Var = com.amazon.aps.iva.lb0.a0.b;
        this.a = h0Var;
        this.b = h0Var2;
        this.c = a0Var;
        com.amazon.aps.iva.kb0.f.b(new a0(this));
        h0 h0Var3 = h0.IGNORE;
        this.d = h0Var == h0Var3 && h0Var2 == h0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.a == b0Var.a && this.b == b0Var.b && com.amazon.aps.iva.yb0.j.a(this.c, b0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        h0 h0Var = this.b;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
