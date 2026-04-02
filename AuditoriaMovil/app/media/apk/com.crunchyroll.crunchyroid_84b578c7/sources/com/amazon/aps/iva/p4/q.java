package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
/* compiled from: Image.kt */
/* loaded from: classes.dex */
public final class q {

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<k> {
        public static final a b = new a();

        public a() {
            super(0, k.class, "<init>", "<init>()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            return new k();
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<k, r, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(k kVar, r rVar) {
            k kVar2 = kVar;
            r rVar2 = rVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(rVar2, "it");
            kVar2.b = rVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<k, String, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(k kVar, String str) {
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "$this$set");
            kVar2.c = str;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<k, n, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(k kVar, n nVar) {
            k kVar2 = kVar;
            n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "$this$set");
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            kVar2.a = nVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<k, com.amazon.aps.iva.y4.f, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(k kVar, com.amazon.aps.iva.y4.f fVar) {
            k kVar2 = kVar;
            int i = fVar.a;
            com.amazon.aps.iva.yb0.j.f(kVar2, "$this$set");
            kVar2.d = i;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ r h;
        public final /* synthetic */ String i;
        public final /* synthetic */ n j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, String str, n nVar, int i, int i2, int i3) {
            super(2);
            this.h = rVar;
            this.i = str;
            this.j = nVar;
            this.k = i;
            this.l = i2;
            this.m = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            q.a(this.h, this.i, this.j, this.k, iVar, this.l | 1, this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(r rVar, String str, n nVar, int i, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        com.amazon.aps.iva.yb0.j.f(rVar, "provider");
        com.amazon.aps.iva.o0.j g = iVar.g(-1947995966);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (g.H(rVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (g.H(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (g.H(nVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (g.c(i)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i4 & 5851) == 1170 && g.h()) {
            g.A();
        } else {
            if (i9 != 0) {
                nVar = n.a.b;
            }
            if (i10 != 0) {
                i = 1;
            }
            e0.b bVar = e0.a;
            a aVar = a.b;
            g.s(-1115894518);
            g.s(1886828752);
            if (g.a instanceof com.amazon.aps.iva.p4.b) {
                g.z0();
                if (g.M) {
                    g.w(new o(aVar));
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, rVar, b.h);
                com.amazon.aps.iva.cq.b.k0(g, str, c.h);
                com.amazon.aps.iva.cq.b.k0(g, nVar, d.h);
                com.amazon.aps.iva.cq.b.k0(g, new com.amazon.aps.iva.y4.f(i), e.h);
                g.U(true);
                g.U(false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        n nVar2 = nVar;
        int i11 = i;
        j2 X = g.X();
        if (X != null) {
            X.d = new f(rVar, str, nVar2, i11, i2, i3);
        }
    }
}
