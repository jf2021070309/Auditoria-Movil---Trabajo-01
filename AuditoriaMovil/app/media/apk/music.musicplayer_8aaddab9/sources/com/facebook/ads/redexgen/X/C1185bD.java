package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.bD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1185bD implements InterfaceC03565h {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC03595k A00;
    public final C7U A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = C1185bD.class.getSimpleName();
    }

    public C1185bD(InterfaceC03595k interfaceC03595k, C1045Xn c1045Xn) {
        this.A00 = interfaceC03595k;
        this.A00.A3C(new C1187bF(this));
        this.A01 = new C7U(c1045Xn);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5i().size()));
        }
        for (InterfaceC03625n interfaceC03625n : this.A00.A5i()) {
            int i2 = C03585j.A00[interfaceC03625n.A7i().ordinal()];
            if (i2 == 1) {
                A04(interfaceC03625n.getUrl());
            } else if (i2 == 2) {
                A06(interfaceC03625n.getUrl());
            } else if (i2 == 3) {
                A05(interfaceC03625n.getUrl());
            }
        }
        this.A01.A0U(new C1186bE(this), new C7N(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C7R c7r = new C7R(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c7r.A01 = A00(117, 8, 90);
        this.A01.A0V(c7r);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C7T c7t = new C7T(str, A00(81, 36, 11), A00(125, 7, 46));
        c7t.A04 = true;
        c7t.A02 = A00(117, 8, 90);
        this.A01.A0X(c7t);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C7T c7t = new C7T(str, A00(81, 36, 11), A00(125, 7, 46));
        c7t.A04 = false;
        c7t.A02 = A00(117, 8, 90);
        this.A01.A0a(c7t);
    }
}
