package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g extends a<Float> {
    public g(String str, float f) {
        super(str, Float.valueOf(f));
    }

    @Override // com.kwad.sdk.core.config.item.b
    /* renamed from: Ac */
    public final Float getValue() {
        return (Float) super.getValue();
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        setValue(Float.valueOf(sharedPreferences.getFloat(getKey(), zY().floatValue())));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        editor.putFloat(getKey(), getValue().floatValue());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        setValue(jSONObject != null ? Float.valueOf((float) jSONObject.optDouble(getKey(), zY().floatValue())) : zY());
    }
}
