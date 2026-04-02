package com.amazon.aps.iva.fc0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;
/* compiled from: TypesJVM.kt */
/* loaded from: classes4.dex */
public final class a implements GenericArrayType, Type {
    public final Type b;

    public a(Type type) {
        com.amazon.aps.iva.yb0.j.f(type, "elementType");
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (com.amazon.aps.iva.yb0.j.a(this.b, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.b;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return w.a(this.b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
