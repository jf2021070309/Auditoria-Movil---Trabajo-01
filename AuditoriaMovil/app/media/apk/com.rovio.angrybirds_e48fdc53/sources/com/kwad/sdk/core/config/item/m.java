package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m extends a<Long> {
    public m(String str) {
        this(str, 0L);
    }

    public m(String str, Long l) {
        super(str, l);
    }

    @Override // com.kwad.sdk.core.config.item.b
    /* renamed from: Af */
    public final Long getValue() {
        return (Long) super.getValue();
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        setValue(Long.valueOf(sharedPreferences.getLong(getKey(), zY().longValue())));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        editor.putLong(getKey(), getValue().longValue());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        setValue(jSONObject != null ? Long.valueOf(jSONObject.optLong(getKey(), zY().longValue())) : zY());
    }
}
