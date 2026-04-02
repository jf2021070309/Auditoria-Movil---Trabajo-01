package com.kwad.sdk.core.b.a;

import com.facebook.appevents.AppEventsConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jf implements com.kwad.sdk.core.d<com.kwad.components.core.webview.b.b.w> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.b.b.w wVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        wVar.Xo = jSONObject.optInt("videoCloseTime", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.b.b.w wVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "videoCloseTime", wVar.Xo);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.b.b.w wVar, JSONObject jSONObject) {
        a2(wVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.b.b.w wVar, JSONObject jSONObject) {
        return b2(wVar, jSONObject);
    }
}
