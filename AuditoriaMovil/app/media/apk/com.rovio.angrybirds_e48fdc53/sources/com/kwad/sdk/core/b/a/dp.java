package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.ShareConstants;
import com.kwad.components.core.webview.jshandler.c;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dp implements com.kwad.sdk.core.d<c.a> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.data = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA);
        if (aVar.data == JSONObject.NULL) {
            aVar.data = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (aVar.data != null && !aVar.data.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ShareConstants.WEB_DIALOG_PARAM_DATA, aVar.data);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(c.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(c.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }
}
