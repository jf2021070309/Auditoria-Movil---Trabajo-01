package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fl implements com.kwad.sdk.core.d<AdMatrixInfo.MatrixTemplate> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.MatrixTemplate matrixTemplate, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        matrixTemplate.templateUrl = jSONObject.optString("templateUrl");
        if (matrixTemplate.templateUrl == JSONObject.NULL) {
            matrixTemplate.templateUrl = "";
        }
        matrixTemplate.templateVersion = jSONObject.optString("templateVersion");
        if (matrixTemplate.templateVersion == JSONObject.NULL) {
            matrixTemplate.templateVersion = "";
        }
        matrixTemplate.templateVersionCode = jSONObject.optLong("templateVersionCode");
        matrixTemplate.templateMd5 = jSONObject.optString("templateMd5");
        if (matrixTemplate.templateMd5 == JSONObject.NULL) {
            matrixTemplate.templateMd5 = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.MatrixTemplate matrixTemplate, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (matrixTemplate.templateUrl != null && !matrixTemplate.templateUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateUrl", matrixTemplate.templateUrl);
        }
        if (matrixTemplate.templateVersion != null && !matrixTemplate.templateVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateVersion", matrixTemplate.templateVersion);
        }
        if (matrixTemplate.templateVersionCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateVersionCode", matrixTemplate.templateVersionCode);
        }
        if (matrixTemplate.templateMd5 != null && !matrixTemplate.templateMd5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateMd5", matrixTemplate.templateMd5);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.MatrixTemplate matrixTemplate, JSONObject jSONObject) {
        a2(matrixTemplate, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.MatrixTemplate matrixTemplate, JSONObject jSONObject) {
        return b2(matrixTemplate, jSONObject);
    }
}
