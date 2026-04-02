package com.amazon.aps.iva.ha;

import java.util.Arrays;
/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public final class c {
    public final float[] a;
    public final int[] b;

    public c(int[] iArr, float[] fArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final c a(float[] fArr) {
        int s;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                s = iArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    s = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    s = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    s = com.amazon.aps.iva.gr.n.s(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = s;
        }
        return new c(iArr, fArr);
    }
}
