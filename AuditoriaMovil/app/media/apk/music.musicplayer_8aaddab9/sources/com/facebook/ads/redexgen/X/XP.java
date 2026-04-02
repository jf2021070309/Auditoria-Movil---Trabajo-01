package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class XP implements C8Z {
    public static byte[] A01;
    public static String[] A02 = {"5s7Vvh0NyBhQSPw27iRWGG1DtqQsP1Sv", "FrTyZebbkrmGpsa0d1dFSR1fbKrcWzi5", "vbBgTS8gp4295EX74czAq4g", "ai", "WolquZ0AL0Qdfn", "cakCtq0fnE5al5DYRrCiV1B2lu7xESbR", "HXQXhYUpdji2Kg3a54R03lC9IEJsCvaM", "NPxj8bqKiKcB9Z0ZqCVSMRQGt9eaxHA1"};
    public final C8U A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 16);
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "3cPMFplOUK5Ssg4O5bRCUJRCJG4m75Bq";
            strArr2[6] = "bSCrfJrMY4RCrVdm5HRU5l61ngvuX2qf";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -36, -46, -32, -35, -41, -46};
    }

    static {
        A01();
    }

    public XP(C8U c8u) {
        this.A00 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    @Nullable
    public final String A5t() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    public final String A6d() {
        return C0715Kn.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    @Nullable
    public final String A6e() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    @Nullable
    public final String A6y() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    @Nullable
    public final String A71() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    @Nullable
    public final C8Y A7J() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new XQ(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    @Nullable
    public final String A7k() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    public final String A7l() {
        return A00(0, 7, 94);
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    public final String A7m() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    public final boolean A8P() {
        return BuildConfigApi.isDebug();
    }
}
