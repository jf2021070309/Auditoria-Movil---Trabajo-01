package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f0 {
    private static final Map<String, f0> b = new HashMap();
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a a;

    private f0(String str, Context context) {
        context = context == null ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() : context;
        if (context != null) {
            this.a = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.d().a(context).a(1).a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().u()).a(str).a();
        }
    }

    public static f0 a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_mediation_sdk_sp";
        }
        Map<String, f0> map = b;
        f0 f0Var = map.get(str);
        if (f0Var == null) {
            f0 f0Var2 = new f0(str, context);
            map.put(str, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }

    public static void a(JSONObject jSONObject) {
        try {
            String d = a("gm_v3_temp", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d("gm_key_v3_bug");
            JSONArray jSONArray = !TextUtils.isEmpty(d) ? new JSONArray(d) : new JSONArray();
            if (jSONArray.length() >= 100) {
                jSONArray.put(99, jSONObject);
            } else {
                jSONArray.put(jSONObject);
            }
            a("gm_v3_temp", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).b("gm_key_v3_bug", jSONArray.toString());
        } catch (Throwable th) {
        }
    }

    public static void a(boolean z, boolean z2, int i, String str, long j, int i2) {
        String str2 = z ? "v3" : "v1";
        try {
            String d = a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d(str2);
            JSONObject jSONObject = TextUtils.isEmpty(d) ? new JSONObject() : new JSONObject(d);
            int i3 = 1;
            if (z2) {
                JSONObject optJSONObject = jSONObject.optJSONObject("success");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    jSONObject.put("success", optJSONObject);
                }
                int optInt = optJSONObject.optInt("times", -1);
                int i4 = optInt == -1 ? 1 : optInt + 1;
                optJSONObject.put("times", i4);
                int optInt2 = optJSONObject.optInt("upload_size", -1);
                optJSONObject.put("upload_size", optInt2 == -1 ? i : optInt2 + i);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reason");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    optJSONObject.put("reason", optJSONObject2);
                }
                int optInt3 = optJSONObject2.optInt(str, -1);
                if (optInt3 != -1) {
                    i3 = 1 + optInt3;
                }
                optJSONObject2.put(str, i3);
                if (j <= 10000) {
                    long optInt4 = optJSONObject.optInt("avg_req_duration", -1);
                    optJSONObject.put("avg_req_duration", optInt4 == -1 ? j : ((optInt4 * (i4 - 1)) + j) / i4);
                }
            } else {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("fail");
                if (optJSONObject3 == null) {
                    optJSONObject3 = new JSONObject();
                    jSONObject.put("fail", optJSONObject3);
                }
                int optInt5 = optJSONObject3.optInt("times", -1);
                optJSONObject3.put("times", optInt5 == -1 ? 1 : optInt5 + 1);
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("error_code");
                if (optJSONObject4 == null) {
                    optJSONObject4 = new JSONObject();
                    optJSONObject3.put("error_code", optJSONObject4);
                }
                String str3 = "" + i2;
                int optInt6 = optJSONObject4.optInt(str3, -1);
                if (optInt6 != -1) {
                    i3 = 1 + optInt6;
                }
                optJSONObject4.put(str3, i3);
            }
            a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).b(str2, jSONObject.toString());
        } catch (Throwable th) {
        }
    }

    public static void c(String str, long j) {
        try {
            String d = a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d("init_time");
            JSONObject jSONObject = TextUtils.isEmpty(d) ? new JSONObject() : new JSONObject(d);
            jSONObject.put(str, j);
            a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).b("init_time", jSONObject.toString());
        } catch (Throwable th) {
        }
    }

    public static JSONObject d() {
        try {
            String d = a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d("init_time");
            if (!TextUtils.isEmpty(d)) {
                a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).f("init_time");
                return new JSONObject(d);
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static JSONArray e() {
        try {
            String d = a("gm_v3_temp", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d("gm_key_v3_bug");
            if (!TextUtils.isEmpty(d)) {
                JSONArray jSONArray = new JSONArray(d);
                a("gm_v3_temp", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).f("gm_key_v3_bug");
                return jSONArray;
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static JSONObject g(String str) {
        try {
            String d = a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).d(str);
            if (!TextUtils.isEmpty(d)) {
                a("evt_upload_info", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()).f(str);
                return new JSONObject(d);
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public float a(String str, float f) {
        try {
            return this.a.b(str, f);
        } catch (Throwable th) {
            return f;
        }
    }

    public int a(String str, int i) {
        try {
            return this.a.b(str, i);
        } catch (Throwable th) {
            return i;
        }
    }

    public long a(String str, long j) {
        try {
            return this.a.b(str, j);
        } catch (Throwable th) {
            return j;
        }
    }

    public String a(String str, String str2) {
        try {
            return this.a.a(str, str2);
        } catch (Throwable th) {
            return str2;
        }
    }

    public void a() {
        try {
            this.a.a();
        } catch (Throwable th) {
        }
    }

    public boolean a(String str) {
        return a(str, false);
    }

    public boolean a(String str, boolean z) {
        try {
            return this.a.b(str, z);
        } catch (Throwable th) {
            return z;
        }
    }

    public int b(String str) {
        return a(str, -1);
    }

    public Map<String, ?> b() {
        try {
            return this.a.b();
        } catch (Throwable th) {
            return new HashMap();
        }
    }

    public void b(String str, float f) {
        try {
            this.a.a(str, f);
        } catch (Throwable th) {
        }
    }

    public void b(String str, int i) {
        try {
            this.a.a(str, i);
        } catch (Throwable th) {
        }
    }

    public void b(String str, long j) {
        try {
            this.a.a(str, j);
        } catch (Throwable th) {
        }
    }

    public void b(String str, String str2) {
        try {
            this.a.b(str, str2);
        } catch (Throwable th) {
        }
    }

    public void b(String str, boolean z) {
        try {
            this.a.a(str, z);
        } catch (Throwable th) {
        }
    }

    public long c(String str) {
        return a(str, -1L);
    }

    public String c() {
        return a("any_door_id", (String) null);
    }

    public String d(String str) {
        try {
            return a(str, "");
        } catch (Throwable th) {
            return null;
        }
    }

    public void e(String str) {
        b("any_door_id", str);
    }

    public void f(String str) {
        try {
            this.a.a(str);
        } catch (Throwable th) {
        }
    }
}
