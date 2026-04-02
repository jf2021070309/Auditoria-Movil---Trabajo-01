package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.ab;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class je implements com.kwad.sdk.core.d<ab.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ab.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.type = jSONObject.optInt("type");
        aVar.appName = jSONObject.optString("appName");
        if (aVar.appName == JSONObject.NULL) {
            aVar.appName = "";
        }
        aVar.UD = jSONObject.optString("pkgName");
        if (aVar.UD == JSONObject.NULL) {
            aVar.UD = "";
        }
        aVar.version = jSONObject.optString("version");
        if (aVar.version == JSONObject.NULL) {
            aVar.version = "";
        }
        aVar.versionCode = jSONObject.optInt("versionCode");
        aVar.UE = jSONObject.optInt("appSize");
        aVar.UF = jSONObject.optString("md5");
        if (aVar.UF == JSONObject.NULL) {
            aVar.UF = "";
        }
        aVar.url = jSONObject.optString("url");
        if (aVar.url == JSONObject.NULL) {
            aVar.url = "";
        }
        aVar.UG = jSONObject.optString("appLink");
        if (aVar.UG == JSONObject.NULL) {
            aVar.UG = "";
        }
        aVar.icon = jSONObject.optString("icon");
        if (aVar.icon == JSONObject.NULL) {
            aVar.icon = "";
        }
        aVar.qq = jSONObject.optString("desc");
        if (aVar.qq == JSONObject.NULL) {
            aVar.qq = "";
        }
        aVar.appId = jSONObject.optString("appId");
        if (aVar.appId == JSONObject.NULL) {
            aVar.appId = "";
        }
        aVar.UH = jSONObject.optString("marketUri");
        if (aVar.UH == JSONObject.NULL) {
            aVar.UH = "";
        }
        aVar.UI = jSONObject.optBoolean("disableLandingPageDeepLink");
        aVar.UJ = jSONObject.optBoolean("isLandscapeSupported");
        aVar.UK = jSONObject.optBoolean("isFromLive");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ab.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.type != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", aVar.type);
        }
        if (aVar.appName != null && !aVar.appName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appName", aVar.appName);
        }
        if (aVar.UD != null && !aVar.UD.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pkgName", aVar.UD);
        }
        if (aVar.version != null && !aVar.version.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "version", aVar.version);
        }
        if (aVar.versionCode != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "versionCode", aVar.versionCode);
        }
        if (aVar.UE != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appSize", aVar.UE);
        }
        if (aVar.UF != null && !aVar.UF.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "md5", aVar.UF);
        }
        if (aVar.url != null && !aVar.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", aVar.url);
        }
        if (aVar.UG != null && !aVar.UG.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appLink", aVar.UG);
        }
        if (aVar.icon != null && !aVar.icon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "icon", aVar.icon);
        }
        if (aVar.qq != null && !aVar.qq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "desc", aVar.qq);
        }
        if (aVar.appId != null && !aVar.appId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", aVar.appId);
        }
        if (aVar.UH != null && !aVar.UH.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "marketUri", aVar.UH);
        }
        if (aVar.UI) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableLandingPageDeepLink", aVar.UI);
        }
        if (aVar.UJ) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isLandscapeSupported", aVar.UJ);
        }
        if (aVar.UK) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isFromLive", aVar.UK);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ab.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ab.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
