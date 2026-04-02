package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
import java.util.Iterator;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class u1<V extends p> implements t1<V> {
    public final q a;
    public V b;
    public V c;
    public V d;

    /* compiled from: VectorizedAnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class a implements q {
        public final /* synthetic */ a0 a;

        public a(a0 a0Var) {
            this.a = a0Var;
        }

        @Override // com.amazon.aps.iva.z.q
        public final a0 get(int i) {
            return this.a;
        }
    }

    public u1(q qVar) {
        this.a = qVar;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final long b(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        Iterator<Integer> it = com.amazon.aps.iva.aq.j.T(0, v.b()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int b = ((com.amazon.aps.iva.lb0.f0) it).b();
            j = Math.max(j, this.a.get(b).e(v.a(b), v2.a(b), v3.a(b)));
        }
        return j;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V e(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        if (this.b == null) {
            this.b = (V) com.amazon.aps.iva.e.z.J(v);
        }
        V v4 = this.b;
        if (v4 != null) {
            int b = v4.b();
            for (int i = 0; i < b; i++) {
                V v5 = this.b;
                if (v5 != null) {
                    v5.e(this.a.get(i).c(j, v.a(i), v2.a(i), v3.a(i)), i);
                } else {
                    com.amazon.aps.iva.yb0.j.m("valueVector");
                    throw null;
                }
            }
            V v6 = this.b;
            if (v6 != null) {
                return v6;
            }
            com.amazon.aps.iva.yb0.j.m("valueVector");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("valueVector");
        throw null;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V f(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        if (this.c == null) {
            this.c = (V) com.amazon.aps.iva.e.z.J(v3);
        }
        V v4 = this.c;
        if (v4 != null) {
            int b = v4.b();
            for (int i = 0; i < b; i++) {
                V v5 = this.c;
                if (v5 != null) {
                    v5.e(this.a.get(i).d(j, v.a(i), v2.a(i), v3.a(i)), i);
                } else {
                    com.amazon.aps.iva.yb0.j.m("velocityVector");
                    throw null;
                }
            }
            V v6 = this.c;
            if (v6 != null) {
                return v6;
            }
            com.amazon.aps.iva.yb0.j.m("velocityVector");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("velocityVector");
        throw null;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V g(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        if (this.d == null) {
            this.d = (V) com.amazon.aps.iva.e.z.J(v3);
        }
        V v4 = this.d;
        if (v4 != null) {
            int b = v4.b();
            for (int i = 0; i < b; i++) {
                V v5 = this.d;
                if (v5 != null) {
                    v5.e(this.a.get(i).b(v.a(i), v2.a(i), v3.a(i)), i);
                } else {
                    com.amazon.aps.iva.yb0.j.m("endVelocityVector");
                    throw null;
                }
            }
            V v6 = this.d;
            if (v6 != null) {
                return v6;
            }
            com.amazon.aps.iva.yb0.j.m("endVelocityVector");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("endVelocityVector");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(a0 a0Var) {
        this(new a(a0Var));
        com.amazon.aps.iva.yb0.j.f(a0Var, "anim");
    }
}
