package e.d.d.m.j.p;

import e.d.d.m.j.j.m0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class g {
    public final m0 a;

    public g(m0 m0Var) {
        this.a = m0Var;
    }

    public e.d.d.m.j.p.j.e a(JSONObject jSONObject) throws JSONException {
        return (jSONObject.getInt("settings_version") != 3 ? new b() : new i()).a(this.a, jSONObject);
    }
}
