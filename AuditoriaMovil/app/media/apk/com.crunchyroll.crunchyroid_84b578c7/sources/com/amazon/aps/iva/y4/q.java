package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
/* compiled from: Spacer.kt */
/* loaded from: classes.dex */
public final class q {

    /* compiled from: Spacer.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<j> {
        public static final a b = new a();

        public a() {
            super(0, j.class, "<init>", "<init>()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            return new j();
        }
    }

    /* compiled from: Spacer.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<j, com.amazon.aps.iva.p4.n, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(j jVar, com.amazon.aps.iva.p4.n nVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.p4.n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            jVar2.a = nVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Spacer.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.p4.n h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.p4.n nVar, int i, int i2) {
            super(2);
            this.h = nVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int i = this.j;
            q.a(this.h, iVar, this.i | 1, i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(1380468206);
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
            e0.b bVar = e0.a;
            a aVar = a.b;
            g.s(-1115894518);
            g.s(1886828752);
            if (g.a instanceof com.amazon.aps.iva.p4.b) {
                g.z0();
                if (g.M) {
                    g.w(new com.amazon.aps.iva.p4.o(aVar));
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, nVar, b.h);
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
            X.d = new c(nVar, i, i2);
        }
    }
}
