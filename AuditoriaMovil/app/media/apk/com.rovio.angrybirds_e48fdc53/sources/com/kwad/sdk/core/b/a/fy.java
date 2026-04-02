package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fy implements com.kwad.sdk.core.d<com.kwad.components.core.n.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.n.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.Lq = jSONObject.optInt("load_module");
        bVar.Lr = jSONObject.optLong("load_status");
        bVar.Ls = jSONObject.optLong("load_duration_ms");
        bVar.Lt = jSONObject.optLong("error_code");
        bVar.Lu = jSONObject.optLong("error_msg");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.n.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.Lq != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_module", bVar.Lq);
        }
        if (bVar.Lr != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_status", bVar.Lr);
        }
        if (bVar.Ls != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_duration_ms", bVar.Ls);
        }
        if (bVar.Lt != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_code", bVar.Lt);
        }
        if (bVar.Lu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_msg", bVar.Lu);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.n.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.n.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
