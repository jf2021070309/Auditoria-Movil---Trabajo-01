package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.w0;
import com.amazon.aps.iva.o0.w1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.s1.s0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: LazyLayoutPinnableItem.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* compiled from: LazyLayoutPinnableItem.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
        public final /* synthetic */ y h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.h = yVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            return new z(this.h);
        }
    }

    /* compiled from: LazyLayoutPinnableItem.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Object h;
        public final /* synthetic */ int i;
        public final /* synthetic */ b0 j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj, int i, b0 b0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i2) {
            super(2);
            this.h = obj;
            this.i = i;
            this.j = b0Var;
            this.k = pVar;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a0.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(Object obj, int i, b0 b0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i2) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "pinnedItemList");
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(-2079116560);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        g.s(511388516);
        boolean H = g.H(obj) | g.H(b0Var);
        Object e0 = g.e0();
        i.a.C0550a c0550a = i.a.a;
        if (H || e0 == c0550a) {
            e0 = new y(obj, b0Var);
            g.K0(e0);
        }
        g.U(false);
        y yVar = (y) e0;
        w1 w1Var = yVar.c;
        y1 y1Var = yVar.e;
        y1 y1Var2 = yVar.f;
        w1Var.e(i);
        w0 w0Var = com.amazon.aps.iva.s1.t0.a;
        com.amazon.aps.iva.s1.s0 s0Var = (com.amazon.aps.iva.s1.s0) g.i(w0Var);
        y yVar2 = null;
        com.amazon.aps.iva.y0.h h = com.amazon.aps.iva.y0.m.h((com.amazon.aps.iva.y0.h) com.amazon.aps.iva.y0.m.b.a(), null, false);
        try {
            com.amazon.aps.iva.y0.h j = h.j();
            if (s0Var != ((com.amazon.aps.iva.s1.s0) y1Var2.getValue())) {
                y1Var2.setValue(s0Var);
                if (yVar.b() > 0) {
                    s0.a aVar = (s0.a) y1Var.getValue();
                    if (aVar != null) {
                        aVar.release();
                    }
                    if (s0Var != null) {
                        yVar2 = s0Var.a();
                    }
                    y1Var.setValue(yVar2);
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.y0.h.p(j);
            h.c();
            g.s(1157296644);
            boolean H2 = g.H(yVar);
            Object e02 = g.e0();
            if (H2 || e02 == c0550a) {
                e02 = new a(yVar);
                g.K0(e02);
            }
            g.U(false);
            x0.a(yVar, (com.amazon.aps.iva.xb0.l) e02, g);
            com.amazon.aps.iva.o0.l0.a(new h2[]{w0Var.b(yVar)}, pVar, g, ((i2 >> 6) & 112) | 8);
            j2 X = g.X();
            if (X != null) {
                X.d = new b(obj, i, b0Var, pVar, i2);
            }
        } catch (Throwable th) {
            h.c();
            throw th;
        }
    }
}
