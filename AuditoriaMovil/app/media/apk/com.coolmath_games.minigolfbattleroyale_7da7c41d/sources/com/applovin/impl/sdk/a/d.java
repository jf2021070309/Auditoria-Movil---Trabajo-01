package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
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
    private static final Object b = new Object();
    private JSONObject c;
    private final String d;
    private AppLovinAdSize e;
    private AppLovinAdType f;

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.e = appLovinAdSize;
        this.f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            str2 = str.trim();
        } else {
            str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
        }
        this.d = str2.toLowerCase(Locale.ENGLISH);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str);
        synchronized (b) {
            String str2 = dVar.d;
            if (a.containsKey(str2)) {
                dVar = a.get(str2);
            } else {
                a.put(str2, dVar);
            }
        }
        return dVar;
    }

    public static d a(String str) {
        return a(null, null, str);
    }

    public static d a(String str, JSONObject jSONObject) {
        d a2 = a(str);
        a2.c = jSONObject;
        return a2;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (b) {
                d dVar = a.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (dVar != null) {
                    dVar.e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public static d b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static Collection<d> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        Collections.addAll(linkedHashSet, g(), h(), i(), j(), k());
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

    public String a() {
        return this.d;
    }

    public MaxAdFormat b() {
        AppLovinAdSize c = c();
        if (c == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c == AppLovinAdSize.INTERSTITIAL) {
            if (d() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
        return null;
    }

    public AppLovinAdSize c() {
        if (this.e == null && JsonUtils.valueExists(this.c, "ad_size")) {
            this.e = AppLovinAdSize.fromString(JsonUtils.getString(this.c, "ad_size", null));
        }
        return this.e;
    }

    public AppLovinAdType d() {
        if (this.f == null && JsonUtils.valueExists(this.c, "ad_type")) {
            this.f = AppLovinAdType.fromString(JsonUtils.getString(this.c, "ad_type", null));
        }
        return this.f;
    }

    public boolean e() {
        return f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.d.equalsIgnoreCase(((d) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.d + ", zoneObject=" + this.c + '}';
    }
}
