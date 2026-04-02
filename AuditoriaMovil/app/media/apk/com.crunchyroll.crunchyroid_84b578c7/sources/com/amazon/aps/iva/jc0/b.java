package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.o;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class b implements InvocationHandler {
    public final Class b;
    public final Map c;
    public final com.amazon.aps.iva.kb0.e d;
    public final com.amazon.aps.iva.kb0.e e;
    public final List f;

    public b(Class cls, Map map, m mVar, m mVar2, List list) {
        this.b = cls;
        this.c = map;
        this.d = mVar;
        this.e = mVar2;
        this.f = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z;
        Annotation annotation;
        boolean a;
        boolean z2;
        Class cls = this.b;
        com.amazon.aps.iva.yb0.j.f(cls, "$annotationClass");
        Map map = this.c;
        com.amazon.aps.iva.yb0.j.f(map, "$values");
        com.amazon.aps.iva.kb0.e eVar = this.d;
        com.amazon.aps.iva.yb0.j.f(eVar, "$toString$delegate");
        com.amazon.aps.iva.kb0.e eVar2 = this.e;
        com.amazon.aps.iva.yb0.j.f(eVar2, "$hashCode$delegate");
        List list = this.f;
        com.amazon.aps.iva.yb0.j.f(list, "$methods");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) eVar2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) eVar.getValue();
            }
        }
        boolean z3 = false;
        if (com.amazon.aps.iva.yb0.j.a(name, "equals")) {
            if (objArr != null && objArr.length == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.yb0.j.e(objArr, "args");
                Object Z = o.Z(objArr);
                Class cls2 = null;
                if (Z instanceof Annotation) {
                    annotation = (Annotation) Z;
                } else {
                    annotation = null;
                }
                if (annotation != null) {
                    cls2 = t.o(t.n(annotation));
                }
                if (com.amazon.aps.iva.yb0.j.a(cls2, cls)) {
                    List<Method> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (Method method2 : list2) {
                            Object obj2 = map.get(method2.getName());
                            Object invoke = method2.invoke(Z, new Object[0]);
                            if (obj2 instanceof boolean[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                a = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                                continue;
                            } else if (obj2 instanceof char[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                                a = Arrays.equals((char[]) obj2, (char[]) invoke);
                                continue;
                            } else if (obj2 instanceof byte[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                a = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                                continue;
                            } else if (obj2 instanceof short[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                a = Arrays.equals((short[]) obj2, (short[]) invoke);
                                continue;
                            } else if (obj2 instanceof int[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                                a = Arrays.equals((int[]) obj2, (int[]) invoke);
                                continue;
                            } else if (obj2 instanceof float[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                a = Arrays.equals((float[]) obj2, (float[]) invoke);
                                continue;
                            } else if (obj2 instanceof long[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                                a = Arrays.equals((long[]) obj2, (long[]) invoke);
                                continue;
                            } else if (obj2 instanceof double[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                a = Arrays.equals((double[]) obj2, (double[]) invoke);
                                continue;
                            } else if (obj2 instanceof Object[]) {
                                com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                a = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                                continue;
                            } else {
                                a = com.amazon.aps.iva.yb0.j.a(obj2, invoke);
                                continue;
                            }
                            if (!a) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            }
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(o.b0(objArr));
        sb.append(')');
        throw new com.amazon.aps.iva.wb0.a(sb.toString());
    }
}
