package com.amazon.aps.iva.vn;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.y.x;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrStoreLoadingIndicator.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.v1.a {
    public final y1 j;

    /* compiled from: CrStoreLoadingIndicator.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            i.this.a(iVar, I);
            return q.a;
        }
    }

    public i(Context context) {
        super(context, null, 6, 0);
        this.j = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void a(com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        j g = iVar.g(-795806140);
        if ((i & 14) == 0) {
            if (g.H(this)) {
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
            e0.b bVar = e0.a;
            x.c(getVisible(), null, null, null, null, com.amazon.aps.iva.vn.a.a, g, 196608, 30);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(i);
        }
    }

    public final boolean getVisible() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }
}
