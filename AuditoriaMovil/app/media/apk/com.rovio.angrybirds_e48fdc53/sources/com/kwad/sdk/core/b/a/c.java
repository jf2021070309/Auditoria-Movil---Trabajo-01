package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c implements com.kwad.sdk.core.d<AdStyleInfo.PlayDetailInfo.ActionBarInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.PlayDetailInfo.ActionBarInfo actionBarInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        actionBarInfo.translateBtnShowTime = jSONObject.optLong("translateBtnShowTime");
        actionBarInfo.lightBtnShowTime = jSONObject.optLong("lightBtnShowTime");
        actionBarInfo.cardShowTime = jSONObject.optLong("cardShowTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.PlayDetailInfo.ActionBarInfo actionBarInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (actionBarInfo.translateBtnShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "translateBtnShowTime", actionBarInfo.translateBtnShowTime);
        }
        if (actionBarInfo.lightBtnShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lightBtnShowTime", actionBarInfo.lightBtnShowTime);
        }
        if (actionBarInfo.cardShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardShowTime", actionBarInfo.cardShowTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.PlayDetailInfo.ActionBarInfo actionBarInfo, JSONObject jSONObject) {
        a2(actionBarInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.PlayDetailInfo.ActionBarInfo actionBarInfo, JSONObject jSONObject) {
        return b2(actionBarInfo, jSONObject);
    }
}
