package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.b3;
import com.amazon.aps.iva.o0.j2;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l1 h;
    public final /* synthetic */ j i;
    public final /* synthetic */ m1 j;
    public final /* synthetic */ m1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l1 l1Var, j jVar, m1 m1Var, m1 m1Var2) {
        super(3);
        this.h = l1Var;
        this.i = jVar;
        this.j = m1Var;
        this.k = m1Var2;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        boolean z;
        b3 b3Var2 = b3Var;
        com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
        l1 l1Var = this.h;
        if (l1Var == null && (l1Var = this.i.b.j(this.j)) == null) {
            e0.c("Could not resolve state for movable content");
            throw null;
        }
        z2 z2Var = l1Var.a;
        com.amazon.aps.iva.yb0.j.f(z2Var, "table");
        if (b3Var2.m <= 0 && b3Var2.o(b3Var2.r + 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        e0.f(z);
        int i = b3Var2.r;
        int i2 = b3Var2.h;
        int i3 = b3Var2.i;
        b3Var2.a(1);
        b3Var2.K();
        b3Var2.e();
        b3 j = z2Var.j();
        try {
            List a = b3.a.a(j, 2, b3Var2, false, true, true);
            j.f();
            b3Var2.j();
            b3Var2.i();
            b3Var2.r = i;
            b3Var2.h = i2;
            b3Var2.i = i3;
            o0 o0Var = this.k.c;
            com.amazon.aps.iva.yb0.j.d(o0Var, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            j2.a.a(b3Var2, a, (l2) o0Var);
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            j.f();
            throw th;
        }
    }
}
