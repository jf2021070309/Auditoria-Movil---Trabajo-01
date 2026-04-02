package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: Canvas.kt */
/* loaded from: classes.dex */
public final class q {

    /* compiled from: Canvas.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> lVar, int i) {
            super(2);
            this.h = fVar;
            this.i = lVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            q.a(this.h, this.i, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(fVar, "modifier");
        com.amazon.aps.iva.yb0.j.f(lVar, "onDraw");
        com.amazon.aps.iva.o0.j g = iVar.g(-932836462);
        if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.v(lVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.cq.b.k(androidx.compose.ui.draw.a.a(fVar, lVar), g, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(fVar, lVar, i);
        }
    }
}
