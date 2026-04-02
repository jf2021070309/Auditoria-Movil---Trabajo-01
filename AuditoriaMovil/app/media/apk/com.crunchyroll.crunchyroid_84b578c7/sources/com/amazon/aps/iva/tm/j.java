package com.amazon.aps.iva.tm;

import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.f2;
import com.amazon.aps.iva.m0.g2;
import com.amazon.aps.iva.m0.j1;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.n0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.z.u0;
/* compiled from: SwitchProfileDialog.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            f2 c = j1.c(g2.Hidden, new u0(1.0f, 400.0f, null, 4), true, iVar2, 4);
            iVar2.s(773894976);
            iVar2.s(-492369756);
            Object t = iVar2.t();
            if (t == i.a.a) {
                n0 n0Var = new n0(x0.g(iVar2));
                iVar2.n(n0Var);
                t = n0Var;
            }
            iVar2.G();
            g0 g0Var = ((n0) t).b;
            iVar2.G();
            m0 k = com.amazon.aps.iva.e1.d.k(new r0[0], iVar2);
            q qVar = q.a;
            x0.c(qVar, new e(k, this.h, g0Var, c, null), iVar2);
            iVar2.s(1981795718);
            g2 c2 = c.c.c();
            g2 g2Var = g2.Expanded;
            c cVar = this.h;
            if (c2 == g2Var) {
                x0.c(qVar, new f(c, cVar, null), iVar2);
            }
            iVar2.G();
            x0.c(qVar, new g(c, null), iVar2);
            float f = 14;
            com.amazon.aps.iva.i0.f fVar = com.amazon.aps.iva.i0.g.a;
            float f2 = 0;
            j1.a(com.amazon.aps.iva.v0.b.b(iVar2, -423231982, new i(k, cVar)), null, c, false, new com.amazon.aps.iva.i0.f(new com.amazon.aps.iva.i0.d(f), new com.amazon.aps.iva.i0.d(f), new com.amazon.aps.iva.i0.d(f2), new com.amazon.aps.iva.i0.d(f2)), 0.0f, 0L, 0L, 0L, a.a, iVar2, 805306886, 490);
        }
        return q.a;
    }
}
