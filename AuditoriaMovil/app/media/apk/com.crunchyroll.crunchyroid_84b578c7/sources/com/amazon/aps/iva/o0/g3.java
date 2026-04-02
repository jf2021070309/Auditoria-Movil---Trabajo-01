package com.amazon.aps.iva.o0;
/* compiled from: SnapshotState.kt */
/* loaded from: classes.dex */
public class g3<T> implements com.amazon.aps.iva.y0.h0, com.amazon.aps.iva.y0.t<T> {
    public final h3<T> b;
    public a<T> c;

    /* compiled from: SnapshotState.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends com.amazon.aps.iva.y0.i0 {
        public T c;

        public a(T t) {
            this.c = t;
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final void a(com.amazon.aps.iva.y0.i0 i0Var) {
            com.amazon.aps.iva.yb0.j.f(i0Var, "value");
            this.c = ((a) i0Var).c;
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final com.amazon.aps.iva.y0.i0 b() {
            return new a(this.c);
        }
    }

    public g3(T t, h3<T> h3Var) {
        com.amazon.aps.iva.yb0.j.f(h3Var, "policy");
        this.b = h3Var;
        this.c = new a<>(t);
    }

    @Override // com.amazon.aps.iva.y0.t
    public final h3<T> b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final void g(com.amazon.aps.iva.y0.i0 i0Var) {
        this.c = (a) i0Var;
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final T getValue() {
        return ((a) com.amazon.aps.iva.y0.m.u(this.c, this)).c;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 n() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.o0.q1
    public final void setValue(T t) {
        com.amazon.aps.iva.y0.h k;
        a aVar = (a) com.amazon.aps.iva.y0.m.i(this.c);
        if (!this.b.a(aVar.c, t)) {
            a<T> aVar2 = this.c;
            synchronized (com.amazon.aps.iva.y0.m.c) {
                k = com.amazon.aps.iva.y0.m.k();
                ((a) com.amazon.aps.iva.y0.m.p(aVar2, this, k, aVar)).c = t;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.y0.m.o(k, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((a) com.amazon.aps.iva.y0.m.i(this.c)).c + ")@" + hashCode();
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 x(com.amazon.aps.iva.y0.i0 i0Var, com.amazon.aps.iva.y0.i0 i0Var2, com.amazon.aps.iva.y0.i0 i0Var3) {
        a aVar = (a) i0Var;
        if (!this.b.a(((a) i0Var2).c, ((a) i0Var3).c)) {
            return null;
        }
        return i0Var2;
    }
}
