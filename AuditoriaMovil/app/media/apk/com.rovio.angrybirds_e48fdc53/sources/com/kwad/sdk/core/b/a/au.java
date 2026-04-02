package com.kwad.sdk.core.b.a;

import com.kwad.components.core.request.model.b;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class au implements com.kwad.sdk.core.d<b.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.streamType = jSONObject.optInt("streamType");
        aVar.Qp = jSONObject.optInt("maxVolume");
        aVar.Qq = jSONObject.optInt("minVolume");
        aVar.Qr = jSONObject.optInt("currentVolume");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.streamType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "streamType", aVar.streamType);
        }
        if (aVar.Qp != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "maxVolume", aVar.Qp);
        }
        if (aVar.Qq != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "minVolume", aVar.Qq);
        }
        if (aVar.Qr != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentVolume", aVar.Qr);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
