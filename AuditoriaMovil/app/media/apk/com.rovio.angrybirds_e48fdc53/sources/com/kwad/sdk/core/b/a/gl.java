package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gl implements com.kwad.sdk.core.d<AdStyleInfo.PlayDetailInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.PlayDetailInfo playDetailInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        playDetailInfo.type = jSONObject.optInt("type");
        playDetailInfo.detailWebCardInfo = new AdStyleInfo.PlayDetailInfo.DetailWebCardInfo();
        playDetailInfo.detailWebCardInfo.parseJson(jSONObject.optJSONObject("detailWebCardInfo"));
        playDetailInfo.detailTopToolBarInfo = new AdStyleInfo.PlayDetailInfo.DetailTopToolBarInfo();
        playDetailInfo.detailTopToolBarInfo.parseJson(jSONObject.optJSONObject("detailTopToolBarInfo"));
        playDetailInfo.actionBarInfo = new AdStyleInfo.PlayDetailInfo.ActionBarInfo();
        playDetailInfo.actionBarInfo.parseJson(jSONObject.optJSONObject("actionBarInfo"));
        playDetailInfo.patchAdInfo = new AdStyleInfo.PlayDetailInfo.PatchAdInfo();
        playDetailInfo.patchAdInfo.parseJson(jSONObject.optJSONObject("patchAdInfo"));
        playDetailInfo.detailCommonInfo = new AdStyleInfo.PlayDetailInfo.DetailCommonInfo();
        playDetailInfo.detailCommonInfo.parseJson(jSONObject.optJSONObject("detailCommonInfo"));
        playDetailInfo.drawAdInfo = new AdStyleInfo.PlayDetailInfo.DrawAdInfo();
        playDetailInfo.drawAdInfo.parseJson(jSONObject.optJSONObject("drawAdInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.PlayDetailInfo playDetailInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (playDetailInfo.type != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", playDetailInfo.type);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "detailWebCardInfo", playDetailInfo.detailWebCardInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "detailTopToolBarInfo", playDetailInfo.detailTopToolBarInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "actionBarInfo", playDetailInfo.actionBarInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "patchAdInfo", playDetailInfo.patchAdInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "detailCommonInfo", playDetailInfo.detailCommonInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "drawAdInfo", playDetailInfo.drawAdInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.PlayDetailInfo playDetailInfo, JSONObject jSONObject) {
        a2(playDetailInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.PlayDetailInfo playDetailInfo, JSONObject jSONObject) {
        return b2(playDetailInfo, jSONObject);
    }
}
