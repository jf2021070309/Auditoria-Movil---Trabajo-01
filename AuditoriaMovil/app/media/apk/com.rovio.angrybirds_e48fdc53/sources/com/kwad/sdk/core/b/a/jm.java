package com.kwad.sdk.core.b.a;

import com.kwad.sdk.commercial.model.WebCloseStatus;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jm implements com.kwad.sdk.core.d<WebCloseStatus> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebCloseStatus webCloseStatus, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        webCloseStatus.interactSuccess = jSONObject.optBoolean("interactSuccess");
        webCloseStatus.closeType = jSONObject.optInt("closeType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebCloseStatus webCloseStatus, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (webCloseStatus.interactSuccess) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "interactSuccess", webCloseStatus.interactSuccess);
        }
        if (webCloseStatus.closeType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeType", webCloseStatus.closeType);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebCloseStatus webCloseStatus, JSONObject jSONObject) {
        a2(webCloseStatus, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebCloseStatus webCloseStatus, JSONObject jSONObject) {
        return b2(webCloseStatus, jSONObject);
    }
}
