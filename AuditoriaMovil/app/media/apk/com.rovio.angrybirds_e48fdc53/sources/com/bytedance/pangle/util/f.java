package com.bytedance.pangle.util;

import com.umeng.analytics.pro.cv;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class f {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        return a(str.getBytes());
    }

    public static String a(byte[] bArr) {
        int length;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            if (digest == null || (length = digest.length) <= 0) {
                return null;
            }
            char[] cArr = new char[length << 1];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i + 1;
                char[] cArr2 = a;
                cArr[i] = cArr2[(digest[i2] >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = cArr2[digest[i2] & cv.m];
            }
            return new String(cArr);
        } catch (Exception e) {
            return null;
        }
    }
}
