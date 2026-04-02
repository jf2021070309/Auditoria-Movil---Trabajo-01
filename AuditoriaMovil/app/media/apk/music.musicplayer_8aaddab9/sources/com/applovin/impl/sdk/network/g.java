package com.applovin.impl.sdk.network;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f4225b;

    /* renamed from: c  reason: collision with root package name */
    private String f4226c;

    /* renamed from: d  reason: collision with root package name */
    private String f4227d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f4228e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f4229f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f4230g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4231h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4232i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4233j;

    /* renamed from: k  reason: collision with root package name */
    private String f4234k;

    /* renamed from: l  reason: collision with root package name */
    private int f4235l;

    /* loaded from: classes.dex */
    public static class a {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private String f4236b;

        /* renamed from: c  reason: collision with root package name */
        private String f4237c;

        /* renamed from: d  reason: collision with root package name */
        private String f4238d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f4239e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f4240f;

        /* renamed from: g  reason: collision with root package name */
        private Map<String, Object> f4241g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f4242h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f4243i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f4244j;

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f4239e = map;
            return this;
        }

        public a a(boolean z) {
            this.f4242h = z;
            return this;
        }

        public g a() {
            return new g(this);
        }

        public a b(String str) {
            this.f4236b = str;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f4240f = map;
            return this;
        }

        public a b(boolean z) {
            this.f4243i = z;
            return this;
        }

        public a c(String str) {
            this.f4237c = str;
            return this;
        }

        public a c(Map<String, Object> map) {
            this.f4241g = map;
            return this;
        }

        public a c(boolean z) {
            this.f4244j = z;
            return this;
        }

        public a d(String str) {
            this.f4238d = str;
            return this;
        }
    }

    private g(a aVar) {
        this.a = UUID.randomUUID().toString();
        this.f4225b = aVar.f4236b;
        this.f4226c = aVar.f4237c;
        this.f4227d = aVar.f4238d;
        this.f4228e = aVar.f4239e;
        this.f4229f = aVar.f4240f;
        this.f4230g = aVar.f4241g;
        this.f4231h = aVar.f4242h;
        this.f4232i = aVar.f4243i;
        this.f4233j = aVar.f4244j;
        this.f4234k = aVar.a;
        this.f4235l = 0;
    }

    public g(JSONObject jSONObject, m mVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i2 = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap<>(0);
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap<>(0);
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap<>(0);
        this.a = string;
        this.f4234k = string2;
        this.f4226c = string3;
        this.f4227d = string4;
        this.f4228e = synchronizedMap;
        this.f4229f = synchronizedMap2;
        this.f4230g = synchronizedMap3;
        this.f4231h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f4232i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f4233j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f4235l = i2;
    }

    public static a o() {
        return new a();
    }

    public String a() {
        return this.f4225b;
    }

    public String b() {
        return this.f4226c;
    }

    public String c() {
        return this.f4227d;
    }

    public Map<String, String> d() {
        return this.f4228e;
    }

    public Map<String, String> e() {
        return this.f4229f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((g) obj).a);
    }

    public Map<String, Object> f() {
        return this.f4230g;
    }

    public boolean g() {
        return this.f4231h;
    }

    public boolean h() {
        return this.f4232i;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        return this.f4233j;
    }

    public String j() {
        return this.f4234k;
    }

    public int k() {
        return this.f4235l;
    }

    public void l() {
        this.f4235l++;
    }

    public void m() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f4228e;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f4228e = hashMap;
    }

    public JSONObject n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.a);
        jSONObject.put("communicatorRequestId", this.f4234k);
        jSONObject.put("httpMethod", this.f4225b);
        jSONObject.put("targetUrl", this.f4226c);
        jSONObject.put("backupUrl", this.f4227d);
        jSONObject.put("isEncodingEnabled", this.f4231h);
        jSONObject.put("gzipBodyEncoding", this.f4232i);
        jSONObject.put("attemptNumber", this.f4235l);
        if (this.f4228e != null) {
            jSONObject.put("parameters", new JSONObject(this.f4228e));
        }
        if (this.f4229f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f4229f));
        }
        if (this.f4230g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f4230g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PostbackRequest{uniqueId='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", communicatorRequestId='");
        e.a.d.a.a.J(y, this.f4234k, CoreConstants.SINGLE_QUOTE_CHAR, ", httpMethod='");
        e.a.d.a.a.J(y, this.f4225b, CoreConstants.SINGLE_QUOTE_CHAR, ", targetUrl='");
        e.a.d.a.a.J(y, this.f4226c, CoreConstants.SINGLE_QUOTE_CHAR, ", backupUrl='");
        e.a.d.a.a.J(y, this.f4227d, CoreConstants.SINGLE_QUOTE_CHAR, ", attemptNumber=");
        y.append(this.f4235l);
        y.append(", isEncodingEnabled=");
        y.append(this.f4231h);
        y.append(", isGzipBodyEncoding=");
        y.append(this.f4232i);
        y.append('}');
        return y.toString();
    }
}
