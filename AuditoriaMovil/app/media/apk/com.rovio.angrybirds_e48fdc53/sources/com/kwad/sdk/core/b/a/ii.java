package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.n;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ii implements com.kwad.sdk.core.d<n.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(n.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.packageName = jSONObject.optString(DBDefinition.PACKAGE_NAME);
        if (bVar.packageName == JSONObject.NULL) {
            bVar.packageName = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(n.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.packageName != null && !bVar.packageName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, bVar.packageName);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(n.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(n.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
