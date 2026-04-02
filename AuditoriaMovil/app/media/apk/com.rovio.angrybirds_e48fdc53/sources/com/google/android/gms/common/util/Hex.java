package com.google.android.gms.common.util;

import com.flurry.android.Constants;
import com.umeng.analytics.pro.cv;
/* loaded from: classes2.dex */
public class Hex {
    private static final char[] zzgw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzgx = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    public static String bytesToStringUppercase(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & Constants.UNKNOWN) != 0); i++) {
            sb.append(zzgw[(bArr[i] & 240) >>> 4]);
            sb.append(zzgw[bArr[i] & cv.m]);
        }
        return sb.toString();
    }

    public static String zza(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & Constants.UNKNOWN;
            int i3 = i + 1;
            cArr[i] = zzgx[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = zzgx[i2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] stringToBytes(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i + 2), 16);
        }
        return bArr;
    }
}
