package com.applovin.impl.sdk.b;

import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.a.h;
import com.applovin.impl.sdk.a.i;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
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
    protected final k a;
    protected final AppLovinAdServiceImpl b;
    private AppLovinAd c;
    private String d;
    private SoftReference<AppLovinAdLoadListener> e;
    private volatile String g;
    private final Object f = new Object();
    private volatile boolean h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0025a implements AppLovinAdLoadListener {
        private final AppLovinAdLoadListener b;

        C0025a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.c = appLovinAd;
            if (this.b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0025a.this.b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            r.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0025a.this.b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            r.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements i, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {
        private final AppLovinAdDisplayListener b;
        private final AppLovinAdClickListener c;
        private final AppLovinAdVideoPlaybackListener d;
        private final AppLovinAdRewardListener e;

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.e = appLovinAdRewardListener;
        }

        private void a(g gVar) {
            int i;
            String str;
            String e = a.this.e();
            if (!StringUtils.isValidString(e) || !a.this.h) {
                r z = a.this.a.z();
                z.e("IncentivizedAdController", "Invalid reward state - result: " + e + " and wasFullyEngaged: " + a.this.h);
                a.this.a.z().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                gVar.aH();
                if (a.this.h) {
                    a.this.a.z().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    a.this.a.z().e("IncentivizedAdController", "User close the ad prematurely");
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                gVar.a(c.a(str));
                a.this.a.z().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                com.applovin.impl.sdk.utils.i.a(this.e, gVar, i);
            }
            a.this.a(gVar);
            a.this.a.z().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            com.applovin.impl.sdk.utils.i.b(this.b, gVar);
            if (gVar.af().getAndSet(true)) {
                return;
            }
            a.this.a.z().b("IncentivizedAdController", "Scheduling report rewarded ad...");
            a.this.a.Q().a(new u(gVar, a.this.a), o.a.REWARD);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.utils.i.a(this.c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.utils.i.a(this.b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof h) {
                appLovinAd = ((h) appLovinAd).a();
            }
            if (appLovinAd instanceof g) {
                a((g) appLovinAd);
                return;
            }
            r z = a.this.a.z();
            z.e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
        }

        @Override // com.applovin.impl.sdk.a.i
        public void onAdDisplayFailed(String str) {
            com.applovin.impl.sdk.utils.i.a(this.b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            com.applovin.impl.sdk.utils.i.b(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            com.applovin.impl.sdk.utils.i.c(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            com.applovin.impl.sdk.utils.i.a(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            a.this.a("network_timeout");
            com.applovin.impl.sdk.utils.i.a(this.e, appLovinAd, i);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.utils.i.a(this.d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            com.applovin.impl.sdk.utils.i.a(this.d, appLovinAd, d, z);
            a.this.h = z;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.a = appLovinSdk.coreSdk;
        this.b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.d = str;
    }

    private void a(AppLovinAdBase appLovinAdBase, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdBase.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdBase.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            r z = this.a.z();
            z.e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdBase.getType() + " in an Incentivized Ad interstitial.");
            a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdBase, this.a);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.a.W(), context);
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd);
        if (maybeRetrieveNonDummyAd instanceof g) {
            a((g) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(g gVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.a.Q().a(new z(gVar, appLovinAdRewardListener, this.a), o.a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof h) {
                if (appLovinAd != ((h) appLovinAd2).a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.c = null;
        }
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.c;
        }
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
        if (appLovinAdBase != null) {
            a(appLovinAdBase, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        r.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        d();
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.a.R().a(f.j);
        com.applovin.impl.sdk.utils.i.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        com.applovin.impl.sdk.utils.i.b(appLovinAdDisplayListener, appLovinAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f) {
            this.g = str;
        }
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.loadNextIncentivizedAd(this.d, appLovinAdLoadListener);
    }

    private void d() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.e;
        if (softReference == null || (appLovinAdLoadListener = softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        String str;
        synchronized (this.f) {
            str = this.g;
        }
        return str;
    }

    private AppLovinAdRewardListener f() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
                a.this.a.z().e("IncentivizedAdController", "User declined to view");
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                r z = a.this.a.z();
                z.e("IncentivizedAdController", "User over quota: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                r z = a.this.a.z();
                z.e("IncentivizedAdController", "Reward rejected: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                r z = a.this.a.z();
                z.b("IncentivizedAdController", "Reward validated: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                r z = a.this.a.z();
                z.e("IncentivizedAdController", "Reward validation failed: " + i);
            }
        };
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = f();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a.z().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        this.e = new SoftReference<>(appLovinAdLoadListener);
        if (!a()) {
            b(new C0025a(appLovinAdLoadListener));
            return;
        }
        r.i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.c);
        }
    }

    public boolean a() {
        return this.c != null;
    }

    public String b() {
        return this.d;
    }

    public void c() {
    }
}
