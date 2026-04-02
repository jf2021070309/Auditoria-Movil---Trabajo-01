package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.kwad.components.core.webview.jshandler.ag;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dx implements com.kwad.sdk.core.d<ag.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ag.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.creativeId = jSONObject.optLong("creativeId", new Long(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE).longValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ag.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", bVar.creativeId);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ag.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ag.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
