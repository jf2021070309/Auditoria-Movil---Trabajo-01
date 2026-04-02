package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.webview.d.a;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dy implements com.kwad.sdk.core.d<a.C0262a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0262a c0262a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0262a.Uk = jSONObject.optString("SDKVersion");
        if (c0262a.Uk == JSONObject.NULL) {
            c0262a.Uk = "";
        }
        c0262a.Ul = jSONObject.optInt("SDKVersionCode");
        c0262a.ass = jSONObject.optString("tkVersion");
        if (c0262a.ass == JSONObject.NULL) {
            c0262a.ass = "";
        }
        c0262a.Um = jSONObject.optString("sdkApiVersion");
        if (c0262a.Um == JSONObject.NULL) {
            c0262a.Um = "";
        }
        c0262a.Un = jSONObject.optInt("sdkApiVersionCode");
        c0262a.Uo = jSONObject.optInt("sdkType");
        c0262a.appVersion = jSONObject.optString("appVersion");
        if (c0262a.appVersion == JSONObject.NULL) {
            c0262a.appVersion = "";
        }
        c0262a.appName = jSONObject.optString("appName");
        if (c0262a.appName == JSONObject.NULL) {
            c0262a.appName = "";
        }
        c0262a.appId = jSONObject.optString("appId");
        if (c0262a.appId == JSONObject.NULL) {
            c0262a.appId = "";
        }
        c0262a.aze = jSONObject.optString("globalId");
        if (c0262a.aze == JSONObject.NULL) {
            c0262a.aze = "";
        }
        c0262a.aui = jSONObject.optString("eGid");
        if (c0262a.aui == JSONObject.NULL) {
            c0262a.aui = "";
        }
        c0262a.auh = jSONObject.optString("deviceSig");
        if (c0262a.auh == JSONObject.NULL) {
            c0262a.auh = "";
        }
        c0262a.Up = jSONObject.optString("networkType");
        if (c0262a.Up == JSONObject.NULL) {
            c0262a.Up = "";
        }
        c0262a.Uq = jSONObject.optString("manufacturer");
        if (c0262a.Uq == JSONObject.NULL) {
            c0262a.Uq = "";
        }
        c0262a.model = jSONObject.optString("model");
        if (c0262a.model == JSONObject.NULL) {
            c0262a.model = "";
        }
        c0262a.Ur = jSONObject.optString("deviceBrand");
        if (c0262a.Ur == JSONObject.NULL) {
            c0262a.Ur = "";
        }
        c0262a.Us = jSONObject.optInt("osType");
        c0262a.Ut = jSONObject.optString("systemVersion");
        if (c0262a.Ut == JSONObject.NULL) {
            c0262a.Ut = "";
        }
        c0262a.Uu = jSONObject.optInt("osApi");
        c0262a.Uv = jSONObject.optString(com.umeng.analytics.pro.bg.N);
        if (c0262a.Uv == JSONObject.NULL) {
            c0262a.Uv = "";
        }
        c0262a.Uw = jSONObject.optString("locale");
        if (c0262a.Uw == JSONObject.NULL) {
            c0262a.Uw = "";
        }
        c0262a.azf = jSONObject.optString("uuid");
        if (c0262a.azf == JSONObject.NULL) {
            c0262a.azf = "";
        }
        c0262a.azg = jSONObject.optBoolean("isDynamic");
        c0262a.Ux = jSONObject.optInt("screenWidth");
        c0262a.Uy = jSONObject.optInt("screenHeight");
        c0262a.amJ = jSONObject.optString("imei");
        if (c0262a.amJ == JSONObject.NULL) {
            c0262a.amJ = "";
        }
        c0262a.amK = jSONObject.optString("oaid");
        if (c0262a.amK == JSONObject.NULL) {
            c0262a.amK = "";
        }
        c0262a.auc = jSONObject.optString("androidId");
        if (c0262a.auc == JSONObject.NULL) {
            c0262a.auc = "";
        }
        c0262a.auv = jSONObject.optString("mac");
        if (c0262a.auv == JSONObject.NULL) {
            c0262a.auv = "";
        }
        c0262a.Uz = jSONObject.optInt("statusBarHeight");
        c0262a.UA = jSONObject.optInt("titleBarHeight");
        c0262a.azh = jSONObject.optString("bridgeVersion");
        if (c0262a.azh == JSONObject.NULL) {
            c0262a.azh = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0262a c0262a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0262a.Uk != null && !c0262a.Uk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersion", c0262a.Uk);
        }
        if (c0262a.Ul != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersionCode", c0262a.Ul);
        }
        if (c0262a.ass != null && !c0262a.ass.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tkVersion", c0262a.ass);
        }
        if (c0262a.Um != null && !c0262a.Um.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersion", c0262a.Um);
        }
        if (c0262a.Un != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersionCode", c0262a.Un);
        }
        if (c0262a.Uo != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", c0262a.Uo);
        }
        if (c0262a.appVersion != null && !c0262a.appVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appVersion", c0262a.appVersion);
        }
        if (c0262a.appName != null && !c0262a.appName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appName", c0262a.appName);
        }
        if (c0262a.appId != null && !c0262a.appId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", c0262a.appId);
        }
        if (c0262a.aze != null && !c0262a.aze.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "globalId", c0262a.aze);
        }
        if (c0262a.aui != null && !c0262a.aui.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "eGid", c0262a.aui);
        }
        if (c0262a.auh != null && !c0262a.auh.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceSig", c0262a.auh);
        }
        if (c0262a.Up != null && !c0262a.Up.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "networkType", c0262a.Up);
        }
        if (c0262a.Uq != null && !c0262a.Uq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "manufacturer", c0262a.Uq);
        }
        if (c0262a.model != null && !c0262a.model.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "model", c0262a.model);
        }
        if (c0262a.Ur != null && !c0262a.Ur.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceBrand", c0262a.Ur);
        }
        if (c0262a.Us != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osType", c0262a.Us);
        }
        if (c0262a.Ut != null && !c0262a.Ut.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemVersion", c0262a.Ut);
        }
        if (c0262a.Uu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osApi", c0262a.Uu);
        }
        if (c0262a.Uv != null && !c0262a.Uv.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.umeng.analytics.pro.bg.N, c0262a.Uv);
        }
        if (c0262a.Uw != null && !c0262a.Uw.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "locale", c0262a.Uw);
        }
        if (c0262a.azf != null && !c0262a.azf.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "uuid", c0262a.azf);
        }
        if (c0262a.azg) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isDynamic", c0262a.azg);
        }
        if (c0262a.Ux != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenWidth", c0262a.Ux);
        }
        if (c0262a.Uy != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenHeight", c0262a.Uy);
        }
        if (c0262a.amJ != null && !c0262a.amJ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei", c0262a.amJ);
        }
        if (c0262a.amK != null && !c0262a.amK.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "oaid", c0262a.amK);
        }
        if (c0262a.auc != null && !c0262a.auc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "androidId", c0262a.auc);
        }
        if (c0262a.auv != null && !c0262a.auv.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mac", c0262a.auv);
        }
        if (c0262a.Uz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "statusBarHeight", c0262a.Uz);
        }
        if (c0262a.UA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "titleBarHeight", c0262a.UA);
        }
        if (c0262a.azh != null && !c0262a.azh.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bridgeVersion", c0262a.azh);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0262a c0262a, JSONObject jSONObject) {
        a2(c0262a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0262a c0262a, JSONObject jSONObject) {
        return b2(c0262a, jSONObject);
    }
}
