package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.cZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1263cZ implements InterfaceC02721y {
    public static byte[] A0B;
    public static final String A0C;
    @Nullable
    public InterstitialAd A01;
    @Nullable
    public AnonymousClass18 A02;
    @Nullable
    public FM A03;
    @Nullable
    public C1217bj A04;
    public boolean A06;
    public boolean A07;
    public final C1046Xo A08;
    public final InterstitialAdExtendedListener A09;
    public final AnonymousClass20 A0A;
    public long A00 = -1;
    public MD A05 = new MD();

    public static String A0A(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0B = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -45, 31, 34, 20, 23, -45, 22, 20, 31, 31, 24, 23, -45, 42, 27, 28, 31, 24, -45, 38, 27, 34, 42, 28, 33, 26, -45, 28, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -31, 13, 28, 21};
    }

    static {
        A0B();
        A0C = C1263cZ.class.getSimpleName();
    }

    public C1263cZ(AnonymousClass20 anonymousClass20, AnonymousClass27 anonymousClass27, String str) {
        this.A0A = anonymousClass20;
        this.A08 = anonymousClass20.A05();
        this.A09 = new C1255cQ(str, anonymousClass27, this);
    }

    public final long A0E() {
        FM fm = this.A03;
        if (fm != null) {
            return fm.A0B();
        }
        return -1L;
    }

    public final void A0F() {
        FM fm = this.A03;
        if (fm != null) {
            fm.A0M(new C1264ca(this));
            this.A03.A0R(true);
            this.A03 = null;
            this.A07 = false;
            this.A06 = false;
        }
    }

    public final void A0G() {
        C1217bj c1217bj = this.A04;
        if (c1217bj != null) {
            c1217bj.A02();
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

    public final void A0I(@Nullable EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (!this.A07 && this.A03 != null) {
            Log.w(A0C, A0A(0, 78, 22));
        }
        this.A07 = false;
        if (this.A06 && !JQ.A0f(this.A08)) {
            this.A08.A06().A8y(A0A(130, 3, 62), C04398z.A0D, new AnonymousClass90(A0A(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A08.A0D().A2a(MC.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A09.onError(this.A0A.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        FM fm = this.A03;
        if (fm != null) {
            fm.A0M(new C1268ce(this));
            this.A03.A0H();
            this.A03 = null;
        }
        C02641q c02641q = new C02641q(this.A0A.A09(), KN.A00(this.A08.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, KJ.A07, 1, enumSet);
        c02641q.A05(this.A0A.A07());
        c02641q.A06(this.A0A.A08());
        c02641q.A03(this.A0A.A03());
        this.A03 = new FM(this.A08, c02641q);
        this.A03.A0M(new C1265cb(this));
        this.A03.A0P(str);
    }

    public final boolean A0J() {
        FM fm = this.A03;
        return fm == null || fm.A0S();
    }

    public final boolean A0K() {
        return this.A07;
    }

    public final boolean A0L() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A07) {
            this.A08.A0D().A2a(MC.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        FM fm = this.A03;
        if (fm == null) {
            this.A08.A06().A8y(A0A(130, 3, 62), C04398z.A0K, new AnonymousClass90(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A08.A0D().A2a(MC.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        fm.A0G();
        this.A06 = true;
        this.A07 = false;
        return true;
    }
}
