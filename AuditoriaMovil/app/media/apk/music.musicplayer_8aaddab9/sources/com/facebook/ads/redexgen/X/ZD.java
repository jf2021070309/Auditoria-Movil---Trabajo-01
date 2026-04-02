package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class ZD extends C03866m {
    public static byte[] A01;
    public final KeyguardManager A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-57, -63, -43, -61, -47, -67, -50, -64};
    }

    public ZD(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (KeyguardManager) context.getSystemService(A02(0, 8, 85));
    }

    public final InterfaceC03956v A0G() {
        return new ZH(this);
    }

    public final InterfaceC03956v A0H() {
        return new ZG(this);
    }

    public final InterfaceC03956v A0I() {
        return new ZF(this);
    }

    public final InterfaceC03956v A0J() {
        return new ZE(this);
    }
}
