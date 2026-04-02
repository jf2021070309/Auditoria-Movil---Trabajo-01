package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
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
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3301b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<JSONObject> f3302c = new AtomicReference<>();

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0074a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f3319b;

        /* renamed from: c  reason: collision with root package name */
        private a.InterfaceC0074a f3320c;

        public a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0074a interfaceC0074a) {
            this.f3319b = aVar;
            this.f3320c = interfaceC0074a;
        }

        public void a(a.InterfaceC0074a interfaceC0074a) {
            this.f3320c = interfaceC0074a;
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f3319b.s();
            this.f3319b.a(bundle);
            MediationServiceImpl.this.b(this.f3319b);
            j.a((MaxAdListener) this.f3320c, maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            MediationServiceImpl.this.f3301b.b("MediationService", "Scheduling impression for ad via callback...");
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f3319b, this.f3320c);
            this.f3319b.a(bundle);
            MediationServiceImpl.this.a.ag().a(this.f3319b, "DID_DISPLAY");
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.a.ad().a(maxAd);
                MediationServiceImpl.this.a.al().a(maxAd);
            }
            j.b(this.f3320c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            MediationServiceImpl.this.a(this.f3319b, this.f3320c);
            j.d(this.f3320c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            j.h(this.f3320c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.b(this.f3319b, maxError, this.f3320c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.mediation.a.c)) {
                ((com.applovin.impl.mediation.a.c) maxAd).F();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            j.g(this.f3320c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MediationServiceImpl.this.a.ag().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.a.ad().b(maxAd);
                        MediationServiceImpl.this.a.al().a();
                    }
                    j.c(a.this.f3320c, maxAd);
                }
            }, maxAd instanceof com.applovin.impl.mediation.a.c ? ((com.applovin.impl.mediation.a.c) maxAd).B() : 0L);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f3319b.s();
            MediationServiceImpl.this.a(this.f3319b, maxError, this.f3320c);
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
            j.f(this.f3320c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            j.e(this.f3320c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            j.a(this.f3320c, maxAd, maxReward);
            MediationServiceImpl.this.a.S().a(new com.applovin.impl.mediation.b.f((com.applovin.impl.mediation.a.c) maxAd, MediationServiceImpl.this.a), o.a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(m mVar) {
        this.a = mVar;
        this.f3301b = mVar.B();
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    private g a(com.applovin.impl.mediation.a.c cVar) {
        g g2 = cVar.g();
        if (g2 != null) {
            return g2;
        }
        this.a.ad().a(false);
        v vVar = this.f3301b;
        vVar.d("MediationService", "Failed to show " + cVar + ": adapter not found");
        v.i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    private void a(com.applovin.impl.mediation.a.a aVar) {
        a("mpreload", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0074a interfaceC0074a) {
        this.a.ag().a(aVar, "DID_CLICKED");
        this.a.ag().a(aVar, "DID_CLICK");
        if (aVar.d().endsWith("click")) {
            this.a.ag().a(aVar);
            j.a((MaxAdRevenueListener) interfaceC0074a, (MaxAd) aVar);
        }
        a("mclick", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        j.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar, a.InterfaceC0074a interfaceC0074a) {
        this.a.ad().a(false);
        a(cVar, (MaxAdListener) interfaceC0074a);
        this.f3301b.b("MediationService", "Scheduling impression for ad manually...");
        processRawAdImpressionPostback(cVar, interfaceC0074a);
    }

    private void a(final com.applovin.impl.mediation.a.c cVar, final MaxAdListener maxAdListener) {
        final long longValue = ((Long) this.a.a(com.applovin.impl.sdk.c.a.J)).longValue();
        if (longValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                if (cVar.t().get()) {
                    return;
                }
                StringBuilder y = e.a.d.a.a.y("Ad (");
                y.append(cVar.Q());
                y.append(") has not been displayed after ");
                y.append(longValue);
                y.append("ms. Failing ad display...");
                String sb = y.toString();
                v.i("MediationService", sb);
                MediationServiceImpl.this.b(cVar, new MaxErrorImpl(-1, sb), maxAdListener);
                MediationServiceImpl.this.a.ad().b(cVar);
                MediationServiceImpl.this.a.al().a();
            }
        }, longValue);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        long p = aVar.p();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(p));
        a("mlerr", hashMap, maxError, aVar);
    }

    private void a(String str, com.applovin.impl.mediation.a.f fVar) {
        a(str, Collections.EMPTY_MAP, (MaxError) null, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.h hVar, g gVar) {
        HashMap hashMap = new HashMap(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar.i(), hashMap);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar.h(), hashMap);
        a("serr", hashMap, new MaxErrorImpl(str), hVar);
    }

    private void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, (MaxError) null, fVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        hashMap.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.ab()));
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            hashMap.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((com.applovin.impl.mediation.a.a) fVar).getCreativeId()));
        }
        this.a.S().a(new com.applovin.impl.mediation.b.d(str, hashMap, maxError, fVar, this.a), o.a.MEDIATION_POSTBACKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar) {
        this.a.ag().a(aVar, "DID_LOAD");
        if (aVar.d().endsWith("load")) {
            this.a.ag().a(aVar);
        }
        long p = aVar.p();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(p));
        a("load", hashMap, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.a.ag().a(aVar, "DID_FAIL_DISPLAY");
        processAdDisplayErrorPostback(maxError, aVar);
        if (aVar.t().compareAndSet(false, true)) {
            j.a(maxAdListener, aVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.a.S().a(new com.applovin.impl.mediation.b.g(cVar, this.a), o.a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final com.applovin.impl.mediation.a.h hVar, Context context, final g.a aVar) {
        String str;
        v vVar;
        StringBuilder sb;
        String str2;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final g a2 = this.a.C().a(hVar);
        if (a2 != null) {
            Activity ao = context instanceof Activity ? (Activity) context : this.a.ao();
            MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(hVar, maxAdFormat);
            if (((Boolean) this.a.a(com.applovin.impl.sdk.c.a.X)).booleanValue()) {
                this.a.D().a(hVar, ao);
            }
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str3) {
                    aVar.a(com.applovin.impl.mediation.a.g.a(hVar, a2, str3));
                    a2.j();
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str3) {
                    MediationServiceImpl.this.a(str3, hVar, a2);
                    aVar.a(com.applovin.impl.mediation.a.g.b(hVar, a2, str3));
                    a2.j();
                }
            };
            if (!hVar.a()) {
                vVar = this.f3301b;
                sb = new StringBuilder();
                str2 = "Collecting signal for adapter: ";
            } else if (this.a.D().a(hVar)) {
                vVar = this.f3301b;
                sb = new StringBuilder();
                str2 = "Collecting signal for now-initialized adapter: ";
            } else {
                v vVar2 = this.f3301b;
                StringBuilder y = e.a.d.a.a.y("Skip collecting signal for not-initialized adapter: ");
                y.append(a2.d());
                vVar2.e("MediationService", y.toString());
                str = "Adapter not initialized yet";
            }
            sb.append(str2);
            sb.append(a2.d());
            vVar.b("MediationService", sb.toString());
            a2.a(a3, hVar, ao, maxSignalCollectionListener);
            return;
        }
        str = "Could not load adapter";
        aVar.a(com.applovin.impl.mediation.a.g.a(hVar, str));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            v vVar = this.f3301b;
            vVar.c("MediationService", "Destroying " + maxAd);
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            g g2 = aVar.g();
            if (g2 != null) {
                g2.j();
                aVar.u();
            }
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f3302c.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, i iVar, Context context, a.InterfaceC0074a interfaceC0074a) {
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, a.InterfaceC0074a interfaceC0074a) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("A valid Activity is required");
        }
        this.f3301b.b("MediationService", "Loading " + aVar + "...");
        this.a.ag().a(aVar, "WILL_LOAD");
        a(aVar);
        g a2 = this.a.C().a(aVar);
        if (a2 != null) {
            MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(aVar);
            if (((Boolean) this.a.a(com.applovin.impl.sdk.c.a.Y)).booleanValue()) {
                this.a.D().a(aVar, activity);
            }
            com.applovin.impl.mediation.a.a a4 = aVar.a(a2);
            a2.a(str, a4);
            a4.q();
            a2.a(str, a3, a4, activity, new a(a4, interfaceC0074a));
            return;
        }
        String str2 = "Failed to load " + aVar + ": adapter not loaded";
        v.i("MediationService", str2);
        a(aVar, new MaxErrorImpl(-5001, str2), interfaceC0074a);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c2 = this.a.ad().c();
            if (c2 instanceof com.applovin.impl.mediation.a.a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) c2);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a("mierr", Collections.EMPTY_MAP, maxError, aVar);
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f2) {
        String f3 = f2 != null ? f2.toString() : "";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{MBR}", f3);
        a("mloss", hashMap, aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.f fVar, long j2, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j2));
        a("minit", hashMap, new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0074a interfaceC0074a) {
        if (aVar.d().endsWith("cimp")) {
            this.a.ag().a(aVar);
            j.a((MaxAdRevenueListener) interfaceC0074a, (MaxAd) aVar);
        }
        a("mcimp", aVar);
    }

    public void processRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0074a interfaceC0074a) {
        this.a.ag().a(aVar, "WILL_DISPLAY");
        if (aVar.d().endsWith("mimp")) {
            this.a.ag().a(aVar);
            j.a((MaxAdRevenueListener) interfaceC0074a, (MaxAd) aVar);
        }
        HashMap hashMap = new HashMap(1);
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((com.applovin.impl.mediation.a.c) aVar).z()));
        }
        a("mimp", hashMap, aVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.e eVar, long j2, a.InterfaceC0074a interfaceC0074a) {
        if (eVar.d().endsWith("vimp")) {
            this.a.ag().a(eVar);
            j.a((MaxAdRevenueListener) interfaceC0074a, (MaxAd) eVar);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j2));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.H()));
        a("mvimp", hashMap, eVar);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f3302c.set(jSONObject);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final Activity activity, final a.InterfaceC0074a interfaceC0074a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.a.ad().a(true);
        final g a2 = a(cVar);
        long A = cVar.A();
        v vVar = this.f3301b;
        StringBuilder y = e.a.d.a.a.y("Showing ad ");
        y.append(cVar.getAdUnitId());
        y.append(" with delay of ");
        y.append(A);
        y.append("ms...");
        vVar.c("MediationService", y.toString());
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                MediationServiceImpl.this.b(cVar);
                a2.a(cVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0074a);
            }
        }, A);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final ViewGroup viewGroup, final c.p.j jVar, final Activity activity, final a.InterfaceC0074a interfaceC0074a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.a.ad().a(true);
        final g a2 = a(cVar);
        long A = cVar.A();
        v vVar = this.f3301b;
        StringBuilder y = e.a.d.a.a.y("Showing ad ");
        y.append(cVar.getAdUnitId());
        y.append(" with delay of ");
        y.append(A);
        y.append("ms...");
        vVar.c("MediationService", y.toString());
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                MediationServiceImpl.this.b(cVar);
                a2.a(cVar, viewGroup, jVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0074a);
            }
        }, A);
    }
}
