package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    private static final Map<String, d> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3856b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f3857c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3858d;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinAdSize f3859e;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinAdType f3860f;

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f3859e = appLovinAdSize;
        this.f3860f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            str2 = str.trim();
        } else {
            str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
        }
        this.f3858d = str2.toLowerCase(Locale.ENGLISH);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str);
        synchronized (f3856b) {
            String str2 = dVar.f3858d;
            Map<String, d> map = a;
            if (map.containsKey(str2)) {
                dVar = map.get(str2);
            } else {
                map.put(str2, dVar);
            }
        }
        return dVar;
    }

    public static d a(String str) {
        return a(null, null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f3856b) {
                d dVar = a.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (dVar != null) {
                    dVar.f3859e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f3860f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public static d b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static Collection<d> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(6);
        Collections.addAll(linkedHashSet, g(), h(), i(), j(), k(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static d g() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static d h() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static d i() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static d j() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public static d k() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static d l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public String a() {
        return this.f3858d;
    }

    public MaxAdFormat b() {
        AppLovinAdSize c2 = c();
        if (c2 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c2 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c2 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c2 == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c2 != AppLovinAdSize.INTERSTITIAL) {
            if (c2 == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        } else if (d() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        } else {
            if (d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
    }

    public AppLovinAdSize c() {
        if (this.f3859e == null && JsonUtils.valueExists(this.f3857c, "ad_size")) {
            this.f3859e = AppLovinAdSize.fromString(JsonUtils.getString(this.f3857c, "ad_size", null));
        }
        return this.f3859e;
    }

    public AppLovinAdType d() {
        if (this.f3860f == null && JsonUtils.valueExists(this.f3857c, "ad_type")) {
            this.f3860f = AppLovinAdType.fromString(JsonUtils.getString(this.f3857c, "ad_type", null));
        }
        return this.f3860f;
    }

    public boolean e() {
        return f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f3858d.equalsIgnoreCase(((d) obj).f3858d);
    }

    public int hashCode() {
        return this.f3858d.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AdZone{id=");
        y.append(this.f3858d);
        y.append(", zoneObject=");
        y.append(this.f3857c);
        y.append('}');
        return y.toString();
    }
}
