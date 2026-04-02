package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.core.webview.jshandler.ah;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ev implements com.kwad.sdk.core.d<ah.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ah.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.Vi = jSONObject.optDouble("progress");
        bVar.status = jSONObject.optInt("status");
        bVar.totalBytes = jSONObject.optLong(DBDefinition.TOTAL_BYTES);
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ah.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.Vi != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "progress", bVar.Vi);
        }
        if (bVar.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", bVar.status);
        }
        if (bVar.totalBytes != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.TOTAL_BYTES, bVar.totalBytes);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ah.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ah.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
