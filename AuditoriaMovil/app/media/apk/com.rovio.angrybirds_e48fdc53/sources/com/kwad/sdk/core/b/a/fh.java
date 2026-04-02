package com.kwad.sdk.core.b.a;

import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fh implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.b.a.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.b.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.status = jSONObject.optInt("Status");
        bVar.contentEncoding = jSONObject.optString("Content-Encoding");
        if (bVar.contentEncoding == JSONObject.NULL) {
            bVar.contentEncoding = "";
        }
        bVar.ayT = jSONObject.optString(DownloadUtils.CACHE_CONTROL);
        if (bVar.ayT == JSONObject.NULL) {
            bVar.ayT = "";
        }
        bVar.ayR = jSONObject.optString(DownloadUtils.CONTENT_TYPE);
        if (bVar.ayR == JSONObject.NULL) {
            bVar.ayR = "";
        }
        bVar.ayU = new com.kwad.sdk.core.webview.b.a.a();
        bVar.ayU.parseJson(jSONObject.optJSONObject("headers"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.b.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Status", bVar.status);
        }
        if (bVar.contentEncoding != null && !bVar.contentEncoding.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Content-Encoding", bVar.contentEncoding);
        }
        if (bVar.ayT != null && !bVar.ayT.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DownloadUtils.CACHE_CONTROL, bVar.ayT);
        }
        if (bVar.ayR != null && !bVar.ayR.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DownloadUtils.CONTENT_TYPE, bVar.ayR);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "headers", bVar.ayU);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.b.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.b.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
