package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import c.p.j;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private final m f3692b;

    /* renamed from: c  reason: collision with root package name */
    private final v f3693c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3694d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f3695e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3696f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAdapter f3697g;

    /* renamed from: h  reason: collision with root package name */
    private String f3698h;

    /* renamed from: i  reason: collision with root package name */
    private com.applovin.impl.mediation.a.a f3699i;

    /* renamed from: j  reason: collision with root package name */
    private View f3700j;

    /* renamed from: k  reason: collision with root package name */
    private MaxNativeAd f3701k;

    /* renamed from: l  reason: collision with root package name */
    private MaxNativeAdView f3702l;

    /* renamed from: n  reason: collision with root package name */
    private MaxAdapterResponseParameters f3704n;
    private final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    private final a f3703m = new a(this, null);
    private final AtomicBoolean o = new AtomicBoolean(true);
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final AtomicBoolean q = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.g$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ MaxAdapterInitializationParameters a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f3705b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f3706c;

        public AnonymousClass1(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
            this.a = maxAdapterInitializationParameters;
            this.f3705b = activity;
            this.f3706c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            v vVar = g.this.f3693c;
            StringBuilder y = e.a.d.a.a.y("Initializing ");
            y.append(g.this.f3696f);
            y.append(" on thread: ");
            y.append(Thread.currentThread());
            y.append(" with 'run_on_ui_thread' value: ");
            y.append(g.this.f3695e.V());
            vVar.b("MediationAdapterWrapper", y.toString());
            g.this.f3697g.initialize(this.a, this.f3705b, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.g.1.1
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.g.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            C00841 c00841 = C00841.this;
                            g.this.f3692b.D().a(g.this.f3695e, elapsedRealtime2 - elapsedRealtime, initializationStatus, str);
                            Runnable runnable = AnonymousClass1.this.f3706c;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    }, g.this.f3695e.Z());
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {

        /* renamed from: b  reason: collision with root package name */
        private MediationServiceImpl.a f3742b;

        private a() {
        }

        public /* synthetic */ a(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f3742b = aVar;
        }

        private void a(String str, final Bundle bundle) {
            g.this.q.set(true);
            a(str, this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.p.compareAndSet(false, true)) {
                        a.this.f3742b.a(g.this.f3699i, bundle);
                    }
                }
            });
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            g.this.a.post(new Runnable() { // from class: com.applovin.impl.mediation.g.a.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e2) {
                        MaxAdListener maxAdListener2 = maxAdListener;
                        v.c("MediationAdapterWrapper", e.a.d.a.a.s(e.a.d.a.a.y("Failed to forward call ("), str, ") to ", maxAdListener2 != null ? maxAdListener2.getClass().getName() : null), e2);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            a(str, this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.12
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.p.compareAndSet(false, true)) {
                        a.this.f3742b.onAdLoadFailed(g.this.f3698h, maxError);
                    }
                }
            });
        }

        private void b(String str, final Bundle bundle) {
            if (g.this.f3699i.t().compareAndSet(false, true)) {
                a(str, this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.15
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f3742b.b(g.this.f3699i, bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, final MaxError maxError) {
            a(str, this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.16
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdDisplayFailed(g.this.f3699i, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": adview ad clicked");
            a("onAdViewAdClicked", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.8
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdClicked(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": adview ad collapsed");
            a("onAdViewAdCollapsed", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.11
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdCollapsed(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": adview ad failed to display with error: " + maxAdapterError);
            b("onAdViewAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": adview ad displayed with extra info: " + bundle);
            b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": adview ad expanded");
            a("onAdViewAdExpanded", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.10
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdExpanded(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": adview ad hidden");
            a("onAdViewAdHidden", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.9
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdHidden(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": adview ad ad failed to load with error: " + maxAdapterError);
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": adview ad loaded with extra info: " + bundle);
            g.this.f3700j = view;
            a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": interstitial ad clicked");
            a("onInterstitialAdClicked", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.17
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdClicked(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": interstitial ad failed to display with error " + maxAdapterError);
            b("onInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": interstitial ad displayed with extra info: " + bundle);
            b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": interstitial ad hidden");
            a("onInterstitialAdHidden", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.18
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdHidden(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": interstitial ad failed to load with error " + maxAdapterError);
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": interstitial ad loaded with extra info: " + bundle);
            a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": native ad clicked");
            a("onNativeAdClicked", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.13
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdClicked(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": native ad displayed with extra info: " + bundle);
            b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": native ad ad failed to load with error: " + maxAdapterError);
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": native ad loaded with extra info: " + bundle);
            g.this.f3701k = maxNativeAd;
            a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad clicked");
            a("onRewardedAdClicked", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.19
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdClicked(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad display failed with error: " + maxAdapterError);
            b("onRewardedAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad displayed with extra info: " + bundle);
            b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad hidden");
            a("onRewardedAdHidden", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.20
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdHidden(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad failed to load with error: " + maxAdapterError);
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad loaded with extra info: " + bundle);
            a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded video completed");
            a("onRewardedAdVideoCompleted", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onRewardedVideoCompleted(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded video started");
            a("onRewardedAdVideoStarted", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onRewardedVideoStarted(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial ad clicked");
            a("onRewardedInterstitialAdClicked", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdClicked(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            b("onRewardedInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial ad hidden");
            a("onRewardedInterstitialAdHidden", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onAdHidden(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            v vVar = g.this.f3693c;
            vVar.d("MediationAdapterWrapper", g.this.f3696f + ": rewarded ad failed to load with error: " + maxAdapterError);
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial completed");
            a("onRewardedInterstitialAdVideoCompleted", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onRewardedVideoCompleted(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            v vVar = g.this.f3693c;
            vVar.c("MediationAdapterWrapper", g.this.f3696f + ": rewarded interstitial started");
            a("onRewardedInterstitialAdVideoStarted", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.6
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3742b.onRewardedVideoStarted(g.this.f3699i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward) {
            if (g.this.f3699i instanceof com.applovin.impl.mediation.a.c) {
                final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) g.this.f3699i;
                if (cVar.L().compareAndSet(false, true)) {
                    v vVar = g.this.f3693c;
                    vVar.c("MediationAdapterWrapper", g.this.f3696f + ": user was rewarded: " + maxReward);
                    a("onUserRewarded", this.f3742b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.21
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f3742b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private final com.applovin.impl.mediation.a.h a;

        /* renamed from: b  reason: collision with root package name */
        private final MaxSignalCollectionListener f3752b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f3753c = new AtomicBoolean();

        public b(com.applovin.impl.mediation.a.h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.a = hVar;
            this.f3752b = maxSignalCollectionListener;
        }
    }

    /* loaded from: classes.dex */
    public class c extends com.applovin.impl.sdk.e.a {
        private c() {
            super("TaskTimeoutMediatedAd", g.this.f3692b);
        }

        public /* synthetic */ c(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        private void a(com.applovin.impl.mediation.a.a aVar) {
            if (aVar != null) {
                this.f4020b.H().a(aVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.p.get()) {
                return;
            }
            if (g.this.f3699i.l()) {
                a(g.this.f3696f + " is timing out, considering JS Tag ad loaded: " + g.this.f3699i);
                a(g.this.f3699i);
                return;
            }
            d(g.this.f3696f + " is timing out " + g.this.f3699i + "...");
            a(g.this.f3699i);
            g.this.f3703m.a(e(), new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* loaded from: classes.dex */
    public class d extends com.applovin.impl.sdk.e.a {

        /* renamed from: c  reason: collision with root package name */
        private final b f3754c;

        private d(b bVar) {
            super("TaskTimeoutSignalCollection", g.this.f3692b);
            this.f3754c = bVar;
        }

        public /* synthetic */ d(g gVar, b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3754c.f3753c.get()) {
                return;
            }
            d(g.this.f3696f + " is timing out " + this.f3754c.a + "...");
            g gVar = g.this;
            StringBuilder y = e.a.d.a.a.y("The adapter (");
            y.append(g.this.f3696f);
            y.append(") timed out");
            gVar.b(y.toString(), this.f3754c);
        }
    }

    public g(com.applovin.impl.mediation.a.f fVar, MaxAdapter maxAdapter, m mVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3694d = fVar.P();
        this.f3697g = maxAdapter;
        this.f3692b = mVar;
        this.f3693c = mVar.B();
        this.f3695e = fVar;
        this.f3696f = maxAdapter.getClass().getSimpleName();
    }

    private void a(final Runnable runnable, final com.applovin.impl.mediation.a.a aVar) {
        a("show_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    StringBuilder y = e.a.d.a.a.y("Failed to start displaying ad");
                    y.append(aVar);
                    y.append(" : ");
                    y.append(th);
                    String sb = y.toString();
                    v.i("MediationAdapterWrapper", sb);
                    g.this.f3703m.b("show_ad", new MaxErrorImpl(MaxAdapterError.ERROR_CODE_UNSPECIFIED, sb));
                    g.this.a("show_ad");
                    g.this.f3692b.C().a(g.this.f3695e.O(), "show_ad", g.this.f3699i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f3693c.c("MediationAdapterWrapper", e.a.d.a.a.s(e.a.d.a.a.y("Marking "), this.f3696f, " as disabled due to: ", str));
        this.o.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, b bVar) {
        if (!bVar.f3753c.compareAndSet(false, true) || bVar.f3752b == null) {
            return;
        }
        bVar.f3752b.onSignalCollected(str);
    }

    private void a(final String str, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.g.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    v vVar = g.this.f3693c;
                    vVar.b("MediationAdapterWrapper", g.this.f3696f + ": running " + str + "...");
                    runnable.run();
                    v vVar2 = g.this.f3693c;
                    vVar2.b("MediationAdapterWrapper", g.this.f3696f + ": finished " + str + "");
                } catch (Throwable th) {
                    StringBuilder y = e.a.d.a.a.y("Unable to run adapter operation ");
                    y.append(str);
                    y.append(", marking ");
                    y.append(g.this.f3696f);
                    y.append(" as disabled");
                    v.c("MediationAdapterWrapper", y.toString(), th);
                    g gVar = g.this;
                    StringBuilder y2 = e.a.d.a.a.y("fail_");
                    y2.append(str);
                    gVar.a(y2.toString());
                    if (str.equals("destroy")) {
                        return;
                    }
                    g.this.f3692b.C().a(g.this.f3695e.O(), str, g.this.f3699i);
                }
            }
        };
        if (this.f3695e.V()) {
            this.a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, b bVar) {
        if (!bVar.f3753c.compareAndSet(false, true) || bVar.f3752b == null) {
            return;
        }
        bVar.f3752b.onSignalCollectionFailed(str);
    }

    private boolean b(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar != null) {
            if (aVar.g() == null) {
                v.i("MediationAdapterWrapper", "Adapter has been garbage collected");
                maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
            } else if (aVar.g() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            } else {
                if (activity == null) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (this.o.get()) {
                    if (g()) {
                        return true;
                    }
                    throw new IllegalStateException(e.a.d.a.a.r(e.a.d.a.a.y("Mediation adapter '"), this.f3696f, "' does not have an ad loaded. Please load an ad first"));
                }
                StringBuilder y = e.a.d.a.a.y("Mediation adapter '");
                y.append(this.f3696f);
                y.append("' is disabled. Showing ads with this adapter is disabled.");
                String sb = y.toString();
                v.i("MediationAdapterWrapper", sb);
                maxErrorImpl = new MaxErrorImpl(-1, sb);
            }
            this.f3703m.b("ad_show", maxErrorImpl);
            return false;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public View a() {
        return this.f3700j;
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.15
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f3697g).showInterstitialAd(g.this.f3704n, activity, g.this.f3703m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.16
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f3697g).showRewardedAd(g.this.f3704n, activity, g.this.f3703m);
                    }
                };
            } else if (aVar.getFormat() != MaxAdFormat.REWARDED_INTERSTITIAL) {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            } else {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f3697g).showRewardedInterstitialAd(g.this.f3704n, activity, g.this.f3703m);
                    }
                };
            }
            a(runnable, aVar);
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final ViewGroup viewGroup, final j jVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) g.this.f3697g).showInterstitialAd(g.this.f3704n, viewGroup, jVar, activity, g.this.f3703m);
                    }
                };
            } else if (aVar.getFormat() != MaxAdFormat.REWARDED) {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            } else {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdViewAdapter) g.this.f3697g).showRewardedAd(g.this.f3704n, viewGroup, jVar, activity, g.this.f3703m);
                    }
                };
            }
            a(runnable, aVar);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
        a("initialize", new AnonymousClass1(maxAdapterInitializationParameters, activity, runnable));
    }

    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final com.applovin.impl.mediation.a.h hVar, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (this.o.get()) {
            final b bVar = new b(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f3697g;
            if (!(maxAdapter instanceof MaxSignalProvider)) {
                b(e.a.d.a.a.r(e.a.d.a.a.y("The adapter ("), this.f3696f, ") does not support signal collection"), bVar);
                return;
            }
            final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
            a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.6.1
                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollected(String str) {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                g.this.a(str, bVar);
                            }

                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollectionFailed(String str) {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                g.this.b(str, bVar);
                            }
                        });
                    } catch (Throwable th) {
                        g gVar = g.this;
                        StringBuilder y = e.a.d.a.a.y("Failed signal collection for ");
                        y.append(g.this.f3694d);
                        y.append(" due to exception: ");
                        y.append(th);
                        gVar.b(y.toString(), bVar);
                        g.this.a("collect_signal");
                        g.this.f3692b.C().a(g.this.f3695e.O(), "collect_signal", g.this.f3699i);
                    }
                    if (bVar.f3753c.get()) {
                        return;
                    }
                    if (hVar.Y() == 0) {
                        v vVar = g.this.f3693c;
                        StringBuilder y2 = e.a.d.a.a.y("Failing signal collection ");
                        y2.append(hVar);
                        y2.append(" since it has 0 timeout");
                        vVar.b("MediationAdapterWrapper", y2.toString());
                        g gVar2 = g.this;
                        StringBuilder y3 = e.a.d.a.a.y("The adapter (");
                        y3.append(g.this.f3696f);
                        y3.append(") has 0 timeout");
                        gVar2.b(y3.toString(), bVar);
                        return;
                    }
                    int i2 = (hVar.Y() > 0L ? 1 : (hVar.Y() == 0L ? 0 : -1));
                    v vVar2 = g.this.f3693c;
                    StringBuilder sb = new StringBuilder();
                    if (i2 <= 0) {
                        sb.append("Negative timeout set for ");
                        sb.append(hVar);
                        sb.append(", not scheduling a timeout");
                        vVar2.b("MediationAdapterWrapper", sb.toString());
                        return;
                    }
                    sb.append("Setting timeout ");
                    sb.append(hVar.Y());
                    sb.append("ms. for ");
                    sb.append(hVar);
                    vVar2.b("MediationAdapterWrapper", sb.toString());
                    g.this.f3692b.S().a(new d(g.this, bVar, null), o.a.MEDIATION_TIMEOUT, hVar.Y());
                }
            });
            return;
        }
        StringBuilder y = e.a.d.a.a.y("Mediation adapter '");
        y.append(this.f3696f);
        y.append("' is disabled. Signal collection ads with this adapter is disabled.");
        v.i("MediationAdapterWrapper", y.toString());
        maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f3696f + ") is disabled");
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f3702l = maxNativeAdView;
    }

    public void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.f3698h = str;
        this.f3699i = aVar;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, MediationServiceImpl.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.o.get()) {
            StringBuilder y = e.a.d.a.a.y("Mediation adapter '");
            y.append(this.f3696f);
            y.append("' was disabled due to earlier failures. Loading ads with this adapter is disabled.");
            String sb = y.toString();
            v.i("MediationAdapterWrapper", sb);
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, sb));
            return;
        }
        this.f3704n = maxAdapterResponseParameters;
        this.f3703m.a(aVar2);
        if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.9
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) g.this.f3697g).loadInterstitialAd(maxAdapterResponseParameters, activity, g.this.f3703m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.10
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) g.this.f3697g).loadRewardedAd(maxAdapterResponseParameters, activity, g.this.f3703m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.11
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedInterstitialAdapter) g.this.f3697g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, g.this.f3703m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.12
                @Override // java.lang.Runnable
                public void run() {
                    ((MediationAdapterBase) g.this.f3697g).loadNativeAd(maxAdapterResponseParameters, activity, g.this.f3703m);
                }
            };
        } else if (!aVar.getFormat().isAdViewAd()) {
            throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
        } else {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.13
                @Override // java.lang.Runnable
                public void run() {
                    MaxAdViewAdapter maxAdViewAdapter = (MaxAdViewAdapter) g.this.f3697g;
                    MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                    aVar.getFormat();
                    Activity activity2 = activity;
                    a unused = g.this.f3703m;
                }
            };
        }
        a("load_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    StringBuilder y2 = e.a.d.a.a.y("Failed start loading ");
                    y2.append(aVar);
                    y2.append(" : ");
                    y2.append(th);
                    String sb2 = y2.toString();
                    v.i("MediationAdapterWrapper", sb2);
                    g.this.f3703m.a("load_ad", new MaxErrorImpl(-1, sb2));
                    g.this.a("load_ad");
                    g.this.f3692b.C().a(g.this.f3695e.O(), "load_ad", g.this.f3699i);
                }
                if (g.this.p.get()) {
                    return;
                }
                long Y = g.this.f3695e.Y();
                if (Y <= 0) {
                    v vVar = g.this.f3693c;
                    StringBuilder y3 = e.a.d.a.a.y("Negative timeout set for ");
                    y3.append(aVar);
                    y3.append(", not scheduling a timeout");
                    vVar.b("MediationAdapterWrapper", y3.toString());
                    return;
                }
                v vVar2 = g.this.f3693c;
                vVar2.b("MediationAdapterWrapper", "Setting timeout " + Y + "ms. for " + aVar);
                g.this.f3692b.S().a(new c(g.this, null), o.a.MEDIATION_TIMEOUT, Y);
            }
        });
    }

    public MaxNativeAd b() {
        return this.f3701k;
    }

    public MaxNativeAdView c() {
        return this.f3702l;
    }

    public String d() {
        return this.f3694d;
    }

    public MediationServiceImpl.a e() {
        return this.f3703m.f3742b;
    }

    public boolean f() {
        return this.o.get();
    }

    public boolean g() {
        return this.p.get() && this.q.get();
    }

    public String h() {
        MaxAdapter maxAdapter = this.f3697g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getSdkVersion();
            } catch (Throwable th) {
                v.c("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
                a("sdk_version");
                this.f3692b.C().a(this.f3695e.O(), "sdk_version", this.f3699i);
                return null;
            }
        }
        return null;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f3697g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getAdapterVersion();
            } catch (Throwable th) {
                v.c("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
                a("adapter_version");
                this.f3692b.C().a(this.f3695e.O(), "adapter_version", this.f3699i);
                return null;
            }
        }
        return null;
    }

    public void j() {
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g.7
            @Override // java.lang.Runnable
            public void run() {
                g.this.a("destroy");
                g.this.f3697g.onDestroy();
                g.this.f3697g = null;
                g.this.f3700j = null;
                g.this.f3701k = null;
                g.this.f3702l = null;
            }
        });
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediationAdapterWrapper{adapterTag='");
        y.append(this.f3696f);
        y.append("'");
        y.append('}');
        return y.toString();
    }
}
