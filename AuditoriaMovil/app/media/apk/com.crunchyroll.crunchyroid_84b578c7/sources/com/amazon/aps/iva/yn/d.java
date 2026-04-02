package com.amazon.aps.iva.yn;

import com.amazon.aps.iva.yn.a;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/* compiled from: BifFileParserImpl.java */
/* loaded from: classes2.dex */
public final class d implements c {
    public static int b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length - 1;
            for (int i = 0; length > i; i++) {
                byte b = bArr[length];
                bArr[length] = bArr[i];
                bArr[i] = b;
                length--;
            }
        }
        return ((bArr[0] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[3] & UnsignedBytes.MAX_VALUE) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16);
    }

    @Override // com.amazon.aps.iva.yn.c
    public final b a(byte[] bArr) {
        int b = b(Arrays.copyOfRange(bArr, 12, 16));
        int b2 = b(Arrays.copyOfRange(bArr, 16, 20));
        if (b2 == 0) {
            b2 = (int) TimeUnit.SECONDS.toMillis(1L);
        }
        ArrayList arrayList = new ArrayList();
        int i = 64;
        for (int i2 = 0; i2 < b + 1; i2++) {
            a.C0894a c0894a = new a.C0894a();
            int i3 = i + 4;
            c0894a.a = b(Arrays.copyOfRange(bArr, i, i3));
            i += 8;
            c0894a.b = b(Arrays.copyOfRange(bArr, i3, i));
            arrayList.add(c0894a);
        }
        return new b(bArr, b, b2, arrayList);
    }
}
