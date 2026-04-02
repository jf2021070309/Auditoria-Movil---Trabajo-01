package com.amazon.aps.iva.jn;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SimulcastScreen.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: SimulcastScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, com.amazon.aps.iva.a1.f fVar2, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = fVar2;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            e.a(this.h, this.i, iVar, I, this.k);
            return q.a;
        }
    }

    public static final void a(f fVar, com.amazon.aps.iva.a1.f fVar2, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        j.f(fVar, "viewModel");
        com.amazon.aps.iva.o0.j g = iVar.g(-1848777199);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 48;
            obj = fVar2;
        } else if ((i & 112) == 0) {
            obj = fVar2;
            if (g.H(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            obj = fVar2;
            i3 = i;
        }
        if ((i3 & 81) == 16 && g.h()) {
            g.A();
        } else {
            f.a aVar2 = f.a.c;
            if (i5 != 0) {
                aVar = aVar2;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            g.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar3 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = u.a(aVar);
            int i6 = ((((((i3 >> 3) & 14) << 3) & 112) << 9) & 7168) | 6;
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar3);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d((i6 >> 3) & 112, a2, new x2(g), g, 2058660585);
                a4.b("Simulcast Screen", androidx.compose.foundation.layout.b.a.c(aVar2, a.C0097a.e), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, g, 6, 0, 131068);
                defpackage.c.c(g, false, true, false, false);
                obj = aVar;
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(fVar, obj, i, i2);
        }
    }
}
