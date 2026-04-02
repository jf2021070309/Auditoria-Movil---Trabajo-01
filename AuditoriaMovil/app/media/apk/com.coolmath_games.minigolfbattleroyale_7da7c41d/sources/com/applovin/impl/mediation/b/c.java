package com.applovin.impl.mediation.b;

import android.app.Activity;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.e.t;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {
    private final String a;
    private final MaxAdFormat c;
    private final i d;
    private final JSONArray e;
    private final Activity f;
    private final a.InterfaceC0014a g;

    public c(String str, MaxAdFormat maxAdFormat, i iVar, JSONArray jSONArray, Activity activity, k kVar, a.InterfaceC0014a interfaceC0014a) {
        super("TaskFetchMediatedAd " + str, kVar);
        this.a = str;
        this.c = maxAdFormat;
        this.d = iVar;
        this.e = jSONArray;
        this.f = activity;
        this.g = interfaceC0014a;
    }

    private String a() {
        return com.applovin.impl.mediation.c.b.a(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        d("Unable to fetch " + this.a + " ad: server returned " + i);
        if (i == -800) {
            this.b.R().a(com.applovin.impl.sdk.d.f.o);
        }
        com.applovin.impl.sdk.utils.i.a(this.g, this.a, i == -1009 ? new MaxErrorImpl(-1009, str) : i == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(-1000, str) : new MaxErrorImpl(-1));
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        long b = gVar.b(com.applovin.impl.sdk.d.f.c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis(((Integer) this.b.a(com.applovin.impl.sdk.c.b.dm)).intValue())) {
            gVar.b(com.applovin.impl.sdk.d.f.c, currentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            com.applovin.impl.sdk.utils.g.d(jSONObject, this.b);
            com.applovin.impl.sdk.utils.g.c(jSONObject, this.b);
            com.applovin.impl.sdk.utils.g.e(jSONObject, this.b);
            com.applovin.impl.sdk.utils.g.h(jSONObject, this.b);
            com.applovin.impl.mediation.c.b.a(jSONObject, this.b);
            com.applovin.impl.mediation.c.b.b(jSONObject, this.b);
            if (this.c != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, null))) {
                r.i(e(), "Ad format requested does not match ad unit id's format.");
            }
            this.b.Q().a(b(jSONObject));
        } catch (Throwable th) {
            a("Unable to process mediated ad response", th);
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private e b(JSONObject jSONObject) {
        return new e(this.a, this.c, jSONObject, this.f, this.b, this.g);
    }

    private String b() {
        return com.applovin.impl.mediation.c.b.b(this.b);
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.a);
        hashMap.put("AppLovin-Ad-Format", this.c.getLabel());
        return hashMap;
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.b.A().c()));
            jSONObject2.put("installed", com.applovin.impl.mediation.c.c.a(this.b));
            jSONObject2.put("initialized", this.b.B().d());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.b.B().c()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.b.A().a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.b.A().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            a("Failed to populate adapter classNames", e);
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.e;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.a);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.c.getLabel());
        Map<String, String> stringMap = BundleUtils.toStringMap(this.d.a());
        String a = this.b.D().a(this.a);
        if (StringUtils.isValidString(a)) {
            stringMap.put("previous_winning_network", a);
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(stringMap));
        jSONObject2.put("n", String.valueOf(this.b.ae().a(this.a)));
        jSONObject.put("ad_info", jSONObject2);
    }

    private JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.b.T().a(null, false, true));
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Fetching next ad for ad unit id: " + this.a + " and format: " + this.c);
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dF)).booleanValue() && Utils.isVPNConnected()) {
            a("User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g R = this.b.R();
        R.a(com.applovin.impl.sdk.d.f.n);
        if (R.b(com.applovin.impl.sdk.d.f.c) == 0) {
            R.b(com.applovin.impl.sdk.d.f.c, System.currentTimeMillis());
        }
        try {
            JSONObject h = h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.b.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.b.x());
            }
            if (this.b.H().a()) {
                hashMap.put("test_mode", "1");
            }
            String c = this.b.H().c();
            if (StringUtils.isValidString(c)) {
                hashMap.put("filter_ad_network", c);
                if (!this.b.H().a()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.b.H().b()) {
                    hashMap.put("force_ad_network", c);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(y.b());
            hashMap2.putAll(c());
            a(R);
            t<JSONObject> tVar = new t<JSONObject>(com.applovin.impl.sdk.network.c.a(this.b).b("POST").b(hashMap2).a(a()).c(b()).a((Map<String, String>) hashMap).a(h).d(((Boolean) this.b.a(com.applovin.impl.sdk.c.a.T)).booleanValue()).a((c.a) new JSONObject()).b(((Long) this.b.a(com.applovin.impl.sdk.c.a.f)).intValue()).a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cV)).intValue()).c(((Long) this.b.a(com.applovin.impl.sdk.c.a.e)).intValue()).e(true).a(), this.b) { // from class: com.applovin.impl.mediation.b.c.1
                @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
                public void a(int i, String str, JSONObject jSONObject) {
                    c.this.a(i, str);
                }

                @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i) {
                    if (i != 200) {
                        c.this.a(i, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.d.a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.d.b());
                    c.this.a(jSONObject);
                }
            };
            tVar.a(com.applovin.impl.sdk.c.a.c);
            tVar.b(com.applovin.impl.sdk.c.a.d);
            this.b.Q().a(tVar);
        } catch (Throwable th) {
            a("Unable to fetch ad " + this.a, th);
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
