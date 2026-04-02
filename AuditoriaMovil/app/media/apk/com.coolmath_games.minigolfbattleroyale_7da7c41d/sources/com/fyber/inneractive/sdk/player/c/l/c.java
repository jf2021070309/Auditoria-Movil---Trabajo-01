package com.fyber.inneractive.sdk.player.c.l;

import com.fyber.inneractive.sdk.player.c.k.i;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.l;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c {
    public final List<byte[]> a;
    public final int b;

    public static c a(k kVar) throws l {
        try {
            kVar.d(21);
            int d = kVar.d() & 3;
            int d2 = kVar.d();
            int i = kVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < d2; i3++) {
                kVar.d(1);
                int e = kVar.e();
                for (int i4 = 0; i4 < e; i4++) {
                    int e2 = kVar.e();
                    i2 += e2 + 4;
                    kVar.d(e2);
                }
            }
            kVar.c(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < d2; i6++) {
                kVar.d(1);
                int e3 = kVar.e();
                for (int i7 = 0; i7 < e3; i7++) {
                    int e4 = kVar.e();
                    System.arraycopy(i.a, 0, bArr, i5, i.a.length);
                    int length = i5 + i.a.length;
                    System.arraycopy(kVar.a, kVar.b, bArr, length, e4);
                    i5 = length + e4;
                    kVar.d(e4);
                }
            }
            return new c(i2 == 0 ? null : Collections.singletonList(bArr), d + 1);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new l("Error parsing HEVC config", e5);
        }
    }

    private c(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }
}
