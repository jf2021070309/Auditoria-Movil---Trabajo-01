package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.scene.URLPackage;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ja implements com.kwad.sdk.core.d<URLPackage> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(URLPackage uRLPackage, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        uRLPackage.page = jSONObject.optInt("page");
        uRLPackage.identity = jSONObject.optString("identity");
        if (uRLPackage.identity == JSONObject.NULL) {
            uRLPackage.identity = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(URLPackage uRLPackage, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (uRLPackage.page != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "page", uRLPackage.page);
        }
        if (uRLPackage.identity != null && !uRLPackage.identity.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "identity", uRLPackage.identity);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(URLPackage uRLPackage, JSONObject jSONObject) {
        a2(uRLPackage, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(URLPackage uRLPackage, JSONObject jSONObject) {
        return b2(uRLPackage, jSONObject);
    }
}
