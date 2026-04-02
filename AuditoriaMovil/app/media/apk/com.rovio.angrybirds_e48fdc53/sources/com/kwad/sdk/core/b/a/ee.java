package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.b;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ee implements com.kwad.sdk.core.d<b.C0219b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.C0219b c0219b, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0219b.packageName = jSONObject.optString(DBDefinition.PACKAGE_NAME);
        if (c0219b.packageName == JSONObject.NULL) {
            c0219b.packageName = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.C0219b c0219b, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c0219b.packageName != null && !c0219b.packageName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, c0219b.packageName);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.C0219b c0219b, JSONObject jSONObject) {
        a2(c0219b, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.C0219b c0219b, JSONObject jSONObject) {
        return b2(c0219b, jSONObject);
    }
}
