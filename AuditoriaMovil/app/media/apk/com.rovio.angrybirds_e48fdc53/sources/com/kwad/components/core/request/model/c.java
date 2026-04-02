package com.kwad.components.core.request.model;

import com.kwad.sdk.core.scene.URLPackage;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c implements com.kwad.sdk.core.b {
    public long Qs;
    public long photoId;

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "photoId", this.photoId);
        t.putValue(jSONObject, URLPackage.KEY_AUTHOR_ID, this.Qs);
        return jSONObject;
    }
}
