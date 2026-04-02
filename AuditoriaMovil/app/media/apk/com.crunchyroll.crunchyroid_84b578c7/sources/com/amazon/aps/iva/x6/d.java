package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.u5.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AvcConfig.java */
/* loaded from: classes.dex */
public final class d {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    public d(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = str;
    }

    public static d a(com.amazon.aps.iva.t5.v vVar) throws com.amazon.aps.iva.q5.h0 {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        String str;
        try {
            vVar.G(4);
            int u = (vVar.u() & 3) + 1;
            if (u != 3) {
                ArrayList arrayList = new ArrayList();
                int u2 = vVar.u() & 31;
                int i6 = 0;
                while (true) {
                    bArr = com.amazon.aps.iva.ab.x.a;
                    if (i6 >= u2) {
                        break;
                    }
                    int z = vVar.z();
                    int i7 = vVar.b;
                    vVar.G(z);
                    byte[] bArr2 = vVar.a;
                    byte[] bArr3 = new byte[z + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i7, bArr3, 4, z);
                    arrayList.add(bArr3);
                    i6++;
                }
                int u3 = vVar.u();
                for (int i8 = 0; i8 < u3; i8++) {
                    int z2 = vVar.z();
                    int i9 = vVar.b;
                    vVar.G(z2);
                    byte[] bArr4 = vVar.a;
                    byte[] bArr5 = new byte[z2 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i9, bArr5, 4, z2);
                    arrayList.add(bArr5);
                }
                if (u2 > 0) {
                    d.c d = com.amazon.aps.iva.u5.d.d(u, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i10 = d.e;
                    int i11 = d.f;
                    int i12 = d.n;
                    int i13 = d.o;
                    int i14 = d.p;
                    float f2 = d.g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(d.a), Integer.valueOf(d.b), Integer.valueOf(d.c));
                    i3 = i12;
                    i4 = i13;
                    i5 = i14;
                    f = f2;
                    i = i10;
                    i2 = i11;
                } else {
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new d(arrayList, u, i, i2, i3, i4, i5, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw com.amazon.aps.iva.q5.h0.a("Error parsing AVC config", e);
        }
    }
}
