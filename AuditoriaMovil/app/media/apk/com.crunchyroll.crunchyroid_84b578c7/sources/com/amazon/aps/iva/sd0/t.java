package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.lc0.o;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class t extends g<a> {

    /* compiled from: constantValues.kt */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: constantValues.kt */
        /* renamed from: com.amazon.aps.iva.sd0.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0704a extends a {
            public final e0 a;

            public C0704a(e0 e0Var) {
                this.a = e0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0704a) && com.amazon.aps.iva.yb0.j.a(this.a, ((C0704a) obj).a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* loaded from: classes4.dex */
        public static final class b extends a {
            public final f a;

            public b(f fVar) {
                this.a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(this.a, ((b) obj).a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.a + ')';
            }
        }
    }

    public t(a.C0704a c0704a) {
        super(c0704a);
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        e0 e0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        a1.c.getClass();
        a1 a1Var = a1.d;
        com.amazon.aps.iva.lc0.k j = c0Var.j();
        j.getClass();
        com.amazon.aps.iva.oc0.e j2 = j.j(o.a.P.h());
        T t = this.a;
        a aVar = (a) t;
        if (aVar instanceof a.C0704a) {
            e0Var = ((a.C0704a) t).a;
        } else if (aVar instanceof a.b) {
            f fVar = ((a.b) t).a;
            com.amazon.aps.iva.nd0.b bVar = fVar.a;
            com.amazon.aps.iva.oc0.e a2 = com.amazon.aps.iva.oc0.u.a(c0Var, bVar);
            int i = fVar.b;
            if (a2 == null) {
                com.amazon.aps.iva.ge0.j jVar = com.amazon.aps.iva.ge0.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String bVar2 = bVar.toString();
                com.amazon.aps.iva.yb0.j.e(bVar2, "classId.toString()");
                e0Var = com.amazon.aps.iva.ge0.k.c(jVar, bVar2, String.valueOf(i));
            } else {
                m0 m = a2.m();
                com.amazon.aps.iva.yb0.j.e(m, "descriptor.defaultType");
                u1 A = com.amazon.aps.iva.da0.a.A(m);
                for (int i2 = 0; i2 < i; i2++) {
                    A = c0Var.j().h(A, v1.INVARIANT);
                }
                e0Var = A;
            }
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return f0.e(a1Var, j2, f1.J(new l1(e0Var)));
    }

    public t(f fVar) {
        super(new a.b(fVar));
    }

    public t(com.amazon.aps.iva.nd0.b bVar, int i) {
        super(new a.b(new f(bVar, i)));
    }
}
