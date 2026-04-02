package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class a extends e implements MaxAd {
    protected com.applovin.impl.mediation.g a;
    private final AtomicBoolean c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.c = new AtomicBoolean();
        this.a = gVar;
    }

    public static a a(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new b(jSONObject, jSONObject2, kVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d(jSONObject, jSONObject2, kVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c(jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    private long q() {
        return b("load_started_time_ms", 0L);
    }

    public abstract a a(com.applovin.impl.mediation.g gVar);

    public JSONObject a() {
        return a("ad_values", new JSONObject());
    }

    public void a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("creative_id")) {
            return;
        }
        c("creative_id", BundleUtils.getString("creative_id", bundle));
    }

    public JSONObject b() {
        return a("revenue_parameters", new JSONObject());
    }

    public String c() {
        return JsonUtils.getString(b(), "revenue_event", "");
    }

    public boolean d() {
        com.applovin.impl.mediation.g gVar = this.a;
        return gVar != null && gVar.d() && this.a.e();
    }

    public String e() {
        return a("event_id", "");
    }

    public com.applovin.impl.mediation.g f() {
        return this.a;
    }

    public Float g() {
        return a("r_mbr", (Float) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(a(), str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b(FirebaseAnalytics.Param.AD_FORMAT, a(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return b("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    public String h() {
        return b("bid_response", (String) null);
    }

    public long i() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, R()));
    }

    public String j() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public long k() {
        if (q() > 0) {
            return m() - q();
        }
        return -1L;
    }

    public void l() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long m() {
        return b("load_completed_time_ms", 0L);
    }

    public void n() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean o() {
        return this.c;
    }

    public void p() {
        this.a = null;
    }

    @Override // com.applovin.impl.mediation.a.e
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + j() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }
}
