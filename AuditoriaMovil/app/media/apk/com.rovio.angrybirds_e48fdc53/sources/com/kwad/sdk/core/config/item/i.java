package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i extends b<com.kwad.sdk.core.network.idc.a.a> {
    public i() {
        super("idc", new com.kwad.sdk.core.network.idc.a.a());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(getKey())) == null) {
            setValue(zY());
            return;
        }
        com.kwad.sdk.core.network.idc.a.a aVar = new com.kwad.sdk.core.network.idc.a.a();
        aVar.parseJson(optJSONObject);
        setValue(aVar);
    }
}
