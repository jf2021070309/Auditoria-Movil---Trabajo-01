package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    private double a;
    private double b;
    private int c;
    private int d;
    private String e;
    private JSONObject f;

    private f(double d, double d2, int i, String str, int i2, String str2, JSONObject jSONObject) {
        this.a = d;
        this.b = d2;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = jSONObject;
    }

    public static void a(JSONObject jSONObject, Map<String, f> map) {
        JSONArray optJSONArray;
        String optString;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("prime_rits")) == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                optString = optJSONArray.optString(i);
            } catch (Exception e) {
                e = e;
            }
            try {
                map.put(optString, new f(jSONObject.optDouble("upper", PangleAdapterUtils.CPM_DEFLAUT_VALUE), jSONObject.optDouble("lower", PangleAdapterUtils.CPM_DEFLAUT_VALUE), jSONObject.optInt("type"), optString, jSONObject.optInt("js_mode"), jSONObject.optString("rule_id"), jSONObject.optJSONObject("refresh_time")));
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        }
    }

    public int a() {
        return this.d;
    }

    public int a(String str) {
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            return jSONObject.optInt(str);
        }
        return 0;
    }

    public double b() {
        return this.b;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.c;
    }

    public double e() {
        return this.a;
    }

    public boolean f() {
        return this.a <= PangleAdapterUtils.CPM_DEFLAUT_VALUE && this.b <= PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }
}
