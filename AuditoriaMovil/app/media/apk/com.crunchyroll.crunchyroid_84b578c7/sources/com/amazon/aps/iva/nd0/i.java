package com.amazon.aps.iva.nd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.lb0.r;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: StandardClassIds.kt */
/* loaded from: classes4.dex */
public final class i {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final Set<c> h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final Set<b> p;
    public static final Set<b> q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;

    static {
        c cVar = new c("kotlin");
        a = cVar;
        c c2 = cVar.c(f.h("reflect"));
        b = c2;
        c c3 = cVar.c(f.h("collections"));
        c = c3;
        c c4 = cVar.c(f.h("ranges"));
        d = c4;
        cVar.c(f.h("jvm")).c(f.h("internal"));
        c c5 = cVar.c(f.h("annotation"));
        e = c5;
        c c6 = cVar.c(f.h("internal"));
        c6.c(f.h("ir"));
        c c7 = cVar.c(f.h("coroutines"));
        f = c7;
        g = cVar.c(f.h("enums"));
        h = l1.I(cVar, c3, c4, c5, c2, c6, c7);
        j.a("Nothing");
        j.a("Unit");
        j.a("Any");
        j.a("Enum");
        j.a("Annotation");
        i = j.a("Array");
        b a2 = j.a("Boolean");
        b a3 = j.a("Char");
        b a4 = j.a("Byte");
        b a5 = j.a("Short");
        b a6 = j.a("Int");
        b a7 = j.a("Long");
        b a8 = j.a("Float");
        b a9 = j.a("Double");
        j = j.g(a4);
        k = j.g(a5);
        l = j.g(a6);
        m = j.g(a7);
        j.a("CharSequence");
        n = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.f("KProperty");
        j.f("KMutableProperty");
        j.f("KProperty0");
        j.f("KMutableProperty0");
        j.f("KProperty1");
        j.f("KMutableProperty1");
        j.f("KProperty2");
        j.f("KMutableProperty2");
        o = j.f("KFunction");
        j.f("KClass");
        j.f("KCallable");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        Set<b> I = l1.I(a2, a3, a4, a5, a6, a7, a8, a9);
        p = I;
        Set<b> set = I;
        int w = com.amazon.aps.iva.aq.k.w(r.Y(set));
        int i2 = 16;
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        for (Object obj : set) {
            f j2 = ((b) obj).j();
            com.amazon.aps.iva.yb0.j.e(j2, "id.shortClassName");
            linkedHashMap.put(obj, j.d(j2));
        }
        j.c(linkedHashMap);
        Set<b> I2 = l1.I(j, k, l, m);
        q = I2;
        Set<b> set2 = I2;
        int w2 = com.amazon.aps.iva.aq.k.w(r.Y(set2));
        if (w2 >= 16) {
            i2 = w2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
        for (Object obj2 : set2) {
            f j3 = ((b) obj2).j();
            com.amazon.aps.iva.yb0.j.e(j3, "id.shortClassName");
            linkedHashMap2.put(obj2, j.d(j3));
        }
        j.c(linkedHashMap2);
        m0.R(m0.Q(p, q), n);
        c cVar2 = f;
        f h2 = f.h("Continuation");
        if (cVar2 != null) {
            c.j(h2);
            j.b("Iterator");
            j.b("Iterable");
            j.b("Collection");
            j.b("List");
            j.b("ListIterator");
            j.b("Set");
            b b2 = j.b("Map");
            j.b("MutableIterator");
            j.b("CharIterator");
            j.b("MutableIterable");
            j.b("MutableCollection");
            r = j.b("MutableList");
            j.b("MutableListIterator");
            s = j.b("MutableSet");
            b b3 = j.b("MutableMap");
            t = b3;
            b2.d(f.h("Entry"));
            b3.d(f.h("MutableEntry"));
            j.a("Result");
            j.e("IntRange");
            j.e("LongRange");
            j.e("CharRange");
            c cVar3 = e;
            f h3 = f.h("AnnotationRetention");
            if (cVar3 != null) {
                c.j(h3);
                c.j(f.h("AnnotationTarget"));
                u = new b(g, f.h("EnumEntries"));
                return;
            }
            b.a(3);
            throw null;
        }
        b.a(3);
        throw null;
    }
}
