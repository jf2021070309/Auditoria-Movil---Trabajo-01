package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.request.model.StatusInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class il implements com.kwad.sdk.core.d<StatusInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(StatusInfo statusInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        statusInfo.auz = jSONObject.optInt("personalRecommend");
        statusInfo.auA = jSONObject.optInt("programmaticRecommend");
        statusInfo.auB = new StatusInfo.SplashAdInfo();
        statusInfo.auB.parseJson(jSONObject.optJSONObject("splashAdInfo"));
        statusInfo.auC = new StatusInfo.NativeAdRequestInfo();
        statusInfo.auC.parseJson(jSONObject.optJSONObject("nativeAdInfo"));
        statusInfo.auD = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("taskStats");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.kwad.sdk.core.request.model.f fVar = new com.kwad.sdk.core.request.model.f();
                fVar.parseJson(optJSONArray.optJSONObject(i));
                statusInfo.auD.add(fVar);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(StatusInfo statusInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (statusInfo.auz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "personalRecommend", statusInfo.auz);
        }
        if (statusInfo.auA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "programmaticRecommend", statusInfo.auA);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "splashAdInfo", statusInfo.auB);
        com.kwad.sdk.utils.t.a(jSONObject, "nativeAdInfo", statusInfo.auC);
        com.kwad.sdk.utils.t.putValue(jSONObject, "taskStats", statusInfo.auD);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(StatusInfo statusInfo, JSONObject jSONObject) {
        a2(statusInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(StatusInfo statusInfo, JSONObject jSONObject) {
        return b2(statusInfo, jSONObject);
    }
}
