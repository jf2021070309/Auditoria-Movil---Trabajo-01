package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.kwad.components.core.webview.jshandler.q;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q implements com.kwad.sdk.core.d<q.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(q.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.creativeId = jSONObject.optLong("creativeId", new Long(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE).longValue());
        aVar.adStyle = jSONObject.optInt("adStyle", new Integer(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE).intValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(q.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", aVar.creativeId);
        com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", aVar.adStyle);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(q.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(q.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
