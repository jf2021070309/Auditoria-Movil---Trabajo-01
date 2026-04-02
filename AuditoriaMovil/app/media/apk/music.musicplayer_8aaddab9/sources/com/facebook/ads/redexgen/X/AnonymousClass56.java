package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import e.c.a.l.e;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass56 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", e.a, "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final AnonymousClass59 A01;
    public final C1046Xo A02;
    public final InterfaceC0684Jg A03;

    public static String A0Q(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0R() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 18, 29, 8, 21, 10, 25, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, Byte.MAX_VALUE, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0R();
    }

    public AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, InterfaceC0684Jg interfaceC0684Jg, C1046Xo c1046Xo) {
        this.A01 = anonymousClass59;
        this.A00 = intent;
        this.A03 = interfaceC0684Jg;
        this.A02 = c1046Xo;
    }

    private C1298d8 A00() {
        return (C1298d8) this.A00.getSerializableExtra(A0Q(0, 14, 29));
    }

    public InterfaceC0762Ml A02() {
        return new SL(this.A02, this.A03, new C1215bh(this.A01), (C1294d4) this.A00.getSerializableExtra(A0Q(32, 25, 116)), new TA(), 0);
    }

    public InterfaceC0762Ml A03() {
        AnonymousClass59 anonymousClass59 = this.A01;
        return new TT(anonymousClass59, this.A02, this.A03, new C1215bh(anonymousClass59));
    }

    public InterfaceC0762Ml A04() {
        return new C04579s(this.A02, this.A03, new C1215bh(this.A01), A00(), new TB(), 1);
    }

    public InterfaceC0762Ml A05() {
        return new C04579s(this.A02, this.A03, new C1215bh(this.A01), (C1294d4) this.A00.getSerializableExtra(A0Q(32, 25, 116)), new TA(), 0);
    }

    public InterfaceC0762Ml A06() {
        AnonymousClass18 anonymousClass18 = (AnonymousClass18) this.A00.getSerializableExtra(A0Q(14, 18, 51));
        if (anonymousClass18 == null) {
            return null;
        }
        String A0Y = anonymousClass18.A0Y();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        P4 A02 = P5.A02(A0Y);
        if (A02 == null) {
            return null;
        }
        return new SR(this.A02, new C1215bh(this.A01), A02);
    }

    public InterfaceC0762Ml A07() {
        if (JQ.A1v(this.A02)) {
            C1046Xo c1046Xo = this.A02;
            return new C8G(c1046Xo, this.A03, new C7U(c1046Xo), new C1215bh(this.A01), A00());
        }
        C1046Xo c1046Xo2 = this.A02;
        return new C8F(c1046Xo2, this.A03, new C7U(c1046Xo2), new C1215bh(this.A01), A00());
    }

    public InterfaceC0762Ml A08() {
        return new AnonymousClass92(this.A02, new TB(), this.A03, A00(), new C7U(this.A02), new C1215bh(this.A01));
    }

    public InterfaceC0762Ml A09() {
        return new TE(this.A02, this.A03, new C1215bh(this.A01), A00(), null, new TB());
    }

    public InterfaceC0762Ml A0A() {
        return new C8I(this.A02, new TB(), this.A03, A00(), new C7U(this.A02), new C1215bh(this.A01));
    }

    public InterfaceC0762Ml A0B() {
        return new C8I(this.A02, new TA(), this.A03, (C1294d4) this.A00.getSerializableExtra(A0Q(32, 25, 116)), new C7U(this.A02), new F2(this.A01));
    }

    public InterfaceC0762Ml A0C() {
        C1294d4 c1294d4 = (C1294d4) this.A00.getSerializableExtra(A0Q(32, 25, 116));
        return new TE(this.A02, this.A03, new F2(this.A01), c1294d4, c1294d4.A0Z(), new TA());
    }

    public InterfaceC0762Ml A0D(RelativeLayout relativeLayout) {
        TC tc = new TC(this.A02, new C1214bg(this), this.A03, new C1215bh(this.A01));
        tc.A05(relativeLayout);
        tc.A04(this.A00.getIntExtra(A0Q(57, 27, 124), 200));
        ML.A0M(relativeLayout, -16777216);
        return tc;
    }
}
