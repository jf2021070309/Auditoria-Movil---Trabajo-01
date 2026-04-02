package com.amazon.aps.iva.e7;

import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.u;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.ab.a {
    @Override // com.amazon.aps.iva.ab.a
    public final f0 e(com.amazon.aps.iva.d7.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        u uVar = new u(byteBuffer.array(), byteBuffer.limit());
        uVar.r(12);
        int f = (uVar.f() + uVar.i(12)) - 4;
        uVar.r(44);
        uVar.s(uVar.i(12));
        uVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (uVar.f() < f) {
            uVar.r(48);
            int i = uVar.i(8);
            uVar.r(4);
            int f2 = uVar.f() + uVar.i(12);
            String str = null;
            String str2 = null;
            while (uVar.f() < f2) {
                int i2 = uVar.i(8);
                int i3 = uVar.i(8);
                int f3 = uVar.f() + i3;
                if (i2 == 2) {
                    int i4 = uVar.i(16);
                    uVar.r(8);
                    if (i4 != 3) {
                    }
                    while (uVar.f() < f3) {
                        int i5 = uVar.i(8);
                        Charset charset = Charsets.US_ASCII;
                        byte[] bArr = new byte[i5];
                        uVar.k(bArr, i5);
                        str = new String(bArr, charset);
                        int i6 = uVar.i(8);
                        for (int i7 = 0; i7 < i6; i7++) {
                            uVar.s(uVar.i(8));
                        }
                    }
                } else if (i2 == 21) {
                    Charset charset2 = Charsets.US_ASCII;
                    byte[] bArr2 = new byte[i3];
                    uVar.k(bArr2, i3);
                    str2 = new String(bArr2, charset2);
                }
                uVar.o(f3 * 8);
            }
            uVar.o(f2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(i, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f0(arrayList);
    }
}
