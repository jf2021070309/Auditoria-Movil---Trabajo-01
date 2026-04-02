package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.IronSource;
import com.vungle.warren.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static final TreeMap<String, String> a;
    private static final List<String> b;
    private static JSONArray c;

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        a.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        a.put("com.applovin.mediation.adapters.AmazonBiddingMediationAdapter", "Amazon");
        a.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        a.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        a.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        a.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        a.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        a.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        a.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        a.put("com.applovin.mediation.adapters.IMobileMediationAdapter", "i-mobile");
        a.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        a.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        a.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        a.put("com.applovin.mediation.adapters.LeadboltMediationAdapter", "Leadbolt");
        a.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        a.put("com.applovin.mediation.adapters.MadvertiseMediationAdapter", "madvertise");
        a.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        a.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        a.put("com.applovin.mediation.adapters.MoPubMediationAdapter", IronSource.DataSource_MOPUB);
        a.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        a.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        a.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        a.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        a.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        a.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        a.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        a.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        a.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        a.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        a.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        a.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        a.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        b = new ArrayList(a.keySet());
    }

    public static o.a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? o.a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? o.a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? o.a.MEDIATION_REWARDED_INTERSTITIAL : o.a.MEDIATION_BANNER;
    }

    public static MaxAdapter a(String str, k kVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            kVar.z().e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            r z = kVar.z();
            z.b("AppLovinSdk", "Failed to load: " + str, th);
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(kVar.W());
        }
        r z2 = kVar.z();
        z2.e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        return null;
    }

    public static AppLovinSdkUtils.Size a(int i, MaxAdFormat maxAdFormat, Activity activity) {
        if (i < 0) {
            try {
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(activity, displayMetrics.widthPixels);
            } catch (Throwable th) {
                r.c("MediationUtils", "Failed to get adaptive banner size. Will fallback to using format specific ad view ad size.", th);
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke(null, activity, Integer.valueOf(i));
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    public static JSONArray a(k kVar) {
        JSONArray jSONArray;
        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.a.M)).booleanValue() || (jSONArray = c) == null) {
            if (c != null) {
                b(kVar);
                return c;
            }
            c = new JSONArray();
            for (String str : b) {
                MaxAdapter a2 = a(str, kVar);
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", a.get(str));
                        jSONObject.put("class", str);
                        jSONObject.put("sdk_version", a2.getSdkVersion());
                        jSONObject.put("version", a2.getAdapterVersion());
                    } catch (Throwable unused) {
                    }
                    c.put(jSONObject);
                }
            }
            return c;
        }
        return jSONArray;
    }

    public static boolean a(Object obj) {
        return (obj instanceof g) && StringUtils.isValidString(((g) obj).M());
    }

    private static void b(k kVar) {
        MaxAdapter a2;
        for (int i = 0; i < c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (a2 = a(string, kVar)) != null) {
                JsonUtils.putString(jSONObject, "sdk_version", a2.getSdkVersion());
            }
        }
    }

    public static boolean b(Object obj) {
        return (obj instanceof com.applovin.impl.mediation.a.a) && "APPLOVIN".equals(((com.applovin.impl.mediation.a.a) obj).L());
    }
}
