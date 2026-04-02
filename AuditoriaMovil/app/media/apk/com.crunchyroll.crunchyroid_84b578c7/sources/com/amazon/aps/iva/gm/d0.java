package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.fm.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: AssetItemFactory.kt */
/* loaded from: classes2.dex */
public final class d0 implements com.amazon.aps.iva.gm.a {
    public static final d0 a = new d0();

    /* compiled from: AssetItemFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.hm.d i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.hm.d dVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, int i) {
            super(2);
            this.i = dVar;
            this.j = aVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.hm.d dVar = this.i;
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.j;
            d0.this.a(dVar, aVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.gm.a
    public final void a(com.amazon.aps.iva.hm.d dVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        com.amazon.aps.iva.im.d dVar2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(dVar, "asset");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        com.amazon.aps.iva.o0.j g = iVar.g(1917708432);
        if ((i & 14) == 0) {
            if (g.H(dVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.v(aVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            String str = dVar.a;
            com.amazon.aps.iva.fm.a.a.getClass();
            com.amazon.aps.iva.fm.a a2 = a.C0253a.a();
            if (dVar.c) {
                dVar2 = com.amazon.aps.iva.im.d.LOADING;
            } else if (dVar.b) {
                dVar2 = com.amazon.aps.iva.im.d.SELECTED;
            } else {
                dVar2 = com.amazon.aps.iva.im.d.DEFAULT;
            }
            com.amazon.aps.iva.im.c.a(dVar2, a2, null, str, aVar, g, (i2 << 9) & 57344, 4);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(dVar, aVar, i);
        }
    }
}
