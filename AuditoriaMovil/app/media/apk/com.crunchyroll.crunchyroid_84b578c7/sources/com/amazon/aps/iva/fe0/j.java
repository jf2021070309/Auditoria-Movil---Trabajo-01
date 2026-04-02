package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: NewCapturedType.kt */
/* loaded from: classes4.dex */
public final class j implements com.amazon.aps.iva.rd0.b {
    public final j1 a;
    public com.amazon.aps.iva.xb0.a<? extends List<? extends u1>> b;
    public final j c;
    public final y0 d;
    public final com.amazon.aps.iva.kb0.e e;

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends u1>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends u1> invoke() {
            com.amazon.aps.iva.xb0.a<? extends List<? extends u1>> aVar = j.this.b;
            if (aVar != null) {
                return aVar.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends u1>> {
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends u1> invoke() {
            Iterable iterable = (List) j.this.e.getValue();
            if (iterable == null) {
                iterable = z.b;
            }
            Iterable<u1> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable2));
            for (u1 u1Var : iterable2) {
                arrayList.add(u1Var.N0(this.i));
            }
            return arrayList;
        }
    }

    public j() {
        throw null;
    }

    public /* synthetic */ j(j1 j1Var, i iVar, j jVar, y0 y0Var, int i) {
        this(j1Var, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : jVar, (i & 8) != 0 ? null : y0Var);
    }

    @Override // com.amazon.aps.iva.rd0.b
    public final j1 b() {
        return this.a;
    }

    public final j c(f fVar) {
        b bVar;
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        j1 a2 = this.a.a(fVar);
        com.amazon.aps.iva.yb0.j.e(a2, "projection.refine(kotlinTypeRefiner)");
        if (this.b != null) {
            bVar = new b(fVar);
        } else {
            bVar = null;
        }
        j jVar = this.c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(a2, bVar, jVar, this.d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(j.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        if (jVar2 == jVar) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final Collection g() {
        Collection collection = (List) this.e.getValue();
        if (collection == null) {
            collection = z.b;
        }
        return collection;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<y0> getParameters() {
        return z.b;
    }

    public final int hashCode() {
        j jVar = this.c;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return super.hashCode();
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.lc0.k j() {
        e0 type = this.a.getType();
        com.amazon.aps.iva.yb0.j.e(type, "projection.type");
        return com.amazon.aps.iva.da0.a.n(type);
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
        return "CapturedType(" + this.a + ')';
    }

    public j(j1 j1Var, com.amazon.aps.iva.xb0.a<? extends List<? extends u1>> aVar, j jVar, y0 y0Var) {
        this.a = j1Var;
        this.b = aVar;
        this.c = jVar;
        this.d = y0Var;
        this.e = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new a());
    }
}
