package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: assets/audience_network.dex */
public final class Kf {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    @SuppressLint({"NotWrittenPrivateField"})
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"WcKxqk7L6BbuUQ1o7qmtmX6WSmYBceUW", "BgR1wHMut0LLHWxcn1vNnqjOmnDpA7yk", "nofrFHfyJT7pmG0QketyEOeNZ4PDBNqx", "tJ6rTzDc1vJYhzSuFM6hiX1fKi0tAXSV", "zeDIr51bIn8XcOdXOM6dVjfvh9EOKJZZ", "x4ZdmXYSSnH60B6WOaypztUTceO04NF4", "XXJyOaEVU", "eLFDRkAKNxNhqN4Dib4JBju5Hz9f2MYZ"};

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-35, 43, -14, -35, 43, -14, -35, 28, -14, -35, 28, -14, -35, 28, -22, -26, 21, 26, 25, -20, -22, -25, -20, 10, 0, 5, -2, -73, 3, -8, 10, 11, -73, -8, -5, -73, 9, -4, 10, 7, 6, 5, 10, -4, 5, 3, 18, -22, -1, 17, 18, -16, 3, 17, 14, 13, 12, 17, 3};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, KL kl) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        int i2 = C0708Ke.A00[kl.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return 15000L;
        }
        if (A05[3].charAt(17) != 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "cMCvtLXy3JUCQlBDXi74HNVnq0if4CLO";
        strArr[1] = "Rwzrrq0i3HxLUmTnjjMGp9p8g57hQdnu";
        if (i2 != 4) {
            return -1000L;
        }
        return 15000L;
    }

    public static String A02(C0709Kg c0709Kg) {
        KU.A05(A01(44, 15, 94), A01(22, 22, 87), A01(14, 8, 116));
        return A02.get(A03(c0709Kg));
    }

    public static String A03(C0709Kg c0709Kg) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = c0709Kg.A07();
        objArr[1] = c0709Kg.A05();
        objArr[2] = Integer.valueOf(c0709Kg.A06() == null ? 0 : c0709Kg.A06().A00());
        objArr[3] = Integer.valueOf(c0709Kg.A06() != null ? c0709Kg.A06().A01() : 0);
        objArr[4] = Integer.valueOf(c0709Kg.A04());
        return String.format(locale, A01(0, 14, SyslogConstants.LOG_CLOCK), objArr);
    }

    public static void A05(long j2, C0709Kg c0709Kg) {
        A01.put(A03(c0709Kg), Long.valueOf(j2));
    }

    public static void A06(C0709Kg c0709Kg) {
        A00.put(A03(c0709Kg), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, C0709Kg c0709Kg) {
        A02.put(A03(c0709Kg), str);
    }

    public static boolean A08(C0709Kg c0709Kg) {
        if (A03) {
            return false;
        }
        String A032 = A03(c0709Kg);
        if (A00.containsKey(A032)) {
            Long l2 = A00.get(A032);
            if (A05[3].charAt(17) != 'M') {
                throw new RuntimeException();
            }
            A05[6] = "HNdF4hlEpt9Mz";
            return System.currentTimeMillis() - l2.longValue() < A00(A032, c0709Kg.A05());
        }
        return false;
    }
}
