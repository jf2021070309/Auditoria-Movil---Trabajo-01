package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jj implements com.kwad.sdk.core.d<WebCardVideoPositionHandler.VideoPosition> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebCardVideoPositionHandler.VideoPosition videoPosition, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        videoPosition.leftMarginRation = jSONObject.optDouble("leftMarginRation");
        videoPosition.topMarginRation = jSONObject.optDouble("topMarginRation");
        videoPosition.widthRation = jSONObject.optDouble("widthRation");
        videoPosition.heightWidthRation = jSONObject.optDouble("heightWidthRation");
        videoPosition.leftMargin = jSONObject.optInt("leftMargin");
        videoPosition.topMargin = jSONObject.optInt("topMargin");
        videoPosition.width = jSONObject.optInt("width");
        videoPosition.height = jSONObject.optInt("height");
        videoPosition.borderRadius = jSONObject.optInt("borderRadius");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebCardVideoPositionHandler.VideoPosition videoPosition, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (videoPosition.leftMarginRation != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "leftMarginRation", videoPosition.leftMarginRation);
        }
        if (videoPosition.topMarginRation != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "topMarginRation", videoPosition.topMarginRation);
        }
        if (videoPosition.widthRation != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "widthRation", videoPosition.widthRation);
        }
        if (videoPosition.heightWidthRation != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "heightWidthRation", videoPosition.heightWidthRation);
        }
        if (videoPosition.leftMargin != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "leftMargin", videoPosition.leftMargin);
        }
        if (videoPosition.topMargin != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "topMargin", videoPosition.topMargin);
        }
        if (videoPosition.width != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", videoPosition.width);
        }
        if (videoPosition.height != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", videoPosition.height);
        }
        if (videoPosition.borderRadius != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "borderRadius", videoPosition.borderRadius);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebCardVideoPositionHandler.VideoPosition videoPosition, JSONObject jSONObject) {
        a2(videoPosition, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebCardVideoPositionHandler.VideoPosition videoPosition, JSONObject jSONObject) {
        return b2(videoPosition, jSONObject);
    }
}
