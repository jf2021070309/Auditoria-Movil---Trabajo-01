package com.amazon.aps.iva.uc0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaConstructor.kt */
/* loaded from: classes4.dex */
public final class u extends z implements com.amazon.aps.iva.ed0.k {
    public final Constructor<?> a;

    public u(Constructor<?> constructor) {
        com.amazon.aps.iva.yb0.j.f(constructor, "member");
        this.a = constructor;
    }

    @Override // com.amazon.aps.iva.uc0.z
    public final Member O() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.k
    public final List<com.amazon.aps.iva.ed0.z> f() {
        boolean z;
        Constructor<?> constructor = this.a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        com.amazon.aps.iva.yb0.j.e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) com.amazon.aps.iva.lb0.m.I(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) com.amazon.aps.iva.lb0.m.I(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
            }
            return P(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }

    @Override // com.amazon.aps.iva.ed0.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.a.getTypeParameters();
        com.amazon.aps.iva.yb0.j.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }
}
