package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.l0;
import com.amazon.aps.iva.o0.w0;
import com.amazon.aps.iva.xb0.p;
import java.lang.ref.WeakReference;
/* compiled from: NavBackStackEntryProvider.kt */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: NavBackStackEntryProvider.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.x0.e h;
        public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.x0.e eVar, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, int i) {
            super(2);
            this.h = eVar;
            this.i = pVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                h.b(this.h, this.i, iVar2, ((this.j >> 3) & 112) | 8);
            }
            return q.a;
        }
    }

    /* compiled from: NavBackStackEntryProvider.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.g8.f h;
        public final /* synthetic */ com.amazon.aps.iva.x0.e i;
        public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.g8.f fVar, com.amazon.aps.iva.x0.e eVar, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, int i) {
            super(2);
            this.h = fVar;
            this.i = eVar;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.x0.e eVar = this.i;
            p<com.amazon.aps.iva.o0.i, Integer, q> pVar = this.j;
            h.a(this.h, eVar, pVar, iVar, I);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.g8.f fVar, com.amazon.aps.iva.x0.e eVar, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(-1579360880);
        e0.b bVar = e0.a;
        w0 w0Var = com.amazon.aps.iva.l5.a.a;
        com.amazon.aps.iva.yb0.j.f(fVar, "viewModelStoreOwner");
        l0.a(new h2[]{com.amazon.aps.iva.l5.a.a.b(fVar), androidx.compose.ui.platform.d.d.b(fVar), androidx.compose.ui.platform.d.e.b(fVar)}, com.amazon.aps.iva.v0.b.b(g, -52928304, new a(eVar, pVar, i)), g, 56);
        j2 X = g.X();
        if (X != null) {
            X.d = new b(fVar, eVar, pVar, i);
        }
    }

    public static final void b(com.amazon.aps.iva.x0.e eVar, p pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.k5.a aVar;
        com.amazon.aps.iva.o0.j g = iVar.g(1211832233);
        e0.b bVar = e0.a;
        g.s(1729797275);
        h0 a2 = com.amazon.aps.iva.l5.a.a(g);
        if (a2 != null) {
            if (a2 instanceof androidx.lifecycle.e) {
                aVar = ((androidx.lifecycle.e) a2).getDefaultViewModelCreationExtras();
            } else {
                aVar = a.C0433a.b;
            }
            f0 a3 = com.amazon.aps.iva.l5.b.a(com.amazon.aps.iva.h8.a.class, a2, null, aVar, g);
            g.U(false);
            com.amazon.aps.iva.h8.a aVar2 = (com.amazon.aps.iva.h8.a) a3;
            aVar2.c = new WeakReference<>(eVar);
            eVar.f(aVar2.b, pVar, g, (i & 112) | 520);
            j2 X = g.X();
            if (X != null) {
                X.d = new i(eVar, pVar, i);
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
