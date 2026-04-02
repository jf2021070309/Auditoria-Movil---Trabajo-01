package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e extends b<JSONObject> {
    public e() {
        super(Aa(), new JSONObject());
    }

    private static String Aa() {
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        return (eVar == null || !eVar.getIsExternal()) ? "commercialReportConf" : "commercialExternalReportConf";
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        JSONObject value = getValue();
        if (value == null) {
            value = new JSONObject();
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(sharedPreferences.getString(getKey(), ""));
        } catch (Throwable th) {
        }
        if (jSONObject != null) {
            value = jSONObject;
        }
        setValue(value);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        String key;
        String str;
        if (getValue() != null) {
            key = getKey();
            str = getValue().toString();
        } else {
            key = getKey();
            str = "";
        }
        editor.putString(key, str);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(getKey())) == null) {
            setValue(zY());
        } else {
            setValue(optJSONObject);
        }
    }
}
