package com.amazon.aps.iva.is;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: BaseAnalyticsProperty.kt */
/* loaded from: classes2.dex */
public abstract class a {
    public Map<String, Object> a() {
        Type type = com.amazon.aps.iva.gs.b.a;
        Gson gson = com.amazon.aps.iva.gs.b.b;
        Object fromJson = gson.fromJson(gson.toJson(this), com.amazon.aps.iva.gs.b.a);
        j.e(fromJson, "gson.fromJson(gson.toJson(property), mapType)");
        return (Map) fromJson;
    }
}
