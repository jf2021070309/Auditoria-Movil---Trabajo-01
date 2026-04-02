package com.kwad.sdk.core.b.a;

import com.facebook.internal.NativeProtocol;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.core.scene.URLPackage;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eh implements com.kwad.sdk.core.d<ImpInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ImpInfo impInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        impInfo.pageScene = jSONObject.optLong("pageScene");
        impInfo.subPageScene = jSONObject.optLong("subPageScene");
        impInfo.sdkExtraData = jSONObject.optString("sdkExtraData");
        if (impInfo.sdkExtraData == JSONObject.NULL) {
            impInfo.sdkExtraData = "";
        }
        impInfo.posId = jSONObject.optLong("posId");
        impInfo.entryScene = jSONObject.optLong("entryScene");
        impInfo.adNum = jSONObject.optInt("adNum");
        impInfo.action = jSONObject.optInt(NativeProtocol.WEB_DIALOG_ACTION);
        impInfo.width = jSONObject.optInt("width");
        impInfo.height = jSONObject.optInt("height");
        impInfo.cpmBidFloor = jSONObject.optLong("cpmBidFloor");
        impInfo.adStyle = jSONObject.optInt("adStyle");
        impInfo.urlPackage = new URLPackage();
        impInfo.urlPackage.parseJson(jSONObject.optJSONObject("urlPackage"));
        impInfo.promoteId = jSONObject.optString("promoteId");
        if (impInfo.promoteId == JSONObject.NULL) {
            impInfo.promoteId = "";
        }
        impInfo.comment = jSONObject.optString("comment");
        if (impInfo.comment == JSONObject.NULL) {
            impInfo.comment = "";
        }
        impInfo.backUrl = jSONObject.optString("backUrl");
        if (impInfo.backUrl == JSONObject.NULL) {
            impInfo.backUrl = "";
        }
        impInfo.userCommRateBuying = jSONObject.optLong("userCommRateBuying");
        impInfo.userCommRateSharing = jSONObject.optLong("userCommRateSharing");
        impInfo.screenOrientation = jSONObject.optInt("screenOrientation");
        impInfo.extraData = jSONObject.optString("extraData");
        if (impInfo.extraData == JSONObject.NULL) {
            impInfo.extraData = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ImpInfo impInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (impInfo.pageScene != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageScene", impInfo.pageScene);
        }
        if (impInfo.subPageScene != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "subPageScene", impInfo.subPageScene);
        }
        if (impInfo.sdkExtraData != null && !impInfo.sdkExtraData.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkExtraData", impInfo.sdkExtraData);
        }
        if (impInfo.posId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posId", impInfo.posId);
        }
        if (impInfo.entryScene != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "entryScene", impInfo.entryScene);
        }
        if (impInfo.adNum != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adNum", impInfo.adNum);
        }
        if (impInfo.action != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, NativeProtocol.WEB_DIALOG_ACTION, impInfo.action);
        }
        if (impInfo.width != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", impInfo.width);
        }
        if (impInfo.height != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", impInfo.height);
        }
        if (impInfo.cpmBidFloor != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cpmBidFloor", impInfo.cpmBidFloor);
        }
        if (impInfo.adStyle != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", impInfo.adStyle);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "urlPackage", impInfo.urlPackage);
        if (impInfo.promoteId != null && !impInfo.promoteId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "promoteId", impInfo.promoteId);
        }
        if (impInfo.comment != null && !impInfo.comment.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "comment", impInfo.comment);
        }
        if (impInfo.backUrl != null && !impInfo.backUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "backUrl", impInfo.backUrl);
        }
        if (impInfo.userCommRateBuying != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userCommRateBuying", impInfo.userCommRateBuying);
        }
        if (impInfo.userCommRateSharing != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userCommRateSharing", impInfo.userCommRateSharing);
        }
        if (impInfo.screenOrientation != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenOrientation", impInfo.screenOrientation);
        }
        if (impInfo.extraData != null && !impInfo.extraData.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "extraData", impInfo.extraData);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ImpInfo impInfo, JSONObject jSONObject) {
        a2(impInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ImpInfo impInfo, JSONObject jSONObject) {
        return b2(impInfo, jSONObject);
    }
}
