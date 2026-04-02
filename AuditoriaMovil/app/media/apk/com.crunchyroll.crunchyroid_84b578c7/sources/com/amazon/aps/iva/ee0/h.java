package com.amazon.aps.iva.ee0;

import java.util.Collection;
import java.util.List;
/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes4.dex */
public abstract class h extends n {
    public final com.amazon.aps.iva.de0.i<a> b;

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final Collection<e0> a;
        public List<? extends e0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends e0> collection) {
            com.amazon.aps.iva.yb0.j.f(collection, "allSupertypes");
            this.a = collection;
            this.b = f1.J(com.amazon.aps.iva.ge0.k.d);
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final a invoke() {
            return new a(h.this.d());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, a> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final a invoke(Boolean bool) {
            bool.booleanValue();
            return new a(f1.J(com.amazon.aps.iva.ge0.k.d));
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(a aVar) {
            List list;
            a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "supertypes");
            h hVar = h.this;
            List a = hVar.h().a(hVar, aVar2.a, new i(hVar), new j(hVar));
            List<e0> list2 = null;
            if (a.isEmpty()) {
                e0 e = hVar.e();
                if (e != null) {
                    list = f1.J(e);
                } else {
                    list = null;
                }
                if (list == null) {
                    list = com.amazon.aps.iva.lb0.z.b;
                }
                a = list;
            }
            if (a instanceof List) {
                list2 = (List) a;
            }
            if (list2 == null) {
                list2 = com.amazon.aps.iva.lb0.x.X0(a);
            }
            List<e0> m = hVar.m(list2);
            com.amazon.aps.iva.yb0.j.f(m, "<set-?>");
            aVar2.b = m;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public h(com.amazon.aps.iva.de0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        this.b = lVar.d(c.h, new d(), new b());
    }

    public abstract Collection<e0> d();

    public e0 e() {
        return null;
    }

    public Collection f() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    public abstract com.amazon.aps.iva.oc0.w0 h();

    @Override // com.amazon.aps.iva.ee0.c1
    /* renamed from: i */
    public final List<e0> g() {
        return this.b.invoke().b;
    }

    public void n(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
    }

    public List<e0> m(List<e0> list) {
        return list;
    }
}
