package com.amazon.aps.iva.ic0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
/* compiled from: KTypeImpl.kt */
/* loaded from: classes4.dex */
public final class j0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Type> {
    public final /* synthetic */ k0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.amazon.aps.iva.kb0.e<List<Type>> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(k0 k0Var, int i, com.amazon.aps.iva.kb0.e<? extends List<? extends Type>> eVar) {
        super(0);
        this.h = k0Var;
        this.i = i;
        this.j = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Type invoke() {
        Class<?> cls;
        k0 k0Var = this.h;
        Type c = k0Var.c();
        if (c instanceof Class) {
            Class cls2 = (Class) c;
            if (cls2.isArray()) {
                cls = cls2.getComponentType();
            } else {
                cls = Object.class;
            }
            com.amazon.aps.iva.yb0.j.e(cls, "{\n                      …                        }");
            return cls;
        }
        boolean z = c instanceof GenericArrayType;
        int i = this.i;
        if (z) {
            if (i == 0) {
                Type genericComponentType = ((GenericArrayType) c).getGenericComponentType();
                com.amazon.aps.iva.yb0.j.e(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new com.amazon.aps.iva.wb0.a("Array type has been queried for a non-0th argument: " + k0Var);
        } else if (c instanceof ParameterizedType) {
            Type type = this.j.getValue().get(i);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                com.amazon.aps.iva.yb0.j.e(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) com.amazon.aps.iva.lb0.o.Q(lowerBounds);
                if (type2 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    com.amazon.aps.iva.yb0.j.e(upperBounds, "argument.upperBounds");
                    type = (Type) com.amazon.aps.iva.lb0.o.P(upperBounds);
                } else {
                    type = type2;
                }
            }
            com.amazon.aps.iva.yb0.j.e(type, "{\n                      …                        }");
            return type;
        } else {
            throw new com.amazon.aps.iva.wb0.a("Non-generic type has been queried for arguments: " + k0Var);
        }
    }
}
