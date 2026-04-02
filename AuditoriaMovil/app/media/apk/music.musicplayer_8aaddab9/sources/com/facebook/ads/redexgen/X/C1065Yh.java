package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Yh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1065Yh extends C03866m {
    public static byte[] A01;
    public final PowerManager A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{101, 122, 98, 112, 103};
    }

    public C1065Yh(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (PowerManager) context.getSystemService(A02(0, 5, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DeprecatedMethod"})
    public boolean A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            this.A00.isInteractive();
        }
        return this.A00.isScreenOn();
    }

    public final InterfaceC03956v A0G() {
        return new C1067Yj(this);
    }

    @TargetApi(20)
    public final InterfaceC03956v A0H() {
        return new C1068Yk(this);
    }

    public final InterfaceC03956v A0I() {
        return new C1066Yi(this);
    }
}
