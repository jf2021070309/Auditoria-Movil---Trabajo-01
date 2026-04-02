package com.kwad.sdk.k.a;

import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ax;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class b extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public int aGt;
    public int aGu;
    public int aGv;

    public b(int i, int i2, int i3) {
        this.aGt = i;
        this.aGu = i2;
        this.aGv = i3;
    }

    public static synchronized b Hi() {
        synchronized (b.class) {
            if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xv()) {
                return ax.Hi();
            }
            return null;
        }
    }

    private static void a(b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.aGt = jSONObject.optInt("cellId", -1);
        bVar.aGu = jSONObject.optInt("lac", -1);
        bVar.aGv = jSONObject.optInt("bsss", -1);
    }

    private static JSONObject b(b bVar, JSONObject jSONObject) {
        t.putValue(jSONObject, "cellId", bVar.aGt);
        t.putValue(jSONObject, "lac", bVar.aGu);
        t.putValue(jSONObject, "bsss", bVar.aGv);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        a(this, jSONObject);
        super.afterParseJson(jSONObject);
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        return b(this, new JSONObject());
    }
}
