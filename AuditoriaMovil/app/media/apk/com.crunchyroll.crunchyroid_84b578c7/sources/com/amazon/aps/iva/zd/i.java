package com.amazon.aps.iva.zd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
/* compiled from: EnterPasswordScreen.kt */
/* loaded from: classes.dex */
public final class i {

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements l<k, q> {
        public a(e eVar) {
            super(1, eVar, e.class, "onEvent", "onEvent(Lcom/crunchyroll/mvvm/UiEvent;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(k kVar) {
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "p0");
            ((e) this.receiver).K4(kVar2);
            return q.a;
        }
    }

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.ri.b<e> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ri.b<e> bVar, int i) {
            super(2);
            this.h = bVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            i.a(this.h, iVar, I);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.ri.b<e> bVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(bVar, "controllerFactory");
        com.amazon.aps.iva.o0.j g = iVar.g(93668799);
        if ((i & 14) == 0) {
            if (g.H(bVar)) {
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
            e0.b bVar2 = e0.a;
            e eVar = (e) bVar.a(g);
            com.amazon.aps.iva.zd.b.a((j) com.amazon.aps.iva.j5.b.b(eVar.getState(), g).getValue(), null, new a(eVar), g, 0, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(bVar, i);
        }
    }
}
