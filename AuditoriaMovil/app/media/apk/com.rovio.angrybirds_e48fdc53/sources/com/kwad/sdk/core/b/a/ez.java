package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ez implements com.kwad.sdk.core.d<WebCardVideoPositionHandler.VideoPosition.KSAdJSCornerModel> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebCardVideoPositionHandler.VideoPosition.KSAdJSCornerModel kSAdJSCornerModel, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        kSAdJSCornerModel.topLeft = jSONObject.optDouble("topLeft");
        kSAdJSCornerModel.topRight = jSONObject.optDouble("topRight");
        kSAdJSCornerModel.bottomRight = jSONObject.optDouble("bottomRight");
        kSAdJSCornerModel.bottomLeft = jSONObject.optDouble("bottomLeft");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebCardVideoPositionHandler.VideoPosition.KSAdJSCornerModel kSAdJSCornerModel, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (kSAdJSCornerModel.topLeft != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "topLeft", kSAdJSCornerModel.topLeft);
        }
        if (kSAdJSCornerModel.topRight != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "topRight", kSAdJSCornerModel.topRight);
        }
        if (kSAdJSCornerModel.bottomRight != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bottomRight", kSAdJSCornerModel.bottomRight);
        }
        if (kSAdJSCornerModel.bottomLeft != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bottomLeft", kSAdJSCornerModel.bottomLeft);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebCardVideoPositionHandler.VideoPosition.KSAdJSCornerModel kSAdJSCornerModel, JSONObject jSONObject) {
        a2(kSAdJSCornerModel, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebCardVideoPositionHandler.VideoPosition.KSAdJSCornerModel kSAdJSCornerModel, JSONObject jSONObject) {
        return b2(kSAdJSCornerModel, jSONObject);
    }
}
