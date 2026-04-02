package com.amazon.aps.iva.um;

import com.amazon.aps.iva.fm.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SwitchProfileScreen.kt */
/* loaded from: classes2.dex */
public final class d {

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<f, q> {
        public a(com.amazon.aps.iva.vm.c cVar) {
            super(1, cVar, com.amazon.aps.iva.vm.c.class, "onEvent", "onEvent(Lcom/crunchyroll/mvvm/UiEvent;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            f fVar2 = fVar;
            j.f(fVar2, "p0");
            ((com.amazon.aps.iva.vm.c) this.receiver).K4(fVar2);
            return q.a;
        }
    }

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.ri.b<com.amazon.aps.iva.vm.c> h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ri.b<com.amazon.aps.iva.vm.c> bVar, boolean z, int i, int i2) {
            super(2);
            this.h = bVar;
            this.i = z;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            d.a(this.h, this.i, iVar, I, this.k);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.ri.b<com.amazon.aps.iva.vm.c> bVar, boolean z, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        j.f(bVar, "controllerFactory");
        com.amazon.aps.iva.o0.j g = iVar.g(-771606269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(bVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.a(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                z = false;
            }
            e0.b bVar2 = e0.a;
            com.amazon.aps.iva.vm.c cVar = (com.amazon.aps.iva.vm.c) bVar.a(g);
            a aVar = new a(cVar);
            com.amazon.aps.iva.fm.a.a.getClass();
            com.amazon.aps.iva.um.a.a((e) com.amazon.aps.iva.j5.b.b(cVar.getState(), g).getValue(), z, a.C0253a.a(), null, aVar, g, i3 & 112, 8);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(bVar, z, i, i2);
        }
    }
}
