package com.ellation.analytics.internal;

import com.amazon.aps.iva.gs.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;
/* compiled from: AnalyticsEnumTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/analytics/internal/AnalyticsEnumTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AnalyticsEnumTypeAdapterFactory implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        j.f(gson, "gson");
        j.f(typeToken, "type");
        if (typeToken.getRawType().isEnum()) {
            return new a();
        }
        return null;
    }
}
