package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a<T> extends TypeAdapter<T> {
    private final Gson a;
    private final TypeAdapter<T> b;
    private final Type c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.a = gson;
        this.b = typeAdapter;
        this.c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) {
        return this.b.read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) {
        TypeAdapter<T> typeAdapter = this.b;
        Type a = a(this.c, t);
        if (a != this.c) {
            typeAdapter = this.a.getAdapter(TypeToken.get(a));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !(this.b instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                typeAdapter = this.b;
            }
        }
        typeAdapter.write(jsonWriter, t);
    }

    private Type a(Type type, Object obj) {
        if (obj != null) {
            if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }
}
