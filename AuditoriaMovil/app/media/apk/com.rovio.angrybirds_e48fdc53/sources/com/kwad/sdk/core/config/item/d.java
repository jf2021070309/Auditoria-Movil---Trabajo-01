package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends a<Boolean> {
    public d(String str, boolean z) {
        super(str, Boolean.valueOf(z));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        setValue(Boolean.valueOf(sharedPreferences.getBoolean(getKey(), zY().booleanValue())));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        editor.putBoolean(getKey(), getValue().booleanValue());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        setValue(jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean(getKey(), zY().booleanValue())) : zY());
    }

    @Override // com.kwad.sdk.core.config.item.b
    /* renamed from: zZ */
    public final Boolean getValue() {
        return (Boolean) super.getValue();
    }
}
