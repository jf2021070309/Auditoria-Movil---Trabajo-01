package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.5s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03675s {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C03655q> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C03655q A00() {
        C03655q c03655q = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C03655q c03655q2 = c03655q;
            if (c03655q2 == null) {
                C03655q A002 = C03655q.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c03655q2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C03655q A01(com.facebook.ads.redexgen.X.C8U r5, com.facebook.ads.redexgen.X.C03655q r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5q r0 = com.facebook.ads.redexgen.X.C03725y.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8y r5 = r5.A06()
            int r4 = com.facebook.ads.redexgen.X.C04398z.A1G
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A8y(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C03675s.A01(com.facebook.ads.redexgen.X.8U, com.facebook.ads.redexgen.X.5q):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C03655q A02(C8U c8u, C03655q c03655q, C03665r c03665r) {
        C03685t c03685t = null;
        try {
            if (JP.A06(c8u) && (c03655q == null || TextUtils.isEmpty(c03655q.A03()))) {
                c03685t = C03695u.A00(c8u.getContentResolver());
            }
        } catch (Throwable th) {
            c8u.A06().A8y(A04(12, 7, 6), C04398z.A1I, new AnonymousClass90(th));
        }
        if (c03685t != null && c03685t.A01 != null) {
            A03.set(c03685t.A01);
            c03665r.A05(c03685t.A01);
        }
        if (c03655q == null && c03685t != null && !TextUtils.isEmpty(c03685t.A00)) {
            return new C03655q(c03685t.A00, c03685t.A02, EnumC03645p.A05);
        }
        return c03655q;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C03665r c03665r) {
        A02.set(c03665r.A02());
        A03.set(c03665r.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C8U c8u) {
        long j2;
        C03655q upToDateAdInfo;
        try {
            C03665r c03665r = new C03665r(c8u);
            A06(c03665r);
            if (A08()) {
                return;
            }
            C03655q c03655q = A02.get();
            if (c03655q != null && !TextUtils.isEmpty(c03655q.A03())) {
                j2 = c03655q.A01();
            } else {
                j2 = -1;
            }
            if (j2 > 0 && System.currentTimeMillis() - j2 < JP.A00(c8u)) {
                return;
            }
            if (JP.A07(c8u)) {
                upToDateAdInfo = A01(c8u, A02(c8u, null, c03665r));
            } else {
                upToDateAdInfo = A02(c8u, A01(c8u, null), c03665r);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A02.set(upToDateAdInfo);
                c03665r.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c8u.A06().A8y(A04(12, 7, 6), C04398z.A1H, new AnonymousClass90(th));
        }
    }

    public static boolean A08() {
        boolean updated = false;
        if (LX.A04()) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            if (LX.A05(A04)) {
                A03.set(LX.A01(A04));
                updated = true;
            }
        }
        boolean A042 = LX.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return updated;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return updated;
            }
        }
        String A043 = A04(19, 13, 79);
        if (LX.A05(A043)) {
            String A012 = LX.A01(A043);
            AtomicReference<C03655q> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C03655q(A012, false, EnumC03645p.A04));
            return true;
        }
        return updated;
    }
}
