package com.amazon.aps.iva.s1;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.s1.x;
import com.amazon.aps.iva.u1.e;
import java.util.Map;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class b1 {

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.compose.ui.node.e> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.a aVar) {
            super(0);
            this.h = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.compose.ui.node.e] */
        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.compose.ui.node.e invoke() {
            return this.h.invoke();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ e1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e1 e1Var) {
            super(0);
            this.h = e1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            x a = this.h.a();
            for (Map.Entry entry : a.e.entrySet()) {
                ((x.b) entry.getValue()).d = true;
            }
            androidx.compose.ui.node.e eVar = a.a;
            if (!eVar.A.c) {
                androidx.compose.ui.node.e.U(eVar, false, 3);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
        public final /* synthetic */ p3<e1> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q1 q1Var) {
            super(1);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            return new c1(this.h);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ e1 h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<a1, com.amazon.aps.iva.o2.a, e0> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<f1, com.amazon.aps.iva.o2.a, e0> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e1 e1Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar2, int i, int i2) {
            super(2);
            this.h = e1Var;
            this.i = fVar;
            this.j = pVar;
            this.k = pVar2;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            b1.c(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<a1, com.amazon.aps.iva.o2.a, e0> {
        public static final e h = new e();

        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final e0 invoke(a1 a1Var, com.amazon.aps.iva.o2.a aVar) {
            a1 a1Var2 = a1Var;
            long j = aVar.a;
            com.amazon.aps.iva.yb0.j.f(a1Var2, "$this$SubcomposeLayout");
            return a1Var2.N0().invoke(a1Var2, new com.amazon.aps.iva.o2.a(j));
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ e1 h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<f1, com.amazon.aps.iva.o2.a, e0> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(e1 e1Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar, int i, int i2) {
            super(2);
            this.h = e1Var;
            this.i = fVar;
            this.j = pVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            b1.b(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<a1, com.amazon.aps.iva.o2.a, e0> {
        public static final g h = new g();

        public g() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final e0 invoke(a1 a1Var, com.amazon.aps.iva.o2.a aVar) {
            a1 a1Var2 = a1Var;
            long j = aVar.a;
            com.amazon.aps.iva.yb0.j.f(a1Var2, "$this$null");
            return a1Var2.N0().invoke(a1Var2, new com.amazon.aps.iva.o2.a(j));
        }
    }

    public static final void a(int i, int i2, com.amazon.aps.iva.o0.i iVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p pVar) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(pVar, "measurePolicy");
        com.amazon.aps.iva.o0.j g2 = iVar.g(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g2.H(fVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g2.v(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g2.h()) {
            g2.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            g2.s(-492369756);
            Object e0 = g2.e0();
            if (e0 == i.a.a) {
                e0 = new e1();
                g2.K0(e0);
            }
            g2.U(false);
            int i7 = i3 << 3;
            b((e1) e0, fVar, pVar, g2, (i7 & 112) | 8 | (i7 & 896), 0);
        }
        j2 X = g2.X();
        if (X != null) {
            X.d = new d1(i, i2, fVar, pVar);
        }
    }

    public static final void b(e1 e1Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(e1Var, "state");
        com.amazon.aps.iva.yb0.j.f(pVar, "measurePolicy");
        com.amazon.aps.iva.o0.j g2 = iVar.g(-511989831);
        if ((i2 & 2) != 0) {
            fVar = f.a.c;
        }
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        c(e1Var, fVar, e.h, pVar, g2, (i & 112) | 392 | ((i << 3) & 7168), 0);
        j2 X = g2.X();
        if (X != null) {
            X.d = new f(e1Var, fVar, pVar, i, i2);
        }
    }

    public static final void c(e1 e1Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar2, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(e1Var, "state");
        com.amazon.aps.iva.yb0.j.f(pVar2, "measurePolicy");
        com.amazon.aps.iva.o0.j g2 = iVar.g(2129414763);
        if ((i2 & 2) != 0) {
            fVar = f.a.c;
        }
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        if ((i2 & 4) != 0) {
            pVar = g.h;
        }
        com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar3 = pVar;
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        int S = com.amazon.aps.iva.cq.b.S(g2);
        com.amazon.aps.iva.o0.g0 g0 = com.amazon.aps.iva.cq.b.g0(g2);
        com.amazon.aps.iva.a1.f c2 = com.amazon.aps.iva.a1.e.c(g2, fVar2);
        c2 P = g2.P();
        e.a aVar = androidx.compose.ui.node.e.K;
        g2.s(1886828752);
        if (g2.a instanceof com.amazon.aps.iva.o0.d) {
            g2.z0();
            if (g2.M) {
                g2.w(new a(aVar));
            } else {
                g2.m();
            }
            com.amazon.aps.iva.cq.b.k0(g2, e1Var, e1Var.c);
            com.amazon.aps.iva.cq.b.k0(g2, g0, e1Var.d);
            com.amazon.aps.iva.cq.b.k0(g2, pVar2, e1Var.e);
            com.amazon.aps.iva.cq.b.k0(g2, pVar3, e1Var.f);
            com.amazon.aps.iva.u1.e.o0.getClass();
            com.amazon.aps.iva.cq.b.k0(g2, P, e.a.d);
            com.amazon.aps.iva.cq.b.k0(g2, c2, e.a.c);
            e.a.C0752a c0752a = e.a.f;
            if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g2, S, c0752a);
            }
            g2.U(true);
            g2.U(false);
            g2.s(-607836798);
            if (!g2.h()) {
                com.amazon.aps.iva.o0.x0.f(new b(e1Var), g2);
            }
            g2.U(false);
            q1 h0 = com.amazon.aps.iva.cq.b.h0(e1Var, g2);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            g2.s(1157296644);
            boolean H = g2.H(h0);
            Object e0 = g2.e0();
            if (H || e0 == i.a.a) {
                e0 = new c(h0);
                g2.K0(e0);
            }
            g2.U(false);
            com.amazon.aps.iva.o0.x0.a(qVar, (com.amazon.aps.iva.xb0.l) e0, g2);
            j2 X = g2.X();
            if (X != null) {
                X.d = new d(e1Var, fVar2, pVar3, pVar2, i, i2);
                return;
            }
            return;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }
}
