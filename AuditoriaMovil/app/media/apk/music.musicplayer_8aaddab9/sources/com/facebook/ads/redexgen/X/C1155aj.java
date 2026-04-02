package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.aj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1155aj extends C03866m {
    public static byte[] A04;
    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{13, 15, 24, 5, 26, 5, 24, 21};
    }

    public C1155aj(Context context, C6C c6c) {
        super(context, c6c);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, 106));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC03956v A0G() {
        return new C1158am(this);
    }

    public final InterfaceC03956v A0H() {
        return new C1157al(this);
    }

    public final InterfaceC03956v A0I() {
        return new C1162aq(this);
    }

    public final InterfaceC03956v A0J() {
        return new C1161ap(this);
    }

    public final InterfaceC03956v A0K() {
        return new C1160ao(this);
    }

    public final InterfaceC03956v A0L() {
        return new C1163ar(this);
    }

    public final InterfaceC03956v A0M() {
        return new C1159an(this);
    }

    public final InterfaceC03956v A0N() {
        return new C1164as(this);
    }

    public final InterfaceC03956v A0O() {
        return new C1156ak(this);
    }

    public final InterfaceC03956v A0P() {
        return new C1166au(this);
    }

    public final InterfaceC03956v A0Q() {
        return new C1165at(this);
    }
}
