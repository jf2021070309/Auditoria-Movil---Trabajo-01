package com.applovin.impl.mediation.b;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
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

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f3416c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f3417d;

    /* renamed from: e  reason: collision with root package name */
    private final i f3418e;

    /* renamed from: f  reason: collision with root package name */
    private final JSONArray f3419f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f3420g;

    /* renamed from: h  reason: collision with root package name */
    private final a.InterfaceC0074a f3421h;

    public c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, i iVar, JSONArray jSONArray, Context context, m mVar, a.InterfaceC0074a interfaceC0074a) {
        super(e.a.d.a.a.k("TaskFetchMediatedAd ", str), mVar);
        this.a = str;
        this.f3416c = maxAdFormat;
        this.f3417d = map;
        this.f3418e = iVar;
        this.f3419f = jSONArray;
        this.f3420g = context;
        this.f3421h = interfaceC0074a;
    }

    private String a() {
        return com.applovin.impl.mediation.c.b.a(this.f4020b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str) {
        StringBuilder y = e.a.d.a.a.y("Unable to fetch ");
        y.append(this.a);
        y.append(" ad: server returned ");
        y.append(i2);
        d(y.toString());
        if (i2 == -800) {
            this.f4020b.T().a(com.applovin.impl.sdk.d.f.o);
        }
        j.a(this.f3421h, this.a, i2 == -1009 ? new MaxErrorImpl(-1009, str) : i2 == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(MaxErrorCode.NETWORK_ERROR, str) : new MaxErrorImpl(-1));
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f3996c;
        long b2 = gVar.b(fVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b2 > TimeUnit.MINUTES.toMillis(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.dm)).intValue())) {
            gVar.b(fVar, currentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.f3997d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            h.d(jSONObject, this.f4020b);
            h.c(jSONObject, this.f4020b);
            h.e(jSONObject, this.f4020b);
            h.f(jSONObject, this.f4020b);
            com.applovin.impl.mediation.c.b.a(jSONObject, this.f4020b);
            com.applovin.impl.mediation.c.b.b(jSONObject, this.f4020b);
            com.applovin.impl.sdk.e.a(this.f4020b);
            if (this.f3416c != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null))) {
                v.i(e(), "Ad format requested does not match ad unit id's format.");
            }
            this.f4020b.S().a(b(jSONObject));
        } catch (Throwable th) {
            a("Unable to process mediated ad response", th);
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private e b(JSONObject jSONObject) {
        return new e(this.a, this.f3416c, this.f3417d, jSONObject, this.f3420g, this.f4020b, this.f3421h);
    }

    private String b() {
        return com.applovin.impl.mediation.c.b.b(this.f4020b);
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.a);
        hashMap.put("AppLovin-Ad-Format", this.f3416c.getLabel());
        return hashMap;
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.f4020b.C().c()));
            jSONObject2.put("installed", com.applovin.impl.mediation.c.c.a(this.f4020b));
            jSONObject2.put("initialized", this.f4020b.D().d());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f4020b.D().c()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.f4020b.C().a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.f4020b.C().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e2) {
            a("Failed to populate adapter classNames", e2);
            throw new RuntimeException("Failed to populate classNames: " + e2);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f3419f;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.a);
        jSONObject2.put("ad_format", this.f3416c.getLabel());
        Map<String, String> stringMap = BundleUtils.toStringMap(this.f3418e.a());
        String a = this.f4020b.F().a(this.a);
        if (StringUtils.isValidString(a)) {
            stringMap.put("previous_winning_network", a);
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(stringMap));
        jSONObject2.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, String.valueOf(this.f4020b.af().a(this.a)));
        if (StringUtils.isValidString(this.f3418e.b())) {
            jSONObject2.put("custom_postback_data", this.f3418e.b());
        }
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f4020b.E().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !Utils.isDspDemoApp(this.f4020b.L())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f4020b.p().getExtraParameters()));
    }

    private JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f4020b.V().a(null, false, true));
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        f(jSONObject);
        g(jSONObject);
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder y = e.a.d.a.a.y("Fetching next ad for ad unit id: ");
        y.append(this.a);
        y.append(" and format: ");
        y.append(this.f3416c);
        a(y.toString());
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() && Utils.isVPNConnected()) {
            a("User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g T = this.f4020b.T();
        T.a(com.applovin.impl.sdk.d.f.f4007n);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f3996c;
        if (T.b(fVar) == 0) {
            T.b(fVar, System.currentTimeMillis());
        }
        try {
            JSONObject h2 = h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4020b.z());
            }
            if (this.f4020b.J().a()) {
                hashMap.put("test_mode", "1");
            }
            String c2 = this.f4020b.J().c();
            if (StringUtils.isValidString(c2)) {
                hashMap.put("filter_ad_network", c2);
                if (!this.f4020b.J().a()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f4020b.J().b()) {
                    hashMap.put("force_ad_network", c2);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(ac.b());
            hashMap2.putAll(c());
            a(T);
            u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f4020b).b("POST").b(hashMap2).a(a()).c(b()).a((Map<String, String>) hashMap).a(h2).d(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.a.aa)).booleanValue()).a((c.a) new JSONObject()).b(((Long) this.f4020b.a(com.applovin.impl.sdk.c.a.f3919f)).intValue()).a(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.cV)).intValue()).c(((Long) this.f4020b.a(com.applovin.impl.sdk.c.a.f3918e)).intValue()).e(true).a(), this.f4020b) { // from class: com.applovin.impl.mediation.b.c.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i2, String str, JSONObject jSONObject) {
                    c.this.a(i2, str);
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i2) {
                    if (i2 != 200) {
                        c.this.a(i2, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", ((u) this).f4089d.a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", ((u) this).f4089d.b());
                    c.this.a(jSONObject);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.a.f3916c);
            uVar.b(com.applovin.impl.sdk.c.a.f3917d);
            this.f4020b.S().a(uVar);
        } catch (Throwable th) {
            StringBuilder y2 = e.a.d.a.a.y("Unable to fetch ad ");
            y2.append(this.a);
            a(y2.toString(), th);
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
