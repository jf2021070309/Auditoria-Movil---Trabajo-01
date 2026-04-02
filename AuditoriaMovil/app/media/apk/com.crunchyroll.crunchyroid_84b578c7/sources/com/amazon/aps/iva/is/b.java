package com.amazon.aps.iva.is;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: BaseNestedAnalyticsProperty.kt */
/* loaded from: classes2.dex */
public abstract class b extends a {
    private final transient String topLevelPropertyName;

    public b(String str) {
        this.topLevelPropertyName = str;
    }

    @Override // com.amazon.aps.iva.is.a
    public final Map<String, Map<String, Object>> a() {
        String str = this.topLevelPropertyName;
        Type type = com.amazon.aps.iva.gs.c.a;
        Gson gson = com.amazon.aps.iva.gs.c.b;
        Object fromJson = gson.fromJson(gson.toJson(this), com.amazon.aps.iva.gs.c.a);
        j.e(fromJson, "gson.fromJson(gson.toJson(property), mapType)");
        return k.x(new com.amazon.aps.iva.kb0.j(str, (Map) fromJson));
    }
}
