package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    private final k a;
    private final r b;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0014a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
        private final com.applovin.impl.mediation.a.a b;
        private a.InterfaceC0014a c;

        public a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0014a interfaceC0014a) {
            this.b = aVar;
            this.c = interfaceC0014a;
        }

        public void a(a.InterfaceC0014a interfaceC0014a) {
            this.c = interfaceC0014a;
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.b.n();
            this.b.a(bundle);
            MediationServiceImpl.this.b(this.b);
            i.a((MaxAdListener) this.c, maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            MediationServiceImpl.this.b.b("MediationService", "Scheduling impression for ad via callback...");
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.b, this.c);
            this.b.a(bundle);
            MediationServiceImpl.this.a.af().a(this.b, "DID_DISPLAY");
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.a.ac().a(maxAd);
                MediationServiceImpl.this.a.ak().a(maxAd);
            }
            i.b(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            MediationServiceImpl.this.a(this.b, this.c);
            i.d(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            i.h(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.b(this.b, maxError, this.c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.mediation.a.c)) {
                ((com.applovin.impl.mediation.a.c) maxAd).A();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            i.g(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MediationServiceImpl.this.a.af().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.a.ac().b(maxAd);
                        MediationServiceImpl.this.a.ak().a();
                    }
                    i.c(a.this.c, maxAd);
                }
            }, maxAd instanceof com.applovin.impl.mediation.a.c ? ((com.applovin.impl.mediation.a.c) maxAd).w() : 0L);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.b.n();
            MediationServiceImpl.this.a(this.b, maxError, this.c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            i.f(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            i.e(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            i.a(this.c, maxAd, maxReward);
            MediationServiceImpl.this.a.Q().a(new com.applovin.impl.mediation.b.f((com.applovin.impl.mediation.a.c) maxAd, MediationServiceImpl.this.a), o.a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    private void a(com.applovin.impl.mediation.a.a aVar) {
        a("mpreload", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0014a interfaceC0014a) {
        this.a.af().a(aVar, "DID_CLICKED");
        this.a.af().a(aVar, "DID_CLICK");
        if (aVar.c().endsWith("click")) {
            this.a.af().a(aVar);
            i.a((MaxAdRevenueListener) interfaceC0014a, (MaxAd) aVar);
        }
        a("mclick", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        i.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.c cVar, final MaxAdListener maxAdListener) {
        final long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.a.G)).longValue();
        if (longValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (cVar.o().get()) {
                    return;
                }
                String str = "Ad (" + cVar.L() + ") has not been displayed after " + longValue + "ms. Failing ad display...";
                r.i("MediationService", str);
                MediationServiceImpl.this.b(cVar, new MaxErrorImpl(-1, str), maxAdListener);
                MediationServiceImpl.this.a.ac().b(cVar);
                MediationServiceImpl.this.a.ak().a();
            }
        }, longValue);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        long k = aVar.k();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(k));
        a("mlerr", hashMap, maxError, aVar);
    }

    private void a(String str, com.applovin.impl.mediation.a.e eVar) {
        a(str, Collections.EMPTY_MAP, (MaxError) null, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.g gVar, g gVar2) {
        HashMap hashMap = new HashMap(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar2.g(), hashMap);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar2.f(), hashMap);
        a("serr", hashMap, new MaxErrorImpl(str), gVar);
    }

    private void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.e eVar) {
        a(str, map, (MaxError) null, eVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.e eVar) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("{PLACEMENT}", StringUtils.emptyIfNull(eVar.getPlacement()));
        if (eVar instanceof com.applovin.impl.mediation.a.a) {
            hashMap.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((com.applovin.impl.mediation.a.a) eVar).getCreativeId()));
        }
        this.a.Q().a(new com.applovin.impl.mediation.b.d(str, hashMap, maxError, eVar, this.a), o.a.MEDIATION_POSTBACKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar) {
        this.a.af().a(aVar, "DID_LOAD");
        if (aVar.c().endsWith("load")) {
            this.a.af().a(aVar);
        }
        long k = aVar.k();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(k));
        a("load", hashMap, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.a.af().a(aVar, "DID_FAIL_DISPLAY");
        processAdDisplayErrorPostback(maxError, aVar);
        if (aVar.o().compareAndSet(false, true)) {
            i.a(maxAdListener, aVar, maxError);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final com.applovin.impl.mediation.a.g gVar, Activity activity, final f.a aVar) {
        String str;
        r rVar;
        StringBuilder sb;
        String str2;
        if (gVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final g a2 = this.a.A().a(gVar);
        if (a2 != null) {
            MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(gVar, maxAdFormat);
            a2.a(a3, activity);
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str3) {
                    aVar.a(com.applovin.impl.mediation.a.f.a(gVar, a2, str3));
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str3) {
                    MediationServiceImpl.this.a(str3, gVar, a2);
                    aVar.a(com.applovin.impl.mediation.a.f.b(gVar, a2, str3));
                }
            };
            if (!gVar.a()) {
                rVar = this.b;
                sb = new StringBuilder();
                str2 = "Collecting signal for adapter: ";
            } else if (this.a.B().a(gVar)) {
                rVar = this.b;
                sb = new StringBuilder();
                str2 = "Collecting signal for now-initialized adapter: ";
            } else {
                r rVar2 = this.b;
                rVar2.e("MediationService", "Skip collecting signal for not-initialized adapter: " + a2.b());
                str = "Adapter not initialized yet";
            }
            sb.append(str2);
            sb.append(a2.b());
            rVar.b("MediationService", sb.toString());
            a2.a(a3, gVar, activity, maxSignalCollectionListener);
            return;
        }
        str = "Could not load adapter";
        aVar.a(com.applovin.impl.mediation.a.f.a(gVar, str));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            r rVar = this.b;
            rVar.c("MediationService", "Destroying " + maxAd);
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            g f = aVar.f();
            if (f != null) {
                f.h();
                aVar.p();
            }
        }
    }

    public void loadAd(String str, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.network.i iVar, Activity activity, a.InterfaceC0014a interfaceC0014a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (interfaceC0014a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.a.s())) {
            r.i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (!this.a.d()) {
            r.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.a.a();
        if (str.length() != 16 && !str.startsWith("test_mode") && !this.a.x().startsWith("05TMD")) {
            r.i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
        }
        if (!this.a.a(maxAdFormat)) {
            this.a.G().a(str, maxAdFormat, iVar, activity, interfaceC0014a);
            return;
        }
        r.i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        i.a(interfaceC0014a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, a.InterfaceC0014a interfaceC0014a) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("A valid Activity is required");
        }
        this.b.b("MediationService", "Loading " + aVar + "...");
        this.a.af().a(aVar, "WILL_LOAD");
        a(aVar);
        g a2 = this.a.A().a(aVar);
        if (a2 != null) {
            MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(aVar);
            a2.a(a3, activity);
            com.applovin.impl.mediation.a.a a4 = aVar.a(a2);
            a2.a(str, a4);
            a4.l();
            a2.a(str, a3, a4, activity, new a(a4, interfaceC0014a));
            return;
        }
        String str2 = "Failed to load " + aVar + ": adapter not loaded";
        r.i("MediationService", str2);
        a(aVar, new MaxErrorImpl(-5001, str2), interfaceC0014a);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c = this.a.ac().c();
            if (c instanceof com.applovin.impl.mediation.a.a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) c);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a("mierr", Collections.EMPTY_MAP, maxError, aVar);
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f) {
        String f2 = f != null ? f.toString() : "";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{MBR}", f2);
        a("mloss", hashMap, aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.e eVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", hashMap, new MaxErrorImpl(str), eVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0014a interfaceC0014a) {
        if (aVar.c().endsWith("cimp")) {
            this.a.af().a(aVar);
            i.a((MaxAdRevenueListener) interfaceC0014a, (MaxAd) aVar);
        }
        a("mcimp", aVar);
    }

    public void processRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0014a interfaceC0014a) {
        this.a.af().a(aVar, "WILL_DISPLAY");
        if (aVar.c().endsWith("mimp")) {
            this.a.af().a(aVar);
            i.a((MaxAdRevenueListener) interfaceC0014a, (MaxAd) aVar);
        }
        HashMap hashMap = new HashMap(1);
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((com.applovin.impl.mediation.a.c) aVar).u()));
        }
        a("mimp", hashMap, aVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.b bVar, long j, a.InterfaceC0014a interfaceC0014a) {
        if (bVar.c().endsWith("vimp")) {
            this.a.af().a(bVar);
            i.a((MaxAdRevenueListener) interfaceC0014a, (MaxAd) bVar);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(bVar.y()));
        a("mvimp", hashMap, bVar);
    }

    public void showFullscreenAd(MaxAd maxAd, String str, final Activity activity, final a.InterfaceC0014a interfaceC0014a) {
        if (maxAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (!(maxAd instanceof com.applovin.impl.mediation.a.c)) {
            r.i("MediationService", "Unable to show ad for '" + maxAd.getAdUnitId() + "': only REWARDED or INTERSTITIAL ads are eligible for showFullscreenAd(). " + maxAd.getFormat() + " ad was provided.");
            throw new IllegalArgumentException("Provided ad is not a MediatedFullscreenAd");
        }
        this.a.ac().a(true);
        final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
        final g f = cVar.f();
        if (f != null) {
            cVar.c(str);
            long v = cVar.v();
            r rVar = this.b;
            rVar.c("MediationService", "Showing ad " + maxAd.getAdUnitId() + " with delay of " + v + "ms...");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                        MediationServiceImpl.this.a.Q().a(new com.applovin.impl.mediation.b.g(cVar, MediationServiceImpl.this.a), o.a.MEDIATION_REWARD);
                    }
                    f.a(cVar, activity);
                    MediationServiceImpl.this.a.ac().a(false);
                    MediationServiceImpl.this.a(cVar, (MaxAdListener) interfaceC0014a);
                    MediationServiceImpl.this.b.b("MediationService", "Scheduling impression for ad manually...");
                    MediationServiceImpl.this.processRawAdImpressionPostback(cVar, interfaceC0014a);
                }
            }, v);
            return;
        }
        this.a.ac().a(false);
        r rVar2 = this.b;
        rVar2.d("MediationService", "Failed to show " + maxAd + ": adapter not found");
        r.i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }
}
