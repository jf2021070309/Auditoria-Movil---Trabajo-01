package com.amazon.aps.iva.a5;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.p4.o;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Text.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: Text.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.a5.a> {
        public static final a b = new a();

        public a() {
            super(0, com.amazon.aps.iva.a5.a.class, "<init>", "<init>()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.a5.a invoke() {
            return new com.amazon.aps.iva.a5.a();
        }
    }

    /* compiled from: Text.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<com.amazon.aps.iva.a5.a, String, q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.a5.a aVar, String str) {
            com.amazon.aps.iva.a5.a aVar2 = aVar;
            String str2 = str;
            j.f(aVar2, "$this$set");
            j.f(str2, "it");
            aVar2.b = str2;
            return q.a;
        }
    }

    /* compiled from: Text.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements p<com.amazon.aps.iva.a5.a, n, q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.a5.a aVar, n nVar) {
            com.amazon.aps.iva.a5.a aVar2 = aVar;
            n nVar2 = nVar;
            j.f(aVar2, "$this$set");
            j.f(nVar2, "it");
            aVar2.a = nVar2;
            return q.a;
        }
    }

    /* compiled from: Text.kt */
    /* renamed from: com.amazon.aps.iva.a5.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0102d extends l implements p<com.amazon.aps.iva.a5.a, com.amazon.aps.iva.a5.e, q> {
        public static final C0102d h = new C0102d();

        public C0102d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.a5.a aVar, com.amazon.aps.iva.a5.e eVar) {
            com.amazon.aps.iva.a5.a aVar2 = aVar;
            j.f(aVar2, "$this$set");
            aVar2.c = eVar;
            return q.a;
        }
    }

    /* compiled from: Text.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements p<com.amazon.aps.iva.a5.a, Integer, q> {
        public static final e h = new e();

        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.a5.a aVar, Integer num) {
            com.amazon.aps.iva.a5.a aVar2 = aVar;
            int intValue = num.intValue();
            j.f(aVar2, "$this$set");
            aVar2.d = intValue;
            return q.a;
        }
    }

    /* compiled from: Text.kt */
    /* loaded from: classes.dex */
    public static final class f extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ n i;
        public final /* synthetic */ com.amazon.aps.iva.a5.e j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, n nVar, com.amazon.aps.iva.a5.e eVar, int i, int i2, int i3) {
            super(2);
            this.h = str;
            this.i = nVar;
            this.j = eVar;
            this.k = i;
            this.l = i2;
            this.m = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            d.a(this.h, this.i, this.j, this.k, iVar, this.l | 1, this.m);
            return q.a;
        }
    }

    public static final void a(String str, n nVar, com.amazon.aps.iva.a5.e eVar, int i, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        j.f(str, "text");
        com.amazon.aps.iva.o0.j g = iVar.g(-192911377);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (g.H(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (g.H(nVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (g.H(eVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
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
                eVar = null;
            }
            if (i11 != 0) {
                i = Integer.MAX_VALUE;
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
                com.amazon.aps.iva.cq.b.k0(g, str, b.h);
                com.amazon.aps.iva.cq.b.k0(g, nVar, c.h);
                com.amazon.aps.iva.cq.b.k0(g, eVar, C0102d.h);
                e eVar2 = e.h;
                if (g.M || !j.a(g.e0(), Integer.valueOf(i))) {
                    g.K0(Integer.valueOf(i));
                    g.B(Integer.valueOf(i), eVar2);
                }
                g.U(true);
                g.U(false);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        n nVar2 = nVar;
        com.amazon.aps.iva.a5.e eVar3 = eVar;
        int i12 = i;
        j2 X = g.X();
        if (X != null) {
            X.d = new f(str, nVar2, eVar3, i12, i2, i3);
        }
    }
}
