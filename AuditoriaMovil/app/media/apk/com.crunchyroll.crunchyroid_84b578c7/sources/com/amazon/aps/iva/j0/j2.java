package com.amazon.aps.iva.j0;

import androidx.compose.foundation.gestures.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class j2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ k2 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ com.amazon.aps.iva.c0.l j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.amazon.aps.iva.c0.l lVar, k2 k2Var, boolean z) {
        super(3);
        this.h = k2Var;
        this.i = z;
        this.j = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, 805428266);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        if (iVar2.i(com.amazon.aps.iva.v1.d1.k) == com.amazon.aps.iva.o2.l.Rtl) {
            z = true;
        } else {
            z = false;
        }
        k2 k2Var = this.h;
        if (((com.amazon.aps.iva.b0.f0) k2Var.e.getValue()) != com.amazon.aps.iva.b0.f0.Vertical && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        iVar2.s(1157296644);
        boolean H = iVar2.H(k2Var);
        Object t = iVar2.t();
        Object obj = i.a.a;
        if (H || t == obj) {
            t = new h2(k2Var);
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.xb0.l lVar = (com.amazon.aps.iva.xb0.l) t;
        com.amazon.aps.iva.yb0.j.f(lVar, "consumeScrollDelta");
        iVar2.s(-180460798);
        com.amazon.aps.iva.o0.q1 h0 = com.amazon.aps.iva.cq.b.h0(lVar, iVar2);
        iVar2.s(-492369756);
        Object t2 = iVar2.t();
        if (t2 == obj) {
            Object fVar2 = new com.amazon.aps.iva.b0.f(new com.amazon.aps.iva.b0.u0(h0));
            iVar2.n(fVar2);
            t2 = fVar2;
        }
        iVar2.G();
        com.amazon.aps.iva.b0.t0 t0Var = (com.amazon.aps.iva.b0.t0) t2;
        iVar2.G();
        iVar2.s(511388516);
        boolean H2 = iVar2.H(t0Var) | iVar2.H(k2Var);
        Object t3 = iVar2.t();
        if (H2 || t3 == obj) {
            t3 = new i2(t0Var, k2Var);
            iVar2.n(t3);
        }
        iVar2.G();
        i2 i2Var = (i2) t3;
        f.a aVar = f.a.c;
        com.amazon.aps.iva.b0.f0 f0Var = (com.amazon.aps.iva.b0.f0) k2Var.e.getValue();
        if (this.i) {
            if (k2Var.b.d() == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z3 = true;
                com.amazon.aps.iva.c0.l lVar2 = this.j;
                a.c cVar = androidx.compose.foundation.gestures.a.a;
                com.amazon.aps.iva.yb0.j.f(i2Var, "state");
                com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
                com.amazon.aps.iva.a1.f b = androidx.compose.foundation.gestures.a.b(aVar, i2Var, f0Var, null, z3, z2, null, lVar2);
                iVar2.G();
                return b;
            }
        }
        z3 = false;
        com.amazon.aps.iva.c0.l lVar22 = this.j;
        a.c cVar2 = androidx.compose.foundation.gestures.a.a;
        com.amazon.aps.iva.yb0.j.f(i2Var, "state");
        com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
        com.amazon.aps.iva.a1.f b2 = androidx.compose.foundation.gestures.a.b(aVar, i2Var, f0Var, null, z3, z2, null, lVar22);
        iVar2.G();
        return b2;
    }
}
