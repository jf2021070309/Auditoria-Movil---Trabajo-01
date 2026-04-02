package com.amazon.aps.iva.ys;

import android.content.SharedPreferences;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
/* compiled from: AppConfigModule.kt */
/* loaded from: classes2.dex */
public final class m implements com.amazon.aps.iva.ms.f {
    public final String a;
    public final SharedPreferences b;

    public m(SharedPreferences sharedPreferences, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "environment");
        this.a = str;
        this.b = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.ms.f
    public final void a(String str) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(this.a + "app/configuration", str).apply();
    }

    public final JsonObject b() {
        String string = this.b.getString(defpackage.b.c(new StringBuilder(), this.a, "app/configuration"), null);
        if (string == null) {
            return null;
        }
        return JsonParser.parseString(string).getAsJsonObject();
    }
}
