package com.kwad.sdk.k.a;

import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ax;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class f extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public int aGE = -1;
    public int aGF = -1;

    public static synchronized f Hj() {
        synchronized (f.class) {
            if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xt()) {
                return ax.Hj();
            }
            return null;
        }
    }

    private void a(f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        fVar.aGE = jSONObject.optInt("phoneCount", -1);
        fVar.aGF = jSONObject.optInt("activePhoneCount", -1);
        super.afterToJson(jSONObject);
    }

    private static JSONObject b(f fVar, JSONObject jSONObject) {
        t.putValue(jSONObject, "phoneCount", fVar.aGE);
        t.putValue(jSONObject, "activePhoneCount", fVar.aGF);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        a(this, jSONObject);
        afterParseJson(jSONObject);
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject b = b(this, new JSONObject());
        afterToJson(b);
        return b;
    }
}
