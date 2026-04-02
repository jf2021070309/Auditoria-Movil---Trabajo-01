package h.o.c;

import ch.qos.logback.core.CoreConstants;
import h.o.b.u;
import h.o.b.v;
import h.o.b.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d implements h.r.b<Object>, c {
    public static final Map<Class<? extends h.a<?>>, Integer> a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, String> f8941b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, String> f8942c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String> f8943d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f8944e;

    static {
        int i2 = 0;
        Class[] clsArr = {h.o.b.a.class, h.o.b.l.class, h.o.b.p.class, h.o.b.q.class, h.o.b.r.class, h.o.b.s.class, h.o.b.t.class, u.class, v.class, w.class, h.o.b.b.class, h.o.b.c.class, h.o.b.d.class, h.o.b.e.class, h.o.b.f.class, h.o.b.g.class, h.o.b.h.class, h.o.b.i.class, h.o.b.j.class, h.o.b.k.class, h.o.b.m.class, h.o.b.n.class, h.o.b.o.class};
        j.e(clsArr, "elements");
        List a2 = h.l.c.a(clsArr);
        ArrayList arrayList = new ArrayList(e.j.d.w.s(a2, 10));
        for (Object obj : a2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.l.c.h();
                throw null;
            } else {
                arrayList.add(new h.f((Class) obj, Integer.valueOf(i2)));
                i2 = i3;
            }
        }
        a = h.l.c.k(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f8941b = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f8942c = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        j.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            j.d(str, "kotlinName");
            sb.append(h.t.g.s(str, CoreConstants.DOT, null, 2));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), j.i(str, ".Companion"));
        }
        for (Map.Entry<Class<? extends h.a<?>>, Integer> entry : a.entrySet()) {
            hashMap3.put(entry.getKey().getName(), j.i("kotlin.Function", Integer.valueOf(entry.getValue().intValue())));
        }
        f8943d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.j.d.w.b0(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), h.t.g.s((String) entry2.getValue(), CoreConstants.DOT, null, 2));
        }
    }

    public d(Class<?> cls) {
        j.e(cls, "jClass");
        this.f8944e = cls;
    }

    @Override // h.o.c.c
    public Class<?> a() {
        return this.f8944e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && j.a(e.j.d.w.N(this), e.j.d.w.N((h.r.b) obj));
    }

    public int hashCode() {
        return e.j.d.w.N(this).hashCode();
    }

    public String toString() {
        return j.i(this.f8944e.toString(), " (Kotlin reflection is not available)");
    }
}
