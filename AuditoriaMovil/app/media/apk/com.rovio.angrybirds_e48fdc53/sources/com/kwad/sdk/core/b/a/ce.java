package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ce implements com.kwad.sdk.core.d<AdInfo.CutRuleInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.CutRuleInfo cutRuleInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cutRuleInfo.picHeight = jSONObject.optInt("picHeight");
        cutRuleInfo.viewTopMargin = jSONObject.optInt("viewTopMargin");
        cutRuleInfo.safeAreaHeight = jSONObject.optInt("safeAreaHeight");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.CutRuleInfo cutRuleInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cutRuleInfo.picHeight != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "picHeight", cutRuleInfo.picHeight);
        }
        if (cutRuleInfo.viewTopMargin != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "viewTopMargin", cutRuleInfo.viewTopMargin);
        }
        if (cutRuleInfo.safeAreaHeight != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "safeAreaHeight", cutRuleInfo.safeAreaHeight);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.CutRuleInfo cutRuleInfo, JSONObject jSONObject) {
        a2(cutRuleInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.CutRuleInfo cutRuleInfo, JSONObject jSONObject) {
        return b2(cutRuleInfo, jSONObject);
    }
}
