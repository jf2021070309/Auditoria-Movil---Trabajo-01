package com.amazon.aps.iva.q5;
/* compiled from: MediaPeriodId.java */
/* loaded from: classes.dex */
public class e0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public e0(Object obj) {
        this(-1L, obj);
    }

    public final boolean a() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.a.equals(e0Var.a) && this.b == e0Var.b && this.c == e0Var.c && this.d == e0Var.d && this.e == e0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public e0(long j, Object obj) {
        this(-1, -1, -1, j, obj);
    }

    public e0(e0 e0Var) {
        this.a = e0Var.a;
        this.b = e0Var.b;
        this.c = e0Var.c;
        this.d = e0Var.d;
        this.e = e0Var.e;
    }

    public e0(int i, int i2, int i3, long j, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
