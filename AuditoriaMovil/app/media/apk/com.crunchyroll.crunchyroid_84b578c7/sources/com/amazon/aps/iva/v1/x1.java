package com.amazon.aps.iva.v1;

import android.graphics.Matrix;
/* compiled from: LayerMatrixCache.android.kt */
/* loaded from: classes.dex */
public final class x1<T> {
    public final com.amazon.aps.iva.xb0.p<T, Matrix, com.amazon.aps.iva.kb0.q> a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f;
    public boolean g;
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(com.amazon.aps.iva.xb0.p<? super T, ? super Matrix, com.amazon.aps.iva.kb0.q> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "getMatrix");
        this.a = pVar;
        this.f = true;
        this.g = true;
        this.h = true;
    }

    public final float[] a(T t) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = com.amazon.aps.iva.aq.k.k();
            this.e = fArr;
        }
        if (this.g) {
            this.h = com.amazon.aps.iva.e.z.D(b(t), fArr);
            this.g = false;
        }
        if (!this.h) {
            return null;
        }
        return fArr;
    }

    public final float[] b(T t) {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = com.amazon.aps.iva.aq.k.k();
            this.d = fArr;
        }
        if (!this.f) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(t, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !com.amazon.aps.iva.yb0.j.a(matrix, matrix2)) {
            com.amazon.aps.iva.e.z.P(matrix, fArr);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArr;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}
