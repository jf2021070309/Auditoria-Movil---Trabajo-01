package com.kwad.sdk.core.b.a;

import com.facebook.internal.AnalyticsEvents;
import com.kwad.components.ad.reward.k;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bo implements com.kwad.sdk.core.d<k.c> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(k.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.style = jSONObject.optInt(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        cVar.title = jSONObject.optString("title");
        if (cVar.title == JSONObject.NULL) {
            cVar.title = "";
        }
        cVar.ql = jSONObject.optString("closeBtnText");
        if (cVar.ql == JSONObject.NULL) {
            cVar.ql = "";
        }
        cVar.qm = jSONObject.optString("continueBtnText");
        if (cVar.qm == JSONObject.NULL) {
            cVar.qm = "";
        }
        cVar.qn = jSONObject.optString("viewDetailText");
        if (cVar.qn == JSONObject.NULL) {
            cVar.qn = "";
        }
        cVar.qo = jSONObject.optString("unWatchedVideoTime");
        if (cVar.qo == JSONObject.NULL) {
            cVar.qo = "";
        }
        cVar.qp = jSONObject.optString(DBDefinition.ICON_URL);
        if (cVar.qp == JSONObject.NULL) {
            cVar.qp = "";
        }
        cVar.qq = jSONObject.optString("desc");
        if (cVar.qq == JSONObject.NULL) {
            cVar.qq = "";
        }
        cVar.qr = jSONObject.optString("descTxt");
        if (cVar.qr == JSONObject.NULL) {
            cVar.qr = "";
        }
        cVar.qs = jSONObject.optString("currentPlayTime");
        if (cVar.qs == JSONObject.NULL) {
            cVar.qs = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(k.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (cVar.style != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, cVar.style);
        }
        if (cVar.title != null && !cVar.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", cVar.title);
        }
        if (cVar.ql != null && !cVar.ql.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeBtnText", cVar.ql);
        }
        if (cVar.qm != null && !cVar.qm.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "continueBtnText", cVar.qm);
        }
        if (cVar.qn != null && !cVar.qn.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "viewDetailText", cVar.qn);
        }
        if (cVar.qo != null && !cVar.qo.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "unWatchedVideoTime", cVar.qo);
        }
        if (cVar.qp != null && !cVar.qp.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.ICON_URL, cVar.qp);
        }
        if (cVar.qq != null && !cVar.qq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "desc", cVar.qq);
        }
        if (cVar.qr != null && !cVar.qr.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "descTxt", cVar.qr);
        }
        if (cVar.qs != null && !cVar.qs.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentPlayTime", cVar.qs);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(k.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(k.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }
}
