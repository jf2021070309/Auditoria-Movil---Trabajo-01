package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.ax;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ex implements com.kwad.sdk.core.d<ax.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ax.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.jI = jSONObject.optInt("itemClickType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ax.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.jI != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemClickType", aVar.jI);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ax.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ax.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
