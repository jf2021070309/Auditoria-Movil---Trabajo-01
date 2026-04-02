package com.kwad.sdk.core.b.a;

import com.facebook.appevents.AppEventsConstants;
import com.kwad.sdk.i.a;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cs implements com.kwad.sdk.core.d<a.C0267a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0267a c0267a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0267a.sdkVersion = jSONObject.optString("run_sdk_version");
        if (c0267a.sdkVersion == JSONObject.NULL) {
            c0267a.sdkVersion = "";
        }
        c0267a.aCZ = jSONObject.optLong("trigger_count", new Long(AppEventsConstants.EVENT_PARAM_VALUE_NO).longValue());
        c0267a.aDa = jSONObject.optLong("fail_count", new Long(AppEventsConstants.EVENT_PARAM_VALUE_NO).longValue());
        c0267a.aDb = jSONObject.optLong("real_fail_count", new Long(AppEventsConstants.EVENT_PARAM_VALUE_NO).longValue());
        c0267a.aDc = jSONObject.optString("business");
        if (c0267a.aDc == JSONObject.NULL) {
            c0267a.aDc = "";
        }
        c0267a.aDd = jSONObject.optString("stage");
        if (c0267a.aDd == JSONObject.NULL) {
            c0267a.aDd = "";
        }
        c0267a.aDe = jSONObject.optString("function");
        if (c0267a.aDe == JSONObject.NULL) {
            c0267a.aDe = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0267a c0267a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0267a.sdkVersion != null && !c0267a.sdkVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "run_sdk_version", c0267a.sdkVersion);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "trigger_count", c0267a.aCZ);
        com.kwad.sdk.utils.t.putValue(jSONObject, "fail_count", c0267a.aDa);
        com.kwad.sdk.utils.t.putValue(jSONObject, "real_fail_count", c0267a.aDb);
        if (c0267a.aDc != null && !c0267a.aDc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "business", c0267a.aDc);
        }
        if (c0267a.aDd != null && !c0267a.aDd.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "stage", c0267a.aDd);
        }
        if (c0267a.aDe != null && !c0267a.aDe.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "function", c0267a.aDe);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0267a c0267a, JSONObject jSONObject) {
        a2(c0267a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0267a c0267a, JSONObject jSONObject) {
        return b2(c0267a, jSONObject);
    }
}
