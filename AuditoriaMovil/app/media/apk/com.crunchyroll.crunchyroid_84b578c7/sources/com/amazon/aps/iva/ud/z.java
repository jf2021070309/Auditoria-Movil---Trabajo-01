package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: ContinueWatchingMedium.kt */
/* loaded from: classes.dex */
public final class z {

    /* compiled from: ContinueWatchingMedium.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar) {
            super(2);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.p4.n K = com.amazon.aps.iva.e.w.K(com.amazon.aps.iva.ff0.b.m(n.a.b, new com.amazon.aps.iva.p4.a(R.drawable.background_widget_gradient)), 16);
                com.amazon.aps.iva.yb0.j.f(K, "<this>");
                com.amazon.aps.iva.y4.n.a(com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.ff0.b.K(K)), 1, 0, com.amazon.aps.iva.v0.b.b(iVar2, -632786, new y(this.h)), iVar2, 3072, 4);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ContinueWatchingMedium.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar, int i) {
            super(2);
            this.h = aVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            z.a(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(aVar, FirebaseAnalytics.Param.ITEMS);
        com.amazon.aps.iva.o0.j g = iVar.g(-1180518348);
        if ((i & 14) == 0) {
            if (g.H(aVar)) {
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
            com.amazon.aps.iva.y4.b.a(com.amazon.aps.iva.ff0.b.p(n.a.b), com.amazon.aps.iva.y4.a.e, com.amazon.aps.iva.v0.b.b(g, 1628940050, new a(aVar)), g, 384, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(aVar, i);
        }
    }
}
