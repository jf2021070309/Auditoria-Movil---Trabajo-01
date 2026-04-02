package com.amazon.aps.iva.o0;
/* compiled from: SnapshotFloatState.kt */
/* loaded from: classes.dex */
public class d3 implements com.amazon.aps.iva.y0.h0, n1, com.amazon.aps.iva.y0.t<Float> {
    public a b;

    /* compiled from: SnapshotFloatState.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.y0.i0 {
        public float c;

        public a(float f) {
            this.c = f;
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

    public d3(float f) {
        this.b = new a(f);
    }

    @Override // com.amazon.aps.iva.y0.t
    public final h3<Float> b() {
        return s3.a;
    }

    @Override // com.amazon.aps.iva.o0.n1
    public final float d() {
        return ((a) com.amazon.aps.iva.y0.m.u(this.b, this)).c;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final void g(com.amazon.aps.iva.y0.i0 i0Var) {
        this.b = (a) i0Var;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 n() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.o0.n1
    public final void q(float f) {
        boolean z;
        com.amazon.aps.iva.y0.h k;
        a aVar = (a) com.amazon.aps.iva.y0.m.i(this.b);
        if (aVar.c == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a aVar2 = this.b;
            synchronized (com.amazon.aps.iva.y0.m.c) {
                k = com.amazon.aps.iva.y0.m.k();
                ((a) com.amazon.aps.iva.y0.m.p(aVar2, this, k, aVar)).c = f;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.y0.m.o(k, this);
        }
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((a) com.amazon.aps.iva.y0.m.i(this.b)).c + ")@" + hashCode();
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 x(com.amazon.aps.iva.y0.i0 i0Var, com.amazon.aps.iva.y0.i0 i0Var2, com.amazon.aps.iva.y0.i0 i0Var3) {
        boolean z;
        if (((a) i0Var2).c == ((a) i0Var3).c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return i0Var2;
    }
}
