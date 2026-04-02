package com.kwad.sdk.core.webview.c;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.b {
    public String azb;
    public String azc;
    public String data;

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.azb = jSONObject.optString(NativeProtocol.WEB_DIALOG_ACTION);
        this.data = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_DATA);
        this.azc = jSONObject.optString("callback");
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, NativeProtocol.WEB_DIALOG_ACTION, this.azb);
        t.putValue(jSONObject, ShareConstants.WEB_DIALOG_PARAM_DATA, this.data);
        t.putValue(jSONObject, "callback", this.azc);
        return jSONObject;
    }
}
