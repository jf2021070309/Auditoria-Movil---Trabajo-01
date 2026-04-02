package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l extends b<String> {
    private boolean amN;

    public l(String str, String str2) {
        super(str, str2);
        this.amN = false;
    }

    public l(String str, String str2, boolean z) {
        this(str, str2);
        this.amN = false;
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        if (this.amN) {
            setValue(sharedPreferences.getString(getKey(), zY()));
        }
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        if (this.amN) {
            editor.putString(getKey(), getValue());
        }
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final String getValue() {
        return (String) super.getValue();
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject;
        setValue((jSONObject == null || (optJSONObject = jSONObject.optJSONObject(getKey())) == null) ? zY() : optJSONObject.toString());
    }
}
