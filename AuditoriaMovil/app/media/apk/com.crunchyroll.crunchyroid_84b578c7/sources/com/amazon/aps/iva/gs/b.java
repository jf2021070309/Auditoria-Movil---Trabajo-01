package com.amazon.aps.iva.gs;

import com.amazon.aps.iva.yb0.j;
import com.ellation.analytics.internal.AnalyticsEnumTypeAdapterFactory;
import com.ellation.analytics.internal.AnalyticsFlattenDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: AnalyticsPropertyMapper.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final Type a;
    public static final Gson b;

    /* compiled from: AnalyticsPropertyMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends TypeToken<Map<String, ? extends Object>> {
    }

    static {
        Type type = new a().getType();
        a = type;
        Gson create = new GsonBuilder().registerTypeAdapterFactory(new AnalyticsEnumTypeAdapterFactory()).registerTypeAdapter(type, new AnalyticsFlattenDeserializer()).create();
        j.e(create, "GsonBuilder()\n          …())\n            .create()");
        b = create;
    }
}
