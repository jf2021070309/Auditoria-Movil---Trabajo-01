package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h extends b<a> {

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public String amJ = "";
        public String amK = "";
    }

    public h() {
        super("idMapping", new a());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        a value = getValue();
        if (value == null) {
            value = new a();
        }
        String string = sharedPreferences.getString(getKey(), "");
        if (!TextUtils.isEmpty(string)) {
            try {
                value.parseJson(new JSONObject(cw(string)));
            } catch (JSONException e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            }
        }
        setValue(value);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        if (getValue() == null || getValue().toJson() == null) {
            editor.putString(getKey(), "");
            return;
        }
        editor.putString(getKey(), cv(getValue().toJson().toString()));
    }

    public final String getImei() {
        a value = getValue();
        return (value == null || TextUtils.isEmpty(value.amJ)) ? "" : value.amJ;
    }

    public final String getOaid() {
        a value = getValue();
        return (value == null || TextUtils.isEmpty(value.amK)) ? "" : value.amK;
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(getKey());
        if (optJSONObject == null) {
            return;
        }
        a aVar = new a();
        aVar.parseJson(optJSONObject);
        setValue(aVar);
    }
}
