package com.amazon.aps.iva.fc0;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
/* compiled from: TypesJVM.kt */
/* loaded from: classes4.dex */
public final class w {

    /* compiled from: TypesJVM.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final String a(Type type) {
        String name;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                com.amazon.aps.iva.ne0.h R = com.amazon.aps.iva.ne0.k.R(type, x.b);
                name = ((Class) com.amazon.aps.iva.ne0.s.a0(R)).getName() + com.amazon.aps.iva.oe0.m.d0(com.amazon.aps.iva.ne0.s.T(R), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            } else {
                name = cls.getName();
            }
            com.amazon.aps.iva.yb0.j.e(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }

    public static final Type b(p pVar, boolean z) {
        Class o;
        int i;
        e b = pVar.b();
        if (b instanceof q) {
            return new v((q) b);
        }
        if (b instanceof d) {
            d dVar = (d) b;
            if (z) {
                o = com.amazon.aps.iva.ab.t.p(dVar);
            } else {
                o = com.amazon.aps.iva.ab.t.o(dVar);
            }
            List<r> d = pVar.d();
            if (d.isEmpty()) {
                return o;
            }
            if (o.isArray()) {
                if (o.getComponentType().isPrimitive()) {
                    return o;
                }
                r rVar = (r) com.amazon.aps.iva.lb0.x.R0(d);
                if (rVar != null) {
                    s sVar = rVar.a;
                    if (sVar == null) {
                        i = -1;
                    } else {
                        i = a.a[sVar.ordinal()];
                    }
                    if (i != -1 && i != 1) {
                        if (i != 2 && i != 3) {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                        p pVar2 = rVar.b;
                        com.amazon.aps.iva.yb0.j.c(pVar2);
                        Type b2 = b(pVar2, false);
                        if (!(b2 instanceof Class)) {
                            return new com.amazon.aps.iva.fc0.a(b2);
                        }
                        return o;
                    }
                    return o;
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
            }
            return c(d, o);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + pVar);
    }

    public static final u c(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<r> list2 = list;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
            for (r rVar : list2) {
                arrayList.add(d(rVar));
            }
            return new u(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            List<r> list3 = list;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            for (r rVar2 : list3) {
                arrayList2.add(d(rVar2));
            }
            return new u(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            u c = c(list.subList(length, list.size()), declaringClass);
            List<r> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(subList));
            for (r rVar3 : subList) {
                arrayList3.add(d(rVar3));
            }
            return new u(cls, c, arrayList3);
        }
    }

    public static final Type d(r rVar) {
        s sVar = rVar.a;
        if (sVar == null) {
            return y.d;
        }
        p pVar = rVar.b;
        com.amazon.aps.iva.yb0.j.c(pVar);
        int i = a.a[sVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new y(b(pVar, true), null);
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return b(pVar, true);
        }
        return new y(null, b(pVar, true));
    }
}
