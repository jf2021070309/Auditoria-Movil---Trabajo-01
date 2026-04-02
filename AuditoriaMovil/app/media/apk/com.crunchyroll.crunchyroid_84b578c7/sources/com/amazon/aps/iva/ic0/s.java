package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ic0.p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: KDeclarationContainerImpl.kt */
/* loaded from: classes4.dex */
public abstract class s implements com.amazon.aps.iva.yb0.c {
    public static final com.amazon.aps.iva.oe0.f b = new com.amazon.aps.iva.oe0.f("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    /* loaded from: classes4.dex */
    public abstract class a {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] b = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        public final p0.a a;

        /* compiled from: KDeclarationContainerImpl.kt */
        /* renamed from: com.amazon.aps.iva.ic0.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0364a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.tc0.h> {
            public final /* synthetic */ s h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0364a(s sVar) {
                super(0);
                this.h = sVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.tc0.h invoke() {
                return o0.a(this.h.h());
            }
        }

        public a(s sVar) {
            this.a = p0.c(new C0364a(sVar));
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* loaded from: classes4.dex */
    public enum b {
        DECLARED,
        INHERITED;

        public final boolean accept(com.amazon.aps.iva.oc0.b bVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(bVar, "member");
            boolean isReal = bVar.getKind().isReal();
            if (this == DECLARED) {
                z = true;
            } else {
                z = false;
            }
            if (isReal == z) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends d {
        @Override // com.amazon.aps.iva.ic0.d, com.amazon.aps.iva.oc0.m
        public final h<?> b(com.amazon.aps.iva.oc0.j jVar, com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(jVar, "descriptor");
            com.amazon.aps.iva.yb0.j.f(qVar, "data");
            throw new IllegalStateException("No constructors should appear here: " + jVar);
        }
    }

    public static Method w(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class x;
        Method w;
        if (z) {
            clsArr[0] = cls;
        }
        Method y = y(cls, str, clsArr, cls2);
        if (y != null) {
            return y;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (w = w(superclass, str, clsArr, cls2, z)) != null) {
            return w;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        com.amazon.aps.iva.yb0.j.e(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            com.amazon.aps.iva.yb0.j.e(cls3, "superInterface");
            Method w2 = w(cls3, str, clsArr, cls2, z);
            if (w2 != null) {
                return w2;
            }
            if (z && (x = com.amazon.aps.iva.a60.b.x(com.amazon.aps.iva.uc0.d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method y2 = y(x, str, clsArr, cls2);
                if (y2 != null) {
                    return y2;
                }
            }
        }
        return null;
    }

    public static Method y(Class cls, String str, Class[] clsArr, Class cls2) {
        Method declaredMethod;
        boolean z;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (!com.amazon.aps.iva.yb0.j.a(declaredMethod.getReturnType(), cls2)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            com.amazon.aps.iva.yb0.j.e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (com.amazon.aps.iva.yb0.j.a(method.getName(), str) && com.amazon.aps.iva.yb0.j.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return method;
                }
            }
            return null;
        }
        return declaredMethod;
    }

    public final void n(String str, ArrayList arrayList, boolean z) {
        ArrayList v = v(str);
        arrayList.addAll(v);
        int size = ((v.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            com.amazon.aps.iva.yb0.j.e(cls, "TYPE");
            arrayList.add(cls);
        }
        if (z) {
            arrayList.remove(com.amazon.aps.iva.yb0.e.class);
            arrayList.add(com.amazon.aps.iva.yb0.e.class);
            return;
        }
        arrayList.add(Object.class);
    }

    public final Method o(String str, String str2) {
        Method w;
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "desc");
        if (com.amazon.aps.iva.yb0.j.a(str, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) v(str2).toArray(new Class[0]);
        Class x = x(com.amazon.aps.iva.oe0.q.q0(str2, ')', 0, false, 6) + 1, str2.length(), str2);
        Method w2 = w(t(), str, clsArr, x, false);
        if (w2 != null) {
            return w2;
        }
        if (!t().isInterface() || (w = w(Object.class, str, clsArr, x, false)) == null) {
            return null;
        }
        return w;
    }

    public abstract Collection<com.amazon.aps.iva.oc0.j> p();

    public abstract Collection<com.amazon.aps.iva.oc0.v> q(com.amazon.aps.iva.nd0.f fVar);

    public abstract com.amazon.aps.iva.oc0.n0 r(int i);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<com.amazon.aps.iva.ic0.h<?>> s(com.amazon.aps.iva.xd0.i r8, com.amazon.aps.iva.ic0.s.b r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "belonginess"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            com.amazon.aps.iva.ic0.s$c r0 = new com.amazon.aps.iva.ic0.s$c
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = com.amazon.aps.iva.xd0.l.a.a(r8, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            com.amazon.aps.iva.oc0.k r3 = (com.amazon.aps.iva.oc0.k) r3
            boolean r4 = r3 instanceof com.amazon.aps.iva.oc0.b
            if (r4 == 0) goto L4e
            r4 = r3
            com.amazon.aps.iva.oc0.b r4 = (com.amazon.aps.iva.oc0.b) r4
            com.amazon.aps.iva.oc0.r r5 = r4.getVisibility()
            com.amazon.aps.iva.oc0.q$k r6 = com.amazon.aps.iva.oc0.q.h
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L4e
            com.amazon.aps.iva.kb0.q r4 = com.amazon.aps.iva.kb0.q.a
            java.lang.Object r3 = r3.D0(r0, r4)
            com.amazon.aps.iva.ic0.h r3 = (com.amazon.aps.iva.ic0.h) r3
            goto L4f
        L4e:
            r3 = r1
        L4f:
            if (r3 == 0) goto L20
            r2.add(r3)
            goto L20
        L55:
            java.util.List r8 = com.amazon.aps.iva.lb0.x.X0(r2)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.s.s(com.amazon.aps.iva.xd0.i, com.amazon.aps.iva.ic0.s$b):java.util.Collection");
    }

    public Class<?> t() {
        Class<?> h = h();
        List<com.amazon.aps.iva.fc0.d<? extends Object>> list = com.amazon.aps.iva.uc0.d.a;
        com.amazon.aps.iva.yb0.j.f(h, "<this>");
        Class<? extends Object> cls = com.amazon.aps.iva.uc0.d.c.get(h);
        if (cls == null) {
            return h();
        }
        return cls;
    }

    public abstract Collection<com.amazon.aps.iva.oc0.n0> u(com.amazon.aps.iva.nd0.f fVar);

    public final ArrayList v(String str) {
        int q0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            if (com.amazon.aps.iva.oe0.q.j0("VZCBSIFJD", charAt)) {
                q0 = i2 + 1;
            } else if (charAt == 'L') {
                q0 = com.amazon.aps.iva.oe0.q.q0(str, ';', i, false, 4) + 1;
            } else {
                throw new com.amazon.aps.iva.wb0.a("Unknown type prefix in the method signature: ".concat(str));
            }
            arrayList.add(x(i, q0, str));
            i = q0;
        }
        return arrayList;
    }

    public final Class x(int i, int i2, String str) {
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader d = com.amazon.aps.iva.uc0.d.d(h());
            String substring = str.substring(i + 1, i2 - 1);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = d.loadClass(com.amazon.aps.iva.oe0.m.e0(substring, '/', '.'));
            com.amazon.aps.iva.yb0.j.e(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            Class x = x(i + 1, i2, str);
            com.amazon.aps.iva.nd0.c cVar = v0.a;
            com.amazon.aps.iva.yb0.j.f(x, "<this>");
            return Array.newInstance(x, 0).getClass();
        } else if (charAt == 'V') {
            Class cls = Void.TYPE;
            com.amazon.aps.iva.yb0.j.e(cls, "TYPE");
            return cls;
        } else if (charAt == 'Z') {
            return Boolean.TYPE;
        } else {
            if (charAt == 'C') {
                return Character.TYPE;
            }
            if (charAt == 'B') {
                return Byte.TYPE;
            }
            if (charAt == 'S') {
                return Short.TYPE;
            }
            if (charAt == 'I') {
                return Integer.TYPE;
            }
            if (charAt == 'F') {
                return Float.TYPE;
            }
            if (charAt == 'J') {
                return Long.TYPE;
            }
            if (charAt == 'D') {
                return Double.TYPE;
            }
            throw new com.amazon.aps.iva.wb0.a("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
