package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class LC {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<LC> A02 = new ThreadLocal<>();
    public final C0722Kv A00 = new C0722Kv();

    public static C0722Kv A00() {
        return A02().A00;
    }

    public static C0722Kv A01(LB lb) {
        C0722Kv c0722Kv = new C0722Kv(A00());
        c0722Kv.add(lb);
        return c0722Kv;
    }

    public static LC A02() {
        LC lc = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) != strArr[2].charAt(1)) {
            String[] strArr2 = A01;
            strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
            strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
            if (lc == null) {
                LC lc2 = new LC();
                A02.set(lc2);
                return lc2;
            }
            return lc;
        }
        throw new RuntimeException();
    }

    public static void A03(L7 l7) {
        C0722Kv createRunnableAsyncStackTrace = l7.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A04(L7 l7) {
        C0722Kv createRunnableAsyncStackTrace = l7.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}
