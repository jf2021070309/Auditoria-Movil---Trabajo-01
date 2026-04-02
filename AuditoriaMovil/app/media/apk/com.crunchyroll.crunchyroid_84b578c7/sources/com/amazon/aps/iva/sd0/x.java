package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.o0.t1;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class x extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(str);
        com.amazon.aps.iva.yb0.j.f(str, "value");
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        return c0Var.j().v();
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final String toString() {
        return t1.b(new StringBuilder("\""), (String) this.a, '\"');
    }
}
