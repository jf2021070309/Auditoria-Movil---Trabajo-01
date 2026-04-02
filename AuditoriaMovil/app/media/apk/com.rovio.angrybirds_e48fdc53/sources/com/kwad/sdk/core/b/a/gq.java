package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.z;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gq implements com.kwad.sdk.core.d<z.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(z.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Uk = jSONObject.optString("SDKVersion");
        if (aVar.Uk == JSONObject.NULL) {
            aVar.Uk = "";
        }
        aVar.Ul = jSONObject.optInt("SDKVersionCode");
        aVar.Um = jSONObject.optString("sdkApiVersion");
        if (aVar.Um == JSONObject.NULL) {
            aVar.Um = "";
        }
        aVar.Un = jSONObject.optInt("sdkApiVersionCode");
        aVar.Uo = jSONObject.optInt("sdkType");
        aVar.appVersion = jSONObject.optString("appVersion");
        if (aVar.appVersion == JSONObject.NULL) {
            aVar.appVersion = "";
        }
        aVar.appName = jSONObject.optString("appName");
        if (aVar.appName == JSONObject.NULL) {
            aVar.appName = "";
        }
        aVar.appId = jSONObject.optString("appId");
        if (aVar.appId == JSONObject.NULL) {
            aVar.appId = "";
        }
        aVar.Up = jSONObject.optString("networkType");
        if (aVar.Up == JSONObject.NULL) {
            aVar.Up = "";
        }
        aVar.Uq = jSONObject.optString("manufacturer");
        if (aVar.Uq == JSONObject.NULL) {
            aVar.Uq = "";
        }
        aVar.model = jSONObject.optString("model");
        if (aVar.model == JSONObject.NULL) {
            aVar.model = "";
        }
        aVar.Ur = jSONObject.optString("deviceBrand");
        if (aVar.Ur == JSONObject.NULL) {
            aVar.Ur = "";
        }
        aVar.Us = jSONObject.optInt("osType");
        aVar.Ut = jSONObject.optString("systemVersion");
        if (aVar.Ut == JSONObject.NULL) {
            aVar.Ut = "";
        }
        aVar.Uu = jSONObject.optInt("osApi");
        aVar.Uv = jSONObject.optString(com.umeng.analytics.pro.bg.N);
        if (aVar.Uv == JSONObject.NULL) {
            aVar.Uv = "";
        }
        aVar.Uw = jSONObject.optString("locale");
        if (aVar.Uw == JSONObject.NULL) {
            aVar.Uw = "";
        }
        aVar.Ux = jSONObject.optInt("screenWidth");
        aVar.Uy = jSONObject.optInt("screenHeight");
        aVar.Uz = jSONObject.optInt("statusBarHeight");
        aVar.UA = jSONObject.optInt("titleBarHeight");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(z.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.Uk != null && !aVar.Uk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersion", aVar.Uk);
        }
        if (aVar.Ul != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersionCode", aVar.Ul);
        }
        if (aVar.Um != null && !aVar.Um.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersion", aVar.Um);
        }
        if (aVar.Un != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersionCode", aVar.Un);
        }
        if (aVar.Uo != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", aVar.Uo);
        }
        if (aVar.appVersion != null && !aVar.appVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appVersion", aVar.appVersion);
        }
        if (aVar.appName != null && !aVar.appName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appName", aVar.appName);
        }
        if (aVar.appId != null && !aVar.appId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", aVar.appId);
        }
        if (aVar.Up != null && !aVar.Up.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "networkType", aVar.Up);
        }
        if (aVar.Uq != null && !aVar.Uq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "manufacturer", aVar.Uq);
        }
        if (aVar.model != null && !aVar.model.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "model", aVar.model);
        }
        if (aVar.Ur != null && !aVar.Ur.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceBrand", aVar.Ur);
        }
        if (aVar.Us != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osType", aVar.Us);
        }
        if (aVar.Ut != null && !aVar.Ut.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemVersion", aVar.Ut);
        }
        if (aVar.Uu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osApi", aVar.Uu);
        }
        if (aVar.Uv != null && !aVar.Uv.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.umeng.analytics.pro.bg.N, aVar.Uv);
        }
        if (aVar.Uw != null && !aVar.Uw.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "locale", aVar.Uw);
        }
        if (aVar.Ux != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenWidth", aVar.Ux);
        }
        if (aVar.Uy != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenHeight", aVar.Uy);
        }
        if (aVar.Uz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "statusBarHeight", aVar.Uz);
        }
        if (aVar.UA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "titleBarHeight", aVar.UA);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(z.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(z.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
