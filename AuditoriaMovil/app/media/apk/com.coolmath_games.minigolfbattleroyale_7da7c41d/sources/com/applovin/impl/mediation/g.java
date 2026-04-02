package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
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
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g {
    private final k b;
    private final r c;
    private final String d;
    private final com.applovin.impl.mediation.a.e e;
    private final String f;
    private MaxAdapter g;
    private String h;
    private com.applovin.impl.mediation.a.a i;
    private View j;
    private MaxNativeAd k;
    private View l;
    private MaxAdapterResponseParameters n;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final a m = new a(this, null);
    private final AtomicBoolean o = new AtomicBoolean(true);
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final AtomicBoolean q = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.g$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ MaxAdapterInitializationParameters a;
        final /* synthetic */ Activity b;

        AnonymousClass1(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
            this.a = maxAdapterInitializationParameters;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            r rVar = g.this.c;
            rVar.b("MediationAdapterWrapper", "Initializing " + g.this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + g.this.e.Q());
            g.this.g.initialize(this.a, this.b, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.g.1.1
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.g.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.b.B().a(g.this.e, SystemClock.elapsedRealtime() - elapsedRealtime, initializationStatus, str);
                        }
                    }, g.this.e.T());
                }
            });
        }
    }

    /* loaded from: classes.dex */
    private class a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {
        private MediationServiceImpl.a b;

        private a() {
        }

        /* synthetic */ a(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.b = aVar;
        }

        private void a(String str, final Bundle bundle) {
            g.this.q.set(true);
            a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.p.compareAndSet(false, true)) {
                        a.this.b.a(g.this.i, bundle);
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
                    } catch (Exception e) {
                        MaxAdListener maxAdListener2 = maxAdListener;
                        String name = maxAdListener2 != null ? maxAdListener2.getClass().getName() : null;
                        r.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.12
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.p.compareAndSet(false, true)) {
                        a.this.b.onAdLoadFailed(g.this.h, maxError);
                    }
                }
            });
        }

        private void b(String str, final Bundle bundle) {
            if (g.this.i.o().compareAndSet(false, true)) {
                a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.15
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b.b(g.this.i, bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, final MaxError maxError) {
            a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.16
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdDisplayFailed(g.this.i, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": adview ad clicked");
            a("onAdViewAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.8
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdClicked(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": adview ad collapsed");
            a("onAdViewAdCollapsed", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.11
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdCollapsed(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": adview ad failed to display with error: " + maxAdapterError);
            b("onAdViewAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": adview ad displayed with extra info: " + bundle);
            b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": adview ad expanded");
            a("onAdViewAdExpanded", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.10
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdExpanded(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": adview ad hidden");
            a("onAdViewAdHidden", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.9
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdHidden(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": adview ad ad failed to load with error: " + maxAdapterError);
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": adview ad loaded with extra info: " + bundle);
            g.this.j = view;
            a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": interstitial ad clicked");
            a("onInterstitialAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.17
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdClicked(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": interstitial ad failed to display with error " + maxAdapterError);
            b("onInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": interstitial ad displayed with extra info: " + bundle);
            b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": interstitial ad hidden");
            a("onInterstitialAdHidden", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.18
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdHidden(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": interstitial ad loaded with extra info: " + bundle);
            a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": native ad clicked");
            a("onNativeAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.13
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdClicked(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": native ad failed to display with error: " + maxAdapterError);
            b("onNativeAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": native ad displayed with extra info: " + bundle);
            b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": native ad ad failed to load with error: " + maxAdapterError);
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, View view, Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": native ad loaded with extra info: " + bundle);
            g.this.k = maxNativeAd;
            g.this.l = view;
            a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded ad clicked");
            a("onRewardedAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.19
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdClicked(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            b("onRewardedAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded ad displayed with extra info: " + bundle);
            b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded ad hidden");
            a("onRewardedAdHidden", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.20
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdHidden(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded ad loaded with extra info: " + bundle);
            a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded video completed");
            a("onRewardedAdVideoCompleted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoCompleted(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded video started");
            a("onRewardedAdVideoStarted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoStarted(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad clicked");
            a("onRewardedInterstitialAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdClicked(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            b("onRewardedInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad hidden");
            a("onRewardedInterstitialAdHidden", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdHidden(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            r rVar = g.this.c;
            rVar.d("MediationAdapterWrapper", g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial completed");
            a("onRewardedInterstitialAdVideoCompleted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoCompleted(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            r rVar = g.this.c;
            rVar.c("MediationAdapterWrapper", g.this.f + ": rewarded interstitial started");
            a("onRewardedInterstitialAdVideoStarted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.6
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoStarted(g.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward) {
            if (g.this.i instanceof com.applovin.impl.mediation.a.c) {
                final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) g.this.i;
                if (cVar.G().compareAndSet(false, true)) {
                    r rVar = g.this.c;
                    rVar.c("MediationAdapterWrapper", g.this.f + ": user was rewarded: " + maxReward);
                    a("onUserRewarded", this.b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.21
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        private final com.applovin.impl.mediation.a.g a;
        private final MaxSignalCollectionListener b;
        private final AtomicBoolean c = new AtomicBoolean();

        b(com.applovin.impl.mediation.a.g gVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.a = gVar;
            this.b = maxSignalCollectionListener;
        }
    }

    /* loaded from: classes.dex */
    private class c extends com.applovin.impl.sdk.e.a {
        private c() {
            super("TaskTimeoutMediatedAd", g.this.b);
        }

        /* synthetic */ c(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.p.get()) {
                return;
            }
            d(g.this.f + " is timing out " + g.this.i + "...");
            this.b.F().a(g.this.i);
            g.this.m.a(e(), new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* loaded from: classes.dex */
    private class d extends com.applovin.impl.sdk.e.a {
        private final b c;

        private d(b bVar) {
            super("TaskTimeoutSignalCollection", g.this.b);
            this.c = bVar;
        }

        /* synthetic */ d(g gVar, b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.c.get()) {
                return;
            }
            d(g.this.f + " is timing out " + this.c.a + "...");
            g gVar = g.this;
            gVar.b("The adapter (" + g.this.f + ") timed out", this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.applovin.impl.mediation.a.e eVar, MaxAdapter maxAdapter, k kVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.d = eVar.K();
        this.g = maxAdapter;
        this.b = kVar;
        this.c = kVar.z();
        this.e = eVar;
        this.f = maxAdapter.getClass().getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        r rVar = this.c;
        rVar.c("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        this.o.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, b bVar) {
        if (!bVar.c.compareAndSet(false, true) || bVar.b == null) {
            return;
        }
        bVar.b.onSignalCollected(str);
    }

    private void a(final String str, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.g.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    r rVar = g.this.c;
                    rVar.b("MediationAdapterWrapper", g.this.f + ": running " + str + "...");
                    runnable.run();
                    r rVar2 = g.this.c;
                    rVar2.b("MediationAdapterWrapper", g.this.f + ": finished " + str + "");
                } catch (Throwable th) {
                    r.c("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + g.this.f + " as disabled", th);
                    g gVar = g.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fail_");
                    sb.append(str);
                    gVar.a(sb.toString());
                    if (str.equals("destroy")) {
                        return;
                    }
                    g.this.b.A().a(g.this.e.J(), str, g.this.i);
                }
            }
        };
        if (this.e.Q()) {
            this.a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, b bVar) {
        if (!bVar.c.compareAndSet(false, true) || bVar.b == null) {
            return;
        }
        bVar.b.onSignalCollectionFailed(str);
    }

    public View a() {
        return this.j;
    }

    public void a(final com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (aVar.f() == null) {
            r.i("MediationAdapterWrapper", "Adapter has been garbage collected");
            this.m.b("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"));
        } else if (aVar.f() != this) {
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        } else {
            if (activity == null) {
                throw new IllegalArgumentException("No activity specified");
            }
            if (!this.o.get()) {
                String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
                r.i("MediationAdapterWrapper", str);
                this.m.b("ad_show", new MaxErrorImpl(-1, str));
            } else if (!e()) {
                throw new IllegalStateException("Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
            } else {
                if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                    runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.13
                        @Override // java.lang.Runnable
                        public void run() {
                            ((MaxInterstitialAdapter) g.this.g).showInterstitialAd(g.this.n, activity, g.this.m);
                        }
                    };
                } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                    runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.14
                        @Override // java.lang.Runnable
                        public void run() {
                            ((MaxRewardedAdapter) g.this.g).showRewardedAd(g.this.n, activity, g.this.m);
                        }
                    };
                } else if (aVar.getFormat() != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
                } else {
                    runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ((MaxRewardedInterstitialAdapter) g.this.g).showRewardedInterstitialAd(g.this.n, activity, g.this.m);
                        }
                    };
                }
                a("show_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            String str2 = "Failed to start displaying ad" + aVar + " : " + th;
                            r.i("MediationAdapterWrapper", str2);
                            g.this.m.b("show_ad", new MaxErrorImpl(MaxAdapterError.ERROR_CODE_UNSPECIFIED, str2));
                            g.this.a("show_ad");
                            g.this.b.A().a(g.this.e.J(), "show_ad", g.this.i);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        a("initialize", new AnonymousClass1(maxAdapterInitializationParameters, activity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final com.applovin.impl.mediation.a.g gVar, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!this.o.get()) {
            r.i("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f + ") is disabled");
            return;
        }
        final b bVar = new b(gVar, maxSignalCollectionListener);
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter instanceof MaxSignalProvider) {
            final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
            a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.4.1
                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollected(String str) {
                                g.this.a(str, bVar);
                            }

                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollectionFailed(String str) {
                                g.this.b(str, bVar);
                            }
                        });
                    } catch (Throwable th) {
                        g gVar2 = g.this;
                        gVar2.b("Failed signal collection for " + g.this.d + " due to exception: " + th, bVar);
                        g.this.a("collect_signal");
                        g.this.b.A().a(g.this.e.J(), "collect_signal", g.this.i);
                    }
                    if (bVar.c.get()) {
                        return;
                    }
                    if (gVar.S() == 0) {
                        r rVar = g.this.c;
                        rVar.b("MediationAdapterWrapper", "Failing signal collection " + gVar + " since it has 0 timeout");
                        g gVar3 = g.this;
                        gVar3.b("The adapter (" + g.this.f + ") has 0 timeout", bVar);
                    } else if (gVar.S() <= 0) {
                        r rVar2 = g.this.c;
                        rVar2.b("MediationAdapterWrapper", "Negative timeout set for " + gVar + ", not scheduling a timeout");
                    } else {
                        r rVar3 = g.this.c;
                        rVar3.b("MediationAdapterWrapper", "Setting timeout " + gVar.S() + "ms. for " + gVar);
                        g.this.b.Q().a(new d(g.this, bVar, null), o.a.MEDIATION_TIMEOUT, gVar.S());
                    }
                }
            });
            return;
        }
        b("The adapter (" + this.f + ") does not support signal collection", bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.h = str;
        this.i = aVar;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, MediationServiceImpl.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.o.get()) {
            String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            r.i("MediationAdapterWrapper", str2);
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
            return;
        }
        this.n = maxAdapterResponseParameters;
        this.m.a(aVar2);
        if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.7
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) g.this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, g.this.m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.8
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) g.this.g).loadRewardedAd(maxAdapterResponseParameters, activity, g.this.m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.9
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedInterstitialAdapter) g.this.g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, g.this.m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.10
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxNativeAdAdapter) g.this.g).loadNativeAd(maxAdapterResponseParameters, activity, g.this.m);
                }
            };
        } else if (!aVar.getFormat().isAdViewAd()) {
            throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
        } else {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.11
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAdViewAdapter) g.this.g).loadAdViewAd(maxAdapterResponseParameters, aVar.getFormat(), activity, g.this.m);
                }
            };
        }
        a("load_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str3 = "Failed start loading " + aVar + " : " + th;
                    r.i("MediationAdapterWrapper", str3);
                    g.this.m.a("load_ad", new MaxErrorImpl(-1, str3));
                    g.this.a("load_ad");
                    g.this.b.A().a(g.this.e.J(), "load_ad", g.this.i);
                }
                if (g.this.p.get()) {
                    return;
                }
                long S = g.this.e.S();
                if (S <= 0) {
                    g.this.c.b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                    return;
                }
                g.this.c.b("MediationAdapterWrapper", "Setting timeout " + S + "ms. for " + aVar);
                g.this.b.Q().a(new c(g.this, null), o.a.MEDIATION_TIMEOUT, S);
            }
        });
    }

    public String b() {
        return this.d;
    }

    public MediationServiceImpl.a c() {
        return this.m.b;
    }

    public boolean d() {
        return this.o.get();
    }

    public boolean e() {
        return this.p.get() && this.q.get();
    }

    public String f() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getSdkVersion();
            } catch (Throwable th) {
                r.c("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
                a("sdk_version");
                this.b.A().a(this.e.J(), "sdk_version", this.i);
                return null;
            }
        }
        return null;
    }

    public String g() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getAdapterVersion();
            } catch (Throwable th) {
                r.c("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
                a("adapter_version");
                this.b.A().a(this.e.J(), "adapter_version", this.i);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g.5
            @Override // java.lang.Runnable
            public void run() {
                g.this.a("destroy");
                g.this.g.onDestroy();
                g.this.g = null;
            }
        });
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f + "'}";
    }
}
