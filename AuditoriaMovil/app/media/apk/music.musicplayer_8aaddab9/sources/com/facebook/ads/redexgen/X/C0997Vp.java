package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Vp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0997Vp implements InterfaceC0544Dq {
    public static byte[] A03;
    public static String[] A04 = {"9dIhF2X5qYPGZcPrMQjFeU2FMq4Icb5t", "C7lZKzl2OzNugbLE4QJixcZrlcSgCGI7", "v7kvgcbsYqtq4Ou8B7XlURjv8wkzUozH", "8BzUB2zJ4MAZsKVthH28T9QXZJlG29jD", "wOgdV6BnuyxARX3Rbc0CvFDDXWIKfgjM", "mpBmZ", "f47n1mRwiFyOsV4myeWB5UC2YKJiwKop", "3tKYH9iJUyIyPmbH9Trftcv4NWgUsp5b"};
    public InterfaceC0525Co A00;
    public C0672Iu A01;
    public boolean A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 26, 26, 22, 19, 13, 11, 30, 19, 25, 24, -39, 34, -41, 29, 13, 30, 15, -35, -33};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0544Dq
    public final void A47(C0660Ii c0660Ii) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5U(Format.A02(null, A00(0, 20, 74), this.A01.A05()));
            this.A02 = true;
        }
        int A042 = c0660Ii.A04();
        this.A00.AEL(c0660Ii, A042);
        InterfaceC0525Co interfaceC0525Co = this.A00;
        if (A04[0].charAt(13) != 'c') {
            throw new RuntimeException();
        }
        A04[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        interfaceC0525Co.AEM(this.A01.A04(), 1, A042, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0544Dq
    public final void A8K(C0672Iu c0672Iu, Ce ce, C0550Dw c0550Dw) {
        this.A01 = c0672Iu;
        c0550Dw.A05();
        this.A00 = ce.AFI(c0550Dw.A03(), 4);
        this.A00.A5U(Format.A0B(c0550Dw.A04(), A00(0, 20, 74), null, -1, null));
    }
}
