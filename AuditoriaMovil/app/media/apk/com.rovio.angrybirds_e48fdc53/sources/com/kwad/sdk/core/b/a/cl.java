package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cl implements com.kwad.sdk.core.d<com.kwad.sdk.core.request.model.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.amJ = jSONObject.optString("imei");
        if (bVar.amJ == JSONObject.NULL) {
            bVar.amJ = "";
        }
        bVar.atU = jSONObject.optString("imei1");
        if (bVar.atU == JSONObject.NULL) {
            bVar.atU = "";
        }
        bVar.atV = jSONObject.optString("imei2");
        if (bVar.atV == JSONObject.NULL) {
            bVar.atV = "";
        }
        bVar.atW = jSONObject.optString("meid");
        if (bVar.atW == JSONObject.NULL) {
            bVar.atW = "";
        }
        bVar.amK = jSONObject.optString("oaid");
        if (bVar.amK == JSONObject.NULL) {
            bVar.amK = "";
        }
        bVar.atX = jSONObject.optString("appMkt");
        if (bVar.atX == JSONObject.NULL) {
            bVar.atX = "";
        }
        bVar.atY = jSONObject.optString("appMktParam");
        if (bVar.atY == JSONObject.NULL) {
            bVar.atY = "";
        }
        bVar.Qc = jSONObject.optString("romName");
        if (bVar.Qc == JSONObject.NULL) {
            bVar.Qc = "";
        }
        bVar.Us = jSONObject.optInt("osType");
        bVar.Uu = jSONObject.optInt("osApi");
        bVar.atZ = jSONObject.optString("osVersion");
        if (bVar.atZ == JSONObject.NULL) {
            bVar.atZ = "";
        }
        bVar.Uv = jSONObject.optString(com.umeng.analytics.pro.bg.N);
        if (bVar.Uv == JSONObject.NULL) {
            bVar.Uv = "";
        }
        bVar.Ux = jSONObject.optInt("screenWidth");
        bVar.Uy = jSONObject.optInt("screenHeight");
        bVar.aua = jSONObject.optInt("deviceWidth");
        bVar.aub = jSONObject.optInt("deviceHeight");
        bVar.auc = jSONObject.optString("androidId");
        if (bVar.auc == JSONObject.NULL) {
            bVar.auc = "";
        }
        bVar.aud = jSONObject.optString("deviceId");
        if (bVar.aud == JSONObject.NULL) {
            bVar.aud = "";
        }
        bVar.aue = jSONObject.optString("deviceVendor");
        if (bVar.aue == JSONObject.NULL) {
            bVar.aue = "";
        }
        bVar.auf = jSONObject.optInt("platform");
        bVar.aug = jSONObject.optString("deviceModel");
        if (bVar.aug == JSONObject.NULL) {
            bVar.aug = "";
        }
        bVar.Ur = jSONObject.optString("deviceBrand");
        if (bVar.Ur == JSONObject.NULL) {
            bVar.Ur = "";
        }
        bVar.auh = jSONObject.optString("deviceSig");
        if (bVar.auh == JSONObject.NULL) {
            bVar.auh = "";
        }
        bVar.aui = jSONObject.optString("eGid");
        if (bVar.aui == JSONObject.NULL) {
            bVar.aui = "";
        }
        bVar.auj = jSONObject.optJSONArray("appPackageName");
        bVar.auk = jSONObject.optString("arch");
        if (bVar.auk == JSONObject.NULL) {
            bVar.auk = "";
        }
        bVar.aul = jSONObject.optInt("screenDirection");
        bVar.aum = jSONObject.optString("kwaiVersionName");
        if (bVar.aum == JSONObject.NULL) {
            bVar.aum = "";
        }
        bVar.aun = jSONObject.optString("kwaiNebulaVersionName");
        if (bVar.aun == JSONObject.NULL) {
            bVar.aun = "";
        }
        bVar.auo = jSONObject.optString("wechatVersionName");
        if (bVar.auo == JSONObject.NULL) {
            bVar.auo = "";
        }
        bVar.aup = jSONObject.optLong("sourceFlag");
        bVar.auq = jSONObject.optString("systemBootTime");
        if (bVar.auq == JSONObject.NULL) {
            bVar.auq = "";
        }
        bVar.aur = jSONObject.optString("systemUpdateTime");
        if (bVar.aur == JSONObject.NULL) {
            bVar.aur = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.amJ != null && !bVar.amJ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei", bVar.amJ);
        }
        if (bVar.atU != null && !bVar.atU.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei1", bVar.atU);
        }
        if (bVar.atV != null && !bVar.atV.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei2", bVar.atV);
        }
        if (bVar.atW != null && !bVar.atW.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "meid", bVar.atW);
        }
        if (bVar.amK != null && !bVar.amK.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "oaid", bVar.amK);
        }
        if (bVar.atX != null && !bVar.atX.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appMkt", bVar.atX);
        }
        if (bVar.atY != null && !bVar.atY.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appMktParam", bVar.atY);
        }
        if (bVar.Qc != null && !bVar.Qc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "romName", bVar.Qc);
        }
        if (bVar.Us != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osType", bVar.Us);
        }
        if (bVar.Uu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osApi", bVar.Uu);
        }
        if (bVar.atZ != null && !bVar.atZ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osVersion", bVar.atZ);
        }
        if (bVar.Uv != null && !bVar.Uv.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.umeng.analytics.pro.bg.N, bVar.Uv);
        }
        if (bVar.Ux != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenWidth", bVar.Ux);
        }
        if (bVar.Uy != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenHeight", bVar.Uy);
        }
        if (bVar.aua != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceWidth", bVar.aua);
        }
        if (bVar.aub != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceHeight", bVar.aub);
        }
        if (bVar.auc != null && !bVar.auc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "androidId", bVar.auc);
        }
        if (bVar.aud != null && !bVar.aud.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceId", bVar.aud);
        }
        if (bVar.aue != null && !bVar.aue.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceVendor", bVar.aue);
        }
        if (bVar.auf != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "platform", bVar.auf);
        }
        if (bVar.aug != null && !bVar.aug.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceModel", bVar.aug);
        }
        if (bVar.Ur != null && !bVar.Ur.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceBrand", bVar.Ur);
        }
        if (bVar.auh != null && !bVar.auh.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceSig", bVar.auh);
        }
        if (bVar.aui != null && !bVar.aui.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "eGid", bVar.aui);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appPackageName", bVar.auj);
        if (bVar.auk != null && !bVar.auk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "arch", bVar.auk);
        }
        if (bVar.aul != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenDirection", bVar.aul);
        }
        if (bVar.aum != null && !bVar.aum.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "kwaiVersionName", bVar.aum);
        }
        if (bVar.aun != null && !bVar.aun.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "kwaiNebulaVersionName", bVar.aun);
        }
        if (bVar.auo != null && !bVar.auo.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "wechatVersionName", bVar.auo);
        }
        if (bVar.aup != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sourceFlag", bVar.aup);
        }
        if (bVar.auq != null && !bVar.auq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemBootTime", bVar.auq);
        }
        if (bVar.aur != null && !bVar.aur.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemUpdateTime", bVar.aur);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
