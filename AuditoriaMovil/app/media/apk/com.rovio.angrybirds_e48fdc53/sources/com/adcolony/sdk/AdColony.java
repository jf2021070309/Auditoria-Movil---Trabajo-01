package com.adcolony.sdk;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.adcolony.sdk.q;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColony {
    static ExecutorService a = Executors.newSingleThreadExecutor();

    public static boolean disable() {
        if (!a.e()) {
            return false;
        }
        if (a.d() && (a.c() instanceof t)) {
            a.c().finish();
        }
        final af a2 = a.a();
        for (final AdColonyInterstitial adColonyInterstitial : a2.j().c().values()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.AdColony.1
                @Override // java.lang.Runnable
                public void run() {
                    AdColonyInterstitial.this.a(true);
                    AdColonyInterstitial.this.getListener().onExpiring(AdColonyInterstitial.this);
                }
            });
        }
        q.a(new Runnable() { // from class: com.adcolony.sdk.AdColony.6
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                Iterator<g> it = af.this.n().c().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    af.this.a(gVar.a());
                    if (gVar instanceof s) {
                        s sVar = (s) gVar;
                        if (!sVar.g()) {
                            sVar.loadUrl("about:blank");
                            sVar.clearCache(true);
                            sVar.removeAllViews();
                            sVar.a(true);
                        }
                    }
                }
            }
        });
        a.a().a(true);
        return true;
    }

    public static boolean configure(Activity activity, String str, String... strArr) {
        return configure(activity, null, str, strArr);
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        long currentTimeMillis;
        if (i.a(0, null)) {
            au.e.b("Cannot configure AdColony; configuration mechanism requires 5 seconds between attempts.");
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (a.b() && !as.d(a.a().b().d(), "reconfigurable")) {
            af a2 = a.a();
            if (!a2.b().a().equals(str)) {
                au.e.b("Ignoring call to AdColony.configure, as the app id does not match what was used during the initial configuration.");
                return false;
            } else if (q.a(strArr, a2.b().b())) {
                au.e.b("Ignoring call to AdColony.configure, as the same zone ids were used during the previous configuration.");
                return false;
            }
        }
        adColonyAppOptions.a(str);
        adColonyAppOptions.a(strArr);
        adColonyAppOptions.e();
        String format = new SimpleDateFormat("HH:mm:ss:SSS").format(new Date(System.currentTimeMillis()));
        boolean z = true;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && !strArr[i].equals("")) {
                z = false;
            }
        }
        if (str.equals("") || z) {
            au.g.b("AdColony.configure() called with an empty app or zone id String.");
            return false;
        }
        a.a = true;
        if (Build.VERSION.SDK_INT < 14) {
            au.e.b("The minimum API level for the AdColony SDK is 14.");
            a.a(activity, adColonyAppOptions, true);
        } else {
            a.a(activity, adColonyAppOptions, false);
        }
        String str2 = a.a().l().c() + "/adc3/AppInfo";
        JSONObject a3 = as.a();
        if (new File(str2).exists()) {
            a3 = as.c(str2);
        }
        JSONObject a4 = as.a();
        if (as.b(a3, "appId").equals(str)) {
            as.a(a4, "zoneIds", as.a(as.g(a3, "zoneIds"), strArr, true));
            as.a(a4, "appId", str);
        } else {
            as.a(a4, "zoneIds", as.a(strArr));
            as.a(a4, "appId", str);
        }
        as.h(a4, str2);
        au.f.b("Configure: Total Time (ms): " + (System.currentTimeMillis() - currentTimeMillis) + " and started at " + format);
        return true;
    }

    public static AdColonyZone getZone(String str) {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.getZone() as AdColony has not yet been configured.");
            return null;
        }
        HashMap<String, AdColonyZone> c = a.a().c();
        if (c.containsKey(str)) {
            return c.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        a.a().c().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, null, -1.0d);
    }

    public static boolean notifyIAPComplete(final String str, final String str2, final String str3, final double d) {
        if (!a.e()) {
            au.e.b("Ignoring call to notifyIAPComplete as AdColony has not yet been configured.");
            return false;
        } else if (!q.d(str) || !q.d(str2)) {
            au.e.b("Ignoring call to notifyIAPComplete as one of the passed Strings is greater than 128 characters.");
            return false;
        } else {
            if (str3 != null && str3.length() > 3) {
                au.e.b("You are trying to report an IAP event with a currency String containing more than 3 characters.");
            }
            a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.7
                @Override // java.lang.Runnable
                public void run() {
                    AdColony.a();
                    JSONObject a2 = as.a();
                    if (d >= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                        as.a(a2, InAppPurchaseMetaData.KEY_PRICE, d);
                    }
                    if (str3 != null && str3.length() <= 3) {
                        as.a(a2, "currency_code", str3);
                    }
                    as.a(a2, "product_id", str);
                    as.a(a2, "transaction_id", str2);
                    new d("AdColony.on_iap_report", 1, a2).a();
                }
            });
            return true;
        }
    }

    public static boolean requestNativeAdView(String str, AdColonyNativeAdViewListener adColonyNativeAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestNativeAdView(str, adColonyNativeAdViewListener, adColonyAdSize, null);
    }

    public static boolean requestNativeAdView(final String str, final AdColonyNativeAdViewListener adColonyNativeAdViewListener, final AdColonyAdSize adColonyAdSize, final AdColonyAdOptions adColonyAdOptions) {
        if (!a.e()) {
            au.e.b("Ignoring call to requestNativeAdView as AdColony has not yet been configured.");
            a(adColonyNativeAdViewListener, str);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (i.a(1, bundle)) {
            a(adColonyNativeAdViewListener, str);
            return false;
        }
        try {
            a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.8
                @Override // java.lang.Runnable
                public void run() {
                    af a2 = a.a();
                    if (a2.d() || a2.e()) {
                        AdColony.b();
                        AdColony.a(AdColonyNativeAdViewListener.this, str);
                    }
                    if (!AdColony.a() && a.d()) {
                        AdColony.a(AdColonyNativeAdViewListener.this, str);
                    }
                    if (a2.c().get(str) == null) {
                        new AdColonyZone(str);
                        au.b.b("Zone info for " + str + " doesn't exist in hashmap");
                    }
                    a2.j().a(str, AdColonyNativeAdViewListener.this, adColonyAdSize, adColonyAdOptions);
                }
            });
            return true;
        } catch (RejectedExecutionException e) {
            a(adColonyNativeAdViewListener, str);
            return false;
        }
    }

    public static boolean setAppOptions(final AdColonyAppOptions adColonyAppOptions) {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.setAppOptions() as AdColony has not yet been configured.");
            return false;
        }
        a.a().b(adColonyAppOptions);
        adColonyAppOptions.e();
        try {
            a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.9
                @Override // java.lang.Runnable
                public void run() {
                    AdColony.a();
                    JSONObject a2 = as.a();
                    as.a(a2, "options", AdColonyAppOptions.this.d());
                    new d("Options.set_options", 1, a2).a();
                }
            });
            return true;
        } catch (RejectedExecutionException e) {
            return false;
        }
    }

    public static AdColonyAppOptions getAppOptions() {
        if (a.e()) {
            return a.a().b();
        }
        return null;
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.setRewardListener() as AdColony has not yet been configured.");
            return false;
        }
        a.a().a(adColonyRewardListener);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.removeRewardListener() as AdColony has not yet been configured.");
            return false;
        }
        a.a().a((AdColonyRewardListener) null);
        return true;
    }

    public static String getSDKVersion() {
        return !a.e() ? "" : a.a().k().y();
    }

    public static AdColonyRewardListener getRewardListener() {
        if (a.e()) {
            return a.a().f();
        }
        return null;
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, final String str) {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.addCustomMessageListener as AdColony has not yet been configured.");
            return false;
        } else if (!q.d(str)) {
            au.e.b("Ignoring call to AdColony.addCustomMessageListener.");
            return false;
        } else {
            try {
                a.a().w().put(str, adColonyCustomMessageListener);
                a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.10
                    @Override // java.lang.Runnable
                    public void run() {
                        AdColony.a();
                        JSONObject a2 = as.a();
                        as.a(a2, "type", str);
                        new d("CustomMessage.register", 1, a2).a();
                    }
                });
                return true;
            } catch (RejectedExecutionException e) {
                return false;
            }
        }
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (a.e()) {
            return a.a().w().get(str);
        }
        return null;
    }

    public static boolean removeCustomMessageListener(final String str) {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.removeCustomMessageListener as AdColony has not yet been configured.");
            return false;
        }
        a.a().w().remove(str);
        a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.11
            @Override // java.lang.Runnable
            public void run() {
                AdColony.a();
                JSONObject a2 = as.a();
                as.a(a2, "type", str);
                new d("CustomMessage.unregister", 1, a2).a();
            }
        });
        return true;
    }

    public static boolean clearCustomMessageListeners() {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.clearCustomMessageListeners as AdColony has not yet been configured.");
            return false;
        }
        a.a().w().clear();
        a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.2
            @Override // java.lang.Runnable
            public void run() {
                AdColony.a();
                for (String str : a.a().w().keySet()) {
                    JSONObject a2 = as.a();
                    as.a(a2, "type", str);
                    new d("CustomMessage.unregister", 1, a2).a();
                }
            }
        });
        return true;
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, null);
    }

    public static boolean requestInterstitial(final String str, final AdColonyInterstitialListener adColonyInterstitialListener, final AdColonyAdOptions adColonyAdOptions) {
        if (!a.e()) {
            au.e.b("Ignoring call to AdColony.requestInterstitial as AdColony has not yet been configured.");
            adColonyInterstitialListener.onRequestNotFilled(new AdColonyZone(str));
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (i.a(1, bundle)) {
            AdColonyZone adColonyZone = a.a().c().get(str);
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(str);
                au.b.b("Zone info for " + str + " doesn't exist in hashmap");
            }
            adColonyInterstitialListener.onRequestNotFilled(adColonyZone);
            return false;
        }
        try {
            a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColony.3
                @Override // java.lang.Runnable
                public void run() {
                    af a2 = a.a();
                    if (a2.d() || a2.e()) {
                        AdColony.b();
                        AdColony.a(AdColonyInterstitialListener.this, str);
                    } else if (!AdColony.a() && a.d()) {
                        AdColony.a(AdColonyInterstitialListener.this, str);
                    } else {
                        final AdColonyZone adColonyZone2 = a2.c().get(str);
                        if (adColonyZone2 == null) {
                            adColonyZone2 = new AdColonyZone(str);
                            au.b.b("Zone info for " + str + " doesn't exist in hashmap");
                        }
                        if (adColonyZone2.getZoneType() != 2) {
                            a2.j().a(str, AdColonyInterstitialListener.this, adColonyAdOptions);
                        } else if (a.d()) {
                            a.c().runOnUiThread(new Runnable() { // from class: com.adcolony.sdk.AdColony.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AdColonyInterstitialListener.this.onRequestNotFilled(adColonyZone2);
                                }
                            });
                        }
                    }
                }
            });
            return true;
        } catch (RejectedExecutionException e) {
            a(adColonyInterstitialListener, str);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        q.a aVar = new q.a(15.0d);
        af a2 = a.a();
        while (!a2.x() && !aVar.a()) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
            }
        }
        return a2.x();
    }

    static boolean a(final AdColonyInterstitialListener adColonyInterstitialListener, final String str) {
        if (adColonyInterstitialListener != null && a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.AdColony.4
                @Override // java.lang.Runnable
                public void run() {
                    AdColonyZone adColonyZone = a.a().c().get(str);
                    if (adColonyZone == null) {
                        adColonyZone = new AdColonyZone(str);
                    }
                    adColonyInterstitialListener.onRequestNotFilled(adColonyZone);
                }
            });
            return false;
        }
        return false;
    }

    static boolean a(final AdColonyNativeAdViewListener adColonyNativeAdViewListener, final String str) {
        if (adColonyNativeAdViewListener != null && a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.AdColony.5
                @Override // java.lang.Runnable
                public void run() {
                    AdColonyZone adColonyZone = !a.b() ? null : a.a().c().get(str);
                    if (adColonyZone == null) {
                        adColonyZone = new AdColonyZone(str);
                    }
                    adColonyNativeAdViewListener.onRequestNotFilled(adColonyZone);
                }
            });
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, AdColonyAppOptions adColonyAppOptions) {
        if (adColonyAppOptions != null && activity != null) {
            String a2 = q.a(activity);
            String b = q.b();
            int c = q.c();
            String g = a.a().a.g();
            String str = "none";
            if (a.a().m().a()) {
                str = "wifi";
            } else if (a.a().m().b()) {
                str = "mobile";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", "unknown");
            hashMap.put("advertiserId", "unknown");
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocalShort", a.a().a.q());
            hashMap.put("manufacturer", a.a().a.s());
            hashMap.put("model", a.a().a.t());
            hashMap.put("osVersion", a.a().a.u());
            hashMap.put("carrierName", g);
            hashMap.put("networkType", str);
            hashMap.put("platform", "android");
            hashMap.put("appName", a2);
            hashMap.put("appVersion", b);
            hashMap.put("appBuildNumber", Integer.valueOf(c));
            hashMap.put("appId", "" + adColonyAppOptions.a());
            hashMap.put("apiLevel", Integer.valueOf(a.a().a.n()));
            hashMap.put("sdkVersion", a.a().a.y());
            hashMap.put("controllerVersion", "unknown");
            hashMap.put("zoneIds", adColonyAppOptions.c());
            JSONObject mediationInfo = adColonyAppOptions.getMediationInfo();
            JSONObject pluginInfo = adColonyAppOptions.getPluginInfo();
            if (!as.b(mediationInfo, "mediation_network").equals("")) {
                hashMap.put("mediationNetwork", as.b(mediationInfo, "mediation_network"));
                hashMap.put("mediationNetworkVersion", as.b(mediationInfo, "mediation_network_version"));
            }
            if (!as.b(pluginInfo, "plugin").equals("")) {
                hashMap.put("plugin", as.b(pluginInfo, "plugin"));
                hashMap.put("pluginVersion", as.b(pluginInfo, PluginConstants.KEY_PLUGIN_VERSION));
            }
            b.a(hashMap);
        }
    }

    static void b() {
        au.g.b("The AdColony API is not available while AdColony is disabled.");
    }
}
