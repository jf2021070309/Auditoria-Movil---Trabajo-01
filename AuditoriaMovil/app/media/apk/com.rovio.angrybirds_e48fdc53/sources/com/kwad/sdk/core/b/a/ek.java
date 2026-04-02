package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.i;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ek implements com.kwad.sdk.core.d<i.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(i.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.TD = jSONObject.optString("apkUrl");
        if (aVar.TD == JSONObject.NULL) {
            aVar.TD = "";
        }
        aVar.packageName = jSONObject.optString(DBDefinition.PACKAGE_NAME);
        if (aVar.packageName == JSONObject.NULL) {
            aVar.packageName = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(i.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.TD != null && !aVar.TD.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apkUrl", aVar.TD);
        }
        if (aVar.packageName != null && !aVar.packageName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, aVar.packageName);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(i.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(i.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
