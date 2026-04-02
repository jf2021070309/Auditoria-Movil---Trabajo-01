package com.kuaishou.weapon.p0;

import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
/* loaded from: classes.dex */
public class i {
    private static byte a(byte b, byte b2) {
        return (byte) (((char) (((char) Byte.decode("0x" + new String(new byte[]{b})).byteValue()) << 4)) ^ ((char) Byte.decode("0x" + new String(new byte[]{b2})).byteValue()));
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return new String(c(c(str), str2));
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            stringBuffer.append((char) b);
        }
        return stringBuffer.toString();
    }

    private static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr[i] = (byte) i;
        }
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            i3 = ((bytes[i2] & Constants.UNKNOWN) + (bArr[i4] & Constants.UNKNOWN) + i3) & 255;
            byte b = bArr[i4];
            bArr[i4] = bArr[i3];
            bArr[i3] = b;
            i2 = (i2 + 1) % bytes.length;
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            return null;
        }
        return c(bArr, str);
    }

    private static String b(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            String hexString = Integer.toHexString(str.charAt(i) & 255);
            if (hexString.length() == 1) {
                hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
            }
            str2 = str2 + hexString;
        }
        return str2;
    }

    private static byte[] b(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return c(str.getBytes(), str2);
    }

    public static byte[] b(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            return null;
        }
        return c(bArr, str);
    }

    private static byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = str.getBytes();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = a(bytes[i2], bytes[i2 + 1]);
        }
        return bArr;
    }

    private static byte[] c(byte[] bArr, String str) {
        byte[] a = a(str);
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = ((a[i] & Constants.UNKNOWN) + i2) & 255;
            byte b = a[i];
            a[i] = a[i2];
            a[i2] = b;
            bArr2[i3] = (byte) (a[((a[i] & Constants.UNKNOWN) + (a[i2] & Constants.UNKNOWN)) & 255] ^ bArr[i3]);
        }
        return bArr2;
    }
}
