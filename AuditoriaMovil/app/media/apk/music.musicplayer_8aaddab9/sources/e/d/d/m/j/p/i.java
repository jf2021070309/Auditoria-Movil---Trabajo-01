package e.d.d.m.j.p;

import e.d.d.m.j.j.m0;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class i implements h {
    @Override // e.d.d.m.j.p.h
    public e.d.d.m.j.p.j.e a(m0 m0Var, JSONObject jSONObject) throws JSONException {
        long currentTimeMillis;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fabric");
        JSONObject jSONObject3 = jSONObject.getJSONObject("app");
        String string = jSONObject3.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject2.getString("bundle_id");
        String string3 = jSONObject2.getString("org_id");
        String format = equals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        Locale locale = Locale.US;
        e.d.d.m.j.p.j.a aVar = new e.d.d.m.j.p.j.a(string, format, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject3.optBoolean("update_required", false), jSONObject3.optInt("report_upload_variant", 0), jSONObject3.optInt("native_report_upload_variant", 0));
        e.d.d.m.j.p.j.c cVar = new e.d.d.m.j.p.j.c(8, 4);
        JSONObject jSONObject4 = jSONObject.getJSONObject("features");
        e.d.d.m.j.p.j.b bVar = new e.d.d.m.j.p.j.b(jSONObject4.optBoolean("collect_reports", true), jSONObject4.optBoolean("collect_anrs", false));
        long j2 = optInt2;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            Objects.requireNonNull(m0Var);
            currentTimeMillis = (j2 * 1000) + System.currentTimeMillis();
        }
        return new e.d.d.m.j.p.j.e(currentTimeMillis, aVar, cVar, bVar, optInt, optInt2);
    }
}
