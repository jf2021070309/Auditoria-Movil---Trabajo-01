package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.facebook.internal.ServerProtocol;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.d.b.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.d.b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Va = jSONObject.optBoolean("clickActionButton");
        aVar.Vc = jSONObject.optInt("area");
        aVar.jI = jSONObject.optInt("itemClickType");
        aVar.azk = jSONObject.optInt("convertPageType", new Integer(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE).intValue());
        aVar.Vd = new com.kwad.sdk.core.webview.d.b.c();
        aVar.Vd.parseJson(jSONObject.optJSONObject("logParam"));
        aVar.JR = jSONObject.optBoolean("needReport", new Boolean(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE).booleanValue());
        aVar.creativeId = jSONObject.optLong("creativeId", new Long(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE).longValue());
        aVar.Ka = jSONObject.optString("liveItemId");
        if (aVar.Ka == JSONObject.NULL) {
            aVar.Ka = "";
        }
        aVar.azl = jSONObject.optInt("sceneType");
        aVar.adStyle = jSONObject.optInt("adStyle", new Integer(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE).intValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.d.b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Va) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clickActionButton", aVar.Va);
        }
        if (aVar.Vc != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "area", aVar.Vc);
        }
        if (aVar.jI != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemClickType", aVar.jI);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "convertPageType", aVar.azk);
        com.kwad.sdk.utils.t.a(jSONObject, "logParam", aVar.Vd);
        com.kwad.sdk.utils.t.putValue(jSONObject, "needReport", aVar.JR);
        com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", aVar.creativeId);
        if (aVar.Ka != null && !aVar.Ka.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "liveItemId", aVar.Ka);
        }
        if (aVar.azl != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sceneType", aVar.azl);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", aVar.adStyle);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.d.b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.d.b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
