package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.a.a;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cm implements com.kwad.sdk.core.d<a.C0213a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0213a c0213a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0213a.url = jSONObject.optString("url");
        if (c0213a.url == JSONObject.NULL) {
            c0213a.url = "";
        }
        c0213a.packageName = jSONObject.optString(DBDefinition.PACKAGE_NAME);
        if (c0213a.packageName == JSONObject.NULL) {
            c0213a.packageName = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0213a c0213a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0213a.url != null && !c0213a.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", c0213a.url);
        }
        if (c0213a.packageName != null && !c0213a.packageName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, c0213a.packageName);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0213a c0213a, JSONObject jSONObject) {
        a2(c0213a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0213a c0213a, JSONObject jSONObject) {
        return b2(c0213a, jSONObject);
    }
}
