package com.kwad.sdk.core.b.a;

import com.kwad.sdk.crash.online.monitor.block.BlockEvent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bd implements com.kwad.sdk.core.d<BlockEvent> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(BlockEvent blockEvent, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        blockEvent.blockDuration = jSONObject.optLong("blockDuration");
        blockEvent.blockTimeThreshold = jSONObject.optLong("blockTimeThreshold", new Long("1000").longValue());
        blockEvent.blockLoopInterval = jSONObject.optLong("blockLoopInterval", new Long("100").longValue());
        blockEvent.calcBlockOverhead = jSONObject.optLong("calcBlockOverhead");
        blockEvent.currentActivity = jSONObject.optString("currentActivity");
        if (blockEvent.currentActivity == JSONObject.NULL) {
            blockEvent.currentActivity = "";
        }
        blockEvent.processName = jSONObject.optString("processName");
        if (blockEvent.processName == JSONObject.NULL) {
            blockEvent.processName = "";
        }
        blockEvent.stackTraceSample = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("stackTraceSample");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                BlockEvent.a aVar = new BlockEvent.a();
                aVar.parseJson(optJSONArray.optJSONObject(i));
                blockEvent.stackTraceSample.add(aVar);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(BlockEvent blockEvent, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (blockEvent.blockDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockDuration", blockEvent.blockDuration);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "blockTimeThreshold", blockEvent.blockTimeThreshold);
        com.kwad.sdk.utils.t.putValue(jSONObject, "blockLoopInterval", blockEvent.blockLoopInterval);
        if (blockEvent.calcBlockOverhead != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "calcBlockOverhead", blockEvent.calcBlockOverhead);
        }
        if (blockEvent.currentActivity != null && !blockEvent.currentActivity.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentActivity", blockEvent.currentActivity);
        }
        if (blockEvent.processName != null && !blockEvent.processName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "processName", blockEvent.processName);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "stackTraceSample", blockEvent.stackTraceSample);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(BlockEvent blockEvent, JSONObject jSONObject) {
        a2(blockEvent, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(BlockEvent blockEvent, JSONObject jSONObject) {
        return b2(blockEvent, jSONObject);
    }
}
