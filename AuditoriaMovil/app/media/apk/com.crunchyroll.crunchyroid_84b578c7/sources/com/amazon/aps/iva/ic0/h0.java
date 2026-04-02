package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.h;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.ic0.g;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.ld0.a;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.pc0.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
/* compiled from: KPropertyImpl.kt */
/* loaded from: classes4.dex */
public abstract class h0<V> extends h<V> implements com.amazon.aps.iva.fc0.l<V> {
    public static final Object m = new Object();
    public final s g;
    public final String h;
    public final String i;
    public final Object j;
    public final com.amazon.aps.iva.kb0.e<Field> k;
    public final p0.a<com.amazon.aps.iva.oc0.n0> l;

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes4.dex */
    public static abstract class a<PropertyType, ReturnType> extends h<ReturnType> implements com.amazon.aps.iva.fc0.g<ReturnType> {
        @Override // com.amazon.aps.iva.fc0.g
        public final boolean isExternal() {
            return r().isExternal();
        }

        @Override // com.amazon.aps.iva.fc0.g
        public final boolean isInfix() {
            return r().isInfix();
        }

        @Override // com.amazon.aps.iva.fc0.g
        public final boolean isInline() {
            return r().isInline();
        }

        @Override // com.amazon.aps.iva.fc0.g
        public final boolean isOperator() {
            return r().isOperator();
        }

        @Override // com.amazon.aps.iva.fc0.c
        public final boolean isSuspend() {
            return r().isSuspend();
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final s m() {
            return s().g;
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final com.amazon.aps.iva.jc0.f<?> n() {
            return null;
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final boolean q() {
            return s().q();
        }

        public abstract com.amazon.aps.iva.oc0.m0 r();

        public abstract h0<PropertyType> s();
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes4.dex */
    public static abstract class b<V> extends a<V, V> implements l.a<V> {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(b.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
        public final p0.a g = p0.c(new C0360b(this));
        public final com.amazon.aps.iva.kb0.e h = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new a(this));

        /* compiled from: KPropertyImpl.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jc0.f<?>> {
            public final /* synthetic */ b<V> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? extends V> bVar) {
                super(0);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.jc0.f<?> invoke() {
                return i0.a(this.h, true);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        /* renamed from: com.amazon.aps.iva.ic0.h0$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0360b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.o0> {
            public final /* synthetic */ b<V> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0360b(b<? extends V> bVar) {
                super(0);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.oc0.o0 invoke() {
                b<V> bVar = this.h;
                com.amazon.aps.iva.rc0.m0 getter = bVar.s().o().getGetter();
                if (getter == null) {
                    return com.amazon.aps.iva.qd0.h.c(bVar.s().o(), h.a.a);
                }
                return getter;
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(s(), ((b) obj).s())) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.fc0.c
        public final String getName() {
            return t1.b(new StringBuilder("<get-"), s().h, '>');
        }

        public final int hashCode() {
            return s().hashCode();
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final com.amazon.aps.iva.jc0.f<?> i() {
            return (com.amazon.aps.iva.jc0.f) this.h.getValue();
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final com.amazon.aps.iva.oc0.b o() {
            com.amazon.aps.iva.fc0.l<Object> lVar = i[0];
            Object invoke = this.g.invoke();
            com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
            return (com.amazon.aps.iva.oc0.o0) invoke;
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final com.amazon.aps.iva.oc0.m0 r() {
            com.amazon.aps.iva.fc0.l<Object> lVar = i[0];
            Object invoke = this.g.invoke();
            com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
            return (com.amazon.aps.iva.oc0.o0) invoke;
        }

        public final String toString() {
            return "getter of " + s();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes4.dex */
    public static abstract class c<V> extends a<V, com.amazon.aps.iva.kb0.q> implements h.a<V> {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
        public final p0.a g = p0.c(new b(this));
        public final com.amazon.aps.iva.kb0.e h = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new a(this));

        /* compiled from: KPropertyImpl.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jc0.f<?>> {
            public final /* synthetic */ c<V> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c<V> cVar) {
                super(0);
                this.h = cVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.jc0.f<?> invoke() {
                return i0.a(this.h, false);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        /* loaded from: classes4.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.p0> {
            public final /* synthetic */ c<V> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c<V> cVar) {
                super(0);
                this.h = cVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.oc0.p0 invoke() {
                c<V> cVar = this.h;
                com.amazon.aps.iva.oc0.p0 setter = cVar.s().o().getSetter();
                if (setter == null) {
                    return com.amazon.aps.iva.qd0.h.d(cVar.s().o(), h.a.a);
                }
                return setter;
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c) && com.amazon.aps.iva.yb0.j.a(s(), ((c) obj).s())) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.fc0.c
        public final String getName() {
            return t1.b(new StringBuilder("<set-"), s().h, '>');
        }

        public final int hashCode() {
            return s().hashCode();
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final com.amazon.aps.iva.jc0.f<?> i() {
            return (com.amazon.aps.iva.jc0.f) this.h.getValue();
        }

        @Override // com.amazon.aps.iva.ic0.h
        public final com.amazon.aps.iva.oc0.b o() {
            com.amazon.aps.iva.fc0.l<Object> lVar = i[0];
            Object invoke = this.g.invoke();
            com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
            return (com.amazon.aps.iva.oc0.p0) invoke;
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final com.amazon.aps.iva.oc0.m0 r() {
            com.amazon.aps.iva.fc0.l<Object> lVar = i[0];
            Object invoke = this.g.invoke();
            com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
            return (com.amazon.aps.iva.oc0.p0) invoke;
        }

        public final String toString() {
            return "setter of " + s();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.n0> {
        public final /* synthetic */ h0<V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(h0<? extends V> h0Var) {
            super(0);
            this.h = h0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oc0.n0 invoke() {
            String concat;
            h0<V> h0Var = this.h;
            s sVar = h0Var.g;
            sVar.getClass();
            String str = h0Var.h;
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str2 = h0Var.i;
            com.amazon.aps.iva.yb0.j.f(str2, "signature");
            com.amazon.aps.iva.oe0.e a = s.b.a(str2);
            boolean z = true;
            if (a != null) {
                if (a.c == null) {
                    a.c = new com.amazon.aps.iva.oe0.d(a);
                }
                com.amazon.aps.iva.oe0.d dVar = a.c;
                com.amazon.aps.iva.yb0.j.c(dVar);
                String str3 = (String) dVar.get(1);
                com.amazon.aps.iva.oc0.n0 r = sVar.r(Integer.parseInt(str3));
                if (r == null) {
                    StringBuilder c = com.amazon.aps.iva.k.q.c("Local property #", str3, " not found in ");
                    c.append(sVar.h());
                    throw new com.amazon.aps.iva.wb0.a(c.toString());
                }
                return r;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : sVar.u(com.amazon.aps.iva.nd0.f.h(str))) {
                if (com.amazon.aps.iva.yb0.j.a(t0.b((com.amazon.aps.iva.oc0.n0) obj).a(), str2)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        com.amazon.aps.iva.oc0.r visibility = ((com.amazon.aps.iva.oc0.n0) next).getVisibility();
                        Object obj2 = linkedHashMap.get(visibility);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(visibility, obj2);
                        }
                        ((List) obj2).add(next);
                    }
                    TreeMap treeMap = new TreeMap(new r(v.h));
                    treeMap.putAll(linkedHashMap);
                    Collection<V> values = treeMap.values();
                    com.amazon.aps.iva.yb0.j.e(values, "properties\n             …\n                }.values");
                    List list = (List) com.amazon.aps.iva.lb0.x.C0(values);
                    if (list.size() == 1) {
                        return (com.amazon.aps.iva.oc0.n0) com.amazon.aps.iva.lb0.x.t0(list);
                    }
                    String B0 = com.amazon.aps.iva.lb0.x.B0(sVar.u(com.amazon.aps.iva.nd0.f.h(str)), "\n", null, null, u.h, 30);
                    StringBuilder b = com.amazon.aps.iva.n4.a.b("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
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
                return (com.amazon.aps.iva.oc0.n0) com.amazon.aps.iva.lb0.x.P0(arrayList);
            }
            StringBuilder b2 = com.amazon.aps.iva.n4.a.b("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            b2.append(sVar);
            throw new com.amazon.aps.iva.wb0.a(b2.toString());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Field> {
        public final /* synthetic */ h0<V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(h0<? extends V> h0Var) {
            super(0);
            this.h = h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
            if (r7 != false) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.reflect.Field invoke() {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.h0.e.invoke():java.lang.Object");
        }
    }

    public h0(s sVar, String str, String str2, com.amazon.aps.iva.oc0.n0 n0Var, Object obj) {
        this.g = sVar;
        this.h = str;
        this.i = str2;
        this.j = obj;
        this.k = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new e(this));
        this.l = new p0.a<>(n0Var, new d(this));
    }

    public final boolean equals(Object obj) {
        h0<?> c2 = v0.c(obj);
        if (c2 == null || !com.amazon.aps.iva.yb0.j.a(this.g, c2.g) || !com.amazon.aps.iva.yb0.j.a(this.h, c2.h) || !com.amazon.aps.iva.yb0.j.a(this.i, c2.i) || !com.amazon.aps.iva.yb0.j.a(this.j, c2.j)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final String getName() {
        return this.h;
    }

    public final int hashCode() {
        return this.i.hashCode() + com.amazon.aps.iva.c80.a.b(this.h, this.g.hashCode() * 31, 31);
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final com.amazon.aps.iva.jc0.f<?> i() {
        return t().i();
    }

    @Override // com.amazon.aps.iva.fc0.l
    public final boolean isConst() {
        return o().isConst();
    }

    @Override // com.amazon.aps.iva.fc0.l
    public final boolean isLateinit() {
        return o().u0();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public final boolean isSuspend() {
        return false;
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final s m() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final com.amazon.aps.iva.jc0.f<?> n() {
        t().getClass();
        return null;
    }

    @Override // com.amazon.aps.iva.ic0.h
    public final boolean q() {
        return !com.amazon.aps.iva.yb0.j.a(this.j, com.amazon.aps.iva.yb0.b.NO_RECEIVER);
    }

    public final Member r() {
        boolean z;
        boolean z2;
        if (!o().B()) {
            return null;
        }
        com.amazon.aps.iva.nd0.b bVar = t0.a;
        g b2 = t0.b(o());
        if (b2 instanceof g.c) {
            g.c cVar = (g.c) b2;
            a.c cVar2 = cVar.c;
            boolean z3 = true;
            if ((cVar2.c & 16) == 16) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a.b bVar2 = cVar2.h;
                int i = bVar2.c;
                if ((i & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if ((i & 2) != 2) {
                        z3 = false;
                    }
                    if (z3) {
                        int i2 = bVar2.d;
                        com.amazon.aps.iva.kd0.c cVar3 = cVar.d;
                        return this.g.o(cVar3.getString(i2), cVar3.getString(bVar2.e));
                    }
                }
                return null;
            }
        }
        return this.k.getValue();
    }

    @Override // com.amazon.aps.iva.ic0.h
    /* renamed from: s */
    public final com.amazon.aps.iva.oc0.n0 o() {
        com.amazon.aps.iva.oc0.n0 invoke = this.l.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "_descriptor()");
        return invoke;
    }

    public abstract b<V> t();

    public final String toString() {
        com.amazon.aps.iva.pd0.d dVar = r0.a;
        return r0.c(o());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(s sVar, String str, String str2, Object obj) {
        this(sVar, str, str2, null, obj);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0(com.amazon.aps.iva.ic0.s r8, com.amazon.aps.iva.oc0.n0 r9) {
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
            com.amazon.aps.iva.ic0.g r0 = com.amazon.aps.iva.ic0.t0.b(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = com.amazon.aps.iva.yb0.b.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.h0.<init>(com.amazon.aps.iva.ic0.s, com.amazon.aps.iva.oc0.n0):void");
    }
}
