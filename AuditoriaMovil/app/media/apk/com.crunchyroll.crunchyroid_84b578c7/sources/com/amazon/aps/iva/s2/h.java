package com.amazon.aps.iva.s2;

import java.util.Arrays;
/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public final class h implements Comparable<h> {
    public boolean b;
    public float f;
    public a j;
    public int c = -1;
    public int d = -1;
    public int e = 0;
    public boolean g = false;
    public final float[] h = new float[9];
    public final float[] i = new float[9];
    public b[] k = new b[16];
    public int l = 0;
    public int m = 0;

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public h(a aVar) {
        this.j = aVar;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i < i2) {
                if (this.k[i] == bVar) {
                    return;
                }
                i++;
            } else {
                b[] bVarArr = this.k;
                if (i2 >= bVarArr.length) {
                    this.k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.k;
                int i3 = this.l;
                bVarArr2[i3] = bVar;
                this.l = i3 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.j = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return this.c - hVar.c;
    }

    public final void f(d dVar, float f) {
        this.f = f;
        this.g = true;
        int i = this.l;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].h(dVar, this, false);
        }
        this.l = 0;
    }

    public final void h(d dVar, b bVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].i(dVar, bVar, false);
        }
        this.l = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
