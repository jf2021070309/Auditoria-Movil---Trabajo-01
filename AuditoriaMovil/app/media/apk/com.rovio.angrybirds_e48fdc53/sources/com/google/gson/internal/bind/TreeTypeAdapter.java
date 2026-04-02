package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    private final JsonSerializer<T> a;
    private final JsonDeserializer<T> b;
    private final Gson c;
    private final TypeToken<T> d;
    private final TypeAdapterFactory e;
    private final TreeTypeAdapter<T>.a f = new a();
    private TypeAdapter<T> g;

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.a = jsonSerializer;
        this.b = jsonDeserializer;
        this.c = gson;
        this.d = typeToken;
        this.e = typeAdapterFactory;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) {
        if (this.b == null) {
            return a().read(jsonReader);
        }
        JsonElement parse = Streams.parse(jsonReader);
        if (parse.isJsonNull()) {
            return null;
        }
        return this.b.deserialize(parse, this.d.getType(), this.f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) {
        if (this.a == null) {
            a().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(this.a.serialize(t, this.d.getType(), this.f), jsonWriter);
        }
    }

    private TypeAdapter<T> a() {
        TypeAdapter<T> typeAdapter = this.g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.c.getDelegateAdapter(this.e, this.d);
        this.g = delegateAdapter;
        return delegateAdapter;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        return new b(obj, typeToken, false, null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new b(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new b(obj, null, false, cls);
    }

    /* loaded from: classes2.dex */
    private static final class b implements TypeAdapterFactory {
        private final TypeToken<?> a;
        private final boolean b;
        private final Class<?> c;
        private final JsonSerializer<?> d;
        private final JsonDeserializer<?> e;

        b(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            this.d = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.e = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            C$Gson$Preconditions.checkArgument((this.d == null && this.e == null) ? false : true);
            this.a = typeToken;
            this.b = z;
            this.c = cls;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            boolean isAssignableFrom;
            if (this.a != null) {
                isAssignableFrom = this.a.equals(typeToken) || (this.b && this.a.getType() == typeToken.getRawType());
            } else {
                isAssignableFrom = this.c.isAssignableFrom(typeToken.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.d, this.e, gson, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    private final class a implements JsonDeserializationContext, JsonSerializationContext {
        private a() {
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.c.toJsonTree(obj);
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.c.toJsonTree(obj, type);
        }

        @Override // com.google.gson.JsonDeserializationContext
        public <R> R deserialize(JsonElement jsonElement, Type type) {
            return (R) TreeTypeAdapter.this.c.fromJson(jsonElement, type);
        }
    }
}
