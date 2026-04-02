package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.ShareConstants;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class iv implements com.kwad.sdk.core.d<AdMatrixInfo.TemplateData> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.TemplateData templateData, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        templateData.templateShowTime = jSONObject.optLong("templateShowTime");
        templateData.templateDelayTime = jSONObject.optLong("templateDelayTime");
        templateData.data = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA);
        if (templateData.data == JSONObject.NULL) {
            templateData.data = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.TemplateData templateData, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (templateData.templateShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateShowTime", templateData.templateShowTime);
        }
        if (templateData.templateDelayTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "templateDelayTime", templateData.templateDelayTime);
        }
        if (templateData.data != null && !templateData.data.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ShareConstants.WEB_DIALOG_PARAM_DATA, templateData.data);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.TemplateData templateData, JSONObject jSONObject) {
        a2(templateData, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.TemplateData templateData, JSONObject jSONObject) {
        return b2(templateData, jSONObject);
    }
}
