package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.5Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5Q implements NativeAdsManagerApi {
    public static byte[] A0A;
    public static final String A0B;
    public NativeAdsManager.Listener A01;
    public C1275cl A02;
    public String A03;
    public final int A06;
    public final C1046Xo A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{27, 60, 52, 49, 56, 57, 125, 41, 50, 125, 52, 51, 52, 41, 52, 60, 49, 52, 39, 56, 125, 30, 50, 50, 54, 52, 56, 16, 60, 51, 60, 58, 56, 47, 115};
    }

    static {
        A01();
        A0B = NativeAdsManager.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public C5Q(Context context, String str, int i2) {
        this.A07 = C5G.A02(context);
        this.A08 = str;
        this.A06 = Math.max(i2, 0);
        this.A09 = new ArrayList(i2);
        try {
            CookieManager.getInstance();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
        } catch (Exception e2) {
            Log.w(A0B, A00(0, 35, 89), e2);
        }
    }

    public final NativeAdsManager.Listener A02() {
        return this.A01;
    }

    public final C1275cl A03() {
        return this.A02;
    }

    public final void A04() {
        this.A09.clear();
    }

    public final void A05(int i2) {
        this.A00 = i2;
    }

    public final void A06(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A07(boolean z) {
        this.A04 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        C1275cl c1275cl = this.A02;
        if (c1275cl != null) {
            c1275cl.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        KL kl = KL.A05;
        int i2 = this.A06;
        C1275cl c1275cl = this.A02;
        this.A02 = new C1275cl(this.A07, this.A08, kl, null, i2);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new C1194bM(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    @Nullable
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    @Nullable
    public final NativeAd nextNativeAd(@Nullable NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        List<NativeAd> list = this.A09;
        NativeAd nativeAd = list.get(i2 % list.size());
        if (nativeAdListener != null) {
            ((U1) nativeAd.getInternalNativeAd()).A1T(nativeAd, nativeAdListener);
        }
        if (i2 >= this.A09.size()) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
