package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.c;
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
public class h extends com.applovin.impl.sdk.e.a {
    private static final AtomicBoolean a = new AtomicBoolean();
    private final int c;
    private final Object d;
    private a e;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    private class b extends com.applovin.impl.sdk.e.a {
        public b(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (h.this.d) {
                if (h.this.e != null) {
                    d("Timing out fetch basic settings...");
                    h.this.a(new JSONObject());
                }
            }
        }
    }

    public h(int i, com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.d = new Object();
        this.c = i;
        this.e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        synchronized (this.d) {
            if (this.e != null) {
                this.e.a(jSONObject);
                this.e = null;
            }
        }
    }

    private String c() {
        return com.applovin.impl.sdk.utils.g.a((String) this.b.a(com.applovin.impl.sdk.c.b.aM), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.g.a((String) this.b.a(com.applovin.impl.sdk.c.b.aN), "5.0/i", d());
    }

    protected Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.b.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.b.x());
        }
        Boolean a2 = com.applovin.impl.sdk.h.b().a(f());
        if (a2 != null) {
            hashMap.put("huc", a2.toString());
        }
        Boolean a3 = com.applovin.impl.sdk.h.a().a(f());
        if (a3 != null) {
            hashMap.put("aru", a3.toString());
        }
        Boolean a4 = com.applovin.impl.sdk.h.c().a(f());
        if (a4 != null) {
            hashMap.put("dns", a4.toString());
        }
        return hashMap;
    }

    protected JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.b.e());
            jSONObject.put("init_count", this.c);
            jSONObject.put("server_installed_at", this.b.a(com.applovin.impl.sdk.c.b.ae));
            String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
            if (StringUtils.isValidString(userEngagementSdkVersion)) {
                jSONObject.put("ue_sdk_version", userEngagementSdkVersion);
            }
            if (this.b.N()) {
                jSONObject.put("first_install", true);
            }
            if (!this.b.O()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.b.a(com.applovin.impl.sdk.c.b.dz);
            if (StringUtils.isValidString(str)) {
                jSONObject.put("plugin_version", str);
            }
            String s = this.b.s();
            if (StringUtils.isValidString(s)) {
                jSONObject.put("mediation_provider", s);
            }
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.c.c.a(this.b));
            Map<String, Object> g = this.b.T().g();
            jSONObject.put("package_name", g.get("package_name"));
            jSONObject.put("app_version", g.get("app_version"));
            jSONObject.put("test_ads", g.get("test_ads"));
            jSONObject.put("debug", g.get("debug"));
            jSONObject.put("tg", g.get("tg"));
            jSONObject.put("target_sdk", g.get("target_sdk"));
            if (this.b.p().getInitializationAdUnitIds().size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(this.b.p().getInitializationAdUnitIds());
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            Map<String, Object> b2 = this.b.T().b();
            jSONObject.put("platform", b2.get("platform"));
            jSONObject.put("os", b2.get("os"));
            jSONObject.put("locale", b2.get("locale"));
            if (b2.containsKey("gms_mb")) {
                jSONObject.put("gms_mb", b2.get("gms_mb"));
            }
            m.a j = this.b.T().j();
            jSONObject.put("dnt", j.a);
            if (StringUtils.isValidString(j.b)) {
                jSONObject.put("idfa", j.b);
            }
            String name = this.b.q().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUrlString(name));
            }
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.du)).booleanValue()) {
                jSONObject.put("compass_random_token", this.b.n());
            }
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dw)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.b.o());
            }
        } catch (JSONException e) {
            a("Failed to construct JSON body", e);
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.b.J());
            } catch (Throwable th) {
                a("Cannot update security provider", th);
            }
        }
        Map<String, String> a2 = a();
        com.applovin.impl.sdk.network.c a3 = com.applovin.impl.sdk.network.c.a(this.b).a(c()).c(h()).a(a2).a(b()).d(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.et)).booleanValue()).b("POST").a((c.a) new JSONObject()).a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.db)).intValue()).c(((Integer) this.b.a(com.applovin.impl.sdk.c.b.de)).intValue()).b(((Integer) this.b.a(com.applovin.impl.sdk.c.b.da)).intValue()).e(true).a();
        this.b.Q().a(new b(this.b), o.a.TIMEOUT, ((Integer) this.b.a(com.applovin.impl.sdk.c.b.da)).intValue() + 250);
        t<JSONObject> tVar = new t<JSONObject>(a3, this.b, g()) { // from class: com.applovin.impl.sdk.e.h.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                d("Unable to fetch basic SDK settings: server returned " + i);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                h.this.a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                h.this.a(jSONObject);
            }
        };
        tVar.a(com.applovin.impl.sdk.c.b.aM);
        tVar.b(com.applovin.impl.sdk.c.b.aN);
        this.b.Q().a(tVar);
    }
}
