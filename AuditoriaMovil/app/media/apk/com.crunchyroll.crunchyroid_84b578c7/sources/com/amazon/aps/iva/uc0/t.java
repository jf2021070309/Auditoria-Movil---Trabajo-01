package com.amazon.aps.iva.uc0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ReflectJavaClassifierType.kt */
/* loaded from: classes4.dex */
public final class t extends e0 implements com.amazon.aps.iva.ed0.j {
    public final Type a;
    public final v b;

    public t(Type type) {
        v rVar;
        com.amazon.aps.iva.yb0.j.f(type, "reflectType");
        this.a = type;
        if (type instanceof Class) {
            rVar = new r((Class) type);
        } else if (type instanceof TypeVariable) {
            rVar = new f0((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.amazon.aps.iva.yb0.j.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            rVar = new r((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
        }
        this.b = rVar;
    }

    @Override // com.amazon.aps.iva.ed0.j
    public final String E() {
        return this.a.toString();
    }

    @Override // com.amazon.aps.iva.ed0.j
    public final String H() {
        throw new UnsupportedOperationException("Type not found: " + this.a);
    }

    @Override // com.amazon.aps.iva.uc0.e0
    public final Type O() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.ed0.i, com.amazon.aps.iva.uc0.v] */
    @Override // com.amazon.aps.iva.ed0.j
    public final com.amazon.aps.iva.ed0.i b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection<com.amazon.aps.iva.ed0.a> getAnnotations() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.uc0.e0, com.amazon.aps.iva.ed0.d
    public final com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        return null;
    }

    @Override // com.amazon.aps.iva.ed0.j
    public final boolean s() {
        boolean z;
        Type type = this.a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        com.amazon.aps.iva.yb0.j.e(typeParameters, "getTypeParameters()");
        if (typeParameters.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ed0.j
    public final ArrayList x() {
        com.amazon.aps.iva.ed0.d dVar;
        com.amazon.aps.iva.ed0.d dVar2;
        List<Type> c = d.c(this.a);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(c));
        for (Type type : c) {
            com.amazon.aps.iva.yb0.j.f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    dVar2 = new c0(cls);
                    arrayList.add(dVar2);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    dVar = new h0((WildcardType) type);
                } else {
                    dVar = new t(type);
                }
            } else {
                dVar = new i(type);
            }
            dVar2 = dVar;
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
