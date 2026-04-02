package com.amazon.aps.iva.uc0;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaMethod.kt */
/* loaded from: classes4.dex */
public final class a0 extends z implements com.amazon.aps.iva.ed0.q {
    public final Method a;

    public a0(Method method) {
        com.amazon.aps.iva.yb0.j.f(method, "member");
        this.a = method;
    }

    @Override // com.amazon.aps.iva.ed0.q
    public final e0 C() {
        e0 iVar;
        Type genericReturnType = this.a.getGenericReturnType();
        com.amazon.aps.iva.yb0.j.e(genericReturnType, "member.genericReturnType");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new c0(cls);
            }
        }
        if (!(genericReturnType instanceof GenericArrayType) && (!z || !((Class) genericReturnType).isArray())) {
            if (genericReturnType instanceof WildcardType) {
                iVar = new h0((WildcardType) genericReturnType);
            } else {
                iVar = new t(genericReturnType);
            }
        } else {
            iVar = new i(genericReturnType);
        }
        return iVar;
    }

    @Override // com.amazon.aps.iva.ed0.q
    public final boolean M() {
        Object yVar;
        Object defaultValue = this.a.getDefaultValue();
        Object obj = null;
        if (defaultValue != null) {
            if (d.e(defaultValue.getClass())) {
                yVar = new w(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                yVar = new g(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                yVar = new h(null, (Object[]) defaultValue);
            } else if (defaultValue instanceof Class) {
                yVar = new s(null, (Class) defaultValue);
            } else {
                yVar = new y(defaultValue, null);
            }
            obj = yVar;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.uc0.z
    public final Member O() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.q
    public final List<com.amazon.aps.iva.ed0.z> f() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        com.amazon.aps.iva.yb0.j.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        com.amazon.aps.iva.yb0.j.e(parameterAnnotations, "member.parameterAnnotations");
        return P(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // com.amazon.aps.iva.ed0.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        com.amazon.aps.iva.yb0.j.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }
}
