package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n extends b<String> {
    private static volatile String[] amO;

    public n(String str, String str2) {
        super(str, str2);
        amO = null;
    }

    public static boolean P(long j) {
        String[] strArr;
        if (amO == null) {
            return false;
        }
        for (String str : amO) {
            if (str != null && String.valueOf(j).equals(str.trim())) {
                return true;
            }
        }
        return false;
    }

    private static void cx(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        amO = str.split(",");
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(getKey(), zY());
        setValue(string);
        cx(string);
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        editor.putString(getKey(), getValue());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        if (jSONObject == null) {
            setValue(zY());
            return;
        }
        String optString = jSONObject.optString(getKey(), zY());
        setValue(optString);
        cx(optString);
    }
}
