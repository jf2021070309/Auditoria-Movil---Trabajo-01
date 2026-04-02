package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.y4.a;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: Column.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: Column.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<h> {
        public static final a b = new a();

        public a() {
            super(0, h.class, "<init>", "<init>()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return new h();
        }
    }

    /* compiled from: Column.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<h, com.amazon.aps.iva.p4.n, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(h hVar, com.amazon.aps.iva.p4.n nVar) {
            h hVar2 = hVar;
            com.amazon.aps.iva.p4.n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            hVar2.d = nVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Column.kt */
    /* renamed from: com.amazon.aps.iva.y4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0886c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<h, a.C0884a, com.amazon.aps.iva.kb0.q> {
        public static final C0886c h = new C0886c();

        public C0886c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(h hVar, a.C0884a c0884a) {
            h hVar2 = hVar;
            int i = c0884a.a;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$set");
            hVar2.f = i;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Column.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<h, a.b, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(h hVar, a.b bVar) {
            h hVar2 = hVar;
            int i = bVar.a;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$set");
            hVar2.e = i;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Column.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.p4.n h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.d, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.p4.n nVar, int i, int i2, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.y4.d, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i3, int i4) {
            super(2);
            this.h = nVar;
            this.i = i;
            this.j = i2;
            this.k = qVar;
            this.l = i3;
            this.m = i4;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            c.a(this.h, this.i, this.j, this.k, iVar, this.l | 1, this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.p4.n nVar, int i, int i2, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.y4.d, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, com.amazon.aps.iva.o0.i iVar, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        com.amazon.aps.iva.yb0.j.f(qVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(-1883910253);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (g.H(nVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        int i11 = i4 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            if (g.c(i)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i12 = i4 & 4;
        if (i12 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            if (g.c(i2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (g.H(qVar)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        if ((i5 & 5851) == 1170 && g.h()) {
            g.A();
        } else {
            if (i10 != 0) {
                nVar = n.a.b;
            }
            if (i11 != 0) {
                i = 0;
            }
            if (i12 != 0) {
                i2 = 0;
            }
            e0.b bVar = e0.a;
            a aVar = a.b;
            g.s(578571862);
            g.s(-548224868);
            if (g.a instanceof com.amazon.aps.iva.p4.b) {
                g.z0();
                if (g.M) {
                    g.w(aVar);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, nVar, b.h);
                com.amazon.aps.iva.cq.b.k0(g, new a.C0884a(i2), C0886c.h);
                com.amazon.aps.iva.cq.b.k0(g, new a.b(i), d.h);
                g.s(-1717484658);
                qVar.invoke(com.amazon.aps.iva.y4.e.a, g, Integer.valueOf(((i5 >> 6) & 112) | 6));
                g.U(false);
                g.U(true);
                g.U(false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        com.amazon.aps.iva.p4.n nVar2 = nVar;
        int i13 = i;
        int i14 = i2;
        j2 X = g.X();
        if (X != null) {
            X.d = new e(nVar2, i13, i14, qVar, i3, i4);
        }
    }
}
