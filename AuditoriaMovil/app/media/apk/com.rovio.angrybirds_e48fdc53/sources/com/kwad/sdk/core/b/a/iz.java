package com.kwad.sdk.core.b.a;

import com.kwad.sdk.crash.online.monitor.block.BlockEvent;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class iz implements com.kwad.sdk.core.d<BlockEvent.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(BlockEvent.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aAK = jSONObject.optLong("endTimestamp");
        aVar.repeatCount = jSONObject.optInt("repeatCount", new Integer("1").intValue());
        aVar.aAL = jSONObject.optBoolean("runIdle");
        aVar.aAM = jSONObject.optString("stackTraceDetail");
        if (aVar.aAM == JSONObject.NULL) {
            aVar.aAM = "";
        }
        aVar.aAN = jSONObject.optLong("startTimestamp");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(BlockEvent.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.aAK != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "endTimestamp", aVar.aAK);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "repeatCount", aVar.repeatCount);
        if (aVar.aAL) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "runIdle", aVar.aAL);
        }
        if (aVar.aAM != null && !aVar.aAM.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "stackTraceDetail", aVar.aAM);
        }
        if (aVar.aAN != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "startTimestamp", aVar.aAN);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(BlockEvent.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(BlockEvent.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
