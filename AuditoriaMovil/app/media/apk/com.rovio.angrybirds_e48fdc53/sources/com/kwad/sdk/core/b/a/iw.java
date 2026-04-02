package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class iw implements com.kwad.sdk.core.d<com.kwad.sdk.core.threads.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.avo = jSONObject.optString("pool_name");
        if (bVar.avo == JSONObject.NULL) {
            bVar.avo = "";
        }
        bVar.avp = jSONObject.optInt("core_pool_size");
        bVar.avq = jSONObject.optInt("max_pool_size");
        bVar.avr = jSONObject.optInt("current_pool_size");
        bVar.avs = jSONObject.optInt("active_count");
        bVar.avt = jSONObject.optLong("task_wait_avg_ms");
        bVar.avu = jSONObject.optLong("task_succ_count");
        bVar.interval = jSONObject.optLong("interval_ms");
        bVar.avv = jSONObject.optInt("queue_size");
        bVar.avw = jSONObject.optLong("pass_timestamp");
        bVar.avx = jSONObject.optInt("func_ratio_count");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.avo != null && !bVar.avo.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pool_name", bVar.avo);
        }
        if (bVar.avp != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "core_pool_size", bVar.avp);
        }
        if (bVar.avq != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "max_pool_size", bVar.avq);
        }
        if (bVar.avr != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "current_pool_size", bVar.avr);
        }
        if (bVar.avs != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "active_count", bVar.avs);
        }
        if (bVar.avt != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "task_wait_avg_ms", bVar.avt);
        }
        if (bVar.avu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "task_succ_count", bVar.avu);
        }
        if (bVar.interval != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "interval_ms", bVar.interval);
        }
        if (bVar.avv != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "queue_size", bVar.avv);
        }
        if (bVar.avw != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pass_timestamp", bVar.avw);
        }
        if (bVar.avx != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "func_ratio_count", bVar.avx);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
