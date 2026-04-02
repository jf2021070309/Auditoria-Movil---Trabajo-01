package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class a extends f implements MaxAd {
    public com.applovin.impl.mediation.g a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3327c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdWaterfallInfo f3328d;

    /* renamed from: e  reason: collision with root package name */
    private String f3329e;

    public a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
        this.f3327c = new AtomicBoolean();
        this.a = gVar;
    }

    public static a a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new b(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c(map, jSONObject, jSONObject2, mVar);
        }
        throw new IllegalArgumentException(e.a.d.a.a.k("Unsupported ad format: ", string));
    }

    private long v() {
        return b("load_started_time_ms", 0L);
    }

    public abstract a a(com.applovin.impl.mediation.g gVar);

    public String a() {
        return this.f3329e;
    }

    public void a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("creative_id") || b("creative_id")) {
            return;
        }
        c("creative_id", BundleUtils.getString("creative_id", bundle));
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f3328d = maxAdWaterfallInfo;
    }

    public void a(String str) {
        this.f3329e = str;
    }

    public JSONObject b() {
        return a("ad_values", new JSONObject());
    }

    public JSONObject c() {
        return a("revenue_parameters", new JSONObject());
    }

    public String d() {
        return JsonUtils.getString(c(), "revenue_event", "");
    }

    public boolean e() {
        com.applovin.impl.mediation.g gVar = this.a;
        return gVar != null && gVar.f() && this.a.g();
    }

    public String f() {
        return a("event_id", "");
    }

    public com.applovin.impl.mediation.g g() {
        return this.a;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject b2 = b();
        return b2.has(str) ? JsonUtils.getString(b2, str, str2) : X().getString(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b("ad_format", a("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return b("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(m());
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f3328d;
    }

    public Float h() {
        return a("r_mbr", (Float) null);
    }

    public Bundle i() {
        JSONObject a;
        if (b("credentials")) {
            a = a("credentials", new JSONObject());
        } else {
            a = a("server_parameters", new JSONObject());
            JsonUtils.putString(a, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, m());
        }
        return JsonUtils.toBundle(a);
    }

    public String j() {
        return b("bid_response", (String) null);
    }

    public long k() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, X()));
    }

    public boolean l() {
        return b("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public String m() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public String n() {
        return a("waterfall_name", "");
    }

    public String o() {
        return a("waterfall_test_name", "");
    }

    public long p() {
        if (v() > 0) {
            return r() - v();
        }
        return -1L;
    }

    public void q() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long r() {
        return b("load_completed_time_ms", 0L);
    }

    public void s() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean t() {
        return this.f3327c;
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediatedAd{thirdPartyAdPlacementId=");
        y.append(m());
        y.append(", adUnitId=");
        y.append(getAdUnitId());
        y.append(", format=");
        y.append(getFormat().getLabel());
        y.append(", networkName='");
        y.append(getNetworkName());
        y.append("'}");
        return y.toString();
    }

    public void u() {
        this.a = null;
        this.f3328d = null;
    }
}
