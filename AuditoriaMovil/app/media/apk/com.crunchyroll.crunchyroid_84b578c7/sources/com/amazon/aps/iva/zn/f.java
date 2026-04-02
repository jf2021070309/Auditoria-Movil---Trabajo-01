package com.amazon.aps.iva.zn;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.m0.v2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: CircularProgress.kt */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: CircularProgress.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "circular_progress");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CircularProgress.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            f.a(this.h, iVar, I, i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(675829843);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(fVar)) {
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
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            v2.a(0.0f, 0, 48, 28, com.amazon.aps.iva.ao.a.a, 0L, g, com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.e.j(fVar, 44), false, a.h));
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(fVar, i, i2);
        }
    }
}
