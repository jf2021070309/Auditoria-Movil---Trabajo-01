package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<g> {
        public static final a b = new a();

        public a() {
            super(0, g.class, "<init>", "<init>()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            return new g();
        }
    }

    /* compiled from: Box.kt */
    /* renamed from: com.amazon.aps.iva.y4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0885b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<g, com.amazon.aps.iva.p4.n, com.amazon.aps.iva.kb0.q> {
        public static final C0885b h = new C0885b();

        public C0885b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(g gVar, com.amazon.aps.iva.p4.n nVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.p4.n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            gVar2.d = nVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<g, com.amazon.aps.iva.y4.a, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(g gVar, com.amazon.aps.iva.y4.a aVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.y4.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            gVar2.e = aVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.p4.n h;
        public final /* synthetic */ com.amazon.aps.iva.y4.a i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.y4.a aVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, int i2) {
            super(2);
            this.h = nVar;
            this.i = aVar;
            this.j = pVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            b.a(this.h, this.i, this.j, iVar, this.k | 1, this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.y4.a aVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(1959221577);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (g.H(pVar)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && g.h()) {
            g.A();
        } else {
            if (i7 != 0) {
                nVar = n.a.b;
            }
            if (i8 != 0) {
                aVar = com.amazon.aps.iva.y4.a.c;
            }
            e0.b bVar = e0.a;
            a aVar2 = a.b;
            int i9 = i3 & 896;
            g.s(578571862);
            int i10 = (i9 & 896) | (i9 & 14) | (i9 & 112);
            g.s(-548224868);
            if (g.a instanceof com.amazon.aps.iva.p4.b) {
                g.z0();
                if (g.M) {
                    g.w(aVar2);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, nVar, C0885b.h);
                com.amazon.aps.iva.cq.b.k0(g, aVar, c.h);
                pVar.invoke(g, Integer.valueOf((i10 >> 6) & 14));
                g.U(true);
                g.U(false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        com.amazon.aps.iva.p4.n nVar2 = nVar;
        com.amazon.aps.iva.y4.a aVar3 = aVar;
        j2 X = g.X();
        if (X != null) {
            X.d = new d(nVar2, aVar3, pVar, i, i2);
        }
    }
}
