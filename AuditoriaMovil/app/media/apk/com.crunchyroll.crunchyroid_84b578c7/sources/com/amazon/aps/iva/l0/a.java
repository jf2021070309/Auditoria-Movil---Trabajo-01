package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.v1.t1;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AndroidSelectionHandles.android.kt */
    /* renamed from: com.amazon.aps.iva.l0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0460a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ com.amazon.aps.iva.n2.g j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0460a(com.amazon.aps.iva.a1.f fVar, boolean z, com.amazon.aps.iva.n2.g gVar, boolean z2, int i) {
            super(2);
            this.h = fVar;
            this.i = z;
            this.j = gVar;
            this.k = z2;
            this.l = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ h i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, h hVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
            super(2);
            this.h = j;
            this.i = hVar;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.b(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ long k;
        public final /* synthetic */ int l;
        public final /* synthetic */ com.amazon.aps.iva.n2.g m;
        public final /* synthetic */ boolean n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, long j, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.n2.g gVar, com.amazon.aps.iva.xb0.p pVar, boolean z, boolean z2) {
            super(2);
            this.h = pVar;
            this.i = fVar;
            this.j = z;
            this.k = j;
            this.l = i;
            this.m = gVar;
            this.n = z2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                int i = this.l;
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.h;
                if (pVar == null) {
                    iVar2.s(386443790);
                    boolean z = this.j;
                    Boolean valueOf = Boolean.valueOf(z);
                    long j = this.k;
                    com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(j);
                    iVar2.s(511388516);
                    boolean H = iVar2.H(valueOf) | iVar2.H(cVar);
                    Object t = iVar2.t();
                    if (H || t == i.a.a) {
                        t = new com.amazon.aps.iva.l0.b(j, z);
                        iVar2.n(t);
                    }
                    iVar2.G();
                    a.a(com.amazon.aps.iva.a2.o.a(this.i, false, (com.amazon.aps.iva.xb0.l) t), this.j, this.m, this.n, iVar2, (i & 112) | (i & 896) | (i & 7168));
                    iVar2.G();
                } else {
                    iVar2.s(386444465);
                    pVar.invoke(iVar2, Integer.valueOf((i >> 15) & 14));
                    iVar2.G();
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ com.amazon.aps.iva.n2.g j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, long j, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.n2.g gVar, com.amazon.aps.iva.xb0.p pVar, boolean z, boolean z2) {
            super(2);
            this.h = j;
            this.i = z;
            this.j = gVar;
            this.k = z2;
            this.l = fVar;
            this.m = pVar;
            this.n = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.c(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, boolean z, com.amazon.aps.iva.n2.g gVar, boolean z2, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        com.amazon.aps.iva.a1.f a;
        int i3;
        int i4;
        int i5;
        int i6;
        com.amazon.aps.iva.yb0.j.f(fVar, "modifier");
        com.amazon.aps.iva.yb0.j.f(gVar, "direction");
        com.amazon.aps.iva.o0.j g = iVar.g(47957398);
        if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.a(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (g.H(gVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (g.a(z2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f k = androidx.compose.foundation.layout.e.k(fVar, o.a, o.b);
            com.amazon.aps.iva.yb0.j.f(k, "<this>");
            a = com.amazon.aps.iva.a1.e.a(k, t1.a, new e(z, gVar, z2));
            com.amazon.aps.iva.cq.b.k(a, g, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new C0460a(fVar, z, gVar, z2, i);
        }
    }

    public static final void b(long j, h hVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(hVar, "handleReferencePoint");
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(-1409050158);
        if ((i & 14) == 0) {
            if (g.d(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.H(hVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (g.v(pVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            long e = com.amazon.aps.iva.e.w.e(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.c(j)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.d(j)));
            com.amazon.aps.iva.o2.h hVar2 = new com.amazon.aps.iva.o2.h(e);
            g.s(511388516);
            boolean H = g.H(hVar2) | g.H(hVar);
            Object e0 = g.e0();
            if (H || e0 == i.a.a) {
                e0 = new g(hVar, e);
                g.K0(e0);
            }
            g.U(false);
            com.amazon.aps.iva.q2.g.a((g) e0, null, new com.amazon.aps.iva.q2.z(true, 15), pVar, g, ((i2 << 3) & 7168) | 384, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(j, hVar, pVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a6, code lost:
        if (r22 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ac, code lost:
        if (r22 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
        if (r2 == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(long r18, boolean r20, com.amazon.aps.iva.n2.g r21, boolean r22, com.amazon.aps.iva.a1.f r23, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r24, com.amazon.aps.iva.o0.i r25, int r26) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l0.a.c(long, boolean, com.amazon.aps.iva.n2.g, boolean, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.o0.i, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 > r2.getHeight()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.f1.i0 d(com.amazon.aps.iva.c1.e r26, float r27) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l0.a.d(com.amazon.aps.iva.c1.e, float):com.amazon.aps.iva.f1.i0");
    }
}
