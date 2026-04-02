package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class an implements com.kwad.sdk.core.d<AdMatrixInfo.AggregationCardInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.AggregationCardInfo aggregationCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aggregationCardInfo.changeTime = jSONObject.optInt("changeTime");
        aggregationCardInfo.maxTimesPerDay = jSONObject.optInt("maxTimesPerDay");
        aggregationCardInfo.intervalTime = jSONObject.optLong("intervalTime", new Long("1200").longValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.AggregationCardInfo aggregationCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aggregationCardInfo.changeTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "changeTime", aggregationCardInfo.changeTime);
        }
        if (aggregationCardInfo.maxTimesPerDay != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "maxTimesPerDay", aggregationCardInfo.maxTimesPerDay);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "intervalTime", aggregationCardInfo.intervalTime);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.AggregationCardInfo aggregationCardInfo, JSONObject jSONObject) {
        a2(aggregationCardInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.AggregationCardInfo aggregationCardInfo, JSONObject jSONObject) {
        return b2(aggregationCardInfo, jSONObject);
    }
}
