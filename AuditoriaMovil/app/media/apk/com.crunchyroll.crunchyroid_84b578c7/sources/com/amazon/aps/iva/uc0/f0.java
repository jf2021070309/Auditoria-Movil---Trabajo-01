package com.amazon.aps.iva.uc0;

import com.amazon.aps.iva.ee0.f1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: ReflectJavaTypeParameter.kt */
/* loaded from: classes4.dex */
public final class f0 extends v implements com.amazon.aps.iva.ed0.d, com.amazon.aps.iva.ed0.x {
    public final TypeVariable<?> a;

    public f0(TypeVariable<?> typeVariable) {
        com.amazon.aps.iva.yb0.j.f(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((f0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Collection collection;
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement != null && (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) != null) {
            collection = f1.x(declaredAnnotations);
        } else {
            collection = com.amazon.aps.iva.lb0.z.b;
        }
        return collection;
    }

    @Override // com.amazon.aps.iva.ed0.s
    public final com.amazon.aps.iva.nd0.f getName() {
        return com.amazon.aps.iva.nd0.f.h(this.a.getName());
    }

    @Override // com.amazon.aps.iva.ed0.x
    public final Collection getUpperBounds() {
        Type type;
        Type[] bounds = this.a.getBounds();
        com.amazon.aps.iva.yb0.j.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new t(type2));
        }
        t tVar = (t) com.amazon.aps.iva.lb0.x.R0(arrayList);
        if (tVar != null) {
            type = tVar.a;
        } else {
            type = null;
        }
        RandomAccess randomAccess = arrayList;
        if (com.amazon.aps.iva.yb0.j.a(type, Object.class)) {
            randomAccess = com.amazon.aps.iva.lb0.z.b;
        }
        return (Collection) randomAccess;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        TypeVariable<?> typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return f1.v(declaredAnnotations, cVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.b8.i.d(f0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
