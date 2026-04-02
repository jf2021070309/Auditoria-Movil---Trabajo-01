package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.q6.f;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.x6.f0;
/* compiled from: BaseMediaChunkOutput.java */
/* loaded from: classes.dex */
public final class c implements f.a {
    public final int[] a;
    public final g0[] b;

    public c(int[] iArr, g0[] g0VarArr) {
        this.a = iArr;
        this.b = g0VarArr;
    }

    public final f0 a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return this.b[i2];
                }
                i2++;
            } else {
                p.c();
                return new com.amazon.aps.iva.x6.m();
            }
        }
    }
}
