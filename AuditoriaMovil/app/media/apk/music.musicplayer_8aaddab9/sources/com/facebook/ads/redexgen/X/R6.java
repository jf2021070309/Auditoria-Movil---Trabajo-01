package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public enum R6 {
    A05(true, false),
    A06(true, true);
    
    public static byte[] A02;
    public static String[] A03 = {"O", "EV50HHvcjD7YLIyebT4WEIV5yebebm0n", "F", "5eKOX", "rITyk", "abzOrFl3CNxf2rC8XtUXLAElYVzjlriN", "oaymDZ7pAEcbNFhv7Y0pKv8En2RbSAw", "1P4e8Svw6pgZkfS1AU7Ku11MIWhAZ0aY"};
    public boolean A00;
    public boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 69);
            if (A03[6].length() != 31) {
                throw new RuntimeException();
            }
            A03[1] = "x5tPmx47tzICoGkmwmxxU8TFYjneGYu3";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{4, 2, 17, -56, -57, -53, -52};
    }

    static {
        A01();
    }

    R6(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final String A02() {
        return toString();
    }

    public final boolean A03() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A01;
    }
}
