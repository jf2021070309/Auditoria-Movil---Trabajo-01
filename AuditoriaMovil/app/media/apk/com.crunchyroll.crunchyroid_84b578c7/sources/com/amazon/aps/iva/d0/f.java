package com.amazon.aps.iva.d0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.e;
import java.util.List;
/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class f {
    public static final g a = new g(a.C0097a.a, false);
    public static final b b = b.a;

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.a1.f fVar, int i) {
            super(2);
            this.h = fVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            f.a(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.s1.d0 {
        public static final b a = new b();

        /* compiled from: Box.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$MeasurePolicy");
            com.amazon.aps.iva.yb0.j.f(list, "<anonymous parameter 0>");
            return f0Var.F0(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.i(j), com.amazon.aps.iva.lb0.a0.b, a.h);
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(fVar, "modifier");
        com.amazon.aps.iva.o0.j g = iVar.g(-211209833);
        if ((i & 14) == 0) {
            if (g.H(fVar)) {
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
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            com.amazon.aps.iva.o0.c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(fVar);
            int i4 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, b, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                a2.invoke(new x2(g), g, Integer.valueOf((i4 >> 3) & 112));
                g.s(2058660585);
                g.U(false);
                g.U(true);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(fVar, i);
        }
    }

    public static final void b(u0.a aVar, com.amazon.aps.iva.s1.u0 u0Var, com.amazon.aps.iva.s1.c0 c0Var, com.amazon.aps.iva.o2.l lVar, int i, int i2, com.amazon.aps.iva.a1.a aVar2) {
        e eVar;
        com.amazon.aps.iva.a1.a aVar3;
        com.amazon.aps.iva.a1.a aVar4;
        Object b2 = c0Var.b();
        if (b2 instanceof e) {
            eVar = (e) b2;
        } else {
            eVar = null;
        }
        if (eVar != null && (aVar4 = eVar.o) != null) {
            aVar3 = aVar4;
        } else {
            aVar3 = aVar2;
        }
        long a2 = aVar3.a(com.amazon.aps.iva.o2.k.a(u0Var.b, u0Var.c), com.amazon.aps.iva.o2.k.a(i, i2), lVar);
        u0.a.C0692a c0692a = u0.a.a;
        aVar.getClass();
        u0.a.e(u0Var, a2, 0.0f);
    }

    public static final com.amazon.aps.iva.s1.d0 c(com.amazon.aps.iva.a1.a aVar, boolean z, com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.s1.d0 d0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "alignment");
        iVar.s(56522820);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.C0097a.a) && !z) {
            d0Var = a;
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            iVar.s(511388516);
            boolean H = iVar.H(valueOf) | iVar.H(aVar);
            Object t = iVar.t();
            if (H || t == i.a.a) {
                t = new g(aVar, z);
                iVar.n(t);
            }
            iVar.G();
            d0Var = (com.amazon.aps.iva.s1.d0) t;
        }
        iVar.G();
        return d0Var;
    }
}
