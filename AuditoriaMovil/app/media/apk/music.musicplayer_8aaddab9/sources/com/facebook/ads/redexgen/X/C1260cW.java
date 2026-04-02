package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.cW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1260cW implements InterfaceC02721y {
    public static byte[] A0B;
    public static String[] A0C = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0D;
    @Nullable
    public AnonymousClass18 A02;
    @Nullable
    public FI A03;
    @Nullable
    public C1217bj A04;
    @Nullable
    public String A06;
    public final C1046Xo A08;
    public final S2SRewardedVideoAdExtendedListener A09;
    public final AnonymousClass24 A0A;
    public int A00 = 0;
    public boolean A07 = false;
    public long A01 = -1;
    public MD A05 = new MD();

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0C[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A08();
        A0D = C1260cW.class.getSimpleName();
    }

    public C1260cW(AnonymousClass24 anonymousClass24, AnonymousClass27 anonymousClass27, String str) {
        this.A0A = anonymousClass24;
        this.A08 = anonymousClass24.A0B;
        this.A09 = new cP(str, anonymousClass27, this, anonymousClass24);
    }

    private void A0A(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (!this.A07 && this.A03 != null) {
            Log.w(A0D, A06(0, 78, 100));
        }
        A0B(false);
        this.A07 = false;
        C02641q c02641q = new C02641q(this.A0A.A0C, KL.A06, AdPlacementType.REWARDED_VIDEO, KJ.A07, 1);
        c02641q.A07(z);
        c02641q.A05(this.A0A.A06);
        c02641q.A06(this.A0A.A07);
        this.A03 = new FI(this.A0A.A0B, c02641q);
        this.A03.A0M(new C1262cY(this));
        this.A03.A0Q(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(boolean z) {
        FI fi = this.A03;
        if (fi != null) {
            fi.A0M(new C1261cX(this));
            this.A03.A0R(z);
            this.A03 = null;
        }
    }

    public final long A0D() {
        FI fi = this.A03;
        if (fi != null) {
            return fi.A0B();
        }
        return -1L;
    }

    public final void A0E() {
        A0B(true);
    }

    public final void A0F() {
        C1217bj c1217bj = this.A04;
        if (c1217bj != null) {
            c1217bj.A02();
        }
    }

    public final void A0G(RewardData rewardData) {
        FI fi;
        this.A0A.A03 = rewardData;
        if (this.A07 && (fi = this.A03) != null) {
            fi.A0U(rewardData);
        }
    }

    public final void A0H(AdCompanionView adCompanionView) {
        AnonymousClass18 anonymousClass18;
        this.A04 = (C1217bj) adCompanionView.getAdCompanionViewApi();
        C1046Xo c1046Xo = this.A08;
        if (c1046Xo != null && (anonymousClass18 = this.A02) != null) {
            this.A04.A03(c1046Xo, anonymousClass18);
        }
    }

    public final void A0I(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0A(str, adExperienceType, z);
        } catch (Exception e2) {
            Log.e(A0D, A06(78, 31, 55), e2);
            this.A0A.A0B.A06().A8y(A06(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 3, 96), C04398z.A0T, new AnonymousClass90(e2));
            AdError internalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A0A.A0B.A0D().A2a(MC.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A09.onError(this.A0A.A00(), internalError);
        }
    }

    public final boolean A0J() {
        FI fi = this.A03;
        return fi == null || fi.A0S();
    }

    public final boolean A0K() {
        return this.A07;
    }

    public final boolean A0L(int i2) {
        if (!this.A07) {
            this.A09.onError(this.A0A.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            String[] strArr = A0C;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[2] = "i4TgsteijYTgF3ZXWgh52CAoLdUIST6S";
            strArr2[1] = "KfQZimx5EO3wO5BoFkpX8kIEmrokSzla";
            return false;
        }
        FI fi = this.A03;
        if (fi != null) {
            fi.A07.A02(i2);
            this.A03.A0G();
            this.A07 = false;
            return true;
        }
        this.A07 = false;
        return false;
    }
}
