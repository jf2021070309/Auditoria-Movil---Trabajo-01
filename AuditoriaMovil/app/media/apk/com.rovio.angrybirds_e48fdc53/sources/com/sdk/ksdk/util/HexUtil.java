package com.sdk.ksdk.util;

import com.umeng.analytics.pro.cv;
/* loaded from: classes3.dex */
public class HexUtil {
    public static String hheexx1(byte[] data) {
        char ch;
        int i;
        if (data == null || data.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            int h = (b >> 4) & 15;
            int l = b & cv.m;
            if (h > 9) {
                ch = (char) ((h - 10) + 97);
            } else {
                ch = (char) (h + 48);
            }
            if (l > 9) {
                i = (l - 10) + 97;
            } else {
                i = l + 48;
            }
            char cl = (char) i;
            sb.append(ch);
            sb.append(cl);
        }
        String ret = sb.toString();
        return ret;
    }

    public static String hheexx2(String str) {
        int len;
        if (str == null || (len = str.length()) <= 0 || len % 2 != 0) {
            return null;
        }
        char[] chs = str.toCharArray();
        byte[] ret = new byte[len / 2];
        int i = 0;
        int j = 0;
        while (i < len) {
            char ch = chs[i];
            char cl = chs[i + 1];
            int ih = 0;
            int il = 0;
            if (ch >= 'A' && ch <= 'F') {
                ih = (ch - 'A') + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                ih = (ch - 'a') + 10;
            } else if (ch >= '0' && ch <= '9') {
                ih = ch - '0';
            }
            if (cl >= 'A' && cl <= 'F') {
                il = (cl - 'A') + 10;
            } else if (cl >= 'a' && cl <= 'f') {
                il = (cl - 'a') + 10;
            } else if (cl >= '0' && cl <= '9') {
                il = cl - '0';
            }
            int v = ((ih & 15) << 4) | (il & 15);
            ret[j] = (byte) v;
            i += 2;
            j++;
        }
        String string = new String(ret);
        return string;
    }
}
