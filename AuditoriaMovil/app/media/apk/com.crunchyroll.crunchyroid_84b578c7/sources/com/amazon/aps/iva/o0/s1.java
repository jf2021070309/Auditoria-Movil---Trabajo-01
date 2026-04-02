package com.amazon.aps.iva.o0;
/* compiled from: Applier.kt */
/* loaded from: classes.dex */
public final class s1<N> implements d<N> {
    public final d<N> a;
    public final int b;
    public int c;

    public s1(d<N> dVar, int i) {
        com.amazon.aps.iva.yb0.j.f(dVar, "applier");
        this.a = dVar;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void a(int i, int i2, int i3) {
        int i4;
        if (this.c == 0) {
            i4 = this.b;
        } else {
            i4 = 0;
        }
        this.a.a(i + i4, i2 + i4, i3);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void b(int i, int i2) {
        int i3;
        if (this.c == 0) {
            i3 = this.b;
        } else {
            i3 = 0;
        }
        this.a.b(i + i3, i2);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void c(int i, N n) {
        int i2;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        this.a.c(i + i2, n);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void clear() {
        e0.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // com.amazon.aps.iva.o0.d
    public final N e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void f(int i, N n) {
        int i2;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        this.a.f(i + i2, n);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void g(N n) {
        this.c++;
        this.a.g(n);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void h() {
        boolean z;
        int i = this.c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c = i - 1;
            this.a.h();
            return;
        }
        e0.c("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }
}
