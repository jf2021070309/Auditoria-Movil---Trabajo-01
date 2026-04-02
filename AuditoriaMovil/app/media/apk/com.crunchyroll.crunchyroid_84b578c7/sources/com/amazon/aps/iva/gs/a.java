package com.amazon.aps.iva.gs;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
/* compiled from: AnalyticsEnumTypeAdapterFactory.kt */
/* loaded from: classes2.dex */
public final class a<T> extends TypeAdapter<T> {
    @Override // com.google.gson.TypeAdapter
    public final T read(JsonReader jsonReader) {
        j.f(jsonReader, "input");
        throw new IllegalStateException("AnalyticsEnumTypeAdapter cannot deserialize enums");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, T t) {
        String str;
        j.f(jsonWriter, "out");
        if (t != null) {
            str = t.toString();
        } else {
            str = null;
        }
        jsonWriter.value(str);
    }
}
