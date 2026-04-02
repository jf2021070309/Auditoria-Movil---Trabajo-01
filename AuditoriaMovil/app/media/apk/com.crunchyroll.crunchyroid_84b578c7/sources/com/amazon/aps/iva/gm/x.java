package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.fm.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: AssetSelectionScreen.kt */
/* loaded from: classes2.dex */
public final class x {

    /* compiled from: AssetSelectionScreen.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> {
        public a(d dVar) {
            super(1, dVar, d.class, "onEvent", "onEvent(Lcom/crunchyroll/mvvm/UiEvent;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(z zVar) {
            z zVar2 = zVar;
            com.amazon.aps.iva.yb0.j.f(zVar2, "p0");
            ((d) this.receiver).K4(zVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AssetSelectionScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;
        public final /* synthetic */ com.amazon.aps.iva.gm.a i;
        public final /* synthetic */ com.amazon.aps.iva.ri.b<d> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, com.amazon.aps.iva.gm.a aVar, com.amazon.aps.iva.ri.b<d> bVar, int i2) {
            super(2);
            this.h = i;
            this.i = aVar;
            this.j = bVar;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.gm.a aVar = this.i;
            com.amazon.aps.iva.ri.b<d> bVar = this.j;
            x.a(this.h, aVar, bVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(int i, com.amazon.aps.iva.gm.a aVar, com.amazon.aps.iva.ri.b<d> bVar, com.amazon.aps.iva.o0.i iVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        com.amazon.aps.iva.yb0.j.f(aVar, "assetItemFactory");
        com.amazon.aps.iva.yb0.j.f(bVar, "controllerFactory");
        com.amazon.aps.iva.o0.j g = iVar.g(-1876900088);
        if ((i2 & 14) == 0) {
            if (g.c(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (g.H(aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 896) == 0) {
            if (g.H(bVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) == 146 && g.h()) {
            g.A();
        } else {
            e0.b bVar2 = e0.a;
            d dVar = (d) bVar.a(g);
            com.amazon.aps.iva.fm.a.a.getClass();
            int i7 = i3 << 3;
            i.a((y) com.amazon.aps.iva.j5.b.b(dVar.getState(), g).getValue(), i, aVar, a.C0253a.a(), null, new a(dVar), g, (i7 & 112) | (i7 & 896), 16);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(i, aVar, bVar, i2);
        }
    }
}
