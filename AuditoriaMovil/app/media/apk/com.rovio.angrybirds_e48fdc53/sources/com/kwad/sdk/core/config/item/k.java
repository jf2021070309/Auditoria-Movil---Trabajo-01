package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k extends a<Integer> {
    public k(String str, Integer num) {
        super(str, num);
    }

    public final boolean Ad() {
        return getValue().intValue() == 1;
    }

    @Override // com.kwad.sdk.core.config.item.b
    /* renamed from: Ae */
    public final Integer getValue() {
        return (Integer) super.getValue();
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        setValue(Integer.valueOf(sharedPreferences.getInt(getKey(), zY().intValue())));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        editor.putInt(getKey(), getValue().intValue());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        setValue(jSONObject != null ? Integer.valueOf(jSONObject.optInt(getKey(), zY().intValue())) : zY());
    }
}
