package e.d.d.y.r;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class k {
    public static final Date a = new Date(0);

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f7773b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f7774c;

    /* renamed from: d  reason: collision with root package name */
    public Date f7775d;

    /* renamed from: e  reason: collision with root package name */
    public JSONArray f7776e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f7777f;

    public k(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f7774c = jSONObject;
        this.f7775d = date;
        this.f7776e = jSONArray;
        this.f7777f = jSONObject2;
        this.f7773b = jSONObject3;
    }

    public static k a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new k(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f7773b.toString().equals(((k) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f7773b.hashCode();
    }

    public String toString() {
        return this.f7773b.toString();
    }
}
