package com.amazon.aps.iva.s6;

import android.os.SystemClock;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
import java.util.List;
/* compiled from: BaseTrackSelection.java */
/* loaded from: classes.dex */
public abstract class c implements r {
    public final s0 a;
    public final int b;
    public final int[] c;
    public final com.amazon.aps.iva.q5.v[] d;
    public final long[] e;
    public int f;

    public c() {
        throw null;
    }

    public c(s0 s0Var, int[] iArr) {
        int i = 0;
        com.amazon.aps.iva.cq.b.C(iArr.length > 0);
        s0Var.getClass();
        this.a = s0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new com.amazon.aps.iva.q5.v[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = s0Var.e[iArr[i2]];
        }
        Arrays.sort(this.d, new b(0));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = s0Var.b(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.s6.r
    public final boolean b(int i, long j) {
        if (this.e[i] > j) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.s6.u
    public final int d(com.amazon.aps.iva.q5.v vVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == vVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.s6.u
    public final com.amazon.aps.iva.q5.v e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && Arrays.equals(this.c, cVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.s6.u
    public final int f(int i) {
        return this.c[i];
    }

    @Override // com.amazon.aps.iva.s6.r
    public final boolean h(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = b(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.b && !b; i2++) {
            if (i2 != i && !b(i2, elapsedRealtime)) {
                b = true;
            } else {
                b = false;
            }
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = g0.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // com.amazon.aps.iva.s6.u
    public final int l(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.s6.u
    public final int length() {
        return this.c.length;
    }

    @Override // com.amazon.aps.iva.s6.u
    public final s0 m() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.s6.r
    public final int q() {
        return this.c[c()];
    }

    @Override // com.amazon.aps.iva.s6.r
    public final com.amazon.aps.iva.q5.v r() {
        return this.d[c()];
    }

    @Override // com.amazon.aps.iva.s6.r
    public int u(List list, long j) {
        return list.size();
    }

    @Override // com.amazon.aps.iva.s6.r
    public void a() {
    }

    @Override // com.amazon.aps.iva.s6.r
    public void o() {
    }

    @Override // com.amazon.aps.iva.s6.r
    public void i(float f) {
    }
}
