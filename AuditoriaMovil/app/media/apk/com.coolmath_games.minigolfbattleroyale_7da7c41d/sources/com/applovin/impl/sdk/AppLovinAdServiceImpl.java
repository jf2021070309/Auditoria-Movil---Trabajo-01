package com.applovin.impl.sdk;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.a.c;
import com.applovin.impl.sdk.a.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {
    private final k a;
    private final r b;
    private final Map<com.applovin.impl.sdk.a.d, b> d;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Object e = new Object();
    private final Map<String, String> f = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements AppLovinAdLoadListener {
        private final b b;

        private a(b bVar) {
            this.b = bVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet<AppLovinAdLoadListener> hashSet;
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            com.applovin.impl.sdk.a.d adZone = appLovinAdBase.getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.a.h)) {
                AppLovinAdServiceImpl.this.a.X().a(appLovinAdBase);
                appLovinAd = new com.applovin.impl.sdk.a.h(adZone, AppLovinAdServiceImpl.this.a);
            }
            synchronized (this.b.a) {
                hashSet = new HashSet(this.b.c);
                this.b.c.clear();
                this.b.b = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : hashSet) {
                AppLovinAdServiceImpl.this.a(appLovinAd, appLovinAdLoadListener);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.b.a) {
                hashSet = new HashSet(this.b.c);
                this.b.c.clear();
                this.b.b = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : hashSet) {
                AppLovinAdServiceImpl.this.a(i, appLovinAdLoadListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        final Object a;
        boolean b;
        final Collection<AppLovinAdLoadListener> c;

        private b() {
            this.a = new Object();
            this.c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", pendingAdListeners=" + this.c + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdServiceImpl(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        HashMap hashMap = new HashMap(5);
        this.d = hashMap;
        hashMap.put(com.applovin.impl.sdk.a.d.g(), new b());
        this.d.put(com.applovin.impl.sdk.a.d.h(), new b());
        this.d.put(com.applovin.impl.sdk.a.d.i(), new b());
        this.d.put(com.applovin.impl.sdk.a.d.j(), new b());
        this.d.put(com.applovin.impl.sdk.a.d.k(), new b());
    }

    private b a(com.applovin.impl.sdk.a.d dVar) {
        b bVar;
        synchronized (this.e) {
            bVar = this.d.get(dVar);
            if (bVar == null) {
                bVar = new b();
                this.d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    private String a(String str, long j, int i, String str2, boolean z) {
        try {
            if (StringUtils.isValidString(str)) {
                return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString((i < 0 || i > 100) ? 0 : 0)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
            }
            return null;
        } catch (Throwable th) {
            r rVar = this.b;
            rVar.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            return null;
        }
    }

    private String a(String str, long j, long j2, boolean z, int i) {
        if (StringUtils.isValidString(str)) {
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
            if (i != f.a) {
                appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
                appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(f.a(i)));
            }
            return appendQueryParameter.build().toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                } catch (Throwable th) {
                    r.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    private void a(Uri uri, com.applovin.impl.sdk.a.g gVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar) {
        if (appLovinAdView == null) {
            this.b.e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            return;
        }
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.a)) {
            com.applovin.impl.sdk.utils.i.c(bVar.g(), gVar, appLovinAdView);
        }
        bVar.o();
    }

    private void a(com.applovin.impl.sdk.a.d dVar, com.applovin.impl.sdk.network.i iVar, a aVar) {
        AppLovinAdBase b2 = this.a.X().b(dVar);
        if (b2 == null) {
            a(new com.applovin.impl.sdk.e.j(dVar, iVar, aVar, this.a));
            return;
        }
        r rVar = this.b;
        rVar.b("AppLovinAdService", "Using pre-loaded ad: " + b2 + " for " + dVar);
        this.a.Z().a(b2, true, false);
        aVar.adReceived(b2);
    }

    private void a(com.applovin.impl.sdk.a.d dVar, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        r z = this.a.z();
        z.b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
        b a2 = a(dVar);
        synchronized (a2.a) {
            a2.c.add(appLovinAdLoadListener);
            if (a2.b) {
                this.b.b("AppLovinAdService", "Already waiting on an ad load...");
            } else {
                a2.b = true;
                a(dVar, iVar, new a(a2));
            }
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar) {
        if (!StringUtils.isValidString(aVar.a())) {
            this.b.d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
            return;
        }
        this.a.S().a(com.applovin.impl.sdk.network.g.o().c(Utils.replaceCommonMacros(aVar.a())).d(StringUtils.isValidString(aVar.b()) ? Utils.replaceCommonMacros(aVar.b()) : null).b(aVar.c()).a(false).c(aVar.d()).a());
    }

    private void a(com.applovin.impl.sdk.e.a aVar) {
        if (!this.a.d()) {
            r.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.a.a();
        this.a.Q().a(aVar, o.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    r.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                }
            }
        });
    }

    private void a(List<com.applovin.impl.sdk.d.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : list) {
            a(aVar);
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f) {
            this.f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.a.d dVar) {
        AppLovinAdBase c = this.a.X().c(dVar);
        r rVar = this.b;
        rVar.b("AppLovinAdService", "Dequeued ad: " + c + " for zone: " + dVar + "...");
        return c;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a2 = this.a.T().a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a2;
    }

    public Map<String, String> getCustomQueryParamsForNextAdRequest() {
        HashMap hashMap;
        synchronized (this.f) {
            hashMap = new HashMap(this.f);
            this.f.clear();
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public boolean hasPreloadedAd(AppLovinAdSize appLovinAdSize) {
        return this.a.X().a(com.applovin.impl.sdk.a.d.a(appLovinAdSize, AppLovinAdType.REGULAR));
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public boolean hasPreloadedAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            r.i("AppLovinAdService", "Unable to check if ad is preloaded - invalid zone id");
            return false;
        }
        return this.a.X().a(com.applovin.impl.sdk.a.d.a(str));
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.a.d.a(appLovinAdSize, AppLovinAdType.REGULAR), (com.applovin.impl.sdk.network.i) null, appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        r rVar = this.b;
        rVar.b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        a(com.applovin.impl.sdk.a.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str), iVar, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        com.applovin.impl.sdk.e.a pVar;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            r.i("AppLovinAdService", "Invalid ad token specified");
            a(-8, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.a.c cVar = new com.applovin.impl.sdk.a.c(trim, this.a);
        if (cVar.b() != c.a.REGULAR) {
            if (cVar.b() == c.a.AD_RESPONSE_JSON) {
                JSONObject d = cVar.d();
                if (d != null) {
                    com.applovin.impl.sdk.utils.g.h(d, this.a);
                    com.applovin.impl.sdk.utils.g.d(d, this.a);
                    com.applovin.impl.sdk.utils.g.c(d, this.a);
                    com.applovin.impl.sdk.utils.g.e(d, this.a);
                    if (JsonUtils.getJSONArray(d, "ads", new JSONArray()).length() <= 0) {
                        r rVar = this.b;
                        rVar.e("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                        appLovinAdLoadListener.failedToReceiveAd(204);
                        return;
                    }
                    r rVar2 = this.b;
                    rVar2.b("AppLovinAdService", "Rendering ad for token: " + cVar);
                    com.applovin.impl.sdk.a.d zone = Utils.getZone(d, this.a);
                    f.a aVar = new f.a(zone, appLovinAdLoadListener, this.a);
                    aVar.a(true);
                    pVar = new com.applovin.impl.sdk.e.p(d, zone, com.applovin.impl.sdk.a.b.DECODED_AD_TOKEN_JSON, aVar, this.a);
                } else {
                    r rVar3 = this.b;
                    rVar3.e("AppLovinAdService", "Unable to retrieve ad response JSON from token: " + cVar);
                }
            } else {
                r.i("AppLovinAdService", "Invalid ad token specified: " + cVar);
            }
            appLovinAdLoadListener.failedToReceiveAd(-8);
            return;
        }
        r rVar4 = this.b;
        rVar4.b("AppLovinAdService", "Loading next ad for token: " + cVar);
        pVar = new com.applovin.impl.sdk.e.k(cVar, appLovinAdLoadListener, this.a);
        a(pVar);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        r rVar = this.b;
        rVar.b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        a(com.applovin.impl.sdk.a.d.a(str), (com.applovin.impl.sdk.network.i) null, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            r.i("AppLovinAdService", "No zones were provided");
            a(-7, appLovinAdLoadListener);
            return;
        }
        r rVar = this.b;
        rVar.b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        a(new com.applovin.impl.sdk.e.i(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        r rVar = this.b;
        rVar.b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        a(com.applovin.impl.sdk.a.d.b(str), (com.applovin.impl.sdk.network.i) null, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void preloadAd(AppLovinAdSize appLovinAdSize) {
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void preloadAdForZoneId(String str) {
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.d + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.a.g gVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Uri uri, PointF pointF, boolean z) {
        if (gVar == null) {
            this.b.e("AppLovinAdService", "Unable to track ad view click. No ad specified");
            return;
        }
        this.b.b("AppLovinAdService", "Tracking click on an ad...");
        a(gVar.a(pointF, z));
        a(uri, gVar, appLovinAdView, bVar);
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.a.g gVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (gVar == null) {
            this.b.e("AppLovinAdService", "Unable to track video click. No ad specified");
            return;
        }
        this.b.b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        a(gVar.a(pointF));
        Utils.openUri(appLovinAdView.getContext(), uri, this.a);
    }

    public void trackAppKilled(com.applovin.impl.sdk.a.g gVar) {
        if (gVar == null) {
            this.b.e("AppLovinAdService", "Unable to track app killed. No ad specified");
            return;
        }
        this.b.b("AppLovinAdService", "Tracking app killed during ad...");
        List<com.applovin.impl.sdk.d.a> as = gVar.as();
        if (as != null && !as.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : as) {
                a(new com.applovin.impl.sdk.d.a(aVar.a(), aVar.b()));
            }
            return;
        }
        r rVar = this.b;
        rVar.d("AppLovinAdService", "Unable to track app killed during AD #" + gVar.getAdIdNumber() + ". Missing app killed tracking URL.");
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.a.g gVar, long j, long j2, boolean z, int i) {
        r rVar = this.b;
        if (gVar == null) {
            rVar.e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
            return;
        }
        rVar.b("AppLovinAdService", "Tracking ad closed...");
        List<com.applovin.impl.sdk.d.a> ar = gVar.ar();
        if (ar == null || ar.isEmpty()) {
            r rVar2 = this.b;
            rVar2.d("AppLovinAdService", "Unable to track ad closed for AD #" + gVar.getAdIdNumber() + ". Missing ad close tracking URL." + gVar.getAdIdNumber());
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : ar) {
            String a2 = a(aVar.a(), j, j2, z, i);
            String a3 = a(aVar.b(), j, j2, z, i);
            if (StringUtils.isValidString(a2)) {
                a(new com.applovin.impl.sdk.d.a(a2, a3));
            } else {
                r rVar3 = this.b;
                rVar3.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.a.g gVar) {
        if (gVar == null) {
            this.b.e("AppLovinAdService", "Unable to track impression click. No ad specified");
            return;
        }
        this.b.b("AppLovinAdService", "Tracking impression on ad...");
        a(gVar.at());
        this.a.Z().a(gVar);
    }

    public void trackVideoEnd(com.applovin.impl.sdk.a.g gVar, long j, int i, boolean z) {
        r rVar = this.b;
        if (gVar == null) {
            rVar.e("AppLovinAdService", "Unable to track video end. No ad specified");
            return;
        }
        rVar.b("AppLovinAdService", "Tracking video end on ad...");
        List<com.applovin.impl.sdk.d.a> aq = gVar.aq();
        if (aq == null || aq.isEmpty()) {
            r rVar2 = this.b;
            rVar2.d("AppLovinAdService", "Unable to submit persistent postback for AD #" + gVar.getAdIdNumber() + ". Missing video end tracking URL.");
            return;
        }
        String l = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.sdk.d.a aVar : aq) {
            if (StringUtils.isValidString(aVar.a())) {
                String a2 = a(aVar.a(), j, i, l, z);
                String a3 = a(aVar.b(), j, i, l, z);
                if (a2 != null) {
                    a(new com.applovin.impl.sdk.d.a(a2, a3));
                } else {
                    r rVar3 = this.b;
                    rVar3.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
                }
            } else {
                this.b.d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
