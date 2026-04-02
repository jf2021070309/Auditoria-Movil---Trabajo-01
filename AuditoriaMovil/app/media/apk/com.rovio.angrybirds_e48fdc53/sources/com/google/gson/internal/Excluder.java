package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private boolean d;
    private double a = -1.0d;
    private int b = 136;
    private boolean c = true;
    private List<ExclusionStrategy> e = Collections.emptyList();
    private List<ExclusionStrategy> f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public Excluder m12clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Excluder withVersion(double d) {
        Excluder m12clone = m12clone();
        m12clone.a = d;
        return m12clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m12clone = m12clone();
        m12clone.b = 0;
        for (int i : iArr) {
            m12clone.b = i | m12clone.b;
        }
        return m12clone;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m12clone = m12clone();
        m12clone.c = false;
        return m12clone;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m12clone = m12clone();
        m12clone.d = true;
        return m12clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder m12clone = m12clone();
        if (z) {
            m12clone.e = new ArrayList(this.e);
            m12clone.e.add(exclusionStrategy);
        }
        if (z2) {
            m12clone.f = new ArrayList(this.f);
            m12clone.f.add(exclusionStrategy);
        }
        return m12clone;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean excludeClass = excludeClass(rawType, true);
        final boolean excludeClass2 = excludeClass(rawType, false);
        if (excludeClass || excludeClass2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                private TypeAdapter<T> f;

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) {
                    if (excludeClass2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return a().read(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) {
                    if (excludeClass) {
                        jsonWriter.nullValue();
                    } else {
                        a().write(jsonWriter, t);
                    }
                }

                private TypeAdapter<T> a() {
                    TypeAdapter<T> typeAdapter = this.f;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.f = delegateAdapter;
                    return delegateAdapter;
                }
            };
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z) {
        Expose expose;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.a == -1.0d || a((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) && !field.isSynthetic()) {
            if (!this.d || ((expose = (Expose) field.getAnnotation(Expose.class)) != null && (!z ? !expose.deserialize() : !expose.serialize()))) {
                if ((this.c || !b(field.getType())) && !a(field.getType())) {
                    List<ExclusionStrategy> list = z ? this.e : this.f;
                    if (!list.isEmpty()) {
                        FieldAttributes fieldAttributes = new FieldAttributes(field);
                        for (ExclusionStrategy exclusionStrategy : list) {
                            if (exclusionStrategy.shouldSkipField(fieldAttributes)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        if (this.a == -1.0d || a((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            if ((this.c || !b(cls)) && !a(cls)) {
                for (ExclusionStrategy exclusionStrategy : z ? this.e : this.f) {
                    if (exclusionStrategy.shouldSkipClass(cls)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean b(Class<?> cls) {
        return cls.isMemberClass() && !c(cls);
    }

    private boolean c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean a(Since since, Until until) {
        return a(since) && a(until);
    }

    private boolean a(Since since) {
        return since == null || since.value() <= this.a;
    }

    private boolean a(Until until) {
        return until == null || until.value() > this.a;
    }
}
