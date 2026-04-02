package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eq implements com.kwad.sdk.core.d<AdMatrixInfo.InterstitialCardInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.InterstitialCardInfo interstitialCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        interstitialCardInfo.interactionInfo = new AdMatrixInfo.AdInteractionInfo();
        interstitialCardInfo.interactionInfo.parseJson(jSONObject.optJSONObject("interactionInfo"));
        interstitialCardInfo.cycleAggregateInfo = new AdMatrixInfo.CycleAggregateInfo();
        interstitialCardInfo.cycleAggregateInfo.parseJson(jSONObject.optJSONObject("cycleAggregateInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.InterstitialCardInfo interstitialCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "interactionInfo", interstitialCardInfo.interactionInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "cycleAggregateInfo", interstitialCardInfo.cycleAggregateInfo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.InterstitialCardInfo interstitialCardInfo, JSONObject jSONObject) {
        a2(interstitialCardInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.InterstitialCardInfo interstitialCardInfo, JSONObject jSONObject) {
        return b2(interstitialCardInfo, jSONObject);
    }
}
