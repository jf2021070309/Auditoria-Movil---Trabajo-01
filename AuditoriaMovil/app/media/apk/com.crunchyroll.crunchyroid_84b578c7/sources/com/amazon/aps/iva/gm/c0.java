package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.fm.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: AssetItemFactory.kt */
/* loaded from: classes2.dex */
public final class c0 implements com.amazon.aps.iva.gm.a {
    public static final c0 a = new c0();

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
            c0.this.a(dVar, aVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.gm.a
    public final void a(com.amazon.aps.iva.hm.d dVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        com.amazon.aps.iva.hm.a aVar2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(dVar, "asset");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        com.amazon.aps.iva.o0.j g = iVar.g(1738925947);
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
            float f = 100;
            com.amazon.aps.iva.fm.a.a.getClass();
            String c = a.C0253a.a().c(dVar.a, f, g, 48);
            if (dVar.c) {
                aVar2 = com.amazon.aps.iva.hm.a.ASSET_SELECTION_LOADING;
            } else if (dVar.b) {
                aVar2 = com.amazon.aps.iva.hm.a.ASSET_SELECTION_SELECTED;
            } else {
                aVar2 = com.amazon.aps.iva.hm.a.ASSET_SELECTION_DEFAULT;
            }
            float f2 = 4;
            com.amazon.aps.iva.cn.a.a(c, aVar2, null, new com.amazon.aps.iva.cn.c(f, f2, 24, f2), null, aVar, g, (i2 << 12) & 458752, 20);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(dVar, aVar, i);
        }
    }
}
