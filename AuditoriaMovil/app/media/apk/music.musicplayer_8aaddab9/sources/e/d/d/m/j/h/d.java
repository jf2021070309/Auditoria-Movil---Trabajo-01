package e.d.d.m.j.h;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d implements b, e.d.d.m.j.i.b {
    public e.d.d.m.j.i.a a;

    public static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // e.d.d.m.j.i.b
    public void a(e.d.d.m.j.i.a aVar) {
        this.a = aVar;
        e.d.d.m.j.f.a.a(3);
    }

    @Override // e.d.d.m.j.h.b
    public void b(String str, Bundle bundle) {
        e.d.d.m.j.i.a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                e.d.d.m.j.f.a.d("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
