package com.amazon.aps.iva.uc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oc0.f1;
import com.amazon.aps.iva.oc0.g1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes4.dex */
public abstract class z extends v implements com.amazon.aps.iva.ed0.d, com.amazon.aps.iva.ed0.r, com.amazon.aps.iva.ed0.p {
    public abstract Member O();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList P(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.uc0.z.P(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z) && com.amazon.aps.iva.yb0.j.a(O(), ((z) obj).O())) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection getAnnotations() {
        Collection collection;
        Member O = O();
        com.amazon.aps.iva.yb0.j.d(O, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) O).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            collection = f1.x(declaredAnnotations);
        } else {
            collection = com.amazon.aps.iva.lb0.z.b;
        }
        return collection;
    }

    @Override // com.amazon.aps.iva.ed0.s
    public final com.amazon.aps.iva.nd0.f getName() {
        com.amazon.aps.iva.nd0.f fVar;
        String name = O().getName();
        if (name != null) {
            fVar = com.amazon.aps.iva.nd0.f.h(name);
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return com.amazon.aps.iva.nd0.h.a;
        }
        return fVar;
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final g1 getVisibility() {
        int modifiers = O().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return f1.h.c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return f1.e.c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return com.amazon.aps.iva.sc0.c.c;
            }
            return com.amazon.aps.iva.sc0.b.c;
        }
        return com.amazon.aps.iva.sc0.a.c;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        Member O = O();
        com.amazon.aps.iva.yb0.j.d(O, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) O).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return com.amazon.aps.iva.ee0.f1.v(declaredAnnotations, cVar);
        }
        return null;
    }

    public final int hashCode() {
        return O().hashCode();
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final boolean isAbstract() {
        return Modifier.isAbstract(O().getModifiers());
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final boolean isFinal() {
        return Modifier.isFinal(O().getModifiers());
    }

    @Override // com.amazon.aps.iva.ed0.r
    public final boolean k() {
        return Modifier.isStatic(O().getModifiers());
    }

    @Override // com.amazon.aps.iva.ed0.p
    public final r m() {
        Class<?> declaringClass = O().getDeclaringClass();
        com.amazon.aps.iva.yb0.j.e(declaringClass, "member.declaringClass");
        return new r(declaringClass);
    }

    public final String toString() {
        return getClass().getName() + ": " + O();
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
