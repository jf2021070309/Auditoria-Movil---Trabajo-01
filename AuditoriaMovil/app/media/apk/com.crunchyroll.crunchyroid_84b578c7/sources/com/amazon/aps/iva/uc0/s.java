package com.amazon.aps.iva.uc0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes4.dex */
public final class s extends f implements com.amazon.aps.iva.ed0.h {
    public final Class<?> b;

    public s(com.amazon.aps.iva.nd0.f fVar, Class<?> cls) {
        super(fVar);
        this.b = cls;
    }

    @Override // com.amazon.aps.iva.ed0.h
    public final e0 b() {
        Class<?> cls = this.b;
        com.amazon.aps.iva.yb0.j.f(cls, "type");
        if (cls.isPrimitive()) {
            return new c0(cls);
        }
        if (!(cls instanceof GenericArrayType) && !cls.isArray()) {
            if (cls instanceof WildcardType) {
                return new h0((WildcardType) cls);
            }
            return new t(cls);
        }
        return new i(cls);
    }
}
