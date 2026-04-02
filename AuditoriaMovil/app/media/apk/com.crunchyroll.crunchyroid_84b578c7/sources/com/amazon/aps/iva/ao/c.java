package com.amazon.aps.iva.ao;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.b1;
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
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: Theme.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: Theme.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public final /* synthetic */ p<i, Integer, q> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, p pVar) {
            super(2);
            this.h = pVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                c.b(this.i & 14, 2, iVar2, null, this.h);
            }
            return q.a;
        }
    }

    /* compiled from: Theme.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public final /* synthetic */ p<i, Integer, q> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, p pVar) {
            super(2);
            this.h = pVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            c.a(this.h, iVar, I);
            return q.a;
        }
    }

    public static final void a(p<? super i, ? super Integer, q> pVar, i iVar, int i) {
        int i2;
        int i3;
        j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(-1828139054);
        if ((i & 14) == 0) {
            if (g.v(pVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            b1.a(null, null, null, com.amazon.aps.iva.v0.b.b(g, 696526718, new a(i2, pVar)), g, 3072, 7);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(i, pVar);
        }
    }

    public static final void b(int i, int i2, i iVar, f fVar, p pVar) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.o0.j g = iVar.g(-179196622);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.v(pVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(fVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            f a2 = o.a(fVar, false, d.h);
            g.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a3 = u.a(a2);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d(0, a3, new x2(g), g, 2058660585);
                pVar.invoke(g, Integer.valueOf(i3 & 14));
                g.U(false);
                g.U(true);
                g.U(false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new e(i, i2, fVar, pVar);
        }
    }
}
