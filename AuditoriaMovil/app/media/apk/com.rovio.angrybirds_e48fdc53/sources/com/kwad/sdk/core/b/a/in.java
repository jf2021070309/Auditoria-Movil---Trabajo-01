package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class in implements com.kwad.sdk.core.d<AdMatrixInfo.StyleInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.StyleInfo styleInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        styleInfo.title = jSONObject.optString("title");
        if (styleInfo.title == JSONObject.NULL) {
            styleInfo.title = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.StyleInfo styleInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (styleInfo.title != null && !styleInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", styleInfo.title);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.StyleInfo styleInfo, JSONObject jSONObject) {
        a2(styleInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.StyleInfo styleInfo, JSONObject jSONObject) {
        return b2(styleInfo, jSONObject);
    }
}
