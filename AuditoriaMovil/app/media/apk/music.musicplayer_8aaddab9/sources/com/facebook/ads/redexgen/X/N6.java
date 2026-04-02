package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class N6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TC A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public N6(TC tc) {
        this.A00 = tc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0761Mk interfaceC0761Mk;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            interfaceC0761Mk = this.A00.A04;
            interfaceC0761Mk.A3r(A00(0, 15, 9));
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
