package com.applovin.impl.mediation.a;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    private final JSONObject a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3334b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f3335c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f3336d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f3337e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f3338f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private String f3339g;

    /* renamed from: h  reason: collision with root package name */
    private String f3340h;

    public f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f3334b = mVar;
        this.a = jSONObject2;
        this.f3335c = jSONObject;
        this.f3336d = map;
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.f3334b.a(com.applovin.impl.sdk.c.a.O)).intValue()));
    }

    public JSONObject M() {
        JSONObject jSONObject;
        synchronized (this.f3338f) {
            jSONObject = this.a;
        }
        return jSONObject;
    }

    public JSONObject N() {
        JSONObject jSONObject;
        synchronized (this.f3337e) {
            jSONObject = this.f3335c;
        }
        return jSONObject;
    }

    public String O() {
        return b(Action.CLASS_ATTRIBUTE, (String) null);
    }

    public String P() {
        return b("name", (String) null);
    }

    public String Q() {
        return P().split("_")[0];
    }

    public boolean R() {
        return b("is_testing", Boolean.FALSE).booleanValue();
    }

    public Boolean S() {
        return b("huc") ? b("huc", Boolean.FALSE) : a("huc", (Boolean) null);
    }

    public Boolean T() {
        return b("aru") ? b("aru", Boolean.FALSE) : a("aru", (Boolean) null);
    }

    public Boolean U() {
        return b("dns") ? b("dns", Boolean.FALSE) : a("dns", (Boolean) null);
    }

    public boolean V() {
        return b("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public Map<String, Object> W() {
        return this.f3336d;
    }

    public Bundle X() {
        Bundle bundle = c("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(a("server_parameters", (JSONObject) null)) : new Bundle();
        int a = a();
        if (a != -1) {
            bundle.putBoolean("is_muted", a == 2 ? this.f3334b.p().isMuted() : a == 0);
        }
        return bundle;
    }

    public long Y() {
        return b("adapter_timeout_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.f3925l)).longValue());
    }

    public long Z() {
        return b("init_completion_delay_ms", -1L);
    }

    public float a(String str, float f2) {
        float f3;
        synchronized (this.f3337e) {
            f3 = JsonUtils.getFloat(this.f3335c, str, f2);
        }
        return f3;
    }

    public int a(String str, int i2) {
        int i3;
        synchronized (this.f3338f) {
            i3 = JsonUtils.getInt(this.a, str, i2);
        }
        return i3;
    }

    public long a(String str, long j2) {
        long j3;
        synchronized (this.f3338f) {
            j3 = JsonUtils.getLong(this.a, str, j2);
        }
        return j3;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f3338f) {
            bool2 = JsonUtils.getBoolean(this.a, str, bool);
        }
        return bool2;
    }

    public Float a(String str, Float f2) {
        Float f3;
        synchronized (this.f3337e) {
            f3 = JsonUtils.getFloat(this.f3335c, str, f2);
        }
        return f3;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f3338f) {
            string = JsonUtils.getString(this.a, str, str2);
        }
        return string;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f3338f) {
            jSONArray2 = JsonUtils.getJSONArray(this.a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f3337e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f3335c, str, jSONObject);
        }
        return jSONObject2;
    }

    public long aa() {
        return b("auto_init_delay_ms", 0L);
    }

    public String ab() {
        return this.f3340h;
    }

    public int b(String str, int i2) {
        int i3;
        synchronized (this.f3337e) {
            i3 = JsonUtils.getInt(this.f3335c, str, i2);
        }
        return i3;
    }

    public long b(String str, long j2) {
        long j3;
        synchronized (this.f3337e) {
            j3 = JsonUtils.getLong(this.f3335c, str, j2);
        }
        return j3;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f3337e) {
            bool2 = JsonUtils.getBoolean(this.f3335c, str, bool);
        }
        return bool2;
    }

    public String b(String str, String str2) {
        String string;
        synchronized (this.f3337e) {
            string = JsonUtils.getString(this.f3335c, str, str2);
        }
        return string;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f3337e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f3335c, str, jSONArray);
        }
        return jSONArray2;
    }

    public boolean b(String str) {
        boolean has;
        synchronized (this.f3337e) {
            has = this.f3335c.has(str);
        }
        return has;
    }

    public Object c(String str) {
        Object opt;
        synchronized (this.f3337e) {
            opt = this.f3335c.opt(str);
        }
        return opt;
    }

    public void c(String str, long j2) {
        synchronized (this.f3337e) {
            JsonUtils.putLong(this.f3335c, str, j2);
        }
    }

    public void c(String str, String str2) {
        synchronized (this.f3337e) {
            JsonUtils.putString(this.f3335c, str, str2);
        }
    }

    public void d(String str) {
        this.f3339g = str;
    }

    public void e(String str) {
        this.f3340h = str;
    }

    public List<String> f(String str) {
        if (str != null) {
            JSONArray a = a(str, new JSONArray());
            List list = Collections.EMPTY_LIST;
            List optList = JsonUtils.optList(a, list);
            List optList2 = JsonUtils.optList(b(str, new JSONArray()), list);
            ArrayList arrayList = new ArrayList(optList2.size() + optList.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String g(String str) {
        String b2 = b(str, "");
        return StringUtils.isValidString(b2) ? b2 : a(str, "");
    }

    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f3339g;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediationAdapterSpec{adapterClass='");
        y.append(O());
        y.append("', adapterName='");
        y.append(P());
        y.append("', isTesting=");
        y.append(R());
        y.append('}');
        return y.toString();
    }
}
