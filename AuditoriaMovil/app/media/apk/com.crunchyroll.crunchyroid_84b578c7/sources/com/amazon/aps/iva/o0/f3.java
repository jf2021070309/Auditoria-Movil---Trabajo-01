package com.amazon.aps.iva.o0;
/* compiled from: SnapshotLongState.kt */
/* loaded from: classes.dex */
public class f3 implements com.amazon.aps.iva.y0.h0, p1, com.amazon.aps.iva.y0.t<Long> {
    public a b;

    /* compiled from: SnapshotLongState.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.y0.i0 {
        public long c;

        public a(long j) {
            this.c = j;
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

    public f3(long j) {
        this.b = new a(j);
    }

    @Override // com.amazon.aps.iva.y0.t
    public final h3<Long> b() {
        return s3.a;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final void g(com.amazon.aps.iva.y0.i0 i0Var) {
        this.b = (a) i0Var;
    }

    @Override // com.amazon.aps.iva.o0.p1
    public final long m() {
        return ((a) com.amazon.aps.iva.y0.m.u(this.b, this)).c;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 n() {
        return this.b;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) com.amazon.aps.iva.y0.m.i(this.b)).c + ")@" + hashCode();
    }

    @Override // com.amazon.aps.iva.o0.p1
    public final void w(long j) {
        com.amazon.aps.iva.y0.h k;
        a aVar = (a) com.amazon.aps.iva.y0.m.i(this.b);
        if (aVar.c != j) {
            a aVar2 = this.b;
            synchronized (com.amazon.aps.iva.y0.m.c) {
                k = com.amazon.aps.iva.y0.m.k();
                ((a) com.amazon.aps.iva.y0.m.p(aVar2, this, k, aVar)).c = j;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.y0.m.o(k, this);
        }
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 x(com.amazon.aps.iva.y0.i0 i0Var, com.amazon.aps.iva.y0.i0 i0Var2, com.amazon.aps.iva.y0.i0 i0Var3) {
        if (((a) i0Var2).c != ((a) i0Var3).c) {
            return null;
        }
        return i0Var2;
    }
}
