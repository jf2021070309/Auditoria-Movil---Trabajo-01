package com.amazon.aps.iva.gs;

import com.amazon.aps.iva.yb0.j;
import com.ellation.analytics.internal.AnalyticsEnumTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: NestedAnalyticsPropertyMapper.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final Type a = new a().getType();
    public static final Gson b;

    /* compiled from: NestedAnalyticsPropertyMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends TypeToken<Map<String, ? extends Object>> {
    }

    static {
        Gson create = new GsonBuilder().registerTypeAdapterFactory(new AnalyticsEnumTypeAdapterFactory()).create();
        j.e(create, "GsonBuilder()\n          …())\n            .create()");
        b = create;
    }
}
