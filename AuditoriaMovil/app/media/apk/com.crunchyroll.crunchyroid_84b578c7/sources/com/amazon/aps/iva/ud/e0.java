package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ErrorLayout.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* compiled from: ErrorLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.p4.n h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.p4.n nVar, int i, int i2) {
            super(2);
            this.h = nVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            e0.a(this.h, iVar, I, i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(-379793005);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(nVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                nVar = n.a.b;
            }
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.y4.b.a(com.amazon.aps.iva.ff0.b.m(nVar, new com.amazon.aps.iva.p4.a(R.drawable.background_widget_gradient)), null, j.b, g, 384, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(nVar, i, i2);
        }
    }
}
