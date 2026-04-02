package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;
/* loaded from: classes2.dex */
final class b {
    private final int a;
    private final byte[] b;

    private b(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] a(byte[] bArr, Version version) {
        Version.b a = version.a();
        Version.a[] b = a.b();
        int i = 0;
        for (Version.a aVar : b) {
            i += aVar.a();
        }
        b[] bVarArr = new b[i];
        int length = b.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Version.a aVar2 = b[i2];
            int i4 = i3;
            int i5 = 0;
            while (i5 < aVar2.a()) {
                int b2 = aVar2.b();
                bVarArr[i4] = new b(b2, new byte[a.a() + b2]);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
        int length2 = bVarArr[0].b.length - a.a();
        int i6 = length2 - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i3) {
                bVarArr[i9].b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        boolean z = version.getVersionNumber() == 24;
        int i10 = z ? 8 : i3;
        int i11 = 0;
        while (i11 < i10) {
            bVarArr[i11].b[length2 - 1] = bArr[i7];
            i11++;
            i7++;
        }
        int length3 = bVarArr[0].b.length;
        int i12 = i7;
        while (length2 < length3) {
            int i13 = 0;
            int i14 = i12;
            while (i13 < i3) {
                int i15 = z ? (i13 + 8) % i3 : i13;
                bVarArr[i15].b[(!z || i15 <= 7) ? length2 : length2 - 1] = bArr[i14];
                i13++;
                i14++;
            }
            length2++;
            i12 = i14;
        }
        if (i12 != bArr.length) {
            throw new IllegalArgumentException();
        }
        return bVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b() {
        return this.b;
    }
}
