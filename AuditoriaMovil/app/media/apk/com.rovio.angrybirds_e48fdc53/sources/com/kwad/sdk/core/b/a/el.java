package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.i;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class el implements com.kwad.sdk.core.d<i.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(i.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.status = jSONObject.optInt("status");
        bVar.progress = jSONObject.optInt("progress");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(i.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", bVar.status);
        }
        if (bVar.progress != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "progress", bVar.progress);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(i.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(i.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
