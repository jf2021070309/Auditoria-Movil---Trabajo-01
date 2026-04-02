package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.54  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass54 implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E = {"of0bzA7MwNGTia9F31tAkieNA09H6OOQ", "TyTQj7xFBxvma6AaZ1TUwVS6lItsexiQ", "kN9yyhhGlFuDqh5wulKzoOOSsFZblOVu", "DXKKP4SSVuW5x9unPZpKCS00jdGSX4q", "ceBkREnsnDPWKQGMERGG6oDocc2kf8dJ", "ULZujO58Hn4sCnlurEwExiI5FfKtYml", "oBzM86F4GMvLYp6iWCqbmyfPVfF4ncm8", "8s2Qgj6JQYkd4IbFNTxV1lfTN5yJUxqm"};
    public long A00;
    @Nullable
    public View A01;
    @Nullable
    public AdListener A02;
    @Nullable
    public FN A03;
    @Nullable
    public O8 A04;
    @Nullable
    public String A05;
    @Nullable
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final E5 A0A;
    public final KJ A0B;
    public final String A0C;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-77, -26, -78, -77, -77, -26, -70, -27, 120, -88, 117, -86, 124, 124, 118, 125, -12, -16, -14, -14, -16, -10, -11, 36, -17, 14, 27, 27, 18, 31, -51, 14, 17, -51, 17, 18, 32, 33, 31, 28, 38, 18, 17, -14, 17, 30, 30, 21, 34, -48, 17, 20, -48, 28, 31, 17, 20, -48, 34, 21, 33, 37, 21, 35, 36, 21, 20, -118, -88, -75, -75, -74, -69, 103, -83, -80, -75, -85, 103, -88, 103, -69, -84, -76, -73, -77, -88, -69, -84, 103, -69, -81, -88, -69, 103, -77, -74, -88, -85, 103, -87, -80, -85, 103, 110, 108, -70, 110, -77, -74, -91, -69, -52, -73, -20, -19, -5, -4, -6, -9, 1, -40, -37, -51, -48, -83, -48};
        if (A0E[2].charAt(11) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "i0zr3oWhaZ1ZQYjulO9yltnfKtDweGPM";
        strArr[6] = "f16HnFk6V4WfoRTY4RGQrwGHYb77b2mz";
        A0D = bArr;
    }

    static {
        A02();
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public AnonymousClass54(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = C0727La.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = C5G.A06(context);
            this.A0A.A0D().A2g(AdPlacementType.BANNER.toString(), str);
            C02641q c02641q = new C02641q(str, C0727La.A05(this.A0B), AdPlacementType.BANNER, C0727La.A04(adSize), 1);
            c02641q.A05(this.A05);
            c02641q.A06(this.A06);
            this.A03 = new FN(this.A0A, c02641q);
            this.A03.A0M(new C1209bb(this));
            return;
        }
        throw new IllegalArgumentException(A01(108, 6, 18));
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public AnonymousClass54(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws KH {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0D().A3b();
    }

    public static AdSize A00(String str) throws KH {
        KL A00 = KQ.A00(str);
        if (A00 != null) {
            KQ.A03(A00);
            return C0727La.A01(A00);
        }
        throw new KH(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(67, 41, 7), str));
    }

    private void A03(@Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0D().A2d();
        } else {
            this.A0A.A0D().A2c();
        }
        FN fn = this.A03;
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "8EJDtH9EjlwutgZO3WtzB3nx702AY4O";
        strArr2[5] = "dTiKD7UwUCw1SvcKYJrEphBgoR9CLtC";
        if (fn != null) {
            fn.A0P(str);
        }
        this.A0A.A0D().A2b();
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    @Nullable
    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    @Nullable
    public final FN A08() {
        return this.A03;
    }

    public final E5 A09() {
        return this.A0A;
    }

    public final KJ A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        C0830Pc A01;
        this.A0A.A0D().A3o(this.A06 != null);
        String str = this.A06;
        if (str != null && (A01 = C0829Pb.A01(this.A0A, str)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(A01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(@Nullable AdListener adListener) {
        this.A0A.A0D().A2Z(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(O8 o8) {
        this.A04 = o8;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C0697Jt(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KU.A05(A01(114, 7, 72), A01(24, 19, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), A01(16, 8, 127));
        this.A0A.A0D().A2h();
        FN fn = this.A03;
        if (fn != null) {
            fn.A0R(true);
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18 && this.A04 != null && JQ.A0u(this.A08.getContext())) {
            O8 o8 = this.A04;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "fmi4ltQko56R0Ot1hIU3uMuoiOam3SD1";
            strArr2[6] = "7H1g3sSDF1cZj7eOXlokIXc1uirRZwhG";
            o8.A07();
            View view = this.A01;
            if (view != null) {
                view.getOverlay().remove(this.A04);
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        FN fn = this.A03;
        boolean z = fn == null || fn.A0S();
        this.A0A.A0D().A4X(z);
        return z;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        KU.A05(A01(121, 6, 44), A01(43, 24, SyslogConstants.LOG_ALERT), A01(8, 8, 5));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        KU.A05(A01(121, 6, 44), A01(43, 24, SyslogConstants.LOG_ALERT), A01(0, 8, 65));
        A03(((C0697Jt) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            KN.A01(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
    }
}
