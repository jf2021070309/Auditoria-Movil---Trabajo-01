package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dv implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.i> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.i iVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        iVar.rewardTime = jSONObject.optInt("rewardTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.i iVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (iVar.rewardTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rewardTime", iVar.rewardTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.i iVar, JSONObject jSONObject) {
        a2(iVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.i iVar, JSONObject jSONObject) {
        return b2(iVar, jSONObject);
    }
}
