package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdStatusInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class af implements com.kwad.sdk.core.d<AdStatusInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStatusInfo adStatusInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adStatusInfo.loadFromCache = jSONObject.optBoolean("loadFromCache");
        adStatusInfo.loadDataTime = jSONObject.optLong("loadDataTime");
        adStatusInfo.downloadFinishTime = jSONObject.optLong("downloadFinishTime");
        adStatusInfo.downloadType = jSONObject.optInt("downloadType");
        adStatusInfo.downloadSize = jSONObject.optLong("downloadSize");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStatusInfo adStatusInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adStatusInfo.loadFromCache) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "loadFromCache", adStatusInfo.loadFromCache);
        }
        if (adStatusInfo.loadDataTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "loadDataTime", adStatusInfo.loadDataTime);
        }
        if (adStatusInfo.downloadFinishTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadFinishTime", adStatusInfo.downloadFinishTime);
        }
        if (adStatusInfo.downloadType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadType", adStatusInfo.downloadType);
        }
        if (adStatusInfo.downloadSize != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadSize", adStatusInfo.downloadSize);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStatusInfo adStatusInfo, JSONObject jSONObject) {
        a2(adStatusInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStatusInfo adStatusInfo, JSONObject jSONObject) {
        return b2(adStatusInfo, jSONObject);
    }
}
