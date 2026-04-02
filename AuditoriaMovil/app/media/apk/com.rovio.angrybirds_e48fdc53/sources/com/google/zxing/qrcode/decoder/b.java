package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Version;
/* loaded from: classes2.dex */
final class b {
    private final int a;
    private final byte[] b;

    private b(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] a(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != version.getTotalCodewords()) {
            throw new IllegalArgumentException();
        }
        Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
        Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
        int i = 0;
        for (Version.ECB ecb : eCBlocks) {
            i += ecb.getCount();
        }
        b[] bVarArr = new b[i];
        int length = eCBlocks.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Version.ECB ecb2 = eCBlocks[i2];
            int i4 = i3;
            int i5 = 0;
            while (i5 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                bVarArr[i4] = new b(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
        int length2 = bVarArr[0].b.length;
        int length3 = bVarArr.length - 1;
        while (length3 >= 0 && bVarArr[length3].b.length != length2) {
            length3--;
        }
        int i6 = length3 + 1;
        int eCCodewordsPerBlock = length2 - eCBlocksForLevel.getECCodewordsPerBlock();
        int i7 = 0;
        int i8 = 0;
        while (i7 < eCCodewordsPerBlock) {
            int i9 = i8;
            int i10 = 0;
            while (i10 < i3) {
                bVarArr[i10].b[i7] = bArr[i9];
                i10++;
                i9++;
            }
            i7++;
            i8 = i9;
        }
        int i11 = i6;
        while (i11 < i3) {
            bVarArr[i11].b[eCCodewordsPerBlock] = bArr[i8];
            i11++;
            i8++;
        }
        int length4 = bVarArr[0].b.length;
        while (eCCodewordsPerBlock < length4) {
            int i12 = 0;
            int i13 = i8;
            while (i12 < i3) {
                bVarArr[i12].b[i12 < i6 ? eCCodewordsPerBlock : eCCodewordsPerBlock + 1] = bArr[i13];
                i12++;
                i13++;
            }
            eCCodewordsPerBlock++;
            i8 = i13;
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
