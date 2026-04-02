package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.tc0.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: util.kt */
/* loaded from: classes4.dex */
public final class v0 {
    public static final com.amazon.aps.iva.nd0.c a = new com.amazon.aps.iva.nd0.c("kotlin.jvm.JvmStatic");

    /* compiled from: util.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.lc0.l.values().length];
            try {
                iArr[com.amazon.aps.iva.lc0.l.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.amazon.aps.iva.lc0.l.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static final h<?> a(Object obj) {
        h<?> hVar;
        if (obj instanceof h) {
            hVar = (h) obj;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            w b = b(obj);
            if (b == null) {
                return c(obj);
            }
            return b;
        }
        return hVar;
    }

    public static final w b(Object obj) {
        w wVar;
        com.amazon.aps.iva.yb0.h hVar;
        com.amazon.aps.iva.fc0.c cVar;
        if (obj instanceof w) {
            wVar = (w) obj;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            if (obj instanceof com.amazon.aps.iva.yb0.h) {
                hVar = (com.amazon.aps.iva.yb0.h) obj;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                cVar = hVar.compute();
            } else {
                cVar = null;
            }
            if (!(cVar instanceof w)) {
                return null;
            }
            return (w) cVar;
        }
        return wVar;
    }

    public static final h0<?> c(Object obj) {
        h0<?> h0Var;
        com.amazon.aps.iva.yb0.y yVar;
        com.amazon.aps.iva.fc0.c cVar;
        if (obj instanceof h0) {
            h0Var = (h0) obj;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            if (obj instanceof com.amazon.aps.iva.yb0.y) {
                yVar = (com.amazon.aps.iva.yb0.y) obj;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                cVar = yVar.compute();
            } else {
                cVar = null;
            }
            if (!(cVar instanceof h0)) {
                return null;
            }
            return (h0) cVar;
        }
        return h0Var;
    }

    public static final ArrayList d(com.amazon.aps.iva.pc0.a aVar) {
        boolean z;
        List J;
        Annotation i;
        com.amazon.aps.iva.uc0.e eVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.pc0.h annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (com.amazon.aps.iva.pc0.c cVar : annotations) {
            com.amazon.aps.iva.oc0.t0 g = cVar.g();
            if (g instanceof com.amazon.aps.iva.tc0.b) {
                i = ((com.amazon.aps.iva.tc0.b) g).b;
            } else if (g instanceof i.a) {
                com.amazon.aps.iva.uc0.v vVar = ((i.a) g).b;
                if (vVar instanceof com.amazon.aps.iva.uc0.e) {
                    eVar = (com.amazon.aps.iva.uc0.e) vVar;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    i = eVar.a;
                } else {
                    i = null;
                }
            } else {
                i = i(cVar);
            }
            if (i != null) {
                arrayList.add(i);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n((Annotation) it.next())).getSimpleName(), "Container")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Annotation annotation = (Annotation) it2.next();
                Class o = com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(annotation));
                if (com.amazon.aps.iva.yb0.j.a(o.getSimpleName(), "Container") && o.getAnnotation(com.amazon.aps.iva.yb0.g0.class) != null) {
                    Object invoke = o.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                    com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    J = com.amazon.aps.iva.lb0.m.B((Annotation[]) invoke);
                } else {
                    J = f1.J(annotation);
                }
                com.amazon.aps.iva.lb0.t.d0(arrayList2, J);
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        com.amazon.aps.iva.yb0.j.f(type, "type");
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (com.amazon.aps.iva.yb0.j.a(type, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Character.TYPE)) {
                return (char) 0;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Byte.TYPE)) {
                return (byte) 0;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Short.TYPE)) {
                return (short) 0;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Integer.TYPE)) {
                return 0;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Long.TYPE)) {
                return 0L;
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (com.amazon.aps.iva.yb0.j.a(type, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type);
        }
        return null;
    }

    public static final com.amazon.aps.iva.oc0.a f(Class cls, h.d dVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.kd0.a aVar, com.amazon.aps.iva.xb0.p pVar) {
        List<com.amazon.aps.iva.id0.r> list;
        com.amazon.aps.iva.yb0.j.f(cls, "moduleAnchor");
        com.amazon.aps.iva.yb0.j.f(dVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        com.amazon.aps.iva.yb0.j.f(aVar, "metadataVersion");
        com.amazon.aps.iva.yb0.j.f(pVar, "createDescriptor");
        com.amazon.aps.iva.tc0.h a2 = o0.a(cls);
        if (dVar instanceof com.amazon.aps.iva.id0.h) {
            list = ((com.amazon.aps.iva.id0.h) dVar).j;
        } else if (dVar instanceof com.amazon.aps.iva.id0.m) {
            list = ((com.amazon.aps.iva.id0.m) dVar).j;
        } else {
            throw new IllegalStateException(("Unsupported message: " + dVar).toString());
        }
        List<com.amazon.aps.iva.id0.r> list2 = list;
        com.amazon.aps.iva.ae0.l lVar = a2.a;
        com.amazon.aps.iva.oc0.c0 c0Var = lVar.b;
        com.amazon.aps.iva.kd0.h hVar = com.amazon.aps.iva.kd0.h.b;
        com.amazon.aps.iva.yb0.j.e(list2, "typeParameters");
        return (com.amazon.aps.iva.oc0.a) pVar.invoke(new com.amazon.aps.iva.ae0.x(new com.amazon.aps.iva.ae0.n(lVar, cVar, c0Var, gVar, hVar, aVar, null, null, list2)), dVar);
    }

    public static final com.amazon.aps.iva.oc0.q0 g(com.amazon.aps.iva.oc0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        if (aVar.J() != null) {
            com.amazon.aps.iva.oc0.k d = aVar.d();
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((com.amazon.aps.iva.oc0.e) d).F0();
        }
        return null;
    }

    public static final Class<?> h(ClassLoader classLoader, com.amazon.aps.iva.nd0.b bVar, int i) {
        String str = com.amazon.aps.iva.nc0.c.a;
        com.amazon.aps.iva.nd0.d i2 = bVar.b().i();
        com.amazon.aps.iva.yb0.j.e(i2, "kotlinClassId.asSingleFqName().toUnsafe()");
        com.amazon.aps.iva.nd0.b g = com.amazon.aps.iva.nc0.c.g(i2);
        if (g != null) {
            bVar = g;
        }
        String b = bVar.h().b();
        String b2 = bVar.i().b();
        if (com.amazon.aps.iva.yb0.j.a(b, "kotlin")) {
            switch (b2.hashCode()) {
                case -901856463:
                    if (b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (i > 0) {
            for (int i3 = 0; i3 < i; i3++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (b.length() > 0) {
            z = true;
        }
        if (z) {
            sb.append(b.concat("."));
        }
        sb.append(com.amazon.aps.iva.oe0.m.e0(b2, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return com.amazon.aps.iva.a60.b.x(classLoader, sb2);
    }

    public static final Annotation i(com.amazon.aps.iva.pc0.c cVar) {
        Class<?> cls;
        com.amazon.aps.iva.kb0.j jVar;
        com.amazon.aps.iva.oc0.e d = com.amazon.aps.iva.ud0.b.d(cVar);
        if (d != null) {
            cls = j(d);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = cVar.a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            com.amazon.aps.iva.nd0.f fVar = (com.amazon.aps.iva.nd0.f) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            com.amazon.aps.iva.yb0.j.e(classLoader, "annotationClass.classLoader");
            Object k = k((com.amazon.aps.iva.sd0.g) entry.getValue(), classLoader);
            if (k != null) {
                jVar = new com.amazon.aps.iva.kb0.j(fVar.b(), k);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        Map Z = com.amazon.aps.iva.lb0.i0.Z(arrayList);
        Set<String> keySet = Z.keySet();
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(keySet));
        for (String str : keySet) {
            arrayList2.add(cls.getDeclaredMethod(str, new Class[0]));
        }
        return (Annotation) com.amazon.aps.iva.jc0.c.a(cls, Z, arrayList2);
    }

    public static final Class<?> j(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        com.amazon.aps.iva.oc0.t0 g = eVar.g();
        com.amazon.aps.iva.yb0.j.e(g, FirebaseAnalytics.Param.SOURCE);
        if (g instanceof com.amazon.aps.iva.gd0.v) {
            com.amazon.aps.iva.gd0.t tVar = ((com.amazon.aps.iva.gd0.v) g).b;
            com.amazon.aps.iva.yb0.j.d(tVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((com.amazon.aps.iva.tc0.e) tVar).a;
        } else if (g instanceof i.a) {
            com.amazon.aps.iva.uc0.v vVar = ((i.a) g).b;
            com.amazon.aps.iva.yb0.j.d(vVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((com.amazon.aps.iva.uc0.r) vVar).a;
        } else {
            com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.ud0.b.f(eVar);
            if (f == null) {
                return null;
            }
            return h(com.amazon.aps.iva.uc0.d.d(eVar.getClass()), f, 0);
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v18, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v20, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v19, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.amazon.aps.iva.sd0.g<?> r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.v0.k(com.amazon.aps.iva.sd0.g, java.lang.ClassLoader):java.lang.Object");
    }
}
