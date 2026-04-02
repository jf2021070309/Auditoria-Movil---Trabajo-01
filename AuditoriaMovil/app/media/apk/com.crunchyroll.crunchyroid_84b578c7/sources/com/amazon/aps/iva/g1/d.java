package com.amazon.aps.iva.g1;

import com.amazon.aps.iva.g1.a;
/* compiled from: ColorSpace.kt */
/* loaded from: classes.dex */
public final class d {
    public static c a(c cVar) {
        w wVar = com.amazon.aps.iva.aq.k.c;
        a.C0285a c0285a = a.b;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (b.a(cVar.b, b.a)) {
            u uVar = (u) cVar;
            if (!c(uVar.d, wVar)) {
                float[] a = wVar.a();
                return new u(uVar.a, uVar.h, wVar, e(b(c0285a.a, uVar.d.a(), a), uVar.i), uVar.k, uVar.n, uVar.e, uVar.f, uVar.g, -1);
            }
            return cVar;
        }
        return cVar;
    }

    public static final float[] b(float[] fArr, float[] fArr2, float[] fArr3) {
        com.amazon.aps.iva.yb0.j.f(fArr, "matrix");
        g(fArr, fArr2);
        g(fArr, fArr3);
        return e(d(fArr), f(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean c(w wVar, w wVar2) {
        com.amazon.aps.iva.yb0.j.f(wVar, "a");
        com.amazon.aps.iva.yb0.j.f(wVar2, "b");
        if (wVar == wVar2) {
            return true;
        }
        if (Math.abs(wVar.a - wVar2.a) < 0.001f && Math.abs(wVar.b - wVar2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final float[] d(float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(fArr, "m");
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] e(float[] fArr, float[] fArr2) {
        com.amazon.aps.iva.yb0.j.f(fArr, "lhs");
        com.amazon.aps.iva.yb0.j.f(fArr2, "rhs");
        float f = fArr[3];
        float f2 = fArr2[1];
        float f3 = f * f2;
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = f4 * f5;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = f2 * f9;
        float f11 = fArr[7];
        float f12 = f11 * f5;
        float f13 = fArr[5];
        float f14 = fArr2[1] * f13;
        float f15 = fArr[8];
        float f16 = f5 * f15;
        float f17 = fArr[0];
        float f18 = fArr2[4];
        float f19 = (f * f18) + (fArr2[3] * f17);
        float f20 = fArr2[5];
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        float f24 = fArr[2];
        float f25 = f13 * fArr2[4];
        float f26 = f17 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        float f31 = fArr2[6];
        return new float[]{f6 + f3 + (fArr[0] * fArr2[0]), f12 + f10 + (f7 * f8), f16 + f14 + (fArr[2] * f8), (f4 * f20) + f19, (f11 * f20) + f23 + (f21 * f22), (f20 * f15) + f25 + (f22 * f24), (f4 * f30) + f29, (f11 * f30) + (fArr[4] * f28) + (f21 * f31), (f15 * f30) + (fArr[5] * fArr2[7]) + (f24 * f31)};
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        com.amazon.aps.iva.yb0.j.f(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    public static final void g(float[] fArr, float[] fArr2) {
        com.amazon.aps.iva.yb0.j.f(fArr, "lhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f4 = fArr[2] * f;
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + f4;
    }

    public static final float h(float f, float f2, float f3, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(fArr, "lhs");
        float f4 = fArr[0] * f;
        return (fArr[6] * f3) + (fArr[3] * f2) + f4;
    }

    public static final float i(float f, float f2, float f3, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(fArr, "lhs");
        float f4 = fArr[1] * f;
        return (fArr[7] * f3) + (fArr[4] * f2) + f4;
    }

    public static final float j(float f, float f2, float f3, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(fArr, "lhs");
        float f4 = fArr[2] * f;
        return (fArr[8] * f3) + (fArr[5] * f2) + f4;
    }
}
