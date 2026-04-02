package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.z.h0;
import com.amazon.aps.iva.z.m0;
/* compiled from: ProgressIndicator.kt */
/* loaded from: classes.dex */
public final class v2 {
    public static final float a = o2.a;
    public static final float b = 240;
    public static final float c = 40;
    public static final com.amazon.aps.iva.z.s d = new com.amazon.aps.iva.z.s(0.2f, 0.8f);
    public static final com.amazon.aps.iva.z.s e = new com.amazon.aps.iva.z.s(0.4f, 1.0f);
    public static final com.amazon.aps.iva.z.s f = new com.amazon.aps.iva.z.s(0.0f, 0.65f);
    public static final com.amazon.aps.iva.z.s g = new com.amazon.aps.iva.z.s(0.1f, 0.45f);
    public static final com.amazon.aps.iva.z.s h = new com.amazon.aps.iva.z.s(0.4f, 0.2f);

    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ int i;
        public final /* synthetic */ long j;
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> k;
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> l;
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> m;
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, int i, long j2, h0.a aVar, h0.a aVar2, h0.a aVar3, h0.a aVar4) {
            super(1);
            this.h = j;
            this.i = i;
            this.j = j2;
            this.k = aVar;
            this.l = aVar2;
            this.m = aVar3;
            this.n = aVar4;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e eVar) {
            com.amazon.aps.iva.h1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$Canvas");
            float b = com.amazon.aps.iva.e1.g.b(eVar2.h());
            v2.e(eVar2, 0.0f, 1.0f, this.h, b, this.i);
            com.amazon.aps.iva.o0.p3<Float> p3Var = this.k;
            float floatValue = p3Var.getValue().floatValue();
            com.amazon.aps.iva.o0.p3<Float> p3Var2 = this.l;
            if (floatValue - p3Var2.getValue().floatValue() > 0.0f) {
                v2.e(eVar2, p3Var.getValue().floatValue(), p3Var2.getValue().floatValue(), this.j, b, this.i);
            }
            com.amazon.aps.iva.o0.p3<Float> p3Var3 = this.m;
            float floatValue2 = p3Var3.getValue().floatValue();
            com.amazon.aps.iva.o0.p3<Float> p3Var4 = this.n;
            if (floatValue2 - p3Var4.getValue().floatValue() > 0.0f) {
                v2.e(eVar2, p3Var3.getValue().floatValue(), p3Var4.getValue().floatValue(), this.j, b, this.i);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ long i;
        public final /* synthetic */ long j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.a1.f fVar, long j, long j2, int i, int i2, int i3) {
            super(2);
            this.h = fVar;
            this.i = j;
            this.j = j2;
            this.k = i;
            this.l = i2;
            this.m = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            v2.b(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m0.b<Float>, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m0.b<Float> bVar) {
            m0.b<Float> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "$this$keyframes");
            bVar2.a = 1800;
            m0.a a = bVar2.a(0, Float.valueOf(0.0f));
            com.amazon.aps.iva.z.s sVar = v2.d;
            com.amazon.aps.iva.yb0.j.f(sVar, "easing");
            a.b = sVar;
            bVar2.a(750, Float.valueOf(1.0f));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m0.b<Float>, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m0.b<Float> bVar) {
            m0.b<Float> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "$this$keyframes");
            bVar2.a = 1800;
            m0.a a = bVar2.a(333, Float.valueOf(0.0f));
            com.amazon.aps.iva.z.s sVar = v2.e;
            com.amazon.aps.iva.yb0.j.f(sVar, "easing");
            a.b = sVar;
            bVar2.a(1183, Float.valueOf(1.0f));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m0.b<Float>, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m0.b<Float> bVar) {
            m0.b<Float> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "$this$keyframes");
            bVar2.a = 1800;
            m0.a a = bVar2.a(1000, Float.valueOf(0.0f));
            com.amazon.aps.iva.z.s sVar = v2.f;
            com.amazon.aps.iva.yb0.j.f(sVar, "easing");
            a.b = sVar;
            bVar2.a(1567, Float.valueOf(1.0f));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m0.b<Float>, com.amazon.aps.iva.kb0.q> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m0.b<Float> bVar) {
            m0.b<Float> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "$this$keyframes");
            bVar2.a = 1800;
            m0.a a = bVar2.a(1267, Float.valueOf(0.0f));
            com.amazon.aps.iva.z.s sVar = v2.g;
            com.amazon.aps.iva.yb0.j.f(sVar, "easing");
            a.b = sVar;
            bVar2.a(1800, Float.valueOf(1.0f));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(float r28, int r29, int r30, int r31, long r32, long r34, com.amazon.aps.iva.o0.i r36, com.amazon.aps.iva.a1.f r37) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.v2.a(float, int, int, int, long, long, com.amazon.aps.iva.o0.i, com.amazon.aps.iva.a1.f):void");
    }

    public static final void b(com.amazon.aps.iva.a1.f fVar, long j, long j2, int i, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        Object obj;
        int i4;
        int i5;
        long j3;
        long j4;
        int i6;
        Object obj2;
        long j5;
        int i7;
        int i8;
        int i9;
        com.amazon.aps.iva.o0.j g2 = iVar.g(1501635280);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            obj = fVar;
        } else if ((i2 & 14) == 0) {
            obj = fVar;
            if (g2.H(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            obj = fVar;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (g2.d(j3)) {
                    i9 = 32;
                    i4 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 16;
            i4 |= i9;
        } else {
            j3 = j;
        }
        if ((i2 & 896) == 0) {
            j4 = j2;
            if ((i3 & 4) == 0 && g2.d(j4)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        } else {
            j4 = j2;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                i6 = i;
                if (g2.c(i6)) {
                    i7 = 2048;
                    i4 |= i7;
                }
            } else {
                i6 = i;
            }
            i7 = 1024;
            i4 |= i7;
        } else {
            i6 = i;
        }
        if ((i4 & 5851) == 1170 && g2.h()) {
            g2.A();
            obj2 = obj;
            j5 = j3;
        } else {
            g2.x0();
            if ((i2 & 1) != 0 && !g2.b0()) {
                g2.A();
                obj2 = obj;
                j5 = j3;
            } else {
                if (i10 != 0) {
                    obj2 = f.a.c;
                } else {
                    obj2 = obj;
                }
                if ((i3 & 2) != 0) {
                    e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                    j5 = ((c0) g2.i(d0.a)).f();
                } else {
                    j5 = j3;
                }
                if ((i3 & 4) != 0) {
                    j4 = com.amazon.aps.iva.f1.x.b(j5, 0.24f);
                }
                if ((i3 & 8) != 0) {
                    i6 = 0;
                }
            }
            g2.V();
            e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.z.h0 c2 = com.amazon.aps.iva.z.l0.c(g2);
            h0.a a2 = com.amazon.aps.iva.z.l0.a(c2, 1.0f, com.amazon.aps.iva.z.k.a(com.amazon.aps.iva.z.k.b(c.h)), g2);
            h0.a a3 = com.amazon.aps.iva.z.l0.a(c2, 1.0f, com.amazon.aps.iva.z.k.a(com.amazon.aps.iva.z.k.b(d.h)), g2);
            h0.a a4 = com.amazon.aps.iva.z.l0.a(c2, 1.0f, com.amazon.aps.iva.z.k.a(com.amazon.aps.iva.z.k.b(e.h)), g2);
            h0.a a5 = com.amazon.aps.iva.z.l0.a(c2, 1.0f, com.amazon.aps.iva.z.k.a(com.amazon.aps.iva.z.k.b(f.h)), g2);
            com.amazon.aps.iva.yb0.j.f(obj2, "<this>");
            com.amazon.aps.iva.a1.f k = androidx.compose.foundation.layout.e.k(com.amazon.aps.iva.a2.o.a(obj2, true, com.amazon.aps.iva.a0.v1.h), b, a);
            Object[] objArr = {new com.amazon.aps.iva.f1.x(j4), new com.amazon.aps.iva.f1.y0(i6), a2, a3, new com.amazon.aps.iva.f1.x(j5), a4, a5};
            g2.s(-568225417);
            boolean z = false;
            for (int i11 = 0; i11 < 7; i11++) {
                z |= g2.H(objArr[i11]);
            }
            Object e0 = g2.e0();
            if (z || e0 == i.a.a) {
                e0 = new a(j4, i6, j5, a2, a3, a4, a5);
                g2.K0(e0);
            }
            g2.U(false);
            com.amazon.aps.iva.a0.q.a(k, (com.amazon.aps.iva.xb0.l) e0, g2, 0);
            e0.b bVar3 = com.amazon.aps.iva.o0.e0.a;
        }
        long j6 = j4;
        com.amazon.aps.iva.o0.j2 X = g2.X();
        if (X != null) {
            X.d = new b(obj2, j5, j6, i6, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132 A[LOOP:0: B:82:0x0130->B:83:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r22, int r23, int r24, int r25, long r26, long r28, com.amazon.aps.iva.o0.i r30, com.amazon.aps.iva.a1.f r31) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.v2.c(float, int, int, int, long, long, com.amazon.aps.iva.o0.i, com.amazon.aps.iva.a1.f):void");
    }

    public static final void d(com.amazon.aps.iva.h1.e eVar, float f2, float f3, long j, com.amazon.aps.iva.h1.i iVar) {
        float f4 = 2;
        float f5 = iVar.a / f4;
        float d2 = com.amazon.aps.iva.e1.g.d(eVar.h()) - (f4 * f5);
        com.amazon.aps.iva.h1.e.q0(eVar, j, f2, f3, com.amazon.aps.iva.e1.d.d(f5, f5), com.amazon.aps.iva.ab.r.d(d2, d2), iVar);
    }

    public static final void e(com.amazon.aps.iva.h1.e eVar, float f2, float f3, long j, float f4, int i) {
        boolean z;
        float f5;
        float f6;
        float d2 = com.amazon.aps.iva.e1.g.d(eVar.h());
        float b2 = com.amazon.aps.iva.e1.g.b(eVar.h());
        float f7 = 2;
        float f8 = b2 / f7;
        boolean z2 = true;
        if (eVar.getLayoutDirection() == com.amazon.aps.iva.o2.l.Ltr) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f3;
        }
        float f9 = f5 * d2;
        if (z) {
            f6 = f3;
        } else {
            f6 = 1.0f - f2;
        }
        float f10 = f6 * d2;
        if (i != 0) {
            z2 = false;
        }
        if (!z2 && b2 <= d2) {
            float f11 = f4 / f7;
            com.amazon.aps.iva.ec0.e eVar2 = new com.amazon.aps.iva.ec0.e(f11, d2 - f11);
            float floatValue = ((Number) com.amazon.aps.iva.aq.j.l(Float.valueOf(f9), eVar2)).floatValue();
            float floatValue2 = ((Number) com.amazon.aps.iva.aq.j.l(Float.valueOf(f10), eVar2)).floatValue();
            if (Math.abs(f3 - f2) > 0.0f) {
                com.amazon.aps.iva.h1.e.m0(eVar, j, com.amazon.aps.iva.e1.d.d(floatValue, f8), com.amazon.aps.iva.e1.d.d(floatValue2, f8), f4, i, 480);
                return;
            }
            return;
        }
        com.amazon.aps.iva.h1.e.m0(eVar, j, com.amazon.aps.iva.e1.d.d(f9, f8), com.amazon.aps.iva.e1.d.d(f10, f8), f4, 0, 496);
    }
}
