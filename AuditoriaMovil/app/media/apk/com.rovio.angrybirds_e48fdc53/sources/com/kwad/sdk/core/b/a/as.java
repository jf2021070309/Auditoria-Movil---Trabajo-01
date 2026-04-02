package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.am;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class as implements com.kwad.sdk.core.d<am.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(am.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.appName = jSONObject.optString("appName");
        if (bVar.appName == JSONObject.NULL) {
            bVar.appName = "";
        }
        bVar.UD = jSONObject.optString("pkgName");
        if (bVar.UD == JSONObject.NULL) {
            bVar.UD = "";
        }
        bVar.version = jSONObject.optString("version");
        if (bVar.version == JSONObject.NULL) {
            bVar.version = "";
        }
        bVar.versionCode = jSONObject.optInt("versionCode");
        bVar.Vp = jSONObject.optLong("appSize");
        bVar.UF = jSONObject.optString("md5");
        if (bVar.UF == JSONObject.NULL) {
            bVar.UF = "";
        }
        bVar.url = jSONObject.optString("url");
        if (bVar.url == JSONObject.NULL) {
            bVar.url = "";
        }
        bVar.icon = jSONObject.optString("icon");
        if (bVar.icon == JSONObject.NULL) {
            bVar.icon = "";
        }
        bVar.qq = jSONObject.optString("desc");
        if (bVar.qq == JSONObject.NULL) {
            bVar.qq = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(am.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.appName != null && !bVar.appName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appName", bVar.appName);
        }
        if (bVar.UD != null && !bVar.UD.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pkgName", bVar.UD);
        }
        if (bVar.version != null && !bVar.version.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "version", bVar.version);
        }
        if (bVar.versionCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "versionCode", bVar.versionCode);
        }
        if (bVar.Vp != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appSize", bVar.Vp);
        }
        if (bVar.UF != null && !bVar.UF.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "md5", bVar.UF);
        }
        if (bVar.url != null && !bVar.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", bVar.url);
        }
        if (bVar.icon != null && !bVar.icon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "icon", bVar.icon);
        }
        if (bVar.qq != null && !bVar.qq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "desc", bVar.qq);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(am.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(am.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
