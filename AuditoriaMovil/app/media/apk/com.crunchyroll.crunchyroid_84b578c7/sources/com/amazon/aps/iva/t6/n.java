package com.amazon.aps.iva.t6;

import com.amazon.aps.iva.s6.p;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: SlidingPercentile.java */
/* loaded from: classes.dex */
public final class n {
    public static final p h = new p(1);
    public static final com.amazon.aps.iva.m6.j i = new com.amazon.aps.iva.m6.j(3);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final a[] c = new a[5];
    public final ArrayList<a> b = new ArrayList<>();
    public int d = -1;

    /* compiled from: SlidingPercentile.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public float c;
    }

    public n(int i2) {
        this.a = i2;
    }

    public final void a(float f, int i2) {
        a aVar;
        int i3 = this.d;
        ArrayList<a> arrayList = this.b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        a[] aVarArr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            aVar = aVarArr[i5];
        } else {
            aVar = new a();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        aVar.a = i6;
        aVar.b = i2;
        aVar.c = f;
        arrayList.add(aVar);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.a;
            if (i7 > i8) {
                int i9 = i7 - i8;
                a aVar2 = arrayList.get(0);
                int i10 = aVar2.b;
                if (i10 <= i9) {
                    this.f -= i10;
                    arrayList.remove(0);
                    int i11 = this.g;
                    if (i11 < 5) {
                        this.g = i11 + 1;
                        aVarArr[i11] = aVar2;
                    }
                } else {
                    aVar2.b = i10 - i9;
                    this.f -= i9;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList<a> arrayList = this.b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            a aVar = arrayList.get(i4);
            i3 += aVar.b;
            if (i3 >= f) {
                return aVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).c;
    }
}
