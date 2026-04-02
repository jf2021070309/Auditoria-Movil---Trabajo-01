package com.amazon.aps.iva.uc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.i0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: reflectClassUtil.kt */
/* loaded from: classes4.dex */
public final class d {
    public static final List<com.amazon.aps.iva.fc0.d<? extends Object>> a;
    public static final Map<Class<? extends Object>, Class<? extends Object>> b;
    public static final Map<Class<? extends Object>, Class<? extends Object>> c;
    public static final Map<Class<? extends com.amazon.aps.iva.kb0.a<?>>, Integer> d;

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ParameterizedType, ParameterizedType> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            ParameterizedType parameterizedType2 = parameterizedType;
            com.amazon.aps.iva.yb0.j.f(parameterizedType2, "it");
            Type ownerType = parameterizedType2.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ParameterizedType, com.amazon.aps.iva.ne0.h<? extends Type>> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ne0.h<? extends Type> invoke(ParameterizedType parameterizedType) {
            ParameterizedType parameterizedType2 = parameterizedType;
            com.amazon.aps.iva.yb0.j.f(parameterizedType2, "it");
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            com.amazon.aps.iva.yb0.j.e(actualTypeArguments, "it.actualTypeArguments");
            return com.amazon.aps.iva.lb0.o.M(actualTypeArguments);
        }
    }

    static {
        int i = 0;
        List<com.amazon.aps.iva.fc0.d<? extends Object>> K = f1.K(com.amazon.aps.iva.yb0.e0.a(Boolean.TYPE), com.amazon.aps.iva.yb0.e0.a(Byte.TYPE), com.amazon.aps.iva.yb0.e0.a(Character.TYPE), com.amazon.aps.iva.yb0.e0.a(Double.TYPE), com.amazon.aps.iva.yb0.e0.a(Float.TYPE), com.amazon.aps.iva.yb0.e0.a(Integer.TYPE), com.amazon.aps.iva.yb0.e0.a(Long.TYPE), com.amazon.aps.iva.yb0.e0.a(Short.TYPE));
        a = K;
        List<com.amazon.aps.iva.fc0.d<? extends Object>> list = K;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.fc0.d dVar = (com.amazon.aps.iva.fc0.d) it.next();
            arrayList.add(new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.ab.t.p(dVar), com.amazon.aps.iva.ab.t.q(dVar)));
        }
        b = i0.Z(arrayList);
        List<com.amazon.aps.iva.fc0.d<? extends Object>> list2 = a;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            com.amazon.aps.iva.fc0.d dVar2 = (com.amazon.aps.iva.fc0.d) it2.next();
            arrayList2.add(new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.ab.t.q(dVar2), com.amazon.aps.iva.ab.t.p(dVar2)));
        }
        c = i0.Z(arrayList2);
        List K2 = f1.K(com.amazon.aps.iva.xb0.a.class, com.amazon.aps.iva.xb0.l.class, com.amazon.aps.iva.xb0.p.class, com.amazon.aps.iva.xb0.q.class, com.amazon.aps.iva.xb0.r.class, com.amazon.aps.iva.xb0.s.class, com.amazon.aps.iva.xb0.t.class, com.amazon.aps.iva.xb0.u.class, com.amazon.aps.iva.xb0.v.class, com.amazon.aps.iva.xb0.w.class, com.amazon.aps.iva.xb0.b.class, com.amazon.aps.iva.xb0.c.class, com.amazon.aps.iva.xb0.d.class, com.amazon.aps.iva.xb0.e.class, com.amazon.aps.iva.xb0.f.class, com.amazon.aps.iva.xb0.g.class, com.amazon.aps.iva.xb0.h.class, com.amazon.aps.iva.xb0.i.class, com.amazon.aps.iva.xb0.j.class, com.amazon.aps.iva.xb0.k.class, com.amazon.aps.iva.xb0.m.class, com.amazon.aps.iva.xb0.n.class, com.amazon.aps.iva.xb0.o.class);
        ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(K2));
        for (Object obj : K2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(new com.amazon.aps.iva.kb0.j((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        d = i0.Z(arrayList3);
    }

    public static final com.amazon.aps.iva.nd0.b a(Class<?> cls) {
        boolean z;
        com.amazon.aps.iva.nd0.b a2;
        com.amazon.aps.iva.yb0.j.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                    if (cls.getSimpleName().length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Class<?> declaringClass = cls.getDeclaringClass();
                        if (declaringClass != null && (a2 = a(declaringClass)) != null) {
                            return a2.d(com.amazon.aps.iva.nd0.f.h(cls.getSimpleName()));
                        }
                        return com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(cls.getName()));
                    }
                }
                com.amazon.aps.iva.nd0.c cVar = new com.amazon.aps.iva.nd0.c(cls.getName());
                return new com.amazon.aps.iva.nd0.b(cVar.e(), com.amazon.aps.iva.nd0.c.j(cVar.f()), true);
            }
            throw new IllegalArgumentException(defpackage.e.d("Can't compute ClassId for array type: ", cls));
        }
        throw new IllegalArgumentException(defpackage.e.d("Can't compute ClassId for primitive type: ", cls));
    }

    public static final String b(Class<?> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException(defpackage.e.d("Unsupported primitive type: ", cls));
        } else if (cls.isArray()) {
            return com.amazon.aps.iva.oe0.m.e0(cls.getName(), '.', '/');
        } else {
            return "L" + com.amazon.aps.iva.oe0.m.e0(cls.getName(), '.', '/') + ';';
        }
    }

    public static final List<Type> c(Type type) {
        com.amazon.aps.iva.yb0.j.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            com.amazon.aps.iva.yb0.j.e(actualTypeArguments, "actualTypeArguments");
            return com.amazon.aps.iva.lb0.o.b0(actualTypeArguments);
        }
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.Y(com.amazon.aps.iva.ne0.k.R(type, a.h), b.h));
    }

    public static final ClassLoader d(Class<?> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            com.amazon.aps.iva.yb0.j.e(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }

    public static final boolean e(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
