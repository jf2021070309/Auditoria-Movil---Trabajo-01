package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.f0.t0;
import com.amazon.aps.iva.f0.v0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: LazyListItemProvider.kt */
/* loaded from: classes.dex */
public final class q implements p {
    public final g0 a;
    public final i b;
    public final d c;
    public final com.amazon.aps.iva.f0.r d;

    /* compiled from: LazyListItemProvider.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                q qVar = q.this;
                t0<h> t0Var = qVar.b.a;
                int i = this.i;
                com.amazon.aps.iva.f0.d<h> c = t0Var.c(i);
                c.c.c.K(qVar.c, Integer.valueOf(i - c.a), iVar2, 0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LazyListItemProvider.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;
        public final /* synthetic */ Object j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Object obj, int i2) {
            super(2);
            this.i = i;
            this.j = obj;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            int i = this.i;
            Object obj = this.j;
            q.this.f(i, obj, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public q(g0 g0Var, i iVar, d dVar, v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "state");
        com.amazon.aps.iva.yb0.j.f(iVar, "intervalContent");
        com.amazon.aps.iva.yb0.j.f(dVar, "itemScope");
        this.a = g0Var;
        this.b = iVar;
        this.c = dVar;
        this.d = v0Var;
    }

    @Override // com.amazon.aps.iva.f0.p
    public final int a(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        return this.d.a(obj);
    }

    @Override // com.amazon.aps.iva.f0.p
    public final int b() {
        return this.b.a.b;
    }

    @Override // com.amazon.aps.iva.f0.p
    public final Object c(int i) {
        com.amazon.aps.iva.f0.d<h> c = this.b.a.c(i);
        return c.c.getType().invoke(Integer.valueOf(i - c.a));
    }

    @Override // com.amazon.aps.iva.e0.p
    public final d d() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.e0.p
    public final com.amazon.aps.iva.f0.r e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.b, ((q) obj).b);
    }

    @Override // com.amazon.aps.iva.f0.p
    public final void f(int i, Object obj, com.amazon.aps.iva.o0.i iVar, int i2) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.o0.j g = iVar.g(-462424778);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.f0.a0.a(obj, i, this.a.q, com.amazon.aps.iva.v0.b.b(g, -824725566, new a(i)), g, ((i2 << 3) & 112) | 3592);
        j2 X = g.X();
        if (X != null) {
            X.d = new b(i, obj, i2);
        }
    }

    @Override // com.amazon.aps.iva.e0.p
    public final void g() {
        this.b.getClass();
    }

    @Override // com.amazon.aps.iva.f0.p
    public final Object getKey(int i) {
        Object invoke;
        Object key = this.d.getKey(i);
        if (key == null) {
            com.amazon.aps.iva.f0.d<h> c = this.b.a.c(i);
            int i2 = i - c.a;
            com.amazon.aps.iva.xb0.l<Integer, Object> key2 = c.c.getKey();
            if (key2 == null || (invoke = key2.invoke(Integer.valueOf(i2))) == null) {
                return new com.amazon.aps.iva.f0.b(i);
            }
            return invoke;
        }
        return key;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
