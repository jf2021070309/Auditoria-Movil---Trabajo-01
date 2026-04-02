package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hi implements com.kwad.sdk.core.d<AdMatrixInfo.RotateInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.RotateInfo rotateInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        rotateInfo.title = jSONObject.optString("title");
        if (rotateInfo.title == JSONObject.NULL) {
            rotateInfo.title = "";
        }
        rotateInfo.subTitle = jSONObject.optString("subTitle");
        if (rotateInfo.subTitle == JSONObject.NULL) {
            rotateInfo.subTitle = "";
        }
        rotateInfo.downloadTexts = new AdMatrixInfo.DownloadTexts();
        rotateInfo.downloadTexts.parseJson(jSONObject.optJSONObject("downloadTexts"));
        rotateInfo.x = new AdMatrixInfo.RotateDegreeInfo();
        rotateInfo.x.parseJson(jSONObject.optJSONObject("x"));
        rotateInfo.y = new AdMatrixInfo.RotateDegreeInfo();
        rotateInfo.y.parseJson(jSONObject.optJSONObject("y"));
        rotateInfo.z = new AdMatrixInfo.RotateDegreeInfo();
        rotateInfo.z.parseJson(jSONObject.optJSONObject(com.umeng.analytics.pro.bg.aD));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.RotateInfo rotateInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (rotateInfo.title != null && !rotateInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", rotateInfo.title);
        }
        if (rotateInfo.subTitle != null && !rotateInfo.subTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "subTitle", rotateInfo.subTitle);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "downloadTexts", rotateInfo.downloadTexts);
        com.kwad.sdk.utils.t.a(jSONObject, "x", rotateInfo.x);
        com.kwad.sdk.utils.t.a(jSONObject, "y", rotateInfo.y);
        com.kwad.sdk.utils.t.a(jSONObject, com.umeng.analytics.pro.bg.aD, rotateInfo.z);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.RotateInfo rotateInfo, JSONObject jSONObject) {
        a2(rotateInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.RotateInfo rotateInfo, JSONObject jSONObject) {
        return b2(rotateInfo, jSONObject);
    }
}
