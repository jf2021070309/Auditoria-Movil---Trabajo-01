package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fk implements com.kwad.sdk.core.d<AdMatrixInfo.MatrixTag> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.MatrixTag matrixTag, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        matrixTag.styleId = jSONObject.optInt("styleId");
        matrixTag.type = jSONObject.optString("type");
        if (matrixTag.type == JSONObject.NULL) {
            matrixTag.type = "";
        }
        matrixTag.isHide = jSONObject.optBoolean("isHide");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.MatrixTag matrixTag, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (matrixTag.styleId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "styleId", matrixTag.styleId);
        }
        if (matrixTag.type != null && !matrixTag.type.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", matrixTag.type);
        }
        if (matrixTag.isHide) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isHide", matrixTag.isHide);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.MatrixTag matrixTag, JSONObject jSONObject) {
        a2(matrixTag, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.MatrixTag matrixTag, JSONObject jSONObject) {
        return b2(matrixTag, jSONObject);
    }
}
