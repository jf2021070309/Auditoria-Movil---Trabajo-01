package com.applovin.impl.mediation.a;

import android.os.Bundle;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private final JSONObject a;
    protected final k b;
    private final JSONObject c;
    private final Object d = new Object();
    private final Object e = new Object();
    private volatile String f;

    public e(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.b = kVar;
        this.a = jSONObject2;
        this.c = jSONObject;
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.b.a(com.applovin.impl.sdk.c.a.L)).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject H() {
        JSONObject jSONObject;
        synchronized (this.e) {
            jSONObject = this.a;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject I() {
        JSONObject jSONObject;
        synchronized (this.d) {
            jSONObject = this.c;
        }
        return jSONObject;
    }

    public String J() {
        return b("class", (String) null);
    }

    public String K() {
        return b("name", (String) null);
    }

    public String L() {
        return K().split("_")[0];
    }

    public boolean M() {
        return b("is_testing", (Boolean) false).booleanValue();
    }

    public Boolean N() {
        return a("huc") ? b("huc", (Boolean) false) : a("huc", (Boolean) null);
    }

    public Boolean O() {
        return a("aru") ? b("aru", (Boolean) false) : a("aru", (Boolean) null);
    }

    public Boolean P() {
        return a("dns") ? b("dns", (Boolean) false) : a("dns", (Boolean) null);
    }

    public boolean Q() {
        return b("run_on_ui_thread", (Boolean) true).booleanValue();
    }

    public Bundle R() {
        Bundle bundle = b("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(a("server_parameters", (JSONObject) null)) : new Bundle();
        int a = a();
        if (a != -1) {
            bundle.putBoolean("is_muted", a == 2 ? this.b.p().isMuted() : a == 0);
        }
        return bundle;
    }

    public long S() {
        return b("adapter_timeout_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.l)).longValue());
    }

    public long T() {
        return b("init_completion_delay_ms", -1L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(String str, float f) {
        float f2;
        synchronized (this.d) {
            f2 = JsonUtils.getFloat(this.c, str, f);
        }
        return f2;
    }

    protected int a(String str, int i) {
        int i2;
        synchronized (this.e) {
            i2 = JsonUtils.getInt(this.a, str, i);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long a(String str, long j) {
        long j2;
        synchronized (this.e) {
            j2 = JsonUtils.getLong(this.a, str, j);
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.e) {
            bool2 = JsonUtils.getBoolean(this.a, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float a(String str, Float f) {
        Float f2;
        synchronized (this.d) {
            f2 = JsonUtils.getFloat(this.c, str, f);
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str, String str2) {
        String string;
        synchronized (this.e) {
            string = JsonUtils.getString(this.a, str, str2);
        }
        return string;
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.e) {
            jSONArray2 = JsonUtils.getJSONArray(this.a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.d) {
            jSONObject2 = JsonUtils.getJSONObject(this.c, str, jSONObject);
        }
        return jSONObject2;
    }

    protected boolean a(String str) {
        boolean has;
        synchronized (this.d) {
            has = this.c.has(str);
        }
        return has;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(String str, int i) {
        int i2;
        synchronized (this.d) {
            i2 = JsonUtils.getInt(this.c, str, i);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(String str, long j) {
        long j2;
        synchronized (this.d) {
            j2 = JsonUtils.getLong(this.c, str, j);
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.d) {
            bool2 = JsonUtils.getBoolean(this.c, str, bool);
        }
        return bool2;
    }

    protected Object b(String str) {
        Object opt;
        synchronized (this.d) {
            opt = this.c.opt(str);
        }
        return opt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str, String str2) {
        String string;
        synchronized (this.d) {
            string = JsonUtils.getString(this.c, str, str2);
        }
        return string;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.d) {
            jSONArray2 = JsonUtils.getJSONArray(this.c, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, long j) {
        synchronized (this.d) {
            JsonUtils.putLong(this.c, str, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, String str2) {
        synchronized (this.d) {
            JsonUtils.putString(this.c, str, str2);
        }
    }

    public List<String> d(String str) {
        if (str != null) {
            List optList = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            List optList2 = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String e(String str) {
        String b = b(str, "");
        return StringUtils.isValidString(b) ? b : a(str, "");
    }

    public String getPlacement() {
        return this.f;
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + J() + "', adapterName='" + K() + "', isTesting=" + M() + '}';
    }
}
