package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.o6.v;
/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes.dex */
public final class w0 {
    public final v.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public w0(v.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        com.amazon.aps.iva.cq.b.t(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        com.amazon.aps.iva.cq.b.t(z6);
        if (!z || (!z2 && !z3 && !z4)) {
            z7 = true;
        }
        com.amazon.aps.iva.cq.b.t(z7);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final w0 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new w0(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final w0 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new w0(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.b == w0Var.b && this.c == w0Var.c && this.d == w0Var.d && this.e == w0Var.e && this.f == w0Var.f && this.g == w0Var.g && this.h == w0Var.h && this.i == w0Var.i && com.amazon.aps.iva.t5.g0.a(this.a, w0Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
