package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.au;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class is implements com.kwad.sdk.core.d<au.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(au.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.VA = jSONObject.optInt("taskStatus");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(au.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.VA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "taskStatus", aVar.VA);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(au.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(au.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
