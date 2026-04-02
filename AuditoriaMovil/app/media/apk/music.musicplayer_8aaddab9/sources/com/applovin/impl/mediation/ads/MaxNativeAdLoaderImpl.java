package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a {
    private final a a;

    /* renamed from: b  reason: collision with root package name */
    private String f3390b;

    /* renamed from: c  reason: collision with root package name */
    private MaxNativeAdListener f3391c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, MaxNativeAdView> f3392d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f3393e;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0074a {
        private a() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            j.a(MaxNativeAdLoaderImpl.this.f3391c, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            j.a(MaxNativeAdLoaderImpl.this.f3391c, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    d dVar = (d) maxAd;
                    dVar.d(MaxNativeAdLoaderImpl.this.f3390b);
                    dVar.e(MaxNativeAdLoaderImpl.this.customPostbackData);
                    MaxNativeAd v = dVar.v();
                    MaxNativeAdView a = MaxNativeAdLoaderImpl.this.a(dVar.a());
                    if (a == null) {
                        String x = dVar.x();
                        if (!StringUtils.isValidString(x)) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                            v vVar = maxNativeAdLoaderImpl.logger;
                            String str = maxNativeAdLoaderImpl.tag;
                            vVar.b(str, "Native ad failed to load: Both template and native ad view are null. Please select a template in the dashboard or provide a `MaxNativeAdView` when loading the ad to render the native ad.");
                            j.a(MaxNativeAdLoaderImpl.this.f3391c, MaxNativeAdLoaderImpl.this.adUnitId, (MaxError) new MaxErrorImpl(-5001, "Both template and native ad view are null. Please select a template in the dashboard or provide a `MaxNativeAdView` when loading the ad to render the native ad."), true);
                            return;
                        }
                        a = new MaxNativeAdView(x, MaxNativeAdLoaderImpl.this.sdk.L());
                    }
                    dVar.a(a);
                    a aVar = a.this;
                    a.render(dVar, aVar, MaxNativeAdLoaderImpl.this.sdk);
                    v.prepareViewForInteraction(a);
                    j.a(MaxNativeAdLoaderImpl.this.f3391c, a, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            j.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, m mVar, Context context) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", mVar);
        this.a = new a();
        this.f3392d = new HashMap();
        this.f3393e = new Object();
        v vVar = this.logger;
        String str2 = this.tag;
        vVar.b(str2, "Created new MaxNativeAdLoader (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f3393e) {
            remove = this.f3392d.remove(str);
        }
        return remove;
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f3393e) {
            this.f3392d.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        v vVar;
        String str;
        StringBuilder sb;
        String str2;
        if (maxAd instanceof d) {
            d dVar = (d) maxAd;
            if (dVar.y()) {
                v vVar2 = this.logger;
                String str3 = this.tag;
                vVar2.b(str3, "Native ad(" + dVar + ") has already been destroyed");
                return;
            }
            MaxNativeAdView w = dVar.w();
            if (w != null) {
                w.recycle();
                return;
            }
            vVar = this.logger;
            str = this.tag;
            sb = new StringBuilder();
            sb.append("Destroy failed on native ad(");
            sb.append(dVar);
            str2 = "): native ad view not found";
        } else {
            vVar = this.logger;
            str = this.tag;
            sb = new StringBuilder();
            sb.append("Destroy failed on non-native ad(");
            sb.append(maxAd);
            str2 = ")";
        }
        sb.append(str2);
        vVar.b(str, sb.toString());
    }

    public String getPlacement() {
        return this.f3390b;
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        v vVar = this.logger;
        String str = this.tag;
        vVar.b(str, "Setting native ad listener: " + maxNativeAdListener);
        this.f3391c = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f3390b = str;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MaxNativeAdLoader{adUnitId='");
        e.a.d.a.a.J(y, this.adUnitId, CoreConstants.SINGLE_QUOTE_CHAR, ", nativeAdListener=");
        y.append(this.f3391c);
        y.append(", revenueListener=");
        y.append(this.revenueListener);
        y.append('}');
        return y.toString();
    }
}
