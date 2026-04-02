package com.amazon.aps.iva.uc0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* compiled from: ReflectJavaArrayType.kt */
/* loaded from: classes4.dex */
public final class i extends e0 implements com.amazon.aps.iva.ed0.f {
    public final Type a;
    public final e0 b;
    public final com.amazon.aps.iva.lb0.z c;

    public i(Type type) {
        e0 iVar;
        e0 e0Var;
        this.a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            com.amazon.aps.iva.yb0.j.e(genericComponentType, "genericComponentType");
            boolean z = genericComponentType instanceof Class;
            if (z) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    e0Var = new c0(cls);
                    this.b = e0Var;
                    this.c = com.amazon.aps.iva.lb0.z.b;
                }
            }
            if (!(genericComponentType instanceof GenericArrayType) && (!z || !((Class) genericComponentType).isArray())) {
                if (genericComponentType instanceof WildcardType) {
                    iVar = new h0((WildcardType) genericComponentType);
                } else {
                    iVar = new t(genericComponentType);
                }
            } else {
                iVar = new i(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    com.amazon.aps.iva.yb0.j.e(componentType, "getComponentType()");
                    if (componentType.isPrimitive()) {
                        iVar = new c0(componentType);
                    } else if (!(componentType instanceof GenericArrayType) && !componentType.isArray()) {
                        if (componentType instanceof WildcardType) {
                            iVar = new h0((WildcardType) componentType);
                        } else {
                            iVar = new t(componentType);
                        }
                    } else {
                        iVar = new i(componentType);
                    }
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        e0Var = iVar;
        this.b = e0Var;
        this.c = com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.uc0.e0
    public final Type O() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection<com.amazon.aps.iva.ed0.a> getAnnotations() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ed0.f
    public final e0 z() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
