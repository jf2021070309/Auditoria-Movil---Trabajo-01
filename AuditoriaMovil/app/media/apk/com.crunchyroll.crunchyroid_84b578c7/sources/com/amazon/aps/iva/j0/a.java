package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: AndroidCursorHandle.android.kt */
/* loaded from: classes.dex */
public final class a {
    public static final float a;
    public static final float b;

    /* compiled from: AndroidCursorHandle.android.kt */
    /* renamed from: com.amazon.aps.iva.j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0389a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0389a(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.a1.f fVar, int i) {
            super(2);
            this.h = pVar;
            this.i = fVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                int i = this.j;
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.h;
                if (pVar == null) {
                    iVar2.s(1275643833);
                    a.b(this.i, iVar2, (i >> 3) & 14);
                    iVar2.G();
                } else {
                    iVar2.s(1275643903);
                    pVar.invoke(iVar2, Integer.valueOf((i >> 6) & 14));
                    iVar2.G();
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
            super(2);
            this.h = j;
            this.i = fVar;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.a1.f fVar, int i) {
            super(2);
            this.h = fVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            a.b(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(long j, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(fVar, "modifier");
        com.amazon.aps.iva.o0.j g = iVar.g(-5185995);
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
            if (g.H(fVar)) {
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
            com.amazon.aps.iva.l0.a.b(j, com.amazon.aps.iva.l0.h.TopMiddle, com.amazon.aps.iva.v0.b.b(g, -1458480226, new C0389a(pVar, fVar, i2)), g, (i2 & 14) | 432);
        }
        com.amazon.aps.iva.o0.j2 X = g.X();
        if (X != null) {
            X.d = new b(j, fVar, pVar, i);
        }
    }

    public static final void b(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        com.amazon.aps.iva.a1.f a2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(fVar, "modifier");
        com.amazon.aps.iva.o0.j g = iVar.g(694251107);
        if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f k = androidx.compose.foundation.layout.e.k(fVar, b, a);
            com.amazon.aps.iva.yb0.j.f(k, "<this>");
            a2 = com.amazon.aps.iva.a1.e.a(k, com.amazon.aps.iva.v1.t1.a, d.h);
            com.amazon.aps.iva.cq.b.k(a2, g, 0);
        }
        com.amazon.aps.iva.o0.j2 X = g.X();
        if (X != null) {
            X.d = new c(fVar, i);
        }
    }
}
