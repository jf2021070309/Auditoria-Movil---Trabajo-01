package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bi implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.d.b.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.x = jSONObject.optDouble("x");
        bVar.y = jSONObject.optDouble("y");
        bVar.width = jSONObject.optInt("width");
        bVar.height = jSONObject.optInt("height");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.x != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "x", bVar.x);
        }
        if (bVar.y != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "y", bVar.y);
        }
        if (bVar.width != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", bVar.width);
        }
        if (bVar.height != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", bVar.height);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
