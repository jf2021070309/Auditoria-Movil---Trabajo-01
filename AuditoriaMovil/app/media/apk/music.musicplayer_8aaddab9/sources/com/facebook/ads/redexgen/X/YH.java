package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class YH extends C03866m {
    public static byte[] A01;
    public final TelephonyManager A00;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{15, 7, 14, 13, 4};
    }

    public YH(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (TelephonyManager) context.getSystemService(A04(0, 5, 99));
    }

    public static int A01(CellInfo cellInfo) {
        if (cellInfo != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                if (cellInfo instanceof CellInfoCdma) {
                    return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoWcdma) {
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                }
                throw new UnsupportedOperationException(cellInfo.getClass().getSimpleName());
            }
            throw new UnsupportedOperationException();
        }
        throw new NullPointerException();
    }

    public final InterfaceC03956v A0G() {
        return new YR(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC03956v A0H() {
        return new YQ(this);
    }

    public final InterfaceC03956v A0I() {
        return new YM(this);
    }

    public final InterfaceC03956v A0J() {
        return new YL(this);
    }

    public final InterfaceC03956v A0K() {
        return new YN(this);
    }

    public final InterfaceC03956v A0L() {
        return new YO(this);
    }

    public final InterfaceC03956v A0M() {
        return new YI(this);
    }

    public final InterfaceC03956v A0N() {
        return new YU(this);
    }

    public final InterfaceC03956v A0O() {
        return new YK(this);
    }

    public final InterfaceC03956v A0P() {
        return new YJ(this);
    }

    public final InterfaceC03956v A0Q() {
        return new YT(this);
    }

    public final InterfaceC03956v A0R() {
        return new YS(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC03956v A0S() {
        return new YP(this);
    }
}
