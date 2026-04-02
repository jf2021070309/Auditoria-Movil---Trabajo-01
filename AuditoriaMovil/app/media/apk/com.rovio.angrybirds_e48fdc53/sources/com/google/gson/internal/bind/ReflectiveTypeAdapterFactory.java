package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor a;
    private final FieldNamingStrategy b;
    private final Excluder c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.a = constructorConstructor;
        this.b = fieldNamingStrategy;
        this.c = excluder;
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public boolean excludeField(Field field, boolean z) {
        return a(field, z, this.c);
    }

    static boolean a(Field field, boolean z, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }

    private List<String> a(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.b.translateName(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new Adapter(this.a.get(typeToken), a(gson, (TypeToken<?>) typeToken, (Class<?>) rawType));
    }

    private a a(final Gson gson, final Field field, String str, final TypeToken<?> typeToken, boolean z, boolean z2) {
        final boolean isPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        final TypeAdapter<?> typeAdapter = null;
        if (jsonAdapter != null) {
            typeAdapter = this.d.a(this.a, gson, typeToken, jsonAdapter);
        }
        final boolean z3 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        return new a(str, z, z2) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
            void a(JsonWriter jsonWriter, Object obj) {
                (z3 ? typeAdapter : new com.google.gson.internal.bind.a(gson, typeAdapter, typeToken.getType())).write(jsonWriter, field.get(obj));
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
            void a(JsonReader jsonReader, Object obj) {
                Object read = typeAdapter.read(jsonReader);
                if (read != null || !isPrimitive) {
                    field.set(obj, read);
                }
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
            public boolean a(Object obj) {
                return this.i && field.get(obj) != obj;
            }
        };
    }

    private Map<String, a> a(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        Field[] declaredFields;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean excludeField = excludeField(field, true);
                boolean excludeField2 = excludeField(field, false);
                if (excludeField || excludeField2) {
                    field.setAccessible(true);
                    Type resolve = C$Gson$Types.resolve(typeToken.getType(), cls, field.getGenericType());
                    List<String> a2 = a(field);
                    a aVar = null;
                    int i = 0;
                    while (i < a2.size()) {
                        String str = a2.get(i);
                        if (i != 0) {
                            excludeField = false;
                        }
                        a aVar2 = (a) linkedHashMap.put(str, a(gson, field, str, TypeToken.get(resolve), excludeField, excludeField2));
                        if (aVar != null) {
                            aVar2 = aVar;
                        }
                        i++;
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + aVar.h);
                    }
                }
            }
            typeToken = TypeToken.get(C$Gson$Types.resolve(typeToken.getType(), cls, cls.getGenericSuperclass()));
            cls = typeToken.getRawType();
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class a {
        final String h;
        final boolean i;
        final boolean j;

        abstract void a(JsonReader jsonReader, Object obj);

        abstract void a(JsonWriter jsonWriter, Object obj);

        abstract boolean a(Object obj);

        protected a(String str, boolean z, boolean z2) {
            this.h = str;
            this.i = z;
            this.j = z2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {
        private final ObjectConstructor<T> a;
        private final Map<String, a> b;

        Adapter(ObjectConstructor<T> objectConstructor, Map<String, a> map) {
            this.a = objectConstructor;
            this.b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T construct = this.a.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    a aVar = this.b.get(jsonReader.nextName());
                    if (aVar == null || !aVar.j) {
                        jsonReader.skipValue();
                    } else {
                        aVar.a(jsonReader, construct);
                    }
                }
                jsonReader.endObject();
                return construct;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (a aVar : this.b.values()) {
                    if (aVar.a(t)) {
                        jsonWriter.name(aVar.h);
                        aVar.a(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
