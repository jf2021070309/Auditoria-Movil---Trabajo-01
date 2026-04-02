package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.hd0.a;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.ic0.s;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.tc0.e;
import com.amazon.aps.iva.xd0.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: KClassImpl.kt */
/* loaded from: classes4.dex */
public final class n<T> extends s implements com.amazon.aps.iva.fc0.d<T>, q, n0 {
    public static final /* synthetic */ int e = 0;
    public final Class<T> c;
    public final p0.b<n<T>.a> d;

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes4.dex */
    public final class a extends s.a {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] n = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "annotations", "getAnnotations()Ljava/util/List;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        public final p0.a c;
        public final p0.a d;
        public final p0.a e;
        public final p0.a f;
        public final p0.a g;
        public final p0.a h;
        public final p0.a i;
        public final p0.a j;
        public final p0.a k;
        public final p0.a l;
        public final p0.a m;

        /* compiled from: KClassImpl.kt */
        /* renamed from: com.amazon.aps.iva.ic0.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0362a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0362a(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T>.a aVar = this.h;
                aVar.getClass();
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = a.n;
                com.amazon.aps.iva.fc0.l<Object> lVar = lVarArr[14];
                Object invoke = aVar.l.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke, "<get-allNonStaticMembers>(...)");
                com.amazon.aps.iva.fc0.l<Object> lVar2 = lVarArr[15];
                Object invoke2 = aVar.m.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke2, "<get-allStaticMembers>(...)");
                return com.amazon.aps.iva.lb0.x.L0((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T>.a aVar = this.h;
                aVar.getClass();
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = a.n;
                com.amazon.aps.iva.fc0.l<Object> lVar = lVarArr[10];
                Object invoke = aVar.h.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke, "<get-declaredNonStaticMembers>(...)");
                com.amazon.aps.iva.fc0.l<Object> lVar2 = lVarArr[12];
                Object invoke2 = aVar.j.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke2, "<get-inheritedNonStaticMembers>(...)");
                return com.amazon.aps.iva.lb0.x.L0((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T>.a aVar = this.h;
                aVar.getClass();
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = a.n;
                com.amazon.aps.iva.fc0.l<Object> lVar = lVarArr[11];
                Object invoke = aVar.i.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke, "<get-declaredStaticMembers>(...)");
                com.amazon.aps.iva.fc0.l<Object> lVar2 = lVarArr[13];
                Object invoke2 = aVar.k.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke2, "<get-inheritedStaticMembers>(...)");
                return com.amazon.aps.iva.lb0.x.L0((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends Annotation>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends Annotation> invoke() {
                return v0.d(this.h.a());
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.fc0.g<? extends T>>> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Object invoke() {
                n<T> nVar = this.h;
                Collection<com.amazon.aps.iva.oc0.j> p = nVar.p();
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(p));
                for (com.amazon.aps.iva.oc0.j jVar : p) {
                    arrayList.add(new w(nVar, jVar));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T>.a aVar = this.h;
                aVar.getClass();
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = a.n;
                com.amazon.aps.iva.fc0.l<Object> lVar = lVarArr[10];
                Object invoke = aVar.h.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke, "<get-declaredNonStaticMembers>(...)");
                com.amazon.aps.iva.fc0.l<Object> lVar2 = lVarArr[11];
                Object invoke2 = aVar.i.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke2, "<get-declaredStaticMembers>(...)");
                return com.amazon.aps.iva.lb0.x.L0((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T> nVar = this.h;
                return nVar.s(nVar.B(), s.b.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T> nVar = this.h;
                return nVar.s(nVar.C(), s.b.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.e> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.oc0.e invoke() {
                com.amazon.aps.iva.oc0.e a;
                a.EnumC0334a enumC0334a;
                int i;
                com.amazon.aps.iva.hd0.a aVar;
                int i2 = n.e;
                n<T> nVar = this.h;
                com.amazon.aps.iva.nd0.b z = nVar.z();
                n<T>.a invoke = nVar.d.invoke();
                invoke.getClass();
                com.amazon.aps.iva.fc0.l<Object> lVar = s.a.b[0];
                Object invoke2 = invoke.a.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke2, "<get-moduleData>(...)");
                boolean z2 = z.c;
                com.amazon.aps.iva.ae0.l lVar2 = ((com.amazon.aps.iva.tc0.h) invoke2).a;
                if (z2) {
                    a = lVar2.b(z);
                } else {
                    a = com.amazon.aps.iva.oc0.u.a(lVar2.b, z);
                }
                if (a == null) {
                    Class<T> cls = nVar.c;
                    com.amazon.aps.iva.tc0.e a2 = e.a.a(cls);
                    if (a2 != null && (aVar = a2.b) != null) {
                        enumC0334a = aVar.a;
                    } else {
                        enumC0334a = null;
                    }
                    if (enumC0334a == null) {
                        i = -1;
                    } else {
                        i = b.a[enumC0334a.ordinal()];
                    }
                    switch (i) {
                        case -1:
                        case 6:
                            throw new com.amazon.aps.iva.wb0.a(defpackage.e.d("Unresolved class: ", cls));
                        case 0:
                        default:
                            throw new com.amazon.aps.iva.kb0.h();
                        case 1:
                        case 2:
                        case 3:
                            throw new UnsupportedOperationException(defpackage.e.d("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: ", cls));
                        case 4:
                            throw new UnsupportedOperationException(defpackage.e.d("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: ", cls));
                        case 5:
                            throw new com.amazon.aps.iva.wb0.a("Unknown class: " + cls + " (kind = " + enumC0334a + ')');
                    }
                }
                return a;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T> nVar = this.h;
                return nVar.s(nVar.B(), s.b.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.ic0.h<?>>> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends com.amazon.aps.iva.ic0.h<?>> invoke() {
                n<T> nVar = this.h;
                return nVar.s(nVar.C(), s.b.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends n<? extends Object>>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends n<? extends Object>> invoke() {
                com.amazon.aps.iva.oc0.e eVar;
                Class<?> cls;
                n nVar;
                com.amazon.aps.iva.xd0.i Q = this.h.a().Q();
                com.amazon.aps.iva.yb0.j.e(Q, "descriptor.unsubstitutedInnerClassesScope");
                ArrayList arrayList = new ArrayList();
                for (T t : l.a.a(Q, null, 3)) {
                    if (!com.amazon.aps.iva.qd0.i.m((com.amazon.aps.iva.oc0.k) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.amazon.aps.iva.oc0.k kVar = (com.amazon.aps.iva.oc0.k) it.next();
                    if (kVar instanceof com.amazon.aps.iva.oc0.e) {
                        eVar = (com.amazon.aps.iva.oc0.e) kVar;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        cls = v0.j(eVar);
                    } else {
                        cls = null;
                    }
                    if (cls != null) {
                        nVar = new n(cls);
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        arrayList2.add(nVar);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<T> {
            public final /* synthetic */ n<T>.a h;
            public final /* synthetic */ n<T> i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(n<T>.a aVar, n<T> nVar) {
                super(0);
                this.h = aVar;
                this.i = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final T invoke() {
                Field declaredField;
                com.amazon.aps.iva.oc0.e a = this.h.a();
                if (a.getKind() != com.amazon.aps.iva.oc0.f.OBJECT) {
                    return null;
                }
                boolean X = a.X();
                n<T> nVar = this.i;
                if (X) {
                    LinkedHashSet linkedHashSet = com.amazon.aps.iva.lc0.c.a;
                    if (!com.amazon.aps.iva.dg.b.y(a)) {
                        declaredField = nVar.c.getEnclosingClass().getDeclaredField(a.getName().b());
                        T t = (T) declaredField.get(null);
                        com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                        return t;
                    }
                }
                declaredField = nVar.c.getDeclaredField("INSTANCE");
                T t2 = (T) declaredField.get(null);
                com.amazon.aps.iva.yb0.j.d(t2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t2;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: com.amazon.aps.iva.ic0.n$a$n  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0363n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
            public final /* synthetic */ n<T> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0363n(n<T> nVar) {
                super(0);
                this.h = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final String invoke() {
                n<T> nVar = this.h;
                if (nVar.c.isAnonymousClass()) {
                    return null;
                }
                com.amazon.aps.iva.nd0.b z = nVar.z();
                if (z.c) {
                    return null;
                }
                return z.b().b();
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends n<? extends T>>> {
            public final /* synthetic */ n<T>.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(n<T>.a aVar) {
                super(0);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Object invoke() {
                n nVar;
                Collection<com.amazon.aps.iva.oc0.e> x = this.h.a().x();
                com.amazon.aps.iva.yb0.j.e(x, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (com.amazon.aps.iva.oc0.e eVar : x) {
                    com.amazon.aps.iva.yb0.j.d(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> j = v0.j(eVar);
                    if (j != null) {
                        nVar = new n(j);
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        arrayList.add(nVar);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
            public final /* synthetic */ n<T> h;
            public final /* synthetic */ n<T>.a i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(a aVar, n nVar) {
                super(0);
                this.h = nVar;
                this.i = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final String invoke() {
                n<T> nVar = this.h;
                if (nVar.c.isAnonymousClass()) {
                    return null;
                }
                com.amazon.aps.iva.nd0.b z = nVar.z();
                if (z.c) {
                    this.i.getClass();
                    Class<T> cls = nVar.c;
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
                String b = z.j().b();
                com.amazon.aps.iva.yb0.j.e(b, "classId.shortClassName.asString()");
                return b;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends k0>> {
            public final /* synthetic */ n<T>.a h;
            public final /* synthetic */ n<T> i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(n<T>.a aVar, n<T> nVar) {
                super(0);
                this.h = aVar;
                this.i = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends k0> invoke() {
                boolean z;
                n<T>.a aVar = this.h;
                Collection<com.amazon.aps.iva.ee0.e0> g = aVar.a().h().g();
                com.amazon.aps.iva.yb0.j.e(g, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(g.size());
                for (com.amazon.aps.iva.ee0.e0 e0Var : g) {
                    com.amazon.aps.iva.yb0.j.e(e0Var, "kotlinType");
                    arrayList.add(new k0(e0Var, new com.amazon.aps.iva.ic0.o(e0Var, aVar, this.i)));
                }
                if (!com.amazon.aps.iva.lc0.k.I(aVar.a())) {
                    boolean z2 = true;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            com.amazon.aps.iva.oc0.f kind = com.amazon.aps.iva.qd0.i.c(((k0) it.next()).b).getKind();
                            com.amazon.aps.iva.yb0.j.e(kind, "getClassDescriptorForType(it.type).kind");
                            if (kind != com.amazon.aps.iva.oc0.f.INTERFACE && kind != com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        com.amazon.aps.iva.ee0.m0 f = com.amazon.aps.iva.ud0.b.e(aVar.a()).f();
                        com.amazon.aps.iva.yb0.j.e(f, "descriptor.builtIns.anyType");
                        arrayList.add(new k0(f, com.amazon.aps.iva.ic0.p.h));
                    }
                }
                return com.amazon.aps.iva.a60.b.l(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes4.dex */
        public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends m0>> {
            public final /* synthetic */ n<T>.a h;
            public final /* synthetic */ n<T> i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(n<T>.a aVar, n<T> nVar) {
                super(0);
                this.h = aVar;
                this.i = nVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends m0> invoke() {
                List<y0> n = this.h.a().n();
                com.amazon.aps.iva.yb0.j.e(n, "descriptor.declaredTypeParameters");
                List<y0> list = n;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
                for (y0 y0Var : list) {
                    com.amazon.aps.iva.yb0.j.e(y0Var, "descriptor");
                    arrayList.add(new m0(this.i, y0Var));
                }
                return arrayList;
            }
        }

        public a(n nVar) {
            super(nVar);
            this.c = p0.c(new i(nVar));
            p0.c(new d(this));
            this.d = p0.c(new p(this, nVar));
            this.e = p0.c(new C0363n(nVar));
            this.f = p0.c(new e(nVar));
            p0.c(new l(this));
            new m(this, nVar);
            p0.c(new r(this, nVar));
            this.g = p0.c(new q(this, nVar));
            p0.c(new o(this));
            this.h = p0.c(new g(nVar));
            this.i = p0.c(new h(nVar));
            this.j = p0.c(new j(nVar));
            this.k = p0.c(new k(nVar));
            this.l = p0.c(new b(this));
            this.m = p0.c(new c(this));
            p0.c(new f(this));
            p0.c(new C0362a(this));
        }

        public final com.amazon.aps.iva.oc0.e a() {
            com.amazon.aps.iva.fc0.l<Object> lVar = n[0];
            Object invoke = this.c.invoke();
            com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
            return (com.amazon.aps.iva.oc0.e) invoke;
        }
    }

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.EnumC0334a.values().length];
            try {
                iArr[a.EnumC0334a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0334a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0334a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0334a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC0334a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC0334a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<n<T>.a> {
        public final /* synthetic */ n<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n<T> nVar) {
            super(0);
            this.h = nVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            return new a(this.h);
        }
    }

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ae0.x, com.amazon.aps.iva.id0.m, com.amazon.aps.iva.oc0.n0> {
        public static final d b = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final com.amazon.aps.iva.fc0.f getOwner() {
            return com.amazon.aps.iva.yb0.e0.a(com.amazon.aps.iva.ae0.x.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.oc0.n0 invoke(com.amazon.aps.iva.ae0.x xVar, com.amazon.aps.iva.id0.m mVar) {
            com.amazon.aps.iva.ae0.x xVar2 = xVar;
            com.amazon.aps.iva.id0.m mVar2 = mVar;
            com.amazon.aps.iva.yb0.j.f(xVar2, "p0");
            com.amazon.aps.iva.yb0.j.f(mVar2, "p1");
            return xVar2.f(mVar2);
        }
    }

    public n(Class<T> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "jClass");
        this.c = cls;
        this.d = p0.b(new c(this));
    }

    @Override // com.amazon.aps.iva.ic0.q
    /* renamed from: A */
    public final com.amazon.aps.iva.oc0.e m() {
        return this.d.invoke().a();
    }

    public final com.amazon.aps.iva.xd0.i B() {
        return m().m().l();
    }

    public final com.amazon.aps.iva.xd0.i C() {
        com.amazon.aps.iva.xd0.i h0 = m().h0();
        com.amazon.aps.iva.yb0.j.e(h0, "descriptor.staticScope");
        return h0;
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final Collection<com.amazon.aps.iva.fc0.g<T>> e() {
        n<T>.a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.n[4];
        Object invoke2 = invoke.f.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke2, "<get-constructors>(...)");
        return (Collection) invoke2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n) && com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.ab.t.p(this), com.amazon.aps.iva.ab.t.p((com.amazon.aps.iva.fc0.d) obj))) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final boolean f(Object obj) {
        List<com.amazon.aps.iva.fc0.d<? extends Object>> list = com.amazon.aps.iva.uc0.d.a;
        Class<T> cls = this.c;
        com.amazon.aps.iva.yb0.j.f(cls, "<this>");
        Integer num = com.amazon.aps.iva.uc0.d.d.get(cls);
        if (num != null) {
            return com.amazon.aps.iva.yb0.h0.f(num.intValue(), obj);
        }
        Class<? extends Object> cls2 = com.amazon.aps.iva.uc0.d.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final List<com.amazon.aps.iva.fc0.p> g() {
        n<T>.a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.n[8];
        Object invoke2 = invoke.g.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke2, "<get-supertypes>(...)");
        return (List) invoke2;
    }

    @Override // com.amazon.aps.iva.yb0.c
    public final Class<T> h() {
        return this.c;
    }

    public final int hashCode() {
        return com.amazon.aps.iva.ab.t.p(this).hashCode();
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final String j() {
        n<T>.a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.n[3];
        return (String) invoke.e.invoke();
    }

    @Override // com.amazon.aps.iva.fc0.d
    public final String k() {
        n<T>.a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.n[2];
        return (String) invoke.d.invoke();
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Collection<com.amazon.aps.iva.oc0.j> p() {
        com.amazon.aps.iva.oc0.e m = m();
        if (m.getKind() != com.amazon.aps.iva.oc0.f.INTERFACE && m.getKind() != com.amazon.aps.iva.oc0.f.OBJECT) {
            Collection<com.amazon.aps.iva.oc0.d> e2 = m.e();
            com.amazon.aps.iva.yb0.j.e(e2, "descriptor.constructors");
            return e2;
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Collection<com.amazon.aps.iva.oc0.v> q(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.xd0.i B = B();
        com.amazon.aps.iva.wc0.d dVar = com.amazon.aps.iva.wc0.d.FROM_REFLECTION;
        return com.amazon.aps.iva.lb0.x.L0(C().b(fVar, dVar), B.b(fVar, dVar));
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final com.amazon.aps.iva.oc0.n0 r(int i) {
        com.amazon.aps.iva.ce0.d dVar;
        Class<?> declaringClass;
        Class<T> cls = this.c;
        if (com.amazon.aps.iva.yb0.j.a(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(declaringClass);
            com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((n) a2).r(i);
        }
        com.amazon.aps.iva.oc0.e m = m();
        if (m instanceof com.amazon.aps.iva.ce0.d) {
            dVar = (com.amazon.aps.iva.ce0.d) m;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        h.f<com.amazon.aps.iva.id0.b, List<com.amazon.aps.iva.id0.m>> fVar = com.amazon.aps.iva.ld0.a.j;
        com.amazon.aps.iva.yb0.j.e(fVar, "classLocalVariable");
        com.amazon.aps.iva.id0.m mVar = (com.amazon.aps.iva.id0.m) com.amazon.aps.iva.kd0.e.b(dVar.f, fVar, i);
        if (mVar == null) {
            return null;
        }
        Class<T> cls2 = this.c;
        com.amazon.aps.iva.ae0.n nVar = dVar.m;
        return (com.amazon.aps.iva.oc0.n0) v0.f(cls2, mVar, nVar.b, nVar.d, dVar.g, d.b);
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder("class ");
        com.amazon.aps.iva.nd0.b z = z();
        com.amazon.aps.iva.nd0.c h = z.h();
        com.amazon.aps.iva.yb0.j.e(h, "classId.packageFqName");
        if (h.d()) {
            concat = "";
        } else {
            concat = h.b().concat(".");
        }
        String e0 = com.amazon.aps.iva.oe0.m.e0(z.i().b(), '.', '$');
        sb.append(concat + e0);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Collection<com.amazon.aps.iva.oc0.n0> u(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.xd0.i B = B();
        com.amazon.aps.iva.wc0.d dVar = com.amazon.aps.iva.wc0.d.FROM_REFLECTION;
        return com.amazon.aps.iva.lb0.x.L0(C().c(fVar, dVar), B.c(fVar, dVar));
    }

    public final com.amazon.aps.iva.nd0.b z() {
        com.amazon.aps.iva.nd0.b bVar = t0.a;
        Class<T> cls = this.c;
        com.amazon.aps.iva.yb0.j.f(cls, "klass");
        com.amazon.aps.iva.lc0.l lVar = null;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            com.amazon.aps.iva.yb0.j.e(componentType, "klass.componentType");
            if (componentType.isPrimitive()) {
                lVar = com.amazon.aps.iva.vd0.c.get(componentType.getSimpleName()).getPrimitiveType();
            }
            if (lVar != null) {
                return new com.amazon.aps.iva.nd0.b(com.amazon.aps.iva.lc0.o.k, lVar.getArrayTypeName());
            }
            return com.amazon.aps.iva.nd0.b.l(o.a.g.h());
        } else if (com.amazon.aps.iva.yb0.j.a(cls, Void.TYPE)) {
            return t0.a;
        } else {
            if (cls.isPrimitive()) {
                lVar = com.amazon.aps.iva.vd0.c.get(cls.getSimpleName()).getPrimitiveType();
            }
            if (lVar != null) {
                return new com.amazon.aps.iva.nd0.b(com.amazon.aps.iva.lc0.o.k, lVar.getTypeName());
            }
            com.amazon.aps.iva.nd0.b a2 = com.amazon.aps.iva.uc0.d.a(cls);
            if (!a2.c) {
                String str = com.amazon.aps.iva.nc0.c.a;
                com.amazon.aps.iva.nd0.c b2 = a2.b();
                com.amazon.aps.iva.yb0.j.e(b2, "classId.asSingleFqName()");
                com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.nc0.c.f(b2);
                if (f != null) {
                    return f;
                }
                return a2;
            }
            return a2;
        }
    }
}
