package com.amazon.aps.iva.uc0;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* compiled from: ReflectJavaField.kt */
/* loaded from: classes4.dex */
public final class x extends z implements com.amazon.aps.iva.ed0.n {
    public final Field a;

    public x(Field field) {
        com.amazon.aps.iva.yb0.j.f(field, "member");
        this.a = field;
    }

    @Override // com.amazon.aps.iva.ed0.n
    public final boolean I() {
        return this.a.isEnumConstant();
    }

    @Override // com.amazon.aps.iva.uc0.z
    public final Member O() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.n
    public final com.amazon.aps.iva.ed0.w getType() {
        com.amazon.aps.iva.ed0.w iVar;
        Type genericType = this.a.getGenericType();
        com.amazon.aps.iva.yb0.j.e(genericType, "member.genericType");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new c0(cls);
            }
        }
        if (!(genericType instanceof GenericArrayType) && (!z || !((Class) genericType).isArray())) {
            if (genericType instanceof WildcardType) {
                iVar = new h0((WildcardType) genericType);
            } else {
                iVar = new t(genericType);
            }
        } else {
            iVar = new i(genericType);
        }
        return iVar;
    }

    @Override // com.amazon.aps.iva.ed0.n
    public final void N() {
    }
}
