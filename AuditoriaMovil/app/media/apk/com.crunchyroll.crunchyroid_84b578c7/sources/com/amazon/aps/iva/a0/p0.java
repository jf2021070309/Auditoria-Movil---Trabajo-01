package com.amazon.aps.iva.a0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.e;
import java.util.List;
/* compiled from: Image.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.s1.d0 {
        public static final a a = new a();

        /* compiled from: Image.kt */
        /* renamed from: com.amazon.aps.iva.a0.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0095a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
            public static final C0095a h = new C0095a();

            public C0095a() {
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
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$Layout");
            com.amazon.aps.iva.yb0.j.f(list, "<anonymous parameter 0>");
            return f0Var.F0(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.i(j), com.amazon.aps.iva.lb0.a0.b, C0095a.h);
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.i1.c h;
        public final /* synthetic */ String i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.a1.a k;
        public final /* synthetic */ com.amazon.aps.iva.s1.f l;
        public final /* synthetic */ float m;
        public final /* synthetic */ com.amazon.aps.iva.f1.y n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.i1.c cVar, String str, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar2, float f, com.amazon.aps.iva.f1.y yVar, int i, int i2) {
            super(2);
            this.h = cVar;
            this.i = str;
            this.j = fVar;
            this.k = aVar;
            this.l = fVar2;
            this.m = f;
            this.n = yVar;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            p0.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            com.amazon.aps.iva.a2.y.c(c0Var2, this.h);
            com.amazon.aps.iva.a2.y.d(c0Var2, 5);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.i1.c cVar, String str, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar2, float f, com.amazon.aps.iva.f1.y yVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        com.amazon.aps.iva.a1.f fVar3;
        com.amazon.aps.iva.a1.b bVar;
        f.a.d dVar;
        float f2;
        com.amazon.aps.iva.f1.y yVar2;
        com.amazon.aps.iva.yb0.j.f(cVar, "painter");
        com.amazon.aps.iva.o0.j g = iVar.g(1142754848);
        int i3 = i2 & 4;
        com.amazon.aps.iva.a1.f fVar4 = f.a.c;
        if (i3 != 0) {
            fVar3 = fVar4;
        } else {
            fVar3 = fVar;
        }
        if ((i2 & 8) != 0) {
            bVar = a.C0097a.e;
        } else {
            bVar = aVar;
        }
        if ((i2 & 16) != 0) {
            dVar = f.a.b;
        } else {
            dVar = fVar2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            yVar2 = null;
        } else {
            yVar2 = yVar;
        }
        e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        g.s(-816794123);
        if (str != null) {
            g.s(1157296644);
            boolean H = g.H(str);
            Object e0 = g.e0();
            if (H || e0 == i.a.a) {
                e0 = new c(str);
                g.K0(e0);
            }
            g.U(false);
            fVar4 = com.amazon.aps.iva.a2.o.a(fVar4, false, (com.amazon.aps.iva.xb0.l) e0);
        }
        g.U(false);
        com.amazon.aps.iva.a1.f a2 = androidx.compose.ui.draw.b.a(com.amazon.aps.iva.cq.b.G(fVar3.o(fVar4)), cVar, bVar, dVar, f2, yVar2, 2);
        a aVar2 = a.a;
        g.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g);
        com.amazon.aps.iva.o0.c2 P = g.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar3 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = com.amazon.aps.iva.s1.u.a(a2);
        if (g.a instanceof com.amazon.aps.iva.o0.d) {
            g.z();
            if (g.M) {
                g.w(aVar3);
            } else {
                g.m();
            }
            com.amazon.aps.iva.cq.b.k0(g, aVar2, e.a.e);
            com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
            e.a.C0752a c0752a = e.a.f;
            if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g, S, c0752a);
            }
            a3.invoke(new x2(g), g, 0);
            g.s(2058660585);
            g.U(false);
            g.U(true);
            g.U(false);
            j2 X = g.X();
            if (X != null) {
                X.d = new b(cVar, str, fVar3, bVar, dVar, f2, yVar2, i, i2);
                return;
            }
            return;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }
}
