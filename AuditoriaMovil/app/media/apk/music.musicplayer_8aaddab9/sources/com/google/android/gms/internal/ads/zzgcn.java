package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzgcn {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                byte b2 = bArr[i2];
                byte b3 = (byte) ((b2 + b2) & 254);
                bArr2[i2] = b3;
                if (i2 < 15) {
                    bArr2[i2] = (byte) (((bArr[i2 + 1] >> 7) & 1) | b3);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static byte[] zzb(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }
}
