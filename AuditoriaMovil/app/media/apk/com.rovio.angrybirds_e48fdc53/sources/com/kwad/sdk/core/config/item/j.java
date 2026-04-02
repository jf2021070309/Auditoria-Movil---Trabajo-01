package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j extends b<a> {

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int amL = 180000;
        public int amM = 90000;
    }

    public j(String str) {
        super(str, new a());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        a value = getValue();
        if (value == null) {
            value = new a();
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(sharedPreferences.getString(getKey(), ""));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
        if (jSONObject != null) {
            value.parseJson(jSONObject);
        }
        setValue(value);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        String key;
        String str;
        if (getValue() == null || getValue().toJson() == null) {
            key = getKey();
            str = "";
        } else {
            key = getKey();
            str = getValue().toJson().toString();
        }
        editor.putString(key, str);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(getKey())) == null) {
            setValue(zY());
            return;
        }
        a aVar = new a();
        aVar.parseJson(optJSONObject);
        setValue(aVar);
    }
}
