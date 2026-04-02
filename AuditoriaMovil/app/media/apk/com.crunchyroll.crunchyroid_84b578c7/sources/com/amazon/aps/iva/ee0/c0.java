package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.xd0.o;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: IntersectionTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class c0 implements c1, com.amazon.aps.iva.he0.g {
    public final e0 a;
    public final LinkedHashSet<e0> b;
    public final int c;

    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final m0 invoke(com.amazon.aps.iva.fe0.f fVar) {
            com.amazon.aps.iva.fe0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "kotlinTypeRefiner");
            return c0.this.e(fVar2).c();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l b;

        public b(com.amazon.aps.iva.xb0.l lVar) {
            this.b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            e0 e0Var = (e0) t;
            com.amazon.aps.iva.yb0.j.e(e0Var, "it");
            com.amazon.aps.iva.xb0.l lVar = this.b;
            String obj = lVar.invoke(e0Var).toString();
            e0 e0Var2 = (e0) t2;
            com.amazon.aps.iva.yb0.j.e(e0Var2, "it");
            return f1.t(obj, lVar.invoke(e0Var2).toString());
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, CharSequence> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<e0, Object> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.l<? super e0, ? extends Object> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.e(e0Var2, "it");
            return this.h.invoke(e0Var2).toString();
        }
    }

    public c0(AbstractCollection abstractCollection) {
        com.amazon.aps.iva.yb0.j.f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet<e0> linkedHashSet = new LinkedHashSet<>(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public final m0 c() {
        a1.c.getClass();
        return f0.g(a1.d, this, com.amazon.aps.iva.lb0.z.b, false, o.a.a("member scope for intersection type", this.b), new a());
    }

    public final String d(com.amazon.aps.iva.xb0.l<? super e0, ? extends Object> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "getProperTypeRelatedToStringify");
        return com.amazon.aps.iva.lb0.x.B0(com.amazon.aps.iva.lb0.x.T0(this.b, new b(lVar)), " & ", "{", "}", new c(lVar), 24);
    }

    public final c0 e(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        LinkedHashSet<e0> linkedHashSet = this.b;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(linkedHashSet));
        boolean z = false;
        for (e0 e0Var : linkedHashSet) {
            arrayList.add(e0Var.K0(fVar));
            z = true;
        }
        c0 c0Var = null;
        e0 e0Var2 = null;
        if (z) {
            e0 e0Var3 = this.a;
            if (e0Var3 != null) {
                e0Var2 = e0Var3.K0(fVar);
            }
            c0Var = new c0(new c0(arrayList).b, e0Var2);
        }
        if (c0Var == null) {
            return this;
        }
        return c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.b, ((c0) obj).b);
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final Collection<e0> g() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<com.amazon.aps.iva.oc0.y0> getParameters() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.lc0.k j() {
        com.amazon.aps.iva.lc0.k j = this.b.iterator().next().I0().j();
        com.amazon.aps.iva.yb0.j.e(j, "intersectedTypes.iterato…xt().constructor.builtIns");
        return j;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.oc0.h k() {
        return null;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return d(d0.h);
    }

    public c0(LinkedHashSet linkedHashSet, e0 e0Var) {
        this(linkedHashSet);
        this.a = e0Var;
    }
}
