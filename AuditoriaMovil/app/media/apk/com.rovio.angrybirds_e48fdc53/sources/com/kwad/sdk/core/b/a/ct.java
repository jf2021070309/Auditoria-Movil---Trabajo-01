package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ct implements com.kwad.sdk.core.d<AdMatrixInfo.EndCardInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.EndCardInfo endCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        endCardInfo.cardShowPlayCount = jSONObject.optInt("cardShowPlayCount");
        endCardInfo.cardType = jSONObject.optInt("cardType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.EndCardInfo endCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (endCardInfo.cardShowPlayCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardShowPlayCount", endCardInfo.cardShowPlayCount);
        }
        if (endCardInfo.cardType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardType", endCardInfo.cardType);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.EndCardInfo endCardInfo, JSONObject jSONObject) {
        a2(endCardInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.EndCardInfo endCardInfo, JSONObject jSONObject) {
        return b2(endCardInfo, jSONObject);
    }
}
