package com.amazon.aps.iva.wd;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: CreatePasswordScreen.kt */
/* loaded from: classes.dex */
public final class s {

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> {
        public a(o oVar) {
            super(1, oVar, o.class, "onEvent", "onEvent(Lcom/crunchyroll/mvvm/UiEvent;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u uVar) {
            u uVar2 = uVar;
            com.amazon.aps.iva.yb0.j.f(uVar2, "p0");
            ((o) this.receiver).K4(uVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.ri.b<o> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ri.b<o> bVar, int i) {
            super(2);
            this.h = bVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            s.a(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.ri.b<o> bVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(bVar, "controllerFactory");
        com.amazon.aps.iva.o0.j g = iVar.g(1417221357);
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
            o oVar = (o) bVar.a(g);
            com.amazon.aps.iva.wd.b.a((t) com.amazon.aps.iva.j5.b.b(oVar.getState(), g).getValue(), null, new a(oVar), g, 0, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(bVar, i);
        }
    }
}
