package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.w;
import java.util.Arrays;
/* compiled from: FlacMetadataReader.java */
/* loaded from: classes.dex */
public final class u {
    public static w.a a(com.amazon.aps.iva.t5.v vVar) {
        vVar.G(1);
        int w = vVar.w();
        long j = vVar.b + w;
        int i = w / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long n = vVar.n();
            if (n == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = n;
            jArr2[i2] = vVar.n();
            vVar.G(2);
            i2++;
        }
        vVar.G((int) (j - vVar.b));
        return new w.a(jArr, jArr2);
    }
}
