package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.u5.d;
import java.util.Collections;
import java.util.List;
/* compiled from: HevcConfig.java */
/* loaded from: classes.dex */
public final class y {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final String g;

    public y(List list, int i, int i2, int i3, int i4, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = str;
    }

    public static y a(com.amazon.aps.iva.t5.v vVar) throws com.amazon.aps.iva.q5.h0 {
        List singletonList;
        int i;
        int i2;
        try {
            vVar.G(21);
            int u = vVar.u() & 3;
            int u2 = vVar.u();
            int i3 = vVar.b;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < u2; i6++) {
                vVar.G(1);
                int z = vVar.z();
                for (int i7 = 0; i7 < z; i7++) {
                    int z2 = vVar.z();
                    i5 += z2 + 4;
                    vVar.G(z2);
                }
            }
            vVar.F(i3);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            String str = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < u2) {
                int u3 = vVar.u() & 63;
                int z3 = vVar.z();
                int i13 = i4;
                while (i13 < z3) {
                    int z4 = vVar.z();
                    int i14 = u2;
                    System.arraycopy(com.amazon.aps.iva.u5.d.a, i4, bArr, i12, 4);
                    int i15 = i12 + 4;
                    System.arraycopy(vVar.a, vVar.b, bArr, i15, z4);
                    if (u3 == 33 && i13 == 0) {
                        d.a c = com.amazon.aps.iva.u5.d.c(i15, bArr, i15 + z4);
                        int i16 = c.j;
                        i9 = c.k;
                        i10 = c.l;
                        float f2 = c.i;
                        f = f2;
                        i = u3;
                        i2 = z3;
                        i8 = i16;
                        str = com.amazon.aps.iva.ab.x.v(c.a, c.c, c.d, c.f, c.b, c.e);
                    } else {
                        i = u3;
                        i2 = z3;
                    }
                    i12 = i15 + z4;
                    vVar.G(z4);
                    i13++;
                    u2 = i14;
                    u3 = i;
                    z3 = i2;
                    i4 = 0;
                }
                i11++;
                i4 = 0;
            }
            if (i5 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new y(singletonList, u + 1, i8, i9, i10, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw com.amazon.aps.iva.q5.h0.a("Error parsing HEVC config", e);
        }
    }
}
