package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.d;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dq implements com.kwad.sdk.core.d<d.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(d.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.showLiveStatus = jSONObject.optInt("showLiveStatus");
        aVar.showLiveStyle = jSONObject.optInt("showLiveStyle");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(d.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.showLiveStatus != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showLiveStatus", aVar.showLiveStatus);
        }
        if (aVar.showLiveStyle != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showLiveStyle", aVar.showLiveStyle);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(d.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(d.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
