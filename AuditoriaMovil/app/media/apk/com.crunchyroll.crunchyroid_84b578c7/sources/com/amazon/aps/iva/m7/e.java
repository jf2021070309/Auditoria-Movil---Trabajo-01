package com.amazon.aps.iva.m7;

import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.i;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: Sniffer.java */
/* loaded from: classes.dex */
public final class e {
    public final v a = new v(8);
    public int b;

    public final long a(i iVar) throws IOException {
        v vVar = this.a;
        int i = 0;
        iVar.c(vVar.a, 0, 1, false);
        int i2 = vVar.a[0] & UnsignedBytes.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        iVar.c(vVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (vVar.a[i] & UnsignedBytes.MAX_VALUE) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
