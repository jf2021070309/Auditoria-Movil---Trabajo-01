package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.core.webview.jshandler.am;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ar implements com.kwad.sdk.core.d<am.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(am.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Vi = jSONObject.optDouble("progress");
        aVar.status = jSONObject.optInt("status");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(am.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Vi != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "progress", aVar.Vi);
        }
        if (aVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", aVar.status);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(am.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(am.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
