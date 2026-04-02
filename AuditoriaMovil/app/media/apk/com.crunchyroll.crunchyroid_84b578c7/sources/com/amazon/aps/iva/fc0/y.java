package com.amazon.aps.iva.fc0;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
/* compiled from: TypesJVM.kt */
/* loaded from: classes4.dex */
public final class y implements WildcardType, Type {
    public static final y d = new y(null, null);
    public final Type b;
    public final Type c;

    public y(Type type, Type type2) {
        this.b = type;
        this.c = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.c;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.c;
        if (type != null) {
            return "? super " + w.a(type);
        }
        Type type2 = this.b;
        if (type2 != null && !com.amazon.aps.iva.yb0.j.a(type2, Object.class)) {
            return "? extends " + w.a(type2);
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.b;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
