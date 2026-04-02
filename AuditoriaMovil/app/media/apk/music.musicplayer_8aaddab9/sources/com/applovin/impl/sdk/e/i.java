package com.applovin.impl.sdk.e;

import ch.qos.logback.classic.joran.action.ConfigurationAction;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.a {
    private static final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final int f4040c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4041d;

    /* renamed from: e  reason: collision with root package name */
    private a f4042e;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    public class b extends com.applovin.impl.sdk.e.a {
        public b(com.applovin.impl.sdk.m mVar) {
            super("TaskTimeoutFetchBasicSettings", mVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (i.this.f4041d) {
                if (i.this.f4042e != null) {
                    d("Timing out fetch basic settings...");
                    i.this.a(new JSONObject());
                }
            }
        }
    }

    public i(int i2, com.applovin.impl.sdk.m mVar, a aVar) {
        super("TaskFetchBasicSettings", mVar, true);
        this.f4041d = new Object();
        this.f4040c = i2;
        this.f4042e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        synchronized (this.f4041d) {
            a aVar = this.f4042e;
            if (aVar != null) {
                aVar.a(jSONObject);
                this.f4042e = null;
            }
        }
    }

    private String c() {
        return com.applovin.impl.sdk.utils.h.a((String) this.f4020b.a(com.applovin.impl.sdk.c.b.aV), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.h.a((String) this.f4020b.a(com.applovin.impl.sdk.c.b.aW), "5.0/i", d());
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4020b.z());
        }
        Boolean a2 = com.applovin.impl.sdk.j.b().a(f());
        if (a2 != null) {
            hashMap.put("huc", a2.toString());
        }
        Boolean a3 = com.applovin.impl.sdk.j.a().a(f());
        if (a3 != null) {
            hashMap.put("aru", a3.toString());
        }
        Boolean a4 = com.applovin.impl.sdk.j.c().a(f());
        if (a4 != null) {
            hashMap.put("dns", a4.toString());
        }
        return hashMap;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.f4020b.e());
            jSONObject.put("init_count", this.f4040c);
            jSONObject.put("server_installed_at", this.f4020b.a(com.applovin.impl.sdk.c.b.al));
            String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
            if (StringUtils.isValidString(userEngagementSdkVersion)) {
                jSONObject.put("ue_sdk_version", userEngagementSdkVersion);
            }
            if (this.f4020b.P()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f4020b.Q()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.f4020b.a(com.applovin.impl.sdk.c.b.dA);
            if (StringUtils.isValidString(str)) {
                jSONObject.put("plugin_version", str);
            }
            String t = this.f4020b.t();
            if (StringUtils.isValidString(t)) {
                jSONObject.put("mediation_provider", t);
            }
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.c.c.a(this.f4020b));
            Map<String, Object> h2 = this.f4020b.V().h();
            jSONObject.put("package_name", h2.get("package_name"));
            jSONObject.put("app_version", h2.get("app_version"));
            jSONObject.put("test_ads", h2.get("test_ads"));
            jSONObject.put(ConfigurationAction.INTERNAL_DEBUG_ATTR, h2.get(ConfigurationAction.INTERNAL_DEBUG_ATTR));
            jSONObject.put("tg", h2.get("tg"));
            jSONObject.put("target_sdk", h2.get("target_sdk"));
            if (this.f4020b.p().getInitializationAdUnitIds().size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(this.f4020b.p().getInitializationAdUnitIds());
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", h2.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_TCString", h2.get("IABTCF_gdprApplies"));
            Map<String, Object> b2 = this.f4020b.V().b();
            jSONObject.put("platform", b2.get("platform"));
            jSONObject.put("os", b2.get("os"));
            jSONObject.put("locale", b2.get("locale"));
            jSONObject.put("brand", b2.get("brand"));
            jSONObject.put("brand_name", b2.get("brand_name"));
            jSONObject.put("hardware", b2.get("hardware"));
            jSONObject.put("model", b2.get("model"));
            jSONObject.put("revision", b2.get("revision"));
            if (b2.containsKey("gms_mb")) {
                jSONObject.put("gms_mb", b2.get("gms_mb"));
            }
            if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue()) {
                jSONObject.put("mtl", this.f4020b.ac().b());
            }
            o.a l2 = this.f4020b.V().l();
            jSONObject.put("dnt", l2.a);
            if (StringUtils.isValidString(l2.f4259b)) {
                jSONObject.put("idfa", l2.f4259b);
            }
            o.b m2 = this.f4020b.V().m();
            if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.ds)).booleanValue() && m2 != null) {
                jSONObject.put("idfv", m2.a);
                jSONObject.put("idfv_scope", m2.f4260b);
            }
            String name = this.f4020b.q().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUrlString(name));
            }
            if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dv)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f4020b.n());
            }
            if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dx)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f4020b.o());
            }
            if (this.f4020b.J().a()) {
                jSONObject.put("test_mode", true);
            }
            String c2 = this.f4020b.J().c();
            if (StringUtils.isValidString(c2)) {
                jSONObject.put("test_mode_network", c2);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f4020b.p().getExtraParameters()));
        } catch (JSONException e2) {
            a("Failed to construct JSON body", e2);
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f4020b.L());
            } catch (Throwable th) {
                a("Cannot update security provider", th);
            }
        }
        Map<String, String> a2 = a();
        c.a c2 = com.applovin.impl.sdk.network.c.a(this.f4020b).a(c()).c(h()).a(a2).a(b()).d(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.ez)).booleanValue()).b("POST").a((c.a) new JSONObject()).a(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.db)).intValue()).c(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.de)).intValue());
        com.applovin.impl.sdk.m mVar = this.f4020b;
        com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.da;
        com.applovin.impl.sdk.network.c a3 = c2.b(((Integer) mVar.a(bVar)).intValue()).e(true).a();
        this.f4020b.S().a(new b(this.f4020b), o.a.TIMEOUT, ((Integer) this.f4020b.a(bVar)).intValue() + 250);
        u<JSONObject> uVar = new u<JSONObject>(a3, this.f4020b, g()) { // from class: com.applovin.impl.sdk.e.i.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject) {
                d("Unable to fetch basic SDK settings: server returned " + i2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                i.this.a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i2) {
                i.this.a(jSONObject);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aV);
        uVar.b(com.applovin.impl.sdk.c.b.aW);
        this.f4020b.S().a(uVar);
    }
}
