package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static final TreeMap<String, String> a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f3447b;

    /* renamed from: c  reason: collision with root package name */
    private static JSONArray f3448c;

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.IMobileMediationAdapter", "i-mobile");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LeadboltMediationAdapter", "Leadbolt");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MadvertiseMediationAdapter", "madvertise");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MoPubMediationAdapter", "MoPub");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        f3447b = new ArrayList(treeMap.keySet());
    }

    public static o.a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? o.a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? o.a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? o.a.MEDIATION_REWARDED_INTERSTITIAL : o.a.MEDIATION_BANNER;
    }

    public static AppLovinSdkUtils.Size a(int i2, MaxAdFormat maxAdFormat, Context context) {
        if (i2 < 0) {
            try {
                Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i2 = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable th) {
                v.c("MediationUtils", "Failed to get adaptive banner size. Will fallback to using format specific ad view ad size.", th);
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke(null, context, Integer.valueOf(i2));
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    public static JSONArray a(m mVar) {
        JSONArray jSONArray;
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.a.P)).booleanValue() || (jSONArray = f3448c) == null) {
            if (f3448c != null) {
                b(mVar);
                return f3448c;
            }
            f3448c = new JSONArray();
            for (String str : f3447b) {
                MaxAdapter b2 = b(str, mVar);
                if (b2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", a.get(str));
                        jSONObject.put(Action.CLASS_ATTRIBUTE, str);
                        jSONObject.put("sdk_version", b2.getSdkVersion());
                        jSONObject.put("version", b2.getAdapterVersion());
                    } catch (Throwable unused) {
                    }
                    f3448c.put(jSONObject);
                }
            }
            return f3448c;
        }
        return jSONArray;
    }

    public static JSONObject a(String str, m mVar) {
        JSONArray a2 = a(mVar);
        for (int i2 = 0; i2 < a2.length(); i2++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a2, i2, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, Action.CLASS_ATTRIBUTE, null))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static boolean a(Object obj) {
        return (obj instanceof e) && StringUtils.isValidString(((e) obj).I());
    }

    public static MaxAdapter b(String str, m mVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            mVar.B().e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            v B = mVar.B();
            B.b("AppLovinSdk", "Failed to load: " + str, th);
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(mVar.Y());
        }
        v B2 = mVar.B();
        B2.e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        return null;
    }

    private static void b(m mVar) {
        MaxAdapter b2;
        for (int i2 = 0; i2 < f3448c.length(); i2++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f3448c, i2, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, Action.CLASS_ATTRIBUTE, "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (b2 = b(string, mVar)) != null) {
                JsonUtils.putString(jSONObject, "sdk_version", b2.getSdkVersion());
            }
        }
    }

    public static boolean b(Object obj) {
        return (obj instanceof com.applovin.impl.mediation.a.a) && "APPLOVIN".equals(((com.applovin.impl.mediation.a.a) obj).Q());
    }
}
