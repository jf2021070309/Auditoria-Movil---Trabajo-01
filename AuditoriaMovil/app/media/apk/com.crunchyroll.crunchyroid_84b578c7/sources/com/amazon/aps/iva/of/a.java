package com.amazon.aps.iva.of;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.d;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LoadingOverlay.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: LoadingOverlay.kt */
    /* renamed from: com.amazon.aps.iva.of.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0572a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0572a h = new C0572a();

        public C0572a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "loading_overlay");
            return q.a;
        }
    }

    /* compiled from: LoadingOverlay.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            a.a(this.h, iVar, I, i);
            return q.a;
        }
    }

    public static final void a(f fVar, i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(-936673847);
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
            f j = e.j(o.a(fVar, false, C0572a.h), com.amazon.aps.iva.cq.b.N(R.dimen.progress_bar_size, g));
            d0 c = e.c(g, 733328855, a.C0097a.e, false, g, -1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a = u.a(j);
            if (g.a instanceof d) {
                g.z();
                if (g.M) {
                    g.w(aVar);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d(0, a, new x2(g), g, 2058660585);
                com.amazon.aps.iva.zn.f.a(null, g, 0, 1);
                g.U(false);
                g.U(true);
                g.U(false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(fVar, i, i2);
        }
    }
}
