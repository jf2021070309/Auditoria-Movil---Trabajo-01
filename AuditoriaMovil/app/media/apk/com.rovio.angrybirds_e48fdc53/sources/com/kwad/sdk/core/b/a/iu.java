package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.SdkConfigData;
import com.kwad.sdk.core.response.model.TemplateConfig;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class iu implements com.kwad.sdk.core.d<SdkConfigData.TemplateConfigMap> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(SdkConfigData.TemplateConfigMap templateConfigMap, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        templateConfigMap.couponOpenConfig = new TemplateConfig();
        templateConfigMap.couponOpenConfig.parseJson(jSONObject.optJSONObject("couponOpenConfig"));
        templateConfigMap.couponInfoConfig = new TemplateConfig();
        templateConfigMap.couponInfoConfig.parseJson(jSONObject.optJSONObject("couponInfoConfig"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(SdkConfigData.TemplateConfigMap templateConfigMap, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "couponOpenConfig", templateConfigMap.couponOpenConfig);
        com.kwad.sdk.utils.t.a(jSONObject, "couponInfoConfig", templateConfigMap.couponInfoConfig);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(SdkConfigData.TemplateConfigMap templateConfigMap, JSONObject jSONObject) {
        a2(templateConfigMap, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(SdkConfigData.TemplateConfigMap templateConfigMap, JSONObject jSONObject) {
        return b2(templateConfigMap, jSONObject);
    }
}
