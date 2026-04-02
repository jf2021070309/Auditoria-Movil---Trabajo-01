package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ic0.f;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.jc0.a;
import com.amazon.aps.iva.jc0.g;
import com.amazon.aps.iva.md0.d;
import com.amazon.aps.iva.oc0.c1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: KFunctionImpl.kt */
/* loaded from: classes4.dex */
public final class w extends h<Object> implements com.amazon.aps.iva.yb0.g<Object>, com.amazon.aps.iva.fc0.g<Object>, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.b, com.amazon.aps.iva.xb0.c, com.amazon.aps.iva.xb0.d, com.amazon.aps.iva.xb0.e, com.amazon.aps.iva.xb0.f, com.amazon.aps.iva.xb0.g, com.amazon.aps.iva.xb0.h, com.amazon.aps.iva.xb0.i, com.amazon.aps.iva.xb0.j, com.amazon.aps.iva.xb0.k, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.m, com.amazon.aps.iva.xb0.n, com.amazon.aps.iva.xb0.o, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.xb0.r, com.amazon.aps.iva.xb0.s, com.amazon.aps.iva.xb0.t, com.amazon.aps.iva.xb0.u, com.amazon.aps.iva.xb0.v, com.amazon.aps.iva.xb0.w {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] m = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(w.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    public final s g;
    public final String h;
    public final Object i;
    public final p0.a j;
    public final com.amazon.aps.iva.kb0.e k;
    public final com.amazon.aps.iva.kb0.e l;

    /* compiled from: KFunctionImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jc0.f<? extends Executable>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.jc0.f<? extends Executable> invoke() {
            Object obj;
            com.amazon.aps.iva.jc0.g fVar;
            com.amazon.aps.iva.jc0.g gVar;
            com.amazon.aps.iva.nd0.b bVar = t0.a;
            w wVar = w.this;
            f c = t0.c(wVar.o());
            boolean z = c instanceof f.d;
            s sVar = wVar.g;
            if (z) {
                if (wVar.p()) {
                    Class<?> h = sVar.h();
                    List<com.amazon.aps.iva.fc0.k> parameters = wVar.getParameters();
                    ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(parameters));
                    for (com.amazon.aps.iva.fc0.k kVar : parameters) {
                        String name = kVar.getName();
                        com.amazon.aps.iva.yb0.j.c(name);
                        arrayList.add(name);
                    }
                    return new com.amazon.aps.iva.jc0.a(h, arrayList, a.EnumC0410a.POSITIONAL_CALL, a.b.KOTLIN);
                }
                String str = ((f.d) c).a.b;
                sVar.getClass();
                com.amazon.aps.iva.yb0.j.f(str, "desc");
                Class<?> h2 = sVar.h();
                try {
                    Class[] clsArr = (Class[]) sVar.v(str).toArray(new Class[0]);
                    obj = h2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                } catch (NoSuchMethodException unused) {
                    obj = null;
                }
            } else if (c instanceof f.e) {
                d.b bVar2 = ((f.e) c).a;
                obj = sVar.o(bVar2.a, bVar2.b);
            } else if (c instanceof f.c) {
                obj = ((f.c) c).a;
            } else if (c instanceof f.b) {
                obj = ((f.b) c).a;
            } else if (c instanceof f.a) {
                List<Method> list = ((f.a) c).a;
                Class<?> h3 = sVar.h();
                List<Method> list2 = list;
                ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                for (Method method : list2) {
                    arrayList2.add(method.getName());
                }
                return new com.amazon.aps.iva.jc0.a(h3, arrayList2, a.EnumC0410a.POSITIONAL_CALL, a.b.JAVA, list);
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
            if (obj instanceof Constructor) {
                gVar = w.r(wVar, (Constructor) obj, wVar.o(), false);
            } else if (obj instanceof Method) {
                Method method2 = (Method) obj;
                boolean isStatic = Modifier.isStatic(method2.getModifiers());
                Object obj2 = wVar.i;
                if (!isStatic) {
                    if (wVar.q()) {
                        fVar = new g.AbstractC0412g.a(method2, f1.q(obj2, wVar.o()));
                    } else {
                        fVar = new g.AbstractC0412g.d(method2);
                    }
                } else if (wVar.o().getAnnotations().h(v0.a) != null) {
                    if (wVar.q()) {
                        fVar = new g.AbstractC0412g.b(method2);
                    } else {
                        fVar = new g.AbstractC0412g.e(method2);
                    }
                } else if (wVar.q()) {
                    fVar = new g.AbstractC0412g.c(method2, f1.q(obj2, wVar.o()));
                } else {
                    fVar = new g.AbstractC0412g.f(method2);
                }
                gVar = fVar;
            } else {
                throw new com.amazon.aps.iva.wb0.a("Could not compute caller for function: " + wVar.o() + " (member = " + obj + ')');
            }
            return f1.u(gVar, wVar.o(), false);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jc0.f<? extends Executable>> {
        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.reflect.Member, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.jc0.f<? extends Executable> invoke() {
            GenericDeclaration declaredConstructor;
            com.amazon.aps.iva.jc0.g gVar;
            com.amazon.aps.iva.jc0.g fVar;
            com.amazon.aps.iva.nd0.b bVar = t0.a;
            w wVar = w.this;
            f c = t0.c(wVar.o());
            boolean z = c instanceof f.e;
            s sVar = wVar.g;
            com.amazon.aps.iva.jc0.f<? extends Executable> fVar2 = null;
            if (z) {
                d.b bVar2 = ((f.e) c).a;
                String str = bVar2.a;
                ?? b = wVar.i().b();
                com.amazon.aps.iva.yb0.j.c(b);
                boolean z2 = !Modifier.isStatic(b.getModifiers());
                sVar.getClass();
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String str2 = bVar2.b;
                com.amazon.aps.iva.yb0.j.f(str2, "desc");
                if (!com.amazon.aps.iva.yb0.j.a(str, "<init>")) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        arrayList.add(sVar.h());
                    }
                    sVar.n(str2, arrayList, false);
                    declaredConstructor = s.w(sVar.t(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), sVar.x(com.amazon.aps.iva.oe0.q.q0(str2, ')', 0, false, 6) + 1, str2.length(), str2), z2);
                }
                declaredConstructor = null;
            } else {
                if (c instanceof f.d) {
                    if (wVar.p()) {
                        Class<?> h = sVar.h();
                        List<com.amazon.aps.iva.fc0.k> parameters = wVar.getParameters();
                        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(parameters));
                        for (com.amazon.aps.iva.fc0.k kVar : parameters) {
                            String name = kVar.getName();
                            com.amazon.aps.iva.yb0.j.c(name);
                            arrayList2.add(name);
                        }
                        return new com.amazon.aps.iva.jc0.a(h, arrayList2, a.EnumC0410a.CALL_BY_NAME, a.b.KOTLIN);
                    }
                    String str3 = ((f.d) c).a.b;
                    sVar.getClass();
                    com.amazon.aps.iva.yb0.j.f(str3, "desc");
                    Class<?> h2 = sVar.h();
                    ArrayList arrayList3 = new ArrayList();
                    sVar.n(str3, arrayList3, true);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    try {
                        Class[] clsArr = (Class[]) arrayList3.toArray(new Class[0]);
                        declaredConstructor = h2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (c instanceof f.a) {
                    List<Method> list = ((f.a) c).a;
                    Class<?> h3 = sVar.h();
                    List<Method> list2 = list;
                    ArrayList arrayList4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                    for (Method method : list2) {
                        arrayList4.add(method.getName());
                    }
                    return new com.amazon.aps.iva.jc0.a(h3, arrayList4, a.EnumC0410a.CALL_BY_NAME, a.b.JAVA, list);
                }
                declaredConstructor = null;
            }
            if (declaredConstructor instanceof Constructor) {
                gVar = w.r(wVar, (Constructor) declaredConstructor, wVar.o(), true);
            } else if (declaredConstructor instanceof Method) {
                if (wVar.o().getAnnotations().h(v0.a) != null) {
                    com.amazon.aps.iva.oc0.k d = wVar.o().d();
                    com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((com.amazon.aps.iva.oc0.e) d).X()) {
                        Method method2 = (Method) declaredConstructor;
                        if (wVar.q()) {
                            fVar = new g.AbstractC0412g.b(method2);
                        } else {
                            fVar = new g.AbstractC0412g.e(method2);
                        }
                        gVar = fVar;
                    }
                }
                Method method3 = (Method) declaredConstructor;
                if (wVar.q()) {
                    fVar = new g.AbstractC0412g.c(method3, f1.q(wVar.i, wVar.o()));
                } else {
                    fVar = new g.AbstractC0412g.f(method3);
                }
                gVar = fVar;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                fVar2 = f1.u(gVar, wVar.o(), true);
            }
            return fVar2;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.v> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oc0.v invoke() {
            List q;
            String concat;
            w wVar = w.this;
            s sVar = wVar.g;
            sVar.getClass();
            String str = this.i;
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str2 = wVar.h;
            com.amazon.aps.iva.yb0.j.f(str2, "signature");
            if (com.amazon.aps.iva.yb0.j.a(str, "<init>")) {
                q = com.amazon.aps.iva.lb0.x.X0(sVar.p());
            } else {
                q = sVar.q(com.amazon.aps.iva.nd0.f.h(str));
            }
            Collection<com.amazon.aps.iva.oc0.v> collection = q;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (com.amazon.aps.iva.yb0.j.a(t0.c((com.amazon.aps.iva.oc0.v) obj).a(), str2)) {
                    arrayList.add(obj);
                }
            }
            boolean z = true;
            if (arrayList.size() != 1) {
                String B0 = com.amazon.aps.iva.lb0.x.B0(collection, "\n", null, null, t.h, 30);
                StringBuilder b = com.amazon.aps.iva.n4.a.b("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                b.append(sVar);
                b.append(':');
                if (B0.length() != 0) {
                    z = false;
                }
                if (z) {
                    concat = " no members found";
                } else {
                    concat = "\n".concat(B0);
                }
                b.append(concat);
                throw new com.amazon.aps.iva.wb0.a(b.toString());
            }
            return (com.amazon.aps.iva.oc0.v) com.amazon.aps.iva.lb0.x.P0(arrayList);
        }
    }

    public w(s sVar, String str, String str2, com.amazon.aps.iva.oc0.v vVar, Object obj) {
        this.g = sVar;
        this.h = str2;
        this.i = obj;
        this.j = new p0.a(vVar, new c(str));
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.k = com.amazon.aps.iva.kb0.f.a(gVar, new a());
        this.l = com.amazon.aps.iva.kb0.f.a(gVar, new b());
    }

    public static final com.amazon.aps.iva.jc0.g r(w wVar, Constructor constructor, com.amazon.aps.iva.oc0.v vVar, boolean z) {
        com.amazon.aps.iva.oc0.d dVar;
        boolean z2;
        if (!z) {
            wVar.getClass();
            if (vVar instanceof com.amazon.aps.iva.oc0.d) {
                dVar = (com.amazon.aps.iva.oc0.d) vVar;
            } else {
                dVar = null;
            }
            if (dVar != null && !com.amazon.aps.iva.oc0.q.e(dVar.getVisibility())) {
                com.amazon.aps.iva.oc0.e Z = dVar.Z();
                com.amazon.aps.iva.yb0.j.e(Z, "constructorDescriptor.constructedClass");
                if (!com.amazon.aps.iva.qd0.k.b(Z) && !com.amazon.aps.iva.qd0.i.q(dVar.Z())) {
                    List<c1> f = dVar.f();
                    com.amazon.aps.iva.yb0.j.e(f, "constructorDescriptor.valueParameters");
                    List<c1> list = f;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (c1 c1Var : list) {
                            com.amazon.aps.iva.ee0.e0 type = c1Var.getType();
                            com.amazon.aps.iva.yb0.j.e(type, "it.type");
                            if (com.amazon.aps.iva.aq.j.L(type)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            z2 = false;
            if (z2) {
                if (wVar.q()) {
                    return new g.a(constructor, f1.q(wVar.i, wVar.o()));
                }
                return new g.b(constructor);
            }
        }
        if (wVar.q()) {
            return new g.c(constructor, f1.q(wVar.i, wVar.o()));
        }
        return new g.d(constructor);
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final Object K(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // com.amazon.aps.iva.xb0.t
    public final Object S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // com.amazon.aps.iva.xb0.s
    public final Object V0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final boolean equals(Object obj) {
        w b2 = v0.b(obj);
        if (b2 == null || !com.amazon.aps.iva.yb0.j.a(this.g, b2.g) || !com.amazon.aps.iva.yb0.j.a(getName(), b2.getName()) || !com.amazon.aps.iva.yb0.j.a(this.h, b2.h) || !com.amazon.aps.iva.yb0.j.a(this.i, b2.i)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.yb0.g
    public final int getArity() {
        return com.amazon.aps.iva.aq.k.m(i());
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final String getName() {
        String b2 = o().getName().b();
        com.amazon.aps.iva.yb0.j.e(b2, "descriptor.name.asString()");
        return b2;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.h.hashCode() + ((hashCode + (this.g.hashCode() * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final com.amazon.aps.iva.jc0.f<?> i() {
        return (com.amazon.aps.iva.jc0.f) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // com.amazon.aps.iva.fc0.g
    public final boolean isExternal() {
        return o().isExternal();
    }

    @Override // com.amazon.aps.iva.fc0.g
    public final boolean isInfix() {
        return o().isInfix();
    }

    @Override // com.amazon.aps.iva.fc0.g
    public final boolean isInline() {
        return o().isInline();
    }

    @Override // com.amazon.aps.iva.fc0.g
    public final boolean isOperator() {
        return o().isOperator();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final boolean isSuspend() {
        return o().isSuspend();
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final s m() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final com.amazon.aps.iva.jc0.f<?> n() {
        return (com.amazon.aps.iva.jc0.f) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final boolean q() {
        return !com.amazon.aps.iva.yb0.j.a(this.i, com.amazon.aps.iva.yb0.b.NO_RECEIVER);
    }

    @Override // com.amazon.aps.iva.ic0.h
    /* renamed from: s */
    public final com.amazon.aps.iva.oc0.v o() {
        com.amazon.aps.iva.fc0.l<Object> lVar = m[0];
        Object invoke = this.j.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
        return (com.amazon.aps.iva.oc0.v) invoke;
    }

    public final String toString() {
        com.amazon.aps.iva.pd0.d dVar = r0.a;
        return r0.b(o());
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(com.amazon.aps.iva.ic0.s r8, com.amazon.aps.iva.oc0.v r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "descriptor"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            com.amazon.aps.iva.nd0.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            com.amazon.aps.iva.yb0.j.e(r3, r0)
            com.amazon.aps.iva.ic0.f r0 = com.amazon.aps.iva.ic0.t0.c(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = com.amazon.aps.iva.yb0.b.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.w.<init>(com.amazon.aps.iva.ic0.s, com.amazon.aps.iva.oc0.v):void");
    }
}
