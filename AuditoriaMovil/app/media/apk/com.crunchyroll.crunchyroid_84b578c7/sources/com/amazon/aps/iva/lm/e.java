package com.amazon.aps.iva.lm;

import com.amazon.aps.iva.fm.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
/* compiled from: ManageProfileScreen.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: ManageProfileScreen.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements l<g, q> {
        public a(c cVar) {
            super(1, cVar, c.class, "onEvent", "onEvent(Lcom/crunchyroll/mvvm/UiEvent;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "p0");
            ((c) this.receiver).K4(gVar2);
            return q.a;
        }
    }

    /* compiled from: ManageProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.mm.c h;
        public final /* synthetic */ com.amazon.aps.iva.ri.b<c> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.mm.c cVar, com.amazon.aps.iva.ri.b<c> bVar, int i) {
            super(2);
            this.h = cVar;
            this.i = bVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            e.a(this.h, this.i, iVar, I);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.mm.c cVar, com.amazon.aps.iva.ri.b<c> bVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(cVar, "screenVariant");
        com.amazon.aps.iva.yb0.j.f(bVar, "controllerFactory");
        com.amazon.aps.iva.o0.j g = iVar.g(1281251847);
        if ((i & 14) == 0) {
            if (g.H(cVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.H(bVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && g.h()) {
            g.A();
        } else {
            e0.b bVar2 = e0.a;
            c cVar2 = (c) bVar.a(g);
            com.amazon.aps.iva.fm.a.a.getClass();
            d.a((f) com.amazon.aps.iva.j5.b.b(cVar2.getState(), g).getValue(), a.C0253a.a(), cVar, null, new a(cVar2), g, (i2 << 6) & 896, 8);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(cVar, bVar, i);
        }
    }
}
