package com.amazon.aps.iva.uc0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* compiled from: ReflectJavaWildcardType.kt */
/* loaded from: classes4.dex */
public final class h0 extends e0 implements com.amazon.aps.iva.ed0.a0 {
    public final WildcardType a;
    public final com.amazon.aps.iva.lb0.z b = com.amazon.aps.iva.lb0.z.b;

    public h0(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // com.amazon.aps.iva.ed0.a0
    public final boolean L() {
        Type[] upperBounds = this.a.getUpperBounds();
        com.amazon.aps.iva.yb0.j.e(upperBounds, "reflectType.upperBounds");
        return !com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.lb0.o.Q(upperBounds), Object.class);
    }

    @Override // com.amazon.aps.iva.uc0.e0
    public final Type O() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection<com.amazon.aps.iva.ed0.a> getAnnotations() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ed0.a0
    public final e0 q() {
        e0 iVar;
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                Object Z = com.amazon.aps.iva.lb0.o.Z(lowerBounds);
                com.amazon.aps.iva.yb0.j.e(Z, "lowerBounds.single()");
                Type type = (Type) Z;
                boolean z = type instanceof Class;
                if (z) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        return new c0(cls);
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        iVar = new h0((WildcardType) type);
                    } else {
                        iVar = new t(type);
                    }
                } else {
                    iVar = new i(type);
                }
            } else {
                if (upperBounds.length == 1) {
                    Type type2 = (Type) com.amazon.aps.iva.lb0.o.Z(upperBounds);
                    if (!com.amazon.aps.iva.yb0.j.a(type2, Object.class)) {
                        com.amazon.aps.iva.yb0.j.e(type2, "ub");
                        boolean z2 = type2 instanceof Class;
                        if (z2) {
                            Class cls2 = (Class) type2;
                            if (cls2.isPrimitive()) {
                                return new c0(cls2);
                            }
                        }
                        if (!(type2 instanceof GenericArrayType) && (!z2 || !((Class) type2).isArray())) {
                            if (type2 instanceof WildcardType) {
                                iVar = new h0((WildcardType) type2);
                            } else {
                                iVar = new t(type2);
                            }
                        } else {
                            iVar = new i(type2);
                        }
                    }
                }
                return null;
            }
            return iVar;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
