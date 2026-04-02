package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Process;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Zy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1108Zy extends C03866m {
    public static byte[] A01;
    @Nullable
    public final BluetoothAdapter A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-4, 9, -1, 13, 10, 4, -1, -55, 11, 0, 13, 8, 4, 14, 14, 4, 10, 9, -55, -35, -25, -16, -32, -17, -22, -22, -17, -29};
    }

    public C1108Zy(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = A04(context) ? BluetoothAdapter.getDefaultAdapter() : null;
    }

    public static boolean A04(Context context) {
        return context.checkPermission(A02(0, 28, 49), Process.myPid(), Process.myUid()) == 0;
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC03956v A0G() {
        return new C1112a2(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC03956v A0H() {
        return new C1111a1(this);
    }

    @SuppressLint({"MissingPermission"})
    public final InterfaceC03956v A0I() {
        return new C1110a0(this);
    }
}
