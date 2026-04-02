package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: assets/audience_network.dex */
public final class M3 {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i2) {
        if (i2 <= 0) {
            return null;
        }
        float rate = i2;
        if (new Random().nextFloat() >= 1.0f / rate) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, JQ.A0G(context), JQ.A01(context), JQ.A11(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i2, int i3, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C0938Tg c0938Tg = new C0938Tg();
            M1 m1 = c0938Tg;
            if (i3 >= 0) {
                m1 = new C0936Te(m1, i3);
            }
            if (i2 >= 0) {
                m1 = new C0935Td(m1, i2, i2);
            }
            if (z) {
                m1 = new C0937Tf(m1);
            }
            C0939Th c0939Th = new C0939Th(c0938Tg, 1, m1);
            th.printStackTrace(new PrintWriter(new M2(c0939Th)));
            c0939Th.flush();
            return c0938Tg.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(M0 m0) {
        String A02 = m0.A02();
        if (A02 == null) {
            return false;
        }
        if (A0A(A02)) {
            return true;
        }
        for (String str : m0.A01()) {
            if (A0A(str)) {
                return true;
            }
        }
        for (String str2 : m0.A00()) {
            if (A0A(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
