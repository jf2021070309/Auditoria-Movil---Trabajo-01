package com.amazon.aps.iva.o60;

import android.content.SharedPreferences;
import com.amazon.aps.iva.oe0.q;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: TranslationsStore.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final SharedPreferences a;
    public final Gson b;
    public final String c = "711";

    /* compiled from: TranslationsStore.kt */
    /* loaded from: classes2.dex */
    public static final class a extends TypeToken<Map<String, ? extends Object>> {
    }

    public h(Gson gson, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = gson;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Map<String, ?> all = sharedPreferences.getAll();
        com.amazon.aps.iva.yb0.j.e(all, "store.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            com.amazon.aps.iva.yb0.j.e(key, "key");
            if (!q.i0(key, this.c, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            edit.remove((String) entry2.getKey());
        }
        edit.apply();
    }

    @Override // com.amazon.aps.iva.o60.g
    public final Map<String, Object> a(Locale locale) {
        com.amazon.aps.iva.yb0.j.f(locale, "locale");
        Object fromJson = this.b.fromJson(this.a.getString(locale + "_" + this.c, "{}"), new a().getType());
        com.amazon.aps.iva.yb0.j.e(fromJson, "gson.fromJson(\n         …Any>>() {}.type\n        )");
        return (Map) fromJson;
    }

    @Override // com.amazon.aps.iva.o60.g
    public final void b(Locale locale, Map<String, ? extends Object> map) {
        com.amazon.aps.iva.yb0.j.f(locale, "locale");
        com.amazon.aps.iva.yb0.j.f(map, "translations");
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(locale + "_" + this.c, this.b.toJson(map)).apply();
    }
}
