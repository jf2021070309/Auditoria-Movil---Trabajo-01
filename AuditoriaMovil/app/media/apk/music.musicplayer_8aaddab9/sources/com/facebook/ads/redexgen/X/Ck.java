package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class Ck {
    public static byte[] A02;
    public final C0523Cm A00;
    public final C0523Cm A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, 22};
    }

    public Ck(C0523Cm c0523Cm) {
        this(c0523Cm, c0523Cm);
    }

    public Ck(C0523Cm c0523Cm, C0523Cm c0523Cm2) {
        this.A00 = (C0523Cm) IJ.A01(c0523Cm);
        this.A01 = (C0523Cm) IJ.A01(c0523Cm2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ck ck = (Ck) obj;
        return this.A00.equals(ck.A00) && this.A01.equals(ck.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 1, 88));
        sb.append(this.A00);
        if (this.A00.equals(this.A01)) {
            str = A00(0, 0, 98);
        } else {
            str = A00(0, 2, 80) + this.A01;
        }
        sb.append(str);
        sb.append(A00(3, 1, FacebookMediationAdapter.ERROR_NULL_CONTEXT));
        return sb.toString();
    }
}
