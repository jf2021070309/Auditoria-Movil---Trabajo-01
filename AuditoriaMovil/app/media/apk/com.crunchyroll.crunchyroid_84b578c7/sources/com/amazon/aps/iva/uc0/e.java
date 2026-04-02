package com.amazon.aps.iva.uc0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaAnnotation.kt */
/* loaded from: classes4.dex */
public final class e extends v implements com.amazon.aps.iva.ed0.a {
    public final Annotation a;

    public e(Annotation annotation) {
        com.amazon.aps.iva.yb0.j.f(annotation, "annotation");
        this.a = annotation;
    }

    @Override // com.amazon.aps.iva.ed0.a
    public final ArrayList d() {
        com.amazon.aps.iva.ed0.b yVar;
        Annotation annotation = this.a;
        Method[] declaredMethods = com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(annotation)).getDeclaredMethods();
        com.amazon.aps.iva.yb0.j.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, new Object[0]);
            com.amazon.aps.iva.yb0.j.e(invoke, "method.invoke(annotation)");
            com.amazon.aps.iva.nd0.f h = com.amazon.aps.iva.nd0.f.h(method.getName());
            Class<?> cls = invoke.getClass();
            List<com.amazon.aps.iva.fc0.d<? extends Object>> list = d.a;
            if (Enum.class.isAssignableFrom(cls)) {
                yVar = new w(h, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                yVar = new g(h, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                yVar = new h(h, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                yVar = new s(h, (Class) invoke);
            } else {
                yVar = new y(invoke, h);
            }
            arrayList.add(yVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.a == ((e) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // com.amazon.aps.iva.ed0.a
    public final com.amazon.aps.iva.nd0.b i() {
        return d.a(com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(this.a)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.b8.i.d(e.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ed0.a
    public final r v() {
        return new r(com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(this.a)));
    }

    @Override // com.amazon.aps.iva.ed0.a
    public final void G() {
    }

    @Override // com.amazon.aps.iva.ed0.a
    public final void j() {
    }
}
