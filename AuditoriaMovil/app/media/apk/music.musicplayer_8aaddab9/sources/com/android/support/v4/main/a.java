package com.android.support.v4.main;

import android.app.Activity;
/* loaded from: classes3.dex */
public class a extends Activity {
    public static byte[] he(String str) {
        byte[] bArr;
        String str2 = str;
        int length = str2.length();
        if (length % 2 == 1) {
            length++;
            bArr = new byte[length / 2];
            str2 = new StringBuffer().append(new String(he(llll1l1(277)))).append(str2).toString();
        } else {
            bArr = new byte[length / 2];
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                return bArr;
            }
            bArr[i2] = (byte) Integer.parseInt(str2.substring(i4, i4 + 2), 16);
            i2++;
            i3 = i4 + 2;
        }
    }

    static String llll1l1(int i2) {
        if (i2 != -1 || i2 == -2 || i2 == -3 || i2 == -4) {
        }
        if (i2 == 277) {
            try {
                byte[] bArr = new byte[2];
                bArr[0] = (byte) 38;
                bArr[1] = (byte) 37;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) (bArr[i3] ^ i2);
                }
                return new String(bArr, "UTF-8");
            } catch (Exception e2) {
                return null;
            }
        }
        return null;
    }
}
