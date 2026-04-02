package com.amazon.aps.iva.g1;

import com.amazon.aps.iva.f1.d0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
/* compiled from: Rgb.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.g1.c {
    public static final n r = new n(0);
    public final w d;
    public final float e;
    public final float f;
    public final v g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final j k;
    public final c l;
    public final d0 m;
    public final j n;
    public final b o;
    public final m p;
    public final boolean q;

    /* compiled from: Rgb.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static float a(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }
    }

    /* compiled from: Rgb.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Double, Double> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Double invoke(Double d) {
            double doubleValue = d.doubleValue();
            u uVar = u.this;
            return Double.valueOf(uVar.n.f(com.amazon.aps.iva.aq.j.h(doubleValue, uVar.e, uVar.f)));
        }
    }

    /* compiled from: Rgb.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Double, Double> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Double invoke(Double d) {
            double doubleValue = d.doubleValue();
            u uVar = u.this;
            return Double.valueOf(com.amazon.aps.iva.aq.j.h(uVar.k.f(doubleValue), uVar.e, uVar.f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, float[] fArr, w wVar, float[] fArr2, j jVar, j jVar2, float f, float f2, v vVar, int i) {
        super(i, com.amazon.aps.iva.g1.b.a, str);
        boolean z;
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(fArr, "primaries");
        com.amazon.aps.iva.yb0.j.f(jVar, "oetf");
        com.amazon.aps.iva.yb0.j.f(jVar2, "eotf");
        this.d = wVar;
        this.e = f;
        this.f = f2;
        this.g = vVar;
        this.k = jVar;
        this.l = new c();
        this.m = new d0(this, 1);
        this.n = jVar2;
        this.o = new b();
        this.p = new m(this);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = f3 + f4 + fArr[2];
                fArr3[0] = f3 / f5;
                fArr3[1] = f4 / f5;
                float f6 = fArr[3];
                float f7 = fArr[4];
                float f8 = f6 + f7 + fArr[5];
                fArr3[2] = f6 / f8;
                fArr3[3] = f7 / f8;
                float f9 = fArr[6];
                float f10 = fArr[7];
                float f11 = f9 + f10 + fArr[8];
                fArr3[4] = f9 / f11;
                fArr3[5] = f10 / f11;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.h = fArr3;
            if (fArr2 == null) {
                float f12 = fArr3[0];
                float f13 = fArr3[1];
                float f14 = fArr3[2];
                float f15 = fArr3[3];
                float f16 = fArr3[4];
                float f17 = fArr3[5];
                float f18 = 1;
                float f19 = (f18 - f12) / f13;
                float f20 = wVar.a;
                float f21 = wVar.b;
                float f22 = f12 / f13;
                float f23 = (f14 / f15) - f22;
                float f24 = (f20 / f21) - f22;
                float f25 = ((f18 - f14) / f15) - f19;
                float f26 = (f16 / f17) - f22;
                float f27 = (((((f18 - f20) / f21) - f19) * f23) - (f24 * f25)) / (((((f18 - f16) / f17) - f19) * f23) - (f25 * f26));
                float f28 = (f24 - (f26 * f27)) / f23;
                float f29 = (1.0f - f28) - f27;
                float f30 = f29 / f13;
                float f31 = f28 / f15;
                float f32 = f27 / f17;
                this.i = new float[]{f30 * f12, f29, ((1.0f - f12) - f13) * f30, f31 * f14, f28, ((1.0f - f14) - f15) * f31, f32 * f16, f27, ((1.0f - f16) - f17) * f32};
            } else if (fArr2.length == 9) {
                this.i = fArr2;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.j = d.d(this.i);
            float a2 = a.a(fArr3);
            float[] fArr4 = g.a;
            if (a2 / a.a(g.b) > 0.9f) {
                float[] fArr5 = g.a;
                float f33 = fArr3[0];
                float f34 = fArr5[0];
                float f35 = f33 - f34;
                z = true;
                float f36 = fArr3[1];
                float f37 = fArr5[1];
                float f38 = f36 - f37;
                float f39 = fArr3[2];
                float f40 = fArr5[2];
                float f41 = f39 - f40;
                float f42 = fArr3[3];
                float f43 = fArr5[3];
                float f44 = f42 - f43;
                float f45 = fArr3[4];
                float f46 = fArr5[4];
                float f47 = f45 - f46;
                float f48 = fArr3[5];
                float f49 = fArr5[5];
                float f50 = f48 - f49;
                if (((f37 - f49) * f35) - ((f34 - f46) * f38) < 0.0f || ((f34 - f40) * f38) - ((f37 - f43) * f35) < 0.0f || ((f43 - f37) * f41) - ((f40 - f34) * f44) < 0.0f || ((f40 - f46) * f44) - ((f43 - f49) * f41) < 0.0f || ((f49 - f43) * f47) - ((f46 - f40) * f50) < 0.0f || ((f46 - f34) * f50) - ((f49 - f37) * f47) < 0.0f) {
                }
            } else {
                z = true;
            }
            if (i != 0) {
                float[] fArr6 = g.a;
                if (fArr3 != fArr6) {
                    for (int i2 = 0; i2 < 6; i2++) {
                        if (Float.compare(fArr3[i2], fArr6[i2]) != 0 && Math.abs(fArr3[i2] - fArr6[i2]) > 0.001f) {
                            z3 = false;
                            break;
                        }
                    }
                }
                z3 = z;
                if (z3 && d.c(wVar, com.amazon.aps.iva.aq.k.e)) {
                    if (f == 0.0f ? z : false) {
                        if (f2 == 1.0f ? z : false) {
                            float[] fArr7 = g.a;
                            u uVar = g.c;
                            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                                if (Math.abs(jVar.f(d) - uVar.k.f(d)) <= 0.001d ? z : false) {
                                    if (Math.abs(jVar2.f(d) - uVar.n.f(d)) <= 0.001d ? z : false) {
                                    }
                                }
                            }
                        }
                    }
                }
                z2 = false;
                this.q = z2;
                return;
            }
            z2 = z;
            this.q = z2;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] a(float[] fArr) {
        d.g(this.j, fArr);
        d0 d0Var = this.m;
        fArr[0] = (float) d0Var.f(fArr[0]);
        fArr[1] = (float) d0Var.f(fArr[1]);
        fArr[2] = (float) d0Var.f(fArr[2]);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float b(int i) {
        return this.f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float c(int i) {
        return this.e;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final boolean d() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long e(float f, float f2, float f3) {
        double d = f;
        m mVar = this.p;
        float f4 = (float) mVar.f(d);
        float f5 = (float) mVar.f(f2);
        float f6 = (float) mVar.f(f3);
        float[] fArr = this.i;
        return (Float.floatToIntBits(d.h(f4, f5, f6, fArr)) << 32) | (Float.floatToIntBits(d.i(f4, f5, f6, fArr)) & 4294967295L);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        u uVar = (u) obj;
        if (Float.compare(uVar.e, this.e) != 0 || Float.compare(uVar.f, this.f) != 0 || !com.amazon.aps.iva.yb0.j.a(this.d, uVar.d) || !Arrays.equals(this.h, uVar.h)) {
            return false;
        }
        v vVar = uVar.g;
        v vVar2 = this.g;
        if (vVar2 != null) {
            return com.amazon.aps.iva.yb0.j.a(vVar2, vVar);
        }
        if (vVar == null) {
            return true;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.k, uVar.k)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.n, uVar.n);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] f(float[] fArr) {
        m mVar = this.p;
        fArr[0] = (float) mVar.f(fArr[0]);
        fArr[1] = (float) mVar.f(fArr[1]);
        fArr[2] = (float) mVar.f(fArr[2]);
        d.g(this.i, fArr);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float g(float f, float f2, float f3) {
        double d = f;
        m mVar = this.p;
        return d.j((float) mVar.f(d), (float) mVar.f(f2), (float) mVar.f(f3), this.i);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long h(float f, float f2, float f3, float f4, com.amazon.aps.iva.g1.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "colorSpace");
        float[] fArr = this.j;
        float h = d.h(f, f2, f3, fArr);
        float i = d.i(f, f2, f3, fArr);
        float j = d.j(f, f2, f3, fArr);
        d0 d0Var = this.m;
        return defpackage.i.b((float) d0Var.f(h), (float) d0Var.f(i), (float) d0Var.f(j), f4, cVar);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final int hashCode() {
        boolean z;
        int i;
        int i2;
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        boolean z2 = true;
        int i3 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.f;
        if (f2 != 0.0f) {
            z2 = false;
        }
        if (!z2) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        v vVar = this.g;
        if (vVar != null) {
            i3 = vVar.hashCode();
        }
        int i6 = i5 + i3;
        if (vVar == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (i6 * 31)) * 31);
        }
        return i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.lang.String r12, float[] r13, com.amazon.aps.iva.g1.w r14, com.amazon.aps.iva.g1.v r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            r4 = 0
            double r0 = r9.f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r5 = 0
            if (r0 != 0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r5
        Lf:
            double r7 = r9.g
            if (r6 == 0) goto L22
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 != 0) goto L19
            r6 = r1
            goto L1a
        L19:
            r6 = r5
        L1a:
            if (r6 == 0) goto L22
            com.amazon.aps.iva.g1.o r6 = new com.amazon.aps.iva.g1.o
            r6.<init>(r15, r5)
            goto L27
        L22:
            com.amazon.aps.iva.g1.p r6 = new com.amazon.aps.iva.g1.p
            r6.<init>(r15, r5)
        L27:
            if (r0 != 0) goto L2b
            r0 = r1
            goto L2c
        L2b:
            r0 = r5
        L2c:
            if (r0 == 0) goto L3c
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
            goto L34
        L33:
            r1 = r5
        L34:
            if (r1 == 0) goto L3c
            com.amazon.aps.iva.g1.q r0 = new com.amazon.aps.iva.g1.q
            r0.<init>(r15, r5)
            goto L41
        L3c:
            com.amazon.aps.iva.g1.r r0 = new com.amazon.aps.iva.g1.r
            r0.<init>(r15)
        L41:
            r7 = r0
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g1.u.<init>(java.lang.String, float[], com.amazon.aps.iva.g1.w, com.amazon.aps.iva.g1.v, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.amazon.aps.iva.g1.t] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.amazon.aps.iva.g1.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.lang.String r16, float[] r17, com.amazon.aps.iva.g1.w r18, final double r19, float r21, float r22, int r23) {
        /*
            r15 = this;
            r1 = r19
            r11 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Ld
            r5 = r3
            goto Le
        Ld:
            r5 = r4
        Le:
            com.amazon.aps.iva.g1.n r6 = com.amazon.aps.iva.g1.u.r
            if (r5 == 0) goto L14
            r12 = r6
            goto L1a
        L14:
            com.amazon.aps.iva.g1.s r5 = new com.amazon.aps.iva.g1.s
            r5.<init>()
            r12 = r5
        L1a:
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r3 = r4
        L1e:
            if (r3 == 0) goto L22
            r13 = r6
            goto L28
        L22:
            com.amazon.aps.iva.g1.t r0 = new com.amazon.aps.iva.g1.t
            r0.<init>()
            r13 = r0
        L28:
            com.amazon.aps.iva.g1.v r14 = new com.amazon.aps.iva.g1.v
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = r14
            r1 = r19
            r0.<init>(r1, r3, r5, r7, r9)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r21
            r8 = r22
            r9 = r14
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g1.u.<init>(java.lang.String, float[], com.amazon.aps.iva.g1.w, double, float, float, int):void");
    }
}
