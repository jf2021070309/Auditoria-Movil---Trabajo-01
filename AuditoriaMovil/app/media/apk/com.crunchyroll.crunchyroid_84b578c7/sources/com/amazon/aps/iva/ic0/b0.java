package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.hd0.a;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.ic0.s;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.tc0.e;
import com.amazon.aps.iva.xd0.b;
import com.amazon.aps.iva.xd0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: KPackageImpl.kt */
/* loaded from: classes4.dex */
public final class b0 extends s {
    public final Class<?> c;
    public final p0.b<a> d;

    /* compiled from: KPackageImpl.kt */
    /* loaded from: classes4.dex */
    public final class a extends s.a {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(a.class), "members", "getMembers()Ljava/util/Collection;"))};
        public final p0.a c;
        public final p0.a d;
        public final p0.b e;
        public final p0.b f;

        /* compiled from: KPackageImpl.kt */
        /* renamed from: com.amazon.aps.iva.ic0.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0358a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.tc0.e> {
            public final /* synthetic */ b0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0358a(b0 b0Var) {
                super(0);
                this.h = b0Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.tc0.e invoke() {
                return e.a.a(this.h.c);
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes4.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends h<?>>> {
            public final /* synthetic */ b0 h;
            public final /* synthetic */ a i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, b0 b0Var) {
                super(0);
                this.h = b0Var;
                this.i = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends h<?>> invoke() {
                a aVar = this.i;
                aVar.getClass();
                com.amazon.aps.iva.fc0.l<Object> lVar = a.g[1];
                Object invoke = aVar.d.invoke();
                com.amazon.aps.iva.yb0.j.e(invoke, "<get-scope>(...)");
                s.b bVar = s.b.DECLARED;
                return this.h.s((com.amazon.aps.iva.xd0.i) invoke, bVar);
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes4.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.n<? extends com.amazon.aps.iva.md0.f, ? extends com.amazon.aps.iva.id0.k, ? extends com.amazon.aps.iva.md0.e>> {
            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.n<? extends com.amazon.aps.iva.md0.f, ? extends com.amazon.aps.iva.id0.k, ? extends com.amazon.aps.iva.md0.e> invoke() {
                com.amazon.aps.iva.hd0.a aVar;
                String[] strArr;
                String[] strArr2;
                com.amazon.aps.iva.tc0.e a = a.a(a.this);
                if (a != null && (aVar = a.b) != null && (strArr = aVar.c) != null && (strArr2 = aVar.e) != null) {
                    com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.md0.f, com.amazon.aps.iva.id0.k> h = com.amazon.aps.iva.md0.h.h(strArr, strArr2);
                    return new com.amazon.aps.iva.kb0.n<>(h.b, h.c, aVar.b);
                }
                return null;
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes4.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Class<?>> {
            public final /* synthetic */ b0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b0 b0Var) {
                super(0);
                this.i = b0Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
            @Override // com.amazon.aps.iva.xb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Class<?> invoke() {
                /*
                    r6 = this;
                    com.amazon.aps.iva.ic0.b0$a r0 = com.amazon.aps.iva.ic0.b0.a.this
                    com.amazon.aps.iva.tc0.e r0 = com.amazon.aps.iva.ic0.b0.a.a(r0)
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    if (r0 == 0) goto L1d
                    com.amazon.aps.iva.hd0.a r0 = r0.b
                    if (r0 == 0) goto L1d
                    com.amazon.aps.iva.hd0.a$a r4 = r0.a
                    com.amazon.aps.iva.hd0.a$a r5 = com.amazon.aps.iva.hd0.a.EnumC0334a.MULTIFILE_CLASS_PART
                    if (r4 != r5) goto L17
                    r4 = r1
                    goto L18
                L17:
                    r4 = r2
                L18:
                    if (r4 == 0) goto L1d
                    java.lang.String r0 = r0.f
                    goto L1e
                L1d:
                    r0 = r3
                L1e:
                    if (r0 == 0) goto L3e
                    int r4 = r0.length()
                    if (r4 <= 0) goto L27
                    goto L28
                L27:
                    r1 = r2
                L28:
                    if (r1 == 0) goto L3e
                    com.amazon.aps.iva.ic0.b0 r1 = r6.i
                    java.lang.Class<?> r1 = r1.c
                    java.lang.ClassLoader r1 = r1.getClassLoader()
                    r2 = 47
                    r3 = 46
                    java.lang.String r0 = com.amazon.aps.iva.oe0.m.e0(r0, r2, r3)
                    java.lang.Class r3 = r1.loadClass(r0)
                L3e:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.b0.a.d.invoke():java.lang.Object");
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes4.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd0.i> {
            public e() {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.xd0.i invoke() {
                ?? J;
                String[] strArr;
                a aVar = a.this;
                com.amazon.aps.iva.tc0.e a = a.a(aVar);
                if (a != null) {
                    boolean z = false;
                    com.amazon.aps.iva.fc0.l<Object> lVar = s.a.b[0];
                    Object invoke = aVar.a.invoke();
                    com.amazon.aps.iva.yb0.j.e(invoke, "<get-moduleData>(...)");
                    com.amazon.aps.iva.tc0.a aVar2 = ((com.amazon.aps.iva.tc0.h) invoke).b;
                    aVar2.getClass();
                    ConcurrentHashMap<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.xd0.i> concurrentHashMap = aVar2.c;
                    com.amazon.aps.iva.nd0.b i = a.i();
                    com.amazon.aps.iva.xd0.i iVar = concurrentHashMap.get(i);
                    if (iVar == null) {
                        com.amazon.aps.iva.nd0.c h = a.i().h();
                        com.amazon.aps.iva.yb0.j.e(h, "fileClass.classId.packageFqName");
                        com.amazon.aps.iva.hd0.a aVar3 = a.b;
                        a.EnumC0334a enumC0334a = aVar3.a;
                        a.EnumC0334a enumC0334a2 = a.EnumC0334a.MULTIFILE_CLASS;
                        com.amazon.aps.iva.gd0.l lVar2 = aVar2.a;
                        if (enumC0334a == enumC0334a2) {
                            if (enumC0334a == enumC0334a2) {
                                z = true;
                            }
                            List<String> list = null;
                            if (z) {
                                strArr = aVar3.c;
                            } else {
                                strArr = null;
                            }
                            if (strArr != null) {
                                list = com.amazon.aps.iva.lb0.m.B(strArr);
                            }
                            if (list == null) {
                                list = com.amazon.aps.iva.lb0.z.b;
                            }
                            J = new ArrayList();
                            for (String str : list) {
                                com.amazon.aps.iva.gd0.t a2 = com.amazon.aps.iva.gd0.s.a(aVar2.b, com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(com.amazon.aps.iva.vd0.b.d(str).a.replace('/', '.'))), com.amazon.aps.iva.aq.j.E(lVar2.c().c));
                                if (a2 != null) {
                                    J.add(a2);
                                }
                            }
                        } else {
                            J = f1.J(a);
                        }
                        com.amazon.aps.iva.rc0.r rVar = new com.amazon.aps.iva.rc0.r(lVar2.c().b, h);
                        ArrayList arrayList = new ArrayList();
                        for (com.amazon.aps.iva.gd0.t tVar : (Iterable) J) {
                            com.amazon.aps.iva.ce0.m a3 = lVar2.a(rVar, tVar);
                            if (a3 != null) {
                                arrayList.add(a3);
                            }
                        }
                        iVar = b.a.a("package " + h + " (" + a + ')', com.amazon.aps.iva.lb0.x.X0(arrayList));
                        com.amazon.aps.iva.xd0.i putIfAbsent = concurrentHashMap.putIfAbsent(i, iVar);
                        if (putIfAbsent != null) {
                            iVar = putIfAbsent;
                        }
                    }
                    com.amazon.aps.iva.yb0.j.e(iVar, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                    return iVar;
                }
                return i.b.b;
            }
        }

        public a(b0 b0Var) {
            super(b0Var);
            this.c = p0.c(new C0358a(b0Var));
            this.d = p0.c(new e());
            this.e = new p0.b(new d(b0Var));
            this.f = new p0.b(new c());
            p0.c(new b(this, b0Var));
        }

        public static final com.amazon.aps.iva.tc0.e a(a aVar) {
            aVar.getClass();
            com.amazon.aps.iva.fc0.l<Object> lVar = g[0];
            return (com.amazon.aps.iva.tc0.e) aVar.c.invoke();
        }
    }

    /* compiled from: KPackageImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final a invoke() {
            return new a(b0.this);
        }
    }

    /* compiled from: KPackageImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ae0.x, com.amazon.aps.iva.id0.m, com.amazon.aps.iva.oc0.n0> {
        public static final c b = new c();

        public c() {
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

    public b0(Class<?> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "jClass");
        this.c = cls;
        this.d = p0.b(new b());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            if (com.amazon.aps.iva.yb0.j.a(this.c, ((b0) obj).c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.yb0.c
    public final Class<?> h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Collection<com.amazon.aps.iva.oc0.j> p() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Collection<com.amazon.aps.iva.oc0.v> q(com.amazon.aps.iva.nd0.f fVar) {
        a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.g[1];
        Object invoke2 = invoke.d.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke2, "<get-scope>(...)");
        return ((com.amazon.aps.iva.xd0.i) invoke2).b(fVar, com.amazon.aps.iva.wc0.d.FROM_REFLECTION);
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final com.amazon.aps.iva.oc0.n0 r(int i) {
        a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.g[3];
        com.amazon.aps.iva.kb0.n nVar = (com.amazon.aps.iva.kb0.n) invoke.f.invoke();
        if (nVar != null) {
            com.amazon.aps.iva.md0.f fVar = (com.amazon.aps.iva.md0.f) nVar.b;
            com.amazon.aps.iva.id0.k kVar = (com.amazon.aps.iva.id0.k) nVar.c;
            com.amazon.aps.iva.md0.e eVar = (com.amazon.aps.iva.md0.e) nVar.d;
            h.f<com.amazon.aps.iva.id0.k, List<com.amazon.aps.iva.id0.m>> fVar2 = com.amazon.aps.iva.ld0.a.n;
            com.amazon.aps.iva.yb0.j.e(fVar2, "packageLocalVariable");
            com.amazon.aps.iva.id0.m mVar = (com.amazon.aps.iva.id0.m) com.amazon.aps.iva.kd0.e.b(kVar, fVar2, i);
            if (mVar != null) {
                Class<?> cls = this.c;
                com.amazon.aps.iva.id0.s sVar = kVar.h;
                com.amazon.aps.iva.yb0.j.e(sVar, "packageProto.typeTable");
                return (com.amazon.aps.iva.oc0.n0) v0.f(cls, mVar, fVar, new com.amazon.aps.iva.kd0.g(sVar), eVar, c.b);
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Class<?> t() {
        a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.g[2];
        Class<?> cls = (Class) invoke.e.invoke();
        if (cls == null) {
            return this.c;
        }
        return cls;
    }

    public final String toString() {
        return "file class " + com.amazon.aps.iva.uc0.d.a(this.c).b();
    }

    @Override // com.amazon.aps.iva.ic0.s
    public final Collection<com.amazon.aps.iva.oc0.n0> u(com.amazon.aps.iva.nd0.f fVar) {
        a invoke = this.d.invoke();
        invoke.getClass();
        com.amazon.aps.iva.fc0.l<Object> lVar = a.g[1];
        Object invoke2 = invoke.d.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke2, "<get-scope>(...)");
        return ((com.amazon.aps.iva.xd0.i) invoke2).c(fVar, com.amazon.aps.iva.wc0.d.FROM_REFLECTION);
    }
}
