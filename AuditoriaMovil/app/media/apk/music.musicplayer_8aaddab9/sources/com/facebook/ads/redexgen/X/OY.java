package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class OY {
    public static final int A00 = C0739Lm.A01.heightPixels;
    public static final int A01 = C0739Lm.A01.widthPixels;

    public static float A00(C1B c1b) {
        int A012 = c1b.A0D().A01();
        int height = c1b.A0D().A00();
        if (height > 0) {
            return A012 / height;
        }
        return -1.0f;
    }

    public static int A01(double d2) {
        return (int) ((A01 - (OZ.A08 * 2)) / d2);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = ML.A01(16);
        int i2 = OK.A0A * 2;
        int ctaSpacing = OZ.A08;
        int ctaMargin2 = ctaMargin + i2 + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d2) {
        return d2 < 0.9d;
    }

    public static boolean A04(double d2, int i2) {
        return A02(i2) < A01(d2);
    }

    public static boolean A05(int i2, int i3, double d2) {
        return i2 == 2 || A04(d2, i3);
    }
}
