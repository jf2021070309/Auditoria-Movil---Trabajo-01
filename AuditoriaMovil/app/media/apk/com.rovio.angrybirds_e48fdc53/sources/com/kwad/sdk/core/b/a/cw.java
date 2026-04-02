package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.kwad.sdk.core.report.a;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cw implements com.kwad.sdk.core.d<a.C0258a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0258a c0258a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0258a.code = jSONObject.optInt(PluginConstants.KEY_ERROR_CODE);
        c0258a.msg = jSONObject.optString("msg");
        if (c0258a.msg == JSONObject.NULL) {
            c0258a.msg = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0258a c0258a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0258a.code != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, PluginConstants.KEY_ERROR_CODE, c0258a.code);
        }
        if (c0258a.msg != null && !c0258a.msg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "msg", c0258a.msg);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0258a c0258a, JSONObject jSONObject) {
        a2(c0258a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0258a c0258a, JSONObject jSONObject) {
        return b2(c0258a, jSONObject);
    }
}
