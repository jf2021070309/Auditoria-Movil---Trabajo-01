package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cx implements com.kwad.sdk.core.d<AdStyleInfo.ExposeTagInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.ExposeTagInfo exposeTagInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        exposeTagInfo.text = jSONObject.optString("text");
        if (exposeTagInfo.text == JSONObject.NULL) {
            exposeTagInfo.text = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.ExposeTagInfo exposeTagInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (exposeTagInfo.text != null && !exposeTagInfo.text.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "text", exposeTagInfo.text);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.ExposeTagInfo exposeTagInfo, JSONObject jSONObject) {
        a2(exposeTagInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.ExposeTagInfo exposeTagInfo, JSONObject jSONObject) {
        return b2(exposeTagInfo, jSONObject);
    }
}
