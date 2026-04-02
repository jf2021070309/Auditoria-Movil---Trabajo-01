package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdProductInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hu implements com.kwad.sdk.core.d<AdProductInfo.SpikeInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdProductInfo.SpikeInfo spikeInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        spikeInfo.endTime = jSONObject.optLong("endTime");
        spikeInfo.soldStock = jSONObject.optInt("soldStock");
        spikeInfo.originalStock = jSONObject.optInt("originalStock");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdProductInfo.SpikeInfo spikeInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (spikeInfo.endTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "endTime", spikeInfo.endTime);
        }
        if (spikeInfo.soldStock != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "soldStock", spikeInfo.soldStock);
        }
        if (spikeInfo.originalStock != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "originalStock", spikeInfo.originalStock);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdProductInfo.SpikeInfo spikeInfo, JSONObject jSONObject) {
        a2(spikeInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdProductInfo.SpikeInfo spikeInfo, JSONObject jSONObject) {
        return b2(spikeInfo, jSONObject);
    }
}
