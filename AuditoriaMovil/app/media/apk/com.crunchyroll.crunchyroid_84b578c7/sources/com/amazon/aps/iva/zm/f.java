package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WelcomeScreen.kt */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: WelcomeScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.ri.b<e> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.ri.b<e> bVar, int i) {
            super(2);
            this.h = bVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            f.a(this.h, iVar, I);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.ri.b<e> bVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        j.f(bVar, "controller");
        com.amazon.aps.iva.o0.j g = iVar.g(-417689578);
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
            b.a((g) com.amazon.aps.iva.j5.b.b(((e) bVar.a(g)).getState(), g).getValue(), null, g, 0, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(bVar, i);
        }
    }
}
