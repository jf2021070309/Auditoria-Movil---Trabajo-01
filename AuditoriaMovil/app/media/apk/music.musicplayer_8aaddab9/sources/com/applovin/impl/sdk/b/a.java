package com.applovin.impl.sdk.b;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.e.aa;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final AppLovinAdServiceImpl f3891b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAd f3892c;

    /* renamed from: d  reason: collision with root package name */
    private String f3893d;

    /* renamed from: e  reason: collision with root package name */
    private SoftReference<AppLovinAdLoadListener> f3894e;

    /* renamed from: g  reason: collision with root package name */
    private volatile String f3896g;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3895f = new Object();

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f3897h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0086a implements AppLovinAdLoadListener {

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdLoadListener f3898b;

        public C0086a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f3898b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.f3892c = appLovinAd;
            if (this.f3898b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0086a.this.f3898b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            v.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i2) {
            if (this.f3898b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0086a.this.f3898b.failedToReceiveAd(i2);
                        } catch (Throwable th) {
                            v.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdDisplayListener f3901b;

        /* renamed from: c  reason: collision with root package name */
        private final AppLovinAdClickListener f3902c;

        /* renamed from: d  reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f3903d;

        /* renamed from: e  reason: collision with root package name */
        private final AppLovinAdRewardListener f3904e;

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f3901b = appLovinAdDisplayListener;
            this.f3902c = appLovinAdClickListener;
            this.f3903d = appLovinAdVideoPlaybackListener;
            this.f3904e = appLovinAdRewardListener;
        }

        private void a(e eVar) {
            int i2;
            String str;
            String d2 = a.this.d();
            if (!StringUtils.isValidString(d2) || !a.this.f3897h) {
                v B = a.this.a.B();
                StringBuilder B2 = e.a.d.a.a.B("Invalid reward state - result: ", d2, " and wasFullyEngaged: ");
                B2.append(a.this.f3897h);
                B.e("IncentivizedAdController", B2.toString());
                a.this.a.B().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                eVar.aB();
                if (a.this.f3897h) {
                    a.this.a.B().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    i2 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    a.this.a.B().e("IncentivizedAdController", "User close the ad prematurely");
                    i2 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.a(c.a(str));
                a.this.a.B().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                j.a(this.f3904e, eVar, i2);
            }
            a.this.a(eVar);
            a.this.a.B().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            j.b(this.f3901b, eVar);
            if (eVar.ab().getAndSet(true)) {
                return;
            }
            a.this.a.B().b("IncentivizedAdController", "Scheduling report rewarded ad...");
            a.this.a.S().a(new com.applovin.impl.sdk.e.v(eVar, a.this.a), o.a.REWARD);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            j.a(this.f3902c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            j.a(this.f3901b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof f) {
                appLovinAd = ((f) appLovinAd).a();
            }
            if (appLovinAd instanceof e) {
                a((e) appLovinAd);
                return;
            }
            v B = a.this.a.B();
            B.e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            j.a(this.f3901b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            j.b(this.f3904e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            j.c(this.f3904e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            j.a(this.f3904e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
            a.this.a("network_timeout");
            j.a(this.f3904e, appLovinAd, i2);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            j.a(this.f3903d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            j.a(this.f3903d, appLovinAd, d2, z);
            a.this.f3897h = z;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.a = appLovinSdk.coreSdk;
        this.f3891b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f3893d = str;
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            v B = this.a.B();
            StringBuilder y = e.a.d.a.a.y("Failed to render an ad of type ");
            y.append(appLovinAdImpl.getType());
            y.append(" in an Incentivized Ad interstitial.");
            B.e("IncentivizedAdController", y.toString());
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.a);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.a.Y(), context);
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd);
        if (maybeRetrieveNonDummyAd instanceof e) {
            a((e) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, c.p.j jVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            v B = this.a.B();
            StringBuilder y = e.a.d.a.a.y("Failed to render an ad of type ");
            y.append(appLovinAdImpl.getType());
            y.append(" in an Incentivized Ad interstitial.");
            B.e("IncentivizedAdController", y.toString());
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.a);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.a.Y(), context);
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, jVar);
        if (maybeRetrieveNonDummyAd instanceof e) {
            a((e) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.a.S().a(new aa(eVar, appLovinAdRewardListener, this.a), o.a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f3892c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof f) {
                if (appLovinAd != ((f) appLovinAd2).a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f3892c = null;
        }
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f3892c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        v.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        c();
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.a.T().a(com.applovin.impl.sdk.d.f.f4003j);
        j.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        j.b(appLovinAdDisplayListener, appLovinAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f3895f) {
            this.f3896g = str;
        }
    }

    private void b(AppLovinAd appLovinAd, ViewGroup viewGroup, c.p.j jVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f3892c;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, jVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        v.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        c();
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f3891b.loadNextIncentivizedAd(this.f3893d, appLovinAdLoadListener);
    }

    private void c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f3894e;
        if (softReference == null || (appLovinAdLoadListener = softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        String str;
        synchronized (this.f3895f) {
            str = this.f3896g;
        }
        return str;
    }

    private AppLovinAdRewardListener e() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                v B = a.this.a.B();
                B.e("IncentivizedAdController", "User over quota: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                v B = a.this.a.B();
                B.e("IncentivizedAdController", "Reward rejected: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                v B = a.this.a.B();
                B.b("IncentivizedAdController", "Reward validated: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
                v B = a.this.a.B();
                B.e("IncentivizedAdController", "Reward validation failed: " + i2);
            }
        };
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = e();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAd appLovinAd, ViewGroup viewGroup, c.p.j jVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        b(appLovinAd, viewGroup, jVar, context, appLovinAdRewardListener == null ? e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a.B().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        this.f3894e = new SoftReference<>(appLovinAdLoadListener);
        if (!a()) {
            b(new C0086a(appLovinAdLoadListener));
            return;
        }
        v.i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f3892c);
        }
    }

    public boolean a() {
        return this.f3892c != null;
    }

    public String b() {
        return this.f3893d;
    }
}
