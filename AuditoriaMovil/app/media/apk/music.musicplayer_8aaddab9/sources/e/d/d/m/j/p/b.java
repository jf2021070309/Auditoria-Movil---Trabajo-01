package e.d.d.m.j.p;

import com.google.android.gms.common.internal.ImagesContract;
import e.d.d.m.j.j.m0;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b implements h {
    public static e.d.d.m.j.p.j.b b(JSONObject jSONObject) {
        return new e.d.d.m.j.p.j.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    public static long c(m0 m0Var, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(m0Var);
        return (j2 * 1000) + System.currentTimeMillis();
    }

    @Override // e.d.d.m.j.p.h
    public e.d.d.m.j.p.j.e a(m0 m0Var, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        return new e.d.d.m.j.p.j.e(c(m0Var, optInt2, jSONObject), new e.d.d.m.j.p.j.a(jSONObject2.getString("status"), jSONObject2.getString(ImagesContract.URL), jSONObject2.getString("reports_url"), jSONObject2.getString("ndk_reports_url"), jSONObject2.optBoolean("update_required", false)), new e.d.d.m.j.p.j.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), b(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
