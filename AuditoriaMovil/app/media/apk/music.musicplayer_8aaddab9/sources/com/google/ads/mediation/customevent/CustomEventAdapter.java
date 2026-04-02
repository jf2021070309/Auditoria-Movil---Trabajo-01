package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgt;
import e.d.a.a.a.a;
import e.d.a.a.a.b;
@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    public View a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public CustomEventBanner f4508b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    public CustomEventInterstitial f4509c;

    public static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzcgt.zzi(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public void destroy() {
        CustomEventBanner customEventBanner = this.f4508b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f4509c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationAdapter
    @RecentlyNonNull
    public Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.a;
    }

    @Override // com.google.ads.mediation.MediationAdapter
    @RecentlyNonNull
    public Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull MediationBannerListener mediationBannerListener, @RecentlyNonNull Activity activity, @RecentlyNonNull CustomEventServerParameters customEventServerParameters, @RecentlyNonNull AdSize adSize, @RecentlyNonNull MediationAdRequest mediationAdRequest, @RecentlyNonNull CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(customEventServerParameters.className);
        this.f4508b = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        this.f4508b.requestBannerAd(new a(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull MediationInterstitialListener mediationInterstitialListener, @RecentlyNonNull Activity activity, @RecentlyNonNull CustomEventServerParameters customEventServerParameters, @RecentlyNonNull MediationAdRequest mediationAdRequest, @RecentlyNonNull CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(customEventServerParameters.className);
        this.f4509c = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        this.f4509c.requestInterstitialAd(new b(this, this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.f4509c.showInterstitial();
    }
}
