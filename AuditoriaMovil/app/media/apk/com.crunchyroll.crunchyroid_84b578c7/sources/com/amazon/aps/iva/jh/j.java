package com.amazon.aps.iva.jh;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.lb0.x;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LanguageOptionsStore.kt */
/* loaded from: classes.dex */
public abstract class j implements i {
    public final Gson a;
    public final com.amazon.aps.iva.xb0.a<String> b;
    public final com.amazon.aps.iva.xb0.a<String> c;
    public final SharedPreferences d;

    public j(Context context, Gson gson, com.amazon.aps.iva.xb0.a<String> aVar, com.amazon.aps.iva.xb0.a<String> aVar2, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(gson, "gson");
        com.amazon.aps.iva.yb0.j.f(aVar2, "readLocalFallbackOptionsJson");
        this.a = gson;
        this.b = aVar;
        this.c = aVar2;
        this.d = context.getSharedPreferences(str, 0);
    }

    public abstract e a(String str, List<String> list);

    public abstract f b(String str, String str2);

    @Override // com.amazon.aps.iva.jh.i
    public final List<f> read() {
        String string = this.d.getString("options", null);
        if (string == null) {
            string = this.b.invoke();
        }
        Object fromJson = this.a.fromJson(string, (Class<Object>) new LinkedHashMap().getClass());
        com.amazon.aps.iva.yb0.j.e(fromJson, "gson.fromJson(\n         …>()::class.java\n        )");
        Map map = (Map) fromJson;
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), b((String) entry.getKey(), (String) entry.getValue()));
        }
        return x.X0(linkedHashMap.values());
    }

    @Override // com.amazon.aps.iva.jh.i
    public final List<e> readFallback() {
        String string = this.d.getString("fallback", null);
        if (string == null) {
            string = this.c.invoke();
        }
        Object fromJson = this.a.fromJson(string, (Class<Object>) new LinkedHashMap().getClass());
        com.amazon.aps.iva.yb0.j.e(fromJson, "gson.fromJson(\n         …>()::class.java\n        )");
        Map map = (Map) fromJson;
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a((String) entry.getKey(), (List) entry.getValue()));
        }
        return x.X0(linkedHashMap.values());
    }

    @Override // com.amazon.aps.iva.jh.i
    public final void store(String str) {
        this.d.edit().putString("options", str).apply();
    }

    @Override // com.amazon.aps.iva.jh.i
    public final void storeFallbacks(String str) {
        this.d.edit().putString("fallbackOptions", str).apply();
    }
}
