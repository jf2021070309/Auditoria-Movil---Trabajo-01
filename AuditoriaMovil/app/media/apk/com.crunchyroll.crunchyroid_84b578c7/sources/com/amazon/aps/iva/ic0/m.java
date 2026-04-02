package com.amazon.aps.iva.ic0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* compiled from: KCallableImpl.kt */
/* loaded from: classes4.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Type> {
    public final /* synthetic */ h<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h<Object> hVar) {
        super(0);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Type invoke() {
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        h<Object> hVar = this.h;
        Type type2 = null;
        if (hVar.isSuspend()) {
            Object E0 = com.amazon.aps.iva.lb0.x.E0(hVar.i().a());
            if (E0 instanceof ParameterizedType) {
                parameterizedType = (ParameterizedType) E0;
            } else {
                parameterizedType = null;
            }
            if (parameterizedType != null) {
                type = parameterizedType.getRawType();
            } else {
                type = null;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, com.amazon.aps.iva.ob0.d.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                com.amazon.aps.iva.yb0.j.e(actualTypeArguments, "continuationType.actualTypeArguments");
                Object Z = com.amazon.aps.iva.lb0.o.Z(actualTypeArguments);
                if (Z instanceof WildcardType) {
                    wildcardType = (WildcardType) Z;
                } else {
                    wildcardType = null;
                }
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type2 = (Type) com.amazon.aps.iva.lb0.o.P(lowerBounds);
                }
            }
        }
        if (type2 == null) {
            return hVar.i().getReturnType();
        }
        return type2;
    }
}
