package bykvm_19do.bykvm_19do.bykvm_19do;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 {
    final String a;
    final String b;
    final Boolean c;
    final Long d;
    final Long e;
    final Integer f;
    final Long g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(String str, String str2, Boolean bool, Long l, Long l2, Integer num, Long l3) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = l;
        this.e = l2;
        this.f = num;
        this.g = l3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c1(jSONObject.optString("id", null), jSONObject.optString("req_id", null), jSONObject.has("is_track_limited") ? Boolean.valueOf(jSONObject.optBoolean("is_track_limited")) : null, jSONObject.has("take_ms") ? Long.valueOf(jSONObject.optLong("take_ms", -1L)) : null, jSONObject.has("time") ? Long.valueOf(jSONObject.optLong("time", -1L)) : null, jSONObject.has("query_times") ? Integer.valueOf(jSONObject.optInt("query_times", -1)) : null, jSONObject.has("hw_id_version_code") ? Long.valueOf(jSONObject.optLong("hw_id_version_code", -1L)) : null);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        z0.a(hashMap, "id", this.a);
        z0.a(hashMap, "req_id", this.b);
        z0.a(hashMap, "is_track_limited", String.valueOf(this.c));
        z0.a(hashMap, "take_ms", String.valueOf(this.d));
        z0.a(hashMap, "time", String.valueOf(this.e));
        z0.a(hashMap, "query_times", String.valueOf(this.f));
        z0.a(hashMap, "hw_id_version_code", String.valueOf(this.g));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        z0.a(jSONObject, "id", this.a);
        z0.a(jSONObject, "req_id", this.b);
        z0.a(jSONObject, "is_track_limited", this.c);
        z0.a(jSONObject, "take_ms", this.d);
        z0.a(jSONObject, "time", this.e);
        z0.a(jSONObject, "query_times", this.f);
        z0.a(jSONObject, "hw_id_version_code", this.g);
        return jSONObject;
    }

    public String toString() {
        return b().toString();
    }
}
