package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.C0119m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.controller.j;
import com.ironsource.sdk.e;
import com.ironsource.sdk.f;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.j.a.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b implements c, e, f, com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, d {
    private static b g;
    public g a;
    com.ironsource.sdk.j.e b;
    String c;
    String d;
    j e;
    private long h;
    private com.ironsource.sdk.service.e i;
    private com.ironsource.sdk.service.c j;
    private com.ironsource.sdk.controller.c l;
    private final String f = IronSourceConstants.SUPERSONIC_CONFIG_NAME;
    private boolean k = false;

    private b(Context context) {
        b(context);
    }

    private b(String str, String str2, Context context) {
        this.c = str;
        this.d = str2;
        b(context);
    }

    public static synchronized b a(Context context) {
        b a;
        synchronized (b.class) {
            a = a(context, 0);
        }
        return a;
    }

    public static synchronized b a(Context context, int i) {
        b bVar;
        synchronized (b.class) {
            Logger.i("IronSourceAdsPublisherAgent", "getInstance()");
            if (g == null) {
                g = new b(context);
            }
            bVar = g;
        }
        return bVar;
    }

    public static synchronized e a(String str, String str2, Context context) {
        b bVar;
        synchronized (b.class) {
            if (g == null) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.a);
                g = new b(str, str2, context);
            } else {
                com.ironsource.sdk.service.e.a().b(str);
                com.ironsource.sdk.service.e.a().a(str2);
            }
            bVar = g;
        }
        return bVar;
    }

    private static com.ironsource.sdk.j.f a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.f) cVar.g;
    }

    private void a(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new a(this));
            } catch (Throwable th) {
                com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
                aVar.a("generalmessage", th.getMessage());
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.r, aVar.a);
            }
        }
    }

    private static com.ironsource.sdk.j.c b(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.c) cVar.g;
    }

    private void b(Context context) {
        try {
            com.ironsource.sdk.utils.b.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.sdk.h.e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            com.ironsource.sdk.utils.b.a().a(com.ironsource.sdk.utils.a.a());
            this.i = c(context);
            this.e = new j();
            com.ironsource.sdk.controller.c cVar = new com.ironsource.sdk.controller.c();
            this.l = cVar;
            if (context instanceof Activity) {
                cVar.a((Activity) context);
            }
            this.a = new g(context, this.l, this.i, this.e);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.i("IronSourceAdsPublisherAgent", "C'tor");
            a(context, SDKUtils.getNetworkConfiguration());
            this.j = new com.ironsource.sdk.service.c();
            C0119m.a("sdkv", "5.108");
            this.j.a();
            this.j.a(context);
            this.j.b();
            this.j.c();
            this.j.b(context);
            this.h = 0L;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(com.ironsource.sdk.b bVar, Map<String, String> map) {
        if (bVar.h) {
            c(bVar, map);
        } else {
            d(bVar, map);
        }
    }

    private static com.ironsource.sdk.j.b c(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.b) cVar.g;
    }

    private com.ironsource.sdk.service.e c(Context context) {
        com.ironsource.sdk.service.e a = com.ironsource.sdk.service.e.a();
        a.b();
        a.a(context, this.c, this.d);
        return a;
    }

    private void c(final com.ironsource.sdk.b bVar, final Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.b);
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.g.c a = b.this.e.a(d.e.Interstitial, bVar.b);
                if (a != null) {
                    b.this.a.a(a, map, (com.ironsource.sdk.j.a.c) b.this);
                }
            }
        });
    }

    private com.ironsource.sdk.g.c d(d.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.a(eVar, str);
    }

    private void d(final com.ironsource.sdk.b bVar, final Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.b);
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.6
            @Override // java.lang.Runnable
            public final void run() {
                d.e eVar = bVar.a() ? d.e.Banner : d.e.Interstitial;
                j jVar = b.this.e;
                com.ironsource.sdk.b bVar2 = bVar;
                String str = bVar2.b;
                String str2 = bVar2.c;
                HashMap hashMap = new HashMap();
                hashMap.put("instanceId", bVar2.b);
                hashMap.put("instanceName", bVar2.c);
                hashMap.put("rewarded", Boolean.toString(bVar2.a));
                hashMap.put("inAppBidding", Boolean.toString(bVar2.d));
                hashMap.put("apiVersion", "2");
                com.ironsource.sdk.a aVar = bVar2.e;
                String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                hashMap.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, aVar != null ? Integer.toString(bVar2.e.a) : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                if (bVar2.e != null) {
                    str3 = Integer.toString(bVar2.e.b);
                }
                hashMap.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, str3);
                hashMap.put("label", bVar2.e != null ? bVar2.e.c : "");
                hashMap.put("isBanner", Boolean.toString(bVar2.a()));
                if (bVar2.f != null) {
                    hashMap.putAll(bVar2.f);
                }
                com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str2, hashMap, bVar2.g);
                jVar.a(eVar, str, cVar);
                com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
                com.ironsource.sdk.a.a a = aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.d)).a("demandsourcename", bVar.c).a("producttype", com.ironsource.sdk.d.a(bVar));
                com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.a;
                a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.b)));
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.g, aVar2.a);
                if (eVar == d.e.Banner) {
                    b.this.a.a(b.this.c, b.this.d, cVar, (com.ironsource.sdk.j.a.b) b.this);
                    bVar.h = true;
                    b.this.a.a(cVar, map, (com.ironsource.sdk.j.a.b) b.this);
                    return;
                }
                b.this.a.a(b.this.c, b.this.d, cVar, (com.ironsource.sdk.j.a.c) b.this);
                bVar.h = true;
                b.this.a.a(cVar, map, (com.ironsource.sdk.j.a.c) b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.e
    public final void a() {
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.d();
            }
        });
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity) {
        try {
            Logger.i("IronSourceAdsPublisherAgent", "release()");
            com.ironsource.sdk.utils.a.b();
            this.l.b();
            this.a.b(activity);
            this.a.destroy();
            this.a = null;
        } catch (Exception unused) {
        }
        g = null;
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.l.a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
        com.ironsource.sdk.service.a.a(bVar.b, currentTimeMillis);
        com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
        aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.d)).a("demandsourcename", bVar.c).a("producttype", com.ironsource.sdk.d.a(bVar)).a("custom_c", Long.valueOf(currentTimeMillis));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.e, aVar2.a);
        Logger.d("IronSourceAdsPublisherAgent", "loadAd " + bVar.b);
        if (!bVar.d) {
            b(bVar, map);
            return;
        }
        try {
            map.put("adm", SDKUtils.decodeString(map.get("adm")));
        } catch (Exception e) {
            com.ironsource.sdk.a.a a = new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a("generalmessage", bVar.h ? com.ironsource.sdk.f.b.a : com.ironsource.sdk.f.b.b).a("isbiddinginstance", Boolean.valueOf(bVar.d)).a("demandsourcename", bVar.c).a("producttype", com.ironsource.sdk.d.a(bVar));
            com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.a;
            com.ironsource.sdk.a.a a2 = a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.b)));
            com.ironsource.sdk.service.a aVar4 = com.ironsource.sdk.service.a.a;
            com.ironsource.sdk.service.a.b(bVar.b);
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.j, a2.a);
            e.printStackTrace();
            Logger.d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e.getMessage());
        }
        b(bVar, map);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(Activity activity, final Map<String, String> map) {
        if (activity != null) {
            this.l.a(activity);
        }
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.11
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(map, b.this.b);
            }
        });
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.b bVar, final Map<String, String> map) {
        Logger.i("IronSourceAdsPublisherAgent", "showAd " + bVar.b);
        final com.ironsource.sdk.g.c a = this.e.a(d.e.Interstitial, bVar.b);
        if (a == null) {
            return;
        }
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.7
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.b(a, map, b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str) {
        com.ironsource.sdk.j.c b;
        com.ironsource.sdk.g.c d = d(eVar, str);
        if (d != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a = a(d);
                if (a != null) {
                    a.onRVAdClosed();
                }
            } else if (eVar != d.e.Interstitial || (b = b(d)) == null) {
            } else {
                b.onInterstitialClose();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str, com.ironsource.sdk.g.a aVar) {
        com.ironsource.sdk.j.b c;
        com.ironsource.sdk.g.c d = d(eVar, str);
        if (d != null) {
            d.a(2);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a = a(d);
                if (a != null) {
                    a.onRVInitSuccess(aVar);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b = b(d);
                if (b != null) {
                    b.onInterstitialInitSuccess();
                }
            } else if (eVar != d.e.Banner || (c = c(d)) == null) {
            } else {
                c.onBannerInitSuccess();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str, String str2) {
        com.ironsource.sdk.j.b c;
        com.ironsource.sdk.g.c d = d(eVar, str);
        com.ironsource.sdk.a.a a = new com.ironsource.sdk.a.a().a("demandsourcename", str).a("producttype", eVar).a("callfailreason", str2);
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
        com.ironsource.sdk.a.a a2 = a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(d.b)));
        com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.a;
        com.ironsource.sdk.service.a.b(d.b);
        if (d != null) {
            a2.a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(d)));
            d.a(3);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a3 = a(d);
                if (a3 != null) {
                    a3.onRVInitFail(str2);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b = b(d);
                if (b != null) {
                    b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == d.e.Banner && (c = c(d)) != null) {
                c.onBannerInitFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.h, a2.a);
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.j.b c;
        com.ironsource.sdk.g.c d = d(eVar, str);
        if (d == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + d.a);
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b = b(d);
                if (b != null) {
                    jSONObject.put("demandSourceName", str);
                    b.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a = a(d);
                if (a != null) {
                    jSONObject.put("demandSourceName", str);
                    a.onRVEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar != d.e.Banner || (c = c(d)) == null) {
            } else {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    c.onBannerShowSuccess();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.e
    public final void a(final com.ironsource.sdk.j.e eVar) {
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.13
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(b.this.c, b.this.d, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, int i) {
        com.ironsource.sdk.j.f a;
        com.ironsource.sdk.g.c d = d(d.e.RewardedVideo, str);
        if (d == null || (a = a(d)) == null) {
            return;
        }
        a.onRVAdCredited(i);
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void a(String str, com.ironsource.sdk.c.a aVar) {
        com.ironsource.sdk.j.b c;
        com.ironsource.sdk.g.c d = d(d.e.Banner, str);
        if (d == null || (c = c(d)) == null) {
            return;
        }
        c.onBannerLoadSuccess(aVar);
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, String str2) {
        com.ironsource.sdk.j.f a;
        com.ironsource.sdk.g.c d = d(d.e.RewardedVideo, str);
        if (d == null || (a = a(d)) == null) {
            return;
        }
        a.onRVShowFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, int i) {
        d.e productType;
        com.ironsource.sdk.g.c a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a = this.e.a(productType, str2)) == null) {
            return;
        }
        a.c = i;
    }

    @Override // com.ironsource.sdk.f
    public final void a(final String str, final String str2, final com.ironsource.sdk.j.e eVar) {
        this.c = str;
        this.d = str2;
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.12
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(str, str2, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.f
    public final void a(final String str, final String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.c cVar) {
        this.c = str;
        this.d = str2;
        final com.ironsource.sdk.g.c a = this.e.a(d.e.Interstitial, str3, map, cVar);
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.14
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(str, str2, a, (com.ironsource.sdk.j.a.c) b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.f
    public final void a(final String str, final String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.f fVar) {
        this.c = str;
        this.d = str2;
        final com.ironsource.sdk.g.c a = this.e.a(d.e.RewardedVideo, str3, map, fVar);
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(str, str2, a, (com.ironsource.sdk.j.a.d) b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.f
    public final void a(final String str, final String str2, final Map<String, String> map, final com.ironsource.sdk.j.e eVar) {
        this.c = str;
        this.d = str2;
        this.b = eVar;
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.9
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(str, str2, map, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.e
    public final void a(final Map<String, String> map, final com.ironsource.sdk.j.e eVar) {
        this.b = eVar;
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.10
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(b.this.c, b.this.d, map, eVar);
            }
        });
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.i.a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(jSONObject);
            }
        });
    }

    @Override // com.ironsource.sdk.e
    public final boolean a(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.b);
        com.ironsource.sdk.g.c a = this.e.a(d.e.Interstitial, bVar.b);
        if (a == null) {
            return false;
        }
        return a.f;
    }

    @Override // com.ironsource.sdk.f
    public final boolean a(String str) {
        return this.a.c(str);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void b(Activity activity) {
        if (this.k) {
            return;
        }
        d(activity);
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void b(d.e eVar, String str) {
        com.ironsource.sdk.j.b c;
        com.ironsource.sdk.g.c d = d(eVar, str);
        if (d != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a = a(d);
                if (a != null) {
                    a.onRVAdClicked();
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b = b(d);
                if (b != null) {
                    b.onInterstitialClick();
                }
            } else if (eVar != d.e.Banner || (c = c(d)) == null) {
            } else {
                c.onBannerClick();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void b(String str) {
        com.ironsource.sdk.j.f a;
        com.ironsource.sdk.g.c d = d(d.e.RewardedVideo, str);
        if (d == null || (a = a(d)) == null) {
            return;
        }
        a.onRVNoMoreOffers();
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, int i) {
        com.ironsource.sdk.g.c d = d(d.e.Interstitial, str);
        com.ironsource.sdk.j.c b = b(d);
        if (d == null || b == null) {
            return;
        }
        b.onInterstitialAdRewarded(str, i);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, String str2) {
        com.ironsource.sdk.g.c d = d(d.e.Interstitial, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str2).a("demandsourcename", str);
        if (d != null) {
            com.ironsource.sdk.a.a a = aVar.a("producttype", com.ironsource.sdk.a.e.a(d, d.e.Interstitial)).a("generalmessage", d.e == 2 ? com.ironsource.sdk.f.b.a : com.ironsource.sdk.f.b.b).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(d)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.a;
            a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(d.b)));
            com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.a;
            com.ironsource.sdk.service.a.b(d.b);
            com.ironsource.sdk.j.c b = b(d);
            if (b != null) {
                b.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f, aVar.a);
    }

    @Override // com.ironsource.sdk.f
    public final void b(final JSONObject jSONObject) {
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.8
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(jSONObject, (com.ironsource.sdk.j.a.d) b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void c(Activity activity) {
        if (this.k) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void c(d.e eVar, String str) {
        com.ironsource.sdk.j.f a;
        com.ironsource.sdk.g.c d = d(eVar, str);
        if (d != null) {
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b = b(d);
                if (b != null) {
                    b.onInterstitialOpen();
                }
            } else if (eVar != d.e.RewardedVideo || (a = a(d)) == null) {
            } else {
                a.onRVAdOpened();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str) {
        com.ironsource.sdk.g.c d = d(d.e.Interstitial, str);
        com.ironsource.sdk.a.a a = new com.ironsource.sdk.a.a().a("demandsourcename", str);
        if (d != null) {
            com.ironsource.sdk.a.a a2 = a.a("producttype", com.ironsource.sdk.a.e.a(d, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(d)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
            a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(d.b)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.a;
            com.ironsource.sdk.service.a.b(d.b);
            com.ironsource.sdk.j.c b = b(d);
            if (b != null) {
                b.onInterstitialLoadSuccess();
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.k, a.a);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str, String str2) {
        com.ironsource.sdk.j.c b;
        com.ironsource.sdk.g.c d = d(d.e.Interstitial, str);
        if (d == null || (b = b(d)) == null) {
            return;
        }
        b.onInterstitialShowFailed(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void c(JSONObject jSONObject) {
        final String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.15
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(optString, b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.d.c
    public final void d(Activity activity) {
        try {
            this.a.f();
            this.a.b(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void d(String str) {
        com.ironsource.sdk.j.c b;
        com.ironsource.sdk.g.c d = d(d.e.Interstitial, str);
        if (d == null || (b = b(d)) == null) {
            return;
        }
        b.onInterstitialShowSuccess();
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void d(String str, String str2) {
        com.ironsource.sdk.j.b c;
        com.ironsource.sdk.g.c d = d(d.e.Banner, str);
        if (d == null || (c = c(d)) == null) {
            return;
        }
        c.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void d(final JSONObject jSONObject) {
        this.a.a(new Runnable() { // from class: com.ironsource.sdk.d.b.2
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.a(jSONObject, (com.ironsource.sdk.j.a.c) b.this);
            }
        });
    }

    @Override // com.ironsource.sdk.d.c
    public final void e(Activity activity) {
        this.l.a(activity);
        this.a.e();
        this.a.a(activity);
    }
}
