package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: ContinueWatchingSmall.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* compiled from: ContinueWatchingSmall.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar, int i) {
            super(2);
            this.h = aVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            a0.a(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(aVar, FirebaseAnalytics.Param.ITEMS);
        com.amazon.aps.iva.o0.j g = iVar.g(-234894144);
        if ((i & 14) == 0) {
            if (g.H(aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            long j = ((com.amazon.aps.iva.o2.g) g.i(com.amazon.aps.iva.p4.h.a)).a;
            float min = Math.min(com.amazon.aps.iva.o2.g.c(j), com.amazon.aps.iva.o2.g.b(j));
            com.amazon.aps.iva.sd.a aVar2 = (com.amazon.aps.iva.sd.a) com.amazon.aps.iva.lb0.x.t0(aVar);
            float f = 20;
            n.a aVar3 = n.a.b;
            int i5 = (int) min;
            if (i5 > 163) {
                i3 = 163;
            } else {
                i3 = i5;
            }
            com.amazon.aps.iva.p4.n w = com.amazon.aps.iva.ff0.b.w(aVar3, i3);
            if (i5 > 163) {
                i5 = 163;
            }
            s.a(aVar2, com.amazon.aps.iva.ff0.b.J(w, i5), true, f, g, 3456, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(aVar, i);
        }
    }
}
