package com.amazon.aps.iva.t2;

import java.util.Arrays;
/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public final class h {
    public float[] a = new float[0];
    public double[] b = new double[0];
    public double[] c;
    public g d;
    public int e;

    public final void a(double d, float f) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d;
        this.a[binarySearch] = f;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}
