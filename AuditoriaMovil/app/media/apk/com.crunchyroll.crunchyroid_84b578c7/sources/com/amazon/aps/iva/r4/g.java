package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
/* compiled from: CircularProgressIndicator.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(0);
            this.h = bVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.amazon.aps.iva.r4.q] */
        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            return this.h.invoke();
        }
    }

    /* compiled from: CircularProgressIndicator.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public static final b b = new b();

        public b() {
            super(0, q.class, "<init>", "<init>()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            return new q();
        }
    }

    /* compiled from: CircularProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<q, com.amazon.aps.iva.p4.n, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(q qVar, com.amazon.aps.iva.p4.n nVar) {
            q qVar2 = qVar;
            com.amazon.aps.iva.p4.n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(qVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            qVar2.a = nVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CircularProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<q, com.amazon.aps.iva.b5.a, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(q qVar, com.amazon.aps.iva.b5.a aVar) {
            q qVar2 = qVar;
            com.amazon.aps.iva.b5.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(qVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            qVar2.b = aVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CircularProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.p4.n h;
        public final /* synthetic */ com.amazon.aps.iva.b5.a i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.b5.a aVar, int i, int i2) {
            super(2);
            this.h = nVar;
            this.i = aVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.a(this.h, this.i, iVar, this.j | 1, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.b5.a aVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(-525156579);
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
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        if (i6 == 2 && (i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            g.x0();
            if ((i & 1) != 0 && !g.b0()) {
                g.A();
            } else {
                if (i5 != 0) {
                    nVar = n.a.b;
                }
                if (i6 != 0) {
                    aVar = p1.a;
                }
            }
            g.V();
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            b bVar2 = b.b;
            g.s(-1115894518);
            g.s(1886828752);
            if (g.a instanceof com.amazon.aps.iva.p4.b) {
                g.z0();
                if (g.M) {
                    g.w(new a(bVar2));
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, nVar, c.h);
                com.amazon.aps.iva.cq.b.k0(g, aVar, d.h);
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
            X.d = new e(nVar, aVar, i, i2);
        }
    }
}
