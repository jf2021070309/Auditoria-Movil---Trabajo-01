package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.ee0.f1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassReference.kt */
/* loaded from: classes4.dex */
public final class d implements com.amazon.aps.iva.fc0.d<Object>, c {
    public static final Map<Class<? extends com.amazon.aps.iva.kb0.a<?>>, Integer> c;
    public static final HashMap<String, String> d;
    public static final LinkedHashMap e;
    public final Class<?> b;

    static {
        int i = 0;
        List K = f1.K(com.amazon.aps.iva.xb0.a.class, com.amazon.aps.iva.xb0.l.class, com.amazon.aps.iva.xb0.p.class, com.amazon.aps.iva.xb0.q.class, com.amazon.aps.iva.xb0.r.class, com.amazon.aps.iva.xb0.s.class, com.amazon.aps.iva.xb0.t.class, com.amazon.aps.iva.xb0.u.class, com.amazon.aps.iva.xb0.v.class, com.amazon.aps.iva.xb0.w.class, com.amazon.aps.iva.xb0.b.class, com.amazon.aps.iva.xb0.c.class, com.amazon.aps.iva.xb0.d.class, com.amazon.aps.iva.xb0.e.class, com.amazon.aps.iva.xb0.f.class, com.amazon.aps.iva.xb0.g.class, com.amazon.aps.iva.xb0.h.class, com.amazon.aps.iva.xb0.i.class, com.amazon.aps.iva.xb0.j.class, com.amazon.aps.iva.xb0.k.class, com.amazon.aps.iva.xb0.m.class, com.amazon.aps.iva.xb0.n.class, com.amazon.aps.iva.xb0.o.class);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(K));
        for (Object obj : K) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new com.amazon.aps.iva.kb0.j((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        c = com.amazon.aps.iva.lb0.i0.Z(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
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
        j.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.e(str, "kotlinName");
            sb.append(com.amazon.aps.iva.oe0.q.K0('.', str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends com.amazon.aps.iva.kb0.a<?>>, Integer> entry : c.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, com.amazon.aps.iva.oe0.q.K0('.', str2, str2));
        }
        e = linkedHashMap;
    }

    public d(Class<?> cls) {
        j.f(cls, "jClass");
        this.b = cls;
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final Collection<com.amazon.aps.iva.fc0.g<Object>> e() {
        throw new com.amazon.aps.iva.wb0.a();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && j.a(com.amazon.aps.iva.ab.t.p(this), com.amazon.aps.iva.ab.t.p((com.amazon.aps.iva.fc0.d) obj))) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final boolean f(Object obj) {
        Class<?> cls = this.b;
        j.f(cls, "jClass");
        Map<Class<? extends com.amazon.aps.iva.kb0.a<?>>, Integer> map = c;
        j.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(cls);
        if (num != null) {
            return h0.f(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = com.amazon.aps.iva.ab.t.p(e0.a(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final List<com.amazon.aps.iva.fc0.p> g() {
        throw new com.amazon.aps.iva.wb0.a();
    }

    @Override // com.amazon.aps.iva.yb0.c
    public final Class<?> h() {
        return this.b;
    }

    public final int hashCode() {
        return com.amazon.aps.iva.ab.t.p(this).hashCode();
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final String j() {
        String str;
        Class<?> cls = this.b;
        j.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap<String, String> hashMap = d;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = hashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getCanonicalName();
        }
        return str3;
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final String k() {
        String str;
        Class<?> cls = this.b;
        j.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return com.amazon.aps.iva.oe0.q.I0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return com.amazon.aps.iva.oe0.q.I0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return com.amazon.aps.iva.oe0.q.J0(simpleName, '$');
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = e;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final String toString() {
        return this.b.toString() + " (Kotlin reflection is not available)";
    }
}
