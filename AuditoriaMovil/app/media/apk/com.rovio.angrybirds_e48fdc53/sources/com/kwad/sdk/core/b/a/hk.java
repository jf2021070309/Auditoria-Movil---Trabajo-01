package com.kwad.sdk.core.b.a;

import com.kwad.sdk.i.b;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hk implements com.kwad.sdk.core.d<b.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aDf = jSONObject.optInt("ds");
        aVar.sdkVersion = jSONObject.optString("sv");
        if (aVar.sdkVersion == JSONObject.NULL) {
            aVar.sdkVersion = "";
        }
        aVar.aDg = jSONObject.optString("spv");
        if (aVar.aDg == JSONObject.NULL) {
            aVar.aDg = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.aDf != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ds", aVar.aDf);
        }
        if (aVar.sdkVersion != null && !aVar.sdkVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sv", aVar.sdkVersion);
        }
        if (aVar.aDg != null && !aVar.aDg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "spv", aVar.aDg);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
