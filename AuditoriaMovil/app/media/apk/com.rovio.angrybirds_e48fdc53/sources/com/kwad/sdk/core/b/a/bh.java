package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bh implements com.kwad.sdk.core.d<AdInfo.CallBackStrategyInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.CallBackStrategyInfo callBackStrategyInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        callBackStrategyInfo.impressionCheckMs = jSONObject.optInt("impressionCheckMs", new Integer("5000").intValue());
        callBackStrategyInfo.callBackAdvanceMs = jSONObject.optInt("callBackAdvanceMs", new Integer("2000").intValue());
        callBackStrategyInfo.serverCheckSwitch = jSONObject.optBoolean("serverCheckSwitch");
        callBackStrategyInfo.rewardAdvanceSwitch = jSONObject.optBoolean("rewardAdvanceSwitch");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.CallBackStrategyInfo callBackStrategyInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "impressionCheckMs", callBackStrategyInfo.impressionCheckMs);
        com.kwad.sdk.utils.t.putValue(jSONObject, "callBackAdvanceMs", callBackStrategyInfo.callBackAdvanceMs);
        if (callBackStrategyInfo.serverCheckSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "serverCheckSwitch", callBackStrategyInfo.serverCheckSwitch);
        }
        if (callBackStrategyInfo.rewardAdvanceSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardAdvanceSwitch", callBackStrategyInfo.rewardAdvanceSwitch);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.CallBackStrategyInfo callBackStrategyInfo, JSONObject jSONObject) {
        a2(callBackStrategyInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.CallBackStrategyInfo callBackStrategyInfo, JSONObject jSONObject) {
        return b2(callBackStrategyInfo, jSONObject);
    }
}
