package com.amazon.aps.iva.ei;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: MusicLoadingCard.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: MusicLoadingCard.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            g.a(this.h, iVar, I, i);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        com.amazon.aps.iva.a1.f b;
        boolean z;
        com.amazon.aps.iva.a1.f b2;
        com.amazon.aps.iva.a1.f b3;
        com.amazon.aps.iva.o0.j g = iVar.g(1703232273);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            f.a aVar2 = f.a.c;
            if (i5 != 0) {
                aVar = aVar2;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            com.amazon.aps.iva.a1.f e = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.n(aVar));
            g.s(693286680);
            d0 a2 = v1.a(com.amazon.aps.iva.d0.a.a, a.C0097a.j, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar3 = e.a.b;
            com.amazon.aps.iva.v0.a a3 = u.a(e);
            com.amazon.aps.iva.o0.d<?> dVar = g.a;
            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar3);
                } else {
                    g.m();
                }
                e.a.b bVar2 = e.a.e;
                com.amazon.aps.iva.cq.b.k0(g, a2, bVar2);
                e.a.d dVar2 = e.a.d;
                com.amazon.aps.iva.cq.b.k0(g, P, dVar2);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d(0, a3, new x2(g), g, 2058660585);
                float f = 90;
                com.amazon.aps.iva.a1.f f2 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(aVar2, 160), f);
                long j = com.amazon.aps.iva.ao.a.v;
                b = androidx.compose.foundation.c.b(f2, j, p0.a);
                com.amazon.aps.iva.d0.f.a(b, g, 0);
                com.amazon.aps.iva.a1.f f3 = androidx.compose.foundation.layout.e.f(aVar2, f);
                com.amazon.aps.iva.yb0.j.f(f3, "<this>");
                if (1.0f > 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float f4 = 8;
                    com.amazon.aps.iva.a1.f i6 = androidx.compose.foundation.layout.d.i(f3.o(new LayoutWeightElement(true)), 0.0f, f4, com.amazon.aps.iva.cq.b.N(R.dimen.featured_list_item_margin_end, g), 0.0f, 9);
                    g.s(-483455358);
                    d0 a4 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g);
                    g.s(-1323940314);
                    int S2 = com.amazon.aps.iva.cq.b.S(g);
                    com.amazon.aps.iva.a1.f fVar2 = aVar;
                    c2 P2 = g.P();
                    com.amazon.aps.iva.v0.a a5 = u.a(i6);
                    if (dVar instanceof com.amazon.aps.iva.o0.d) {
                        g.z();
                        if (g.M) {
                            g.w(aVar3);
                        } else {
                            g.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(g, a4, bVar2);
                        com.amazon.aps.iva.cq.b.k0(g, P2, dVar2);
                        if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S2))) {
                            defpackage.a.c(S2, g, S2, c0752a);
                        }
                        defpackage.b.d(0, a5, new x2(g), g, 2058660585);
                        float f5 = 12;
                        float f6 = 16;
                        b2 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.d.i(aVar2, f5, f4, 0.0f, 0.0f, 12)), f6), j, p0.a);
                        com.amazon.aps.iva.d0.f.a(b2, g, 0);
                        b3 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.d.i(aVar2, f5, f4, 0.0f, 0.0f, 12), 100), f6), j, p0.a);
                        com.amazon.aps.iva.d0.f.a(b3, g, 0);
                        g.U(false);
                        g.U(true);
                        g.U(false);
                        g.U(false);
                        g.U(false);
                        g.U(true);
                        g.U(false);
                        g.U(false);
                        obj = fVar2;
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(obj, i, i2);
        }
    }
}
