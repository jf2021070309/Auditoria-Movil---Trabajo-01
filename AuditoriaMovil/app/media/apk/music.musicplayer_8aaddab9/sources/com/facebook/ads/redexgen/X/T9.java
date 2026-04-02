package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class T9 implements NJ {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ NH A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public T9(NH nh) {
        this.A00 = nh;
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void A41() {
        InterfaceC0761Mk interfaceC0761Mk;
        InterfaceC0761Mk interfaceC0761Mk2;
        interfaceC0761Mk = this.A00.A07;
        if (interfaceC0761Mk != null) {
            interfaceC0761Mk2 = this.A00.A07;
            interfaceC0761Mk2.A3r(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void A42() {
        InterfaceC0762Ml interfaceC0762Ml;
        InterfaceC0762Ml interfaceC0762Ml2;
        this.A00.A0M();
        interfaceC0762Ml = this.A00.A08;
        if (interfaceC0762Ml != null) {
            interfaceC0762Ml2 = this.A00.A08;
            interfaceC0762Ml2.AC5(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void A7s() {
        C2H c2h;
        C2H c2h2;
        C2H c2h3;
        C1046Xo c1046Xo;
        c2h = this.A00.A03;
        if (c2h == null) {
            A42();
            return;
        }
        NH.A01(this.A00);
        c2h2 = this.A00.A03;
        if (c2h2.A02() == null) {
            NH nh = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            nh.A0C();
        } else {
            NH nh2 = this.A00;
            c2h3 = nh2.A03;
            nh2.A0E(c2h3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c1046Xo = this.A00.A05;
            if (JQ.A1d(c1046Xo)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void A8k() {
        C2D c2d;
        C2G c2g;
        C1046Xo c1046Xo;
        C2D c2d2;
        String str;
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0I())) {
            LV lv = new LV();
            c1046Xo = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri parse = Uri.parse(c2d2.A0I());
            str = this.A00.A09;
            LV.A0A(lv, c1046Xo, parse, str);
        }
        c2g = this.A00.A02;
        c2g.A04();
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void A8l() {
        InterfaceC0762Ml interfaceC0762Ml;
        C2D c2d;
        C2G c2g;
        C1046Xo c1046Xo;
        C2D c2d2;
        String str;
        InterfaceC0762Ml interfaceC0762Ml2;
        this.A00.A0M();
        interfaceC0762Ml = this.A00.A08;
        if (interfaceC0762Ml != null) {
            interfaceC0762Ml2 = this.A00.A08;
            interfaceC0762Ml2.AC5(true);
        }
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0C())) {
            LV lv = new LV();
            c1046Xo = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri parse = Uri.parse(c2d2.A0C());
            str = this.A00.A09;
            LV.A0A(lv, c1046Xo, parse, str);
        }
        c2g = this.A00.A02;
        c2g.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void ABT(C2F c2f) {
        C2F c2f2;
        C2D c2d;
        C2H A0B;
        C2D c2d2;
        NH.A00(this.A00);
        this.A00.A01 = c2f;
        c2f2 = this.A00.A01;
        if (c2f2 == C2F.A03) {
            c2d2 = this.A00.A04;
            A0B = c2d2.A0A();
        } else {
            c2d = this.A00.A04;
            A0B = c2d.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.NJ
    public final void ABc(C2H c2h) {
        C2G c2g;
        NH.A00(this.A00);
        c2g = this.A00.A02;
        c2g.A07(c2h.A01());
        if (!c2h.A05().isEmpty()) {
            this.A00.A0E(c2h);
        } else {
            this.A00.A0D(c2h);
        }
    }
}
