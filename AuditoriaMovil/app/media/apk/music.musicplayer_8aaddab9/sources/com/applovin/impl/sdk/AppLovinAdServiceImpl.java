package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.c;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3755b;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, b> f3757d;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3756c = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private final Object f3758e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f3759f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<JSONObject> f3760g = new AtomicReference<>();

    /* loaded from: classes.dex */
    public class a implements AppLovinAdLoadListener {

        /* renamed from: b  reason: collision with root package name */
        private final b f3765b;

        private a(b bVar) {
            this.f3765b = bVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            com.applovin.impl.sdk.ad.d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
                AppLovinAdServiceImpl.this.a.Z().a(appLovinAdImpl);
                appLovinAd = new com.applovin.impl.sdk.ad.f(adZone, AppLovinAdServiceImpl.this.a);
            }
            synchronized (this.f3765b.a) {
                hashSet = new HashSet(this.f3765b.f3767c);
                this.f3765b.f3767c.clear();
                this.f3765b.f3766b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            HashSet hashSet;
            synchronized (this.f3765b.a) {
                hashSet = new HashSet(this.f3765b.f3767c);
                this.f3765b.f3767c.clear();
                this.f3765b.f3766b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(i2, (AppLovinAdLoadListener) it.next());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3766b;

        /* renamed from: c  reason: collision with root package name */
        public final Collection<AppLovinAdLoadListener> f3767c;

        private b() {
            this.a = new Object();
            this.f3767c = new HashSet();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("AdLoadState{, isWaitingForAd=");
            y.append(this.f3766b);
            y.append(", pendingAdListeners=");
            y.append(this.f3767c);
            y.append('}');
            return y.toString();
        }
    }

    public AppLovinAdServiceImpl(m mVar) {
        this.a = mVar;
        this.f3755b = mVar.B();
        HashMap hashMap = new HashMap(5);
        this.f3757d = hashMap;
        hashMap.put(com.applovin.impl.sdk.ad.d.g(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.h(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.i(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.j(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.k(), new b());
    }

    private Uri a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            v B = this.a.B();
            B.d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            return null;
        }
    }

    private b a(com.applovin.impl.sdk.ad.d dVar) {
        b bVar;
        synchronized (this.f3758e) {
            bVar = this.f3757d.get(dVar);
            if (bVar == null) {
                bVar = new b();
                this.f3757d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    private String a(String str, long j2, int i2, String str2, boolean z) {
        try {
            if (StringUtils.isValidString(str)) {
                return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j2)).appendQueryParameter("pv", Integer.toString((i2 < 0 || i2 > 100) ? 0 : 0)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
            }
            return null;
        } catch (Throwable th) {
            v vVar = this.f3755b;
            vVar.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            return null;
        }
    }

    private String a(String str, long j2, long j3, List<Long> list, boolean z, int i2) {
        if (StringUtils.isValidString(str)) {
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j2)).appendQueryParameter("vs_ms", Long.toString(j3));
            if (list != null && list.size() > 0) {
                appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
            }
            if (i2 != h.a) {
                appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
                appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(h.a(i2)));
            }
            return appendQueryParameter.build().toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i2, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f3756c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i2);
                } catch (Throwable th) {
                    v.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.a)) {
            com.applovin.impl.sdk.utils.j.c(bVar.g(), eVar, appLovinAdView);
        }
        bVar.o();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, m mVar) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            mVar.B().e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
            return;
        }
        Uri a2 = a(uri, "primaryUrl");
        List<Uri> b2 = b(uri, "primaryTrackingUrl");
        Uri a3 = a(uri, "fallbackUrl");
        List<Uri> b3 = b(uri, "fallbackTrackingUrl");
        if (a2 == null && a3 == null) {
            mVar.B().e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
            return;
        }
        if (!a(a2, "primary", b2, eVar, appLovinAdView, bVar, context, mVar)) {
            a(a3, "backup", b3, eVar, appLovinAdView, bVar, context, mVar);
        }
        if (bVar != null) {
            bVar.o();
        }
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.network.i iVar, a aVar) {
        AppLovinAdImpl a2 = this.a.Z().a(dVar);
        if (a2 == null) {
            a(new com.applovin.impl.sdk.e.k(dVar, iVar, aVar, this.a));
            return;
        }
        v vVar = this.f3755b;
        vVar.b("AppLovinAdService", "Using pre-loaded ad: " + a2 + " for " + dVar);
        aVar.adReceived(a2);
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        v B = this.a.B();
        B.b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
        b a2 = a(dVar);
        synchronized (a2.a) {
            a2.f3767c.add(appLovinAdLoadListener);
            if (a2.f3766b) {
                this.f3755b.b("AppLovinAdService", "Already waiting on an ad load...");
            } else {
                a2.f3766b = true;
                a(dVar, iVar, new a(a2));
            }
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar) {
        if (!StringUtils.isValidString(aVar.a())) {
            this.f3755b.d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
            return;
        }
        this.a.U().a(com.applovin.impl.sdk.network.g.o().c(Utils.replaceCommonMacros(aVar.a())).d(StringUtils.isValidString(aVar.b()) ? Utils.replaceCommonMacros(aVar.b()) : null).b(aVar.c()).a(false).c(aVar.d()).a());
    }

    private void a(com.applovin.impl.sdk.e.a aVar) {
        if (!this.a.d()) {
            v.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.a.a();
        this.a.S().a(aVar, o.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f3756c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    v.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                }
            }
        });
    }

    private boolean a(Uri uri, String str, List<Uri> list, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, m mVar) {
        v B = mVar.B();
        B.b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        boolean openUri = Utils.openUri(context, uri, mVar);
        v B2 = mVar.B();
        if (openUri) {
            B2.b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            for (Uri uri2 : list) {
                mVar.X().dispatchPostbackAsync(uri2.toString(), null);
            }
            if (bVar != null) {
                com.applovin.impl.sdk.utils.j.c(bVar.g(), eVar, appLovinAdView);
            }
        } else {
            B2.e("AppLovinAdService", "URL failed to open");
        }
        return openUri;
    }

    private List<Uri> b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String str2 : queryParameters) {
            try {
                arrayList.add(Uri.parse(str2));
            } catch (Throwable unused) {
                v B = this.a.B();
                B.d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
        }
        return arrayList;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f3759f) {
            this.f3759f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl b2 = this.a.Z().b(dVar);
        v vVar = this.f3755b;
        vVar.b("AppLovinAdService", "Dequeued ad: " + b2 + " for zone: " + dVar + "...");
        return b2;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f3760g.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        HashMap hashMap;
        synchronized (this.f3759f) {
            hashMap = new HashMap(this.f3759f);
            this.f3759f.clear();
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a2 = this.a.V().a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a2;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR), (com.applovin.impl.sdk.network.i) null, appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        v vVar = this.f3755b;
        vVar.b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str), iVar, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        StringBuilder sb;
        String str2;
        com.applovin.impl.sdk.e.a pVar;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            v.i("AppLovinAdService", "Invalid ad token specified");
            a(-8, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(trim, this.a);
        if (cVar.b() != c.a.REGULAR) {
            if (cVar.b() == c.a.AD_RESPONSE_JSON) {
                JSONObject d2 = cVar.d();
                if (d2 != null) {
                    com.applovin.impl.sdk.utils.h.f(d2, this.a);
                    com.applovin.impl.sdk.utils.h.d(d2, this.a);
                    com.applovin.impl.sdk.utils.h.c(d2, this.a);
                    com.applovin.impl.sdk.utils.h.e(d2, this.a);
                    e.a(this.a);
                    if (JsonUtils.getJSONArray(d2, "ads", new JSONArray()).length() <= 0) {
                        v vVar = this.f3755b;
                        vVar.e("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                        appLovinAdLoadListener.failedToReceiveAd(204);
                        return;
                    }
                    v vVar2 = this.f3755b;
                    vVar2.b("AppLovinAdService", "Rendering ad for token: " + cVar);
                    pVar = new com.applovin.impl.sdk.e.p(d2, Utils.getZone(d2, this.a), com.applovin.impl.sdk.ad.b.DECODED_AD_TOKEN_JSON, appLovinAdLoadListener, this.a);
                } else {
                    sb = new StringBuilder();
                    str2 = "Unable to retrieve ad response JSON from token: ";
                }
            } else {
                sb = new StringBuilder();
                str2 = "Invalid ad token specified: ";
            }
            sb.append(str2);
            sb.append(cVar);
            v.i("AppLovinAdService", sb.toString());
            appLovinAdLoadListener.failedToReceiveAd(-8);
            return;
        }
        v vVar3 = this.f3755b;
        vVar3.b("AppLovinAdService", "Loading next ad for token: " + cVar);
        pVar = new com.applovin.impl.sdk.e.l(cVar, appLovinAdLoadListener, this.a);
        a(pVar);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        v vVar = this.f3755b;
        vVar.b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        a(com.applovin.impl.sdk.ad.d.a(str), (com.applovin.impl.sdk.network.i) null, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            v.i("AppLovinAdService", "No zones were provided");
            a(-7, appLovinAdLoadListener);
            return;
        }
        v vVar = this.f3755b;
        vVar.b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        a(new com.applovin.impl.sdk.e.j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        v vVar = this.f3755b;
        vVar.b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        a(com.applovin.impl.sdk.ad.d.b(str), (com.applovin.impl.sdk.network.i) null, appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.sdk.d.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : list) {
            a(aVar);
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f3760g.set(jSONObject);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinAdService{adLoadStates=");
        y.append(this.f3757d);
        y.append('}');
        return y.toString();
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Uri uri, PointF pointF, boolean z) {
        if (eVar == null) {
            this.f3755b.e("AppLovinAdService", "Unable to track ad view click. No ad specified");
            return;
        }
        this.f3755b.b("AppLovinAdService", "Tracking click on an ad...");
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z));
        if (appLovinAdView == null) {
            this.f3755b.e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.a);
        } else {
            a(uri, eVar, appLovinAdView, bVar);
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.e eVar, Uri uri, PointF pointF, Context context) {
        if (eVar == null) {
            this.f3755b.e("AppLovinAdService", "Unable to track video click. No ad specified");
            return;
        }
        this.f3755b.b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        maybeSubmitPersistentPostbacks(eVar.a(pointF));
        if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, (AppLovinAdView) null, (com.applovin.impl.adview.b) null, context, this.a);
        } else {
            Utils.openUri(context, uri, this.a);
        }
    }

    public void trackAppKilled(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            this.f3755b.e("AppLovinAdService", "Unable to track app killed. No ad specified");
            return;
        }
        this.f3755b.b("AppLovinAdService", "Tracking app killed during ad...");
        List<com.applovin.impl.sdk.d.a> ao = eVar.ao();
        if (ao != null && !ao.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : ao) {
                a(new com.applovin.impl.sdk.d.a(aVar.a(), aVar.b()));
            }
            return;
        }
        v vVar = this.f3755b;
        StringBuilder y = e.a.d.a.a.y("Unable to track app killed during AD #");
        y.append(eVar.getAdIdNumber());
        y.append(". Missing app killed tracking URL.");
        vVar.d("AppLovinAdService", y.toString());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.e eVar, long j2, List<Long> list, long j3, boolean z, int i2) {
        v vVar = this.f3755b;
        if (eVar == null) {
            vVar.e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
            return;
        }
        vVar.b("AppLovinAdService", "Tracking ad closed...");
        List<com.applovin.impl.sdk.d.a> an = eVar.an();
        if (an == null || an.isEmpty()) {
            v vVar2 = this.f3755b;
            StringBuilder y = e.a.d.a.a.y("Unable to track ad closed for AD #");
            y.append(eVar.getAdIdNumber());
            y.append(". Missing ad close tracking URL.");
            y.append(eVar.getAdIdNumber());
            vVar2.d("AppLovinAdService", y.toString());
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : an) {
            String a2 = a(aVar.a(), j2, j3, list, z, i2);
            String a3 = a(aVar.b(), j2, j3, list, z, i2);
            if (StringUtils.isValidString(a2)) {
                a(new com.applovin.impl.sdk.d.a(a2, a3));
            } else {
                v vVar3 = this.f3755b;
                StringBuilder y2 = e.a.d.a.a.y("Failed to parse url: ");
                y2.append(aVar.a());
                vVar3.e("AppLovinAdService", y2.toString());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            this.f3755b.e("AppLovinAdService", "Unable to track impression click. No ad specified");
            return;
        }
        this.f3755b.b("AppLovinAdService", "Tracking impression on ad...");
        maybeSubmitPersistentPostbacks(eVar.ap());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.e eVar, long j2, int i2, boolean z) {
        v vVar = this.f3755b;
        if (eVar == null) {
            vVar.e("AppLovinAdService", "Unable to track video end. No ad specified");
            return;
        }
        vVar.b("AppLovinAdService", "Tracking video end on ad...");
        List<com.applovin.impl.sdk.d.a> am = eVar.am();
        if (am == null || am.isEmpty()) {
            v vVar2 = this.f3755b;
            StringBuilder y = e.a.d.a.a.y("Unable to submit persistent postback for AD #");
            y.append(eVar.getAdIdNumber());
            y.append(". Missing video end tracking URL.");
            vVar2.d("AppLovinAdService", y.toString());
            return;
        }
        String l2 = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.sdk.d.a aVar : am) {
            if (StringUtils.isValidString(aVar.a())) {
                String a2 = a(aVar.a(), j2, i2, l2, z);
                String a3 = a(aVar.b(), j2, i2, l2, z);
                if (a2 != null) {
                    a(new com.applovin.impl.sdk.d.a(a2, a3));
                } else {
                    v vVar3 = this.f3755b;
                    StringBuilder y2 = e.a.d.a.a.y("Failed to parse url: ");
                    y2.append(aVar.a());
                    vVar3.e("AppLovinAdService", y2.toString());
                }
            } else {
                this.f3755b.d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
