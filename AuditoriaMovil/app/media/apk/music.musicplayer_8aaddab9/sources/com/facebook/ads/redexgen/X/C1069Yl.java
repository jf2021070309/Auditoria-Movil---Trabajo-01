package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Yl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1069Yl extends C03866m {
    public static byte[] A07;
    public static final String A08;
    public final Context A00;
    @Nullable
    public final PackageInfo A01;
    @Nullable
    public final PackageManager A02;
    public final C6C A03;
    @Nullable
    public final ActivityInfo[] A04;
    @Nullable
    public final ServiceInfo[] A05;
    @Nullable
    public final String[] A06;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{29, 57, 35, 35, 57, 62, 55, 112, 0, 49, 51, 59, 49, 55, 53, 112, 0, 53, 34, 61, 57, 35, 35, 57, 63, 62, 35};
    }

    static {
        A07();
        A08 = C1069Yl.class.getSimpleName();
    }

    public C1069Yl(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = context;
        this.A03 = c6c;
        this.A01 = A02(context);
        this.A02 = context.getPackageManager();
        this.A04 = A08(context);
        this.A05 = A0A(context);
        this.A06 = A0C(context);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private PackageInfo A02(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ActivityInfo[] A08(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ServiceInfo[] A0A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private String[] A0C(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    public final InterfaceC03956v A0G() {
        return new C1071Yn(this);
    }

    public final InterfaceC03956v A0H() {
        return new C1072Yo(this);
    }

    public final InterfaceC03956v A0I() {
        return new C1070Ym(this);
    }

    public final InterfaceC03956v A0J() {
        return new C1073Yp(this);
    }

    public final InterfaceC03956v A0K() {
        return new C1078Yu(this);
    }

    public final InterfaceC03956v A0L() {
        return new C1082Yy(this);
    }

    public final InterfaceC03956v A0M() {
        return new C1077Yt(this);
    }

    public final InterfaceC03956v A0N() {
        return new C1074Yq(this);
    }

    public final InterfaceC03956v A0O() {
        return new C1076Ys(this);
    }

    public final InterfaceC03956v A0P() {
        return new C1075Yr(this);
    }

    public final InterfaceC03956v A0Q() {
        return new C1079Yv(this);
    }

    public final InterfaceC03956v A0R() {
        return new C1080Yw(this);
    }

    public final InterfaceC03956v A0S() {
        return new C1081Yx(this);
    }

    public final InterfaceC03956v A0T() {
        return new Z0(this);
    }

    public final InterfaceC03956v A0U() {
        return new Z1(this);
    }

    public final InterfaceC03956v A0V() {
        return new C1083Yz(this);
    }

    public final InterfaceC03956v A0W() {
        return new Z3(this);
    }

    public final InterfaceC03956v A0X() {
        return new Z4(this);
    }

    public final InterfaceC03956v A0Y() {
        return new Z2(this);
    }
}
