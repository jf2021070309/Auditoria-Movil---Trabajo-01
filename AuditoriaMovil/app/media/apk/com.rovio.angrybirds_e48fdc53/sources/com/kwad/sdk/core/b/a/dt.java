package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.f;
import com.vungle.publisher.VungleAdActivity;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dt implements com.kwad.sdk.core.d<f.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(f.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.TA = jSONObject.optInt("playableSrc");
        bVar.TB = jSONObject.optInt("isMiddleEnd");
        bVar.KX = jSONObject.optInt(VungleAdActivity.AD_TYPE_EXTRA_KEY);
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(f.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.TA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playableSrc", bVar.TA);
        }
        if (bVar.TB != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isMiddleEnd", bVar.TB);
        }
        if (bVar.KX != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, VungleAdActivity.AD_TYPE_EXTRA_KEY, bVar.KX);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(f.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(f.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
