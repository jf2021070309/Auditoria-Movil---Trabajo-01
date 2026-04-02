package com.amazon.aps.iva.tc0;

import com.amazon.aps.iva.gd0.t;
import com.amazon.aps.iva.lc0.l;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.yb0.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes4.dex */
public final class c {
    public static com.amazon.aps.iva.sd0.f a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            j.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (j.a(cls, Void.TYPE)) {
                return new com.amazon.aps.iva.sd0.f(com.amazon.aps.iva.nd0.b.l(o.a.d.h()), i);
            }
            l primitiveType = com.amazon.aps.iva.vd0.c.get(cls.getName()).getPrimitiveType();
            j.e(primitiveType, "get(currentClass.name).primitiveType");
            if (i > 0) {
                return new com.amazon.aps.iva.sd0.f(com.amazon.aps.iva.nd0.b.l(primitiveType.getArrayTypeFqName()), i - 1);
            }
            return new com.amazon.aps.iva.sd0.f(com.amazon.aps.iva.nd0.b.l(primitiveType.getTypeFqName()), i);
        }
        com.amazon.aps.iva.nd0.b a = com.amazon.aps.iva.uc0.d.a(cls);
        String str = com.amazon.aps.iva.nc0.c.a;
        com.amazon.aps.iva.nd0.c b = a.b();
        j.e(b, "javaClassId.asSingleFqName()");
        com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.nc0.c.f(b);
        if (f != null) {
            a = f;
        }
        return new com.amazon.aps.iva.sd0.f(a, i);
    }

    public static void b(Class cls, t.c cVar) {
        j.f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        j.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            j.e(annotation, "annotation");
            c(cVar, annotation);
        }
        cVar.a();
    }

    public static void c(t.c cVar, Annotation annotation) {
        Class o = com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(annotation));
        t.a b = cVar.b(com.amazon.aps.iva.uc0.d.a(o), new b(annotation));
        if (b != null) {
            d(b, annotation, o);
        }
    }

    public static void d(t.a aVar, Annotation annotation, Class cls) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Method[] declaredMethods = cls.getDeclaredMethods();
        j.e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                j.c(invoke);
                com.amazon.aps.iva.nd0.f h = com.amazon.aps.iva.nd0.f.h(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (j.a(cls2, Class.class)) {
                    aVar.f(h, a((Class) invoke));
                } else if (g.a.contains(cls2)) {
                    aVar.c(invoke, h);
                } else {
                    List<com.amazon.aps.iva.fc0.d<? extends Object>> list = com.amazon.aps.iva.uc0.d.a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        j.e(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        aVar.e(h, com.amazon.aps.iva.uc0.d.a(cls2), com.amazon.aps.iva.nd0.f.h(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        j.e(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) com.amazon.aps.iva.lb0.o.Z(interfaces);
                        j.e(cls3, "annotationClass");
                        t.a d = aVar.d(com.amazon.aps.iva.uc0.d.a(cls3), h);
                        if (d != null) {
                            d(d, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        t.b b = aVar.b(h);
                        if (b != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                com.amazon.aps.iva.nd0.b a = com.amazon.aps.iva.uc0.d.a(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    j.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    b.d(a, com.amazon.aps.iva.nd0.f.h(((Enum) obj).name()));
                                }
                            } else if (j.a(componentType, Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    j.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    b.c(a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    t.a b2 = b.b(com.amazon.aps.iva.uc0.d.a(componentType));
                                    if (b2 != null) {
                                        j.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        d(b2, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    b.e(obj4);
                                }
                            }
                            b.a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
