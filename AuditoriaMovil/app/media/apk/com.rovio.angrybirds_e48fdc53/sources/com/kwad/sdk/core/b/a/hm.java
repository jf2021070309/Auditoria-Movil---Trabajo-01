package com.kwad.sdk.core.b.a;

import com.facebook.internal.NativeProtocol;
import com.kwad.sdk.core.scene.URLPackage;
import com.kwad.sdk.internal.api.AdLabelImpl;
import com.kwad.sdk.internal.api.NativeAdExtraDataImpl;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.internal.api.SplashExtraDataImpl;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hm implements com.kwad.sdk.core.d<SceneImpl> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(SceneImpl sceneImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        sceneImpl.urlPackage = new URLPackage();
        sceneImpl.urlPackage.parseJson(jSONObject.optJSONObject("urlPackage"));
        sceneImpl.posId = jSONObject.optLong("posId");
        sceneImpl.entryScene = jSONObject.optLong("entryScene");
        sceneImpl.adNum = jSONObject.optInt("adNum");
        sceneImpl.action = jSONObject.optInt(NativeProtocol.WEB_DIALOG_ACTION);
        sceneImpl.width = jSONObject.optInt("width");
        sceneImpl.height = jSONObject.optInt("height");
        sceneImpl.adStyle = jSONObject.optInt("adStyle");
        sceneImpl.screenOrientation = jSONObject.optInt("screenOrientation");
        sceneImpl.mKsAdLabel = new AdLabelImpl();
        sceneImpl.mKsAdLabel.parseJson(jSONObject.optJSONObject("mKsAdLabel"));
        sceneImpl.splashExtraData = new SplashExtraDataImpl();
        sceneImpl.splashExtraData.parseJson(jSONObject.optJSONObject("splashExtraData"));
        sceneImpl.nativeAdExtraData = new NativeAdExtraDataImpl();
        sceneImpl.nativeAdExtraData.parseJson(jSONObject.optJSONObject("nativeAdExtraData"));
        sceneImpl.promoteId = jSONObject.optString("promoteId");
        if (sceneImpl.promoteId == JSONObject.NULL) {
            sceneImpl.promoteId = "";
        }
        sceneImpl.comment = jSONObject.optString("comment");
        if (sceneImpl.comment == JSONObject.NULL) {
            sceneImpl.comment = "";
        }
        sceneImpl.userCommRateBuying = jSONObject.optLong("userCommRateBuying");
        sceneImpl.userCommRateSharing = jSONObject.optLong("userCommRateSharing");
        sceneImpl.backUrl = jSONObject.optString("backUrl");
        if (sceneImpl.backUrl == JSONObject.NULL) {
            sceneImpl.backUrl = "";
        }
        sceneImpl.bidResponse = jSONObject.optString("bidResponse");
        if (sceneImpl.bidResponse == JSONObject.NULL) {
            sceneImpl.bidResponse = "";
        }
        sceneImpl.bidResponseV2 = jSONObject.optString("bidResponseV2");
        if (sceneImpl.bidResponseV2 == JSONObject.NULL) {
            sceneImpl.bidResponseV2 = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(SceneImpl sceneImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "urlPackage", sceneImpl.urlPackage);
        if (sceneImpl.posId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posId", sceneImpl.posId);
        }
        if (sceneImpl.entryScene != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "entryScene", sceneImpl.entryScene);
        }
        if (sceneImpl.adNum != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adNum", sceneImpl.adNum);
        }
        if (sceneImpl.action != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, NativeProtocol.WEB_DIALOG_ACTION, sceneImpl.action);
        }
        if (sceneImpl.width != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", sceneImpl.width);
        }
        if (sceneImpl.height != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", sceneImpl.height);
        }
        if (sceneImpl.adStyle != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", sceneImpl.adStyle);
        }
        if (sceneImpl.screenOrientation != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenOrientation", sceneImpl.screenOrientation);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "mKsAdLabel", sceneImpl.mKsAdLabel);
        com.kwad.sdk.utils.t.a(jSONObject, "splashExtraData", sceneImpl.splashExtraData);
        com.kwad.sdk.utils.t.a(jSONObject, "nativeAdExtraData", sceneImpl.nativeAdExtraData);
        if (sceneImpl.promoteId != null && !sceneImpl.promoteId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "promoteId", sceneImpl.promoteId);
        }
        if (sceneImpl.comment != null && !sceneImpl.comment.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "comment", sceneImpl.comment);
        }
        if (sceneImpl.userCommRateBuying != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userCommRateBuying", sceneImpl.userCommRateBuying);
        }
        if (sceneImpl.userCommRateSharing != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userCommRateSharing", sceneImpl.userCommRateSharing);
        }
        if (sceneImpl.backUrl != null && !sceneImpl.backUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "backUrl", sceneImpl.backUrl);
        }
        if (sceneImpl.bidResponse != null && !sceneImpl.bidResponse.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bidResponse", sceneImpl.bidResponse);
        }
        if (sceneImpl.bidResponseV2 != null && !sceneImpl.bidResponseV2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bidResponseV2", sceneImpl.bidResponseV2);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(SceneImpl sceneImpl, JSONObject jSONObject) {
        a2(sceneImpl, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(SceneImpl sceneImpl, JSONObject jSONObject) {
        return b2(sceneImpl, jSONObject);
    }
}
