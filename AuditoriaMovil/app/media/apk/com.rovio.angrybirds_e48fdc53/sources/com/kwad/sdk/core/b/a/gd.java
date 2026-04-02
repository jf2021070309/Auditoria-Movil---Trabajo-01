package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gd implements com.kwad.sdk.core.d<com.kwad.sdk.h.a.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.h.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.aCj = jSONObject.optString("packageId");
        if (bVar.aCj == JSONObject.NULL) {
            bVar.aCj = "";
        }
        bVar.aCk = jSONObject.optString("zipFileName");
        if (bVar.aCk == JSONObject.NULL) {
            bVar.aCk = "";
        }
        bVar.aCl = jSONObject.optString("zipPath");
        if (bVar.aCl == JSONObject.NULL) {
            bVar.aCl = "";
        }
        bVar.packageUrl = jSONObject.optString("packageUrl");
        if (bVar.packageUrl == JSONObject.NULL) {
            bVar.packageUrl = "";
        }
        bVar.version = jSONObject.optString("version");
        if (bVar.version == JSONObject.NULL) {
            bVar.version = "";
        }
        bVar.ags = jSONObject.optString("checksum");
        if (bVar.ags == JSONObject.NULL) {
            bVar.ags = "";
        }
        bVar.loadType = jSONObject.optInt("loadType");
        bVar.packageType = jSONObject.optInt("packageType");
        bVar.aCn = jSONObject.optBoolean("public");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.h.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.aCj != null && !bVar.aCj.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "packageId", bVar.aCj);
        }
        if (bVar.aCk != null && !bVar.aCk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "zipFileName", bVar.aCk);
        }
        if (bVar.aCl != null && !bVar.aCl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "zipPath", bVar.aCl);
        }
        if (bVar.packageUrl != null && !bVar.packageUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "packageUrl", bVar.packageUrl);
        }
        if (bVar.version != null && !bVar.version.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "version", bVar.version);
        }
        if (bVar.ags != null && !bVar.ags.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "checksum", bVar.ags);
        }
        if (bVar.loadType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "loadType", bVar.loadType);
        }
        if (bVar.packageType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "packageType", bVar.packageType);
        }
        if (bVar.aCn) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "public", bVar.aCn);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.h.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.h.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
