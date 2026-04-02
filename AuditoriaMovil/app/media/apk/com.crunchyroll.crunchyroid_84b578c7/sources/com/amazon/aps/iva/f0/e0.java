package com.amazon.aps.iva.f0;

import android.view.View;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.s1.e1;
/* compiled from: LazyLayoutPrefetcher.android.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ c0 h;
        public final /* synthetic */ m i;
        public final /* synthetic */ e1 j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, m mVar, e1 e1Var, int i) {
            super(2);
            this.h = c0Var;
            this.i = mVar;
            this.j = e1Var;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            m mVar = this.i;
            e1 e1Var = this.j;
            e0.a(this.h, mVar, e1Var, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(c0 c0Var, m mVar, e1 e1Var, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "prefetchState");
        com.amazon.aps.iva.yb0.j.f(mVar, "itemContentFactory");
        com.amazon.aps.iva.yb0.j.f(e1Var, "subcomposeLayoutState");
        com.amazon.aps.iva.o0.j g = iVar.g(1113453182);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        View view = (View) g.i(androidx.compose.ui.platform.d.f);
        g.s(1618982084);
        boolean H = g.H(e1Var) | g.H(c0Var) | g.H(view);
        Object e0 = g.e0();
        if (H || e0 == i.a.a) {
            g.K0(new d0(c0Var, e1Var, mVar, view));
        }
        g.U(false);
        j2 X = g.X();
        if (X != null) {
            X.d = new a(c0Var, mVar, e1Var, i);
        }
    }
}
