package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.s1.b1;
import com.amazon.aps.iva.s1.e1;
import com.google.android.gms.ads.AdRequest;
/* compiled from: LazyLayout.kt */
/* loaded from: classes.dex */
public final class u {

    /* compiled from: LazyLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.x0.e, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ c0 h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<v, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.a<p>> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p pVar, int i, q1 q1Var) {
            super(3);
            this.h = c0Var;
            this.i = fVar;
            this.j = pVar;
            this.k = i;
            this.l = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.x0.e eVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.x0.e eVar2 = eVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(eVar2, "saveableStateHolder");
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            iVar2.s(-492369756);
            Object t = iVar2.t();
            Object obj = i.a.a;
            if (t == obj) {
                t = new m(eVar2, new t(this.l));
                iVar2.n(t);
            }
            iVar2.G();
            m mVar = (m) t;
            iVar2.s(-492369756);
            Object t2 = iVar2.t();
            if (t2 == obj) {
                t2 = new e1(new q(mVar));
                iVar2.n(t2);
            }
            iVar2.G();
            e1 e1Var = (e1) t2;
            iVar2.s(-1523808190);
            int i = this.k;
            c0 c0Var = this.h;
            if (c0Var != null) {
                e0.a(c0Var, mVar, e1Var, iVar2, ((i >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            iVar2.G();
            com.amazon.aps.iva.a1.f fVar = this.i;
            iVar2.s(511388516);
            boolean H = iVar2.H(mVar);
            com.amazon.aps.iva.xb0.p<v, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> pVar = this.j;
            boolean H2 = H | iVar2.H(pVar);
            Object t3 = iVar2.t();
            if (H2 || t3 == obj) {
                t3 = new s(mVar, pVar);
                iVar2.n(t3);
            }
            iVar2.G();
            b1.b(e1Var, fVar, (com.amazon.aps.iva.xb0.p) t3, iVar2, (i & 112) | 8, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LazyLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<p> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ c0 j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<v, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.a<? extends p> aVar, com.amazon.aps.iva.a1.f fVar, c0 c0Var, com.amazon.aps.iva.xb0.p<? super v, ? super com.amazon.aps.iva.o2.a, ? extends com.amazon.aps.iva.s1.e0> pVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = fVar;
            this.j = c0Var;
            this.k = pVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            u.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.xb0.a<? extends p> aVar, com.amazon.aps.iva.a1.f fVar, c0 c0Var, com.amazon.aps.iva.xb0.p<? super v, ? super com.amazon.aps.iva.o2.a, ? extends com.amazon.aps.iva.s1.e0> pVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        com.amazon.aps.iva.yb0.j.f(aVar, "itemProvider");
        com.amazon.aps.iva.yb0.j.f(pVar, "measurePolicy");
        com.amazon.aps.iva.o0.j g = iVar.g(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.v(aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(fVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (g.H(c0Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (g.v(pVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i10 = i3;
        if ((i10 & 5851) == 1170 && g.h()) {
            g.A();
        } else {
            if (i8 != 0) {
                fVar = f.a.c;
            }
            if (i9 != 0) {
                c0Var = null;
            }
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            s0.a(com.amazon.aps.iva.v0.b.b(g, -1488997347, new a(c0Var, fVar, pVar, i10, com.amazon.aps.iva.cq.b.h0(aVar, g))), g, 6);
        }
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        c0 c0Var2 = c0Var;
        j2 X = g.X();
        if (X != null) {
            X.d = new b(aVar, fVar2, c0Var2, pVar, i, i2);
        }
    }
}
