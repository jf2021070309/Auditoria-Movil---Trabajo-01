package com.amazon.aps.iva.d6;

import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import java.io.IOException;
/* compiled from: EventSampleStream.java */
/* loaded from: classes.dex */
public final class g implements h0 {
    public final v b;
    public long[] d;
    public boolean e;
    public com.amazon.aps.iva.e6.f f;
    public boolean g;
    public int h;
    public final com.amazon.aps.iva.f7.c c = new com.amazon.aps.iva.f7.c();
    public long i = -9223372036854775807L;

    public g(com.amazon.aps.iva.e6.f fVar, v vVar, boolean z) {
        this.b = vVar;
        this.f = fVar;
        this.d = fVar.b;
        c(fVar, z);
    }

    public final void b(long j) {
        boolean z = true;
        int b = g0.b(this.d, j, true);
        this.h = b;
        if (!((this.e && b == this.d.length) ? false : false)) {
            j = -9223372036854775807L;
        }
        this.i = j;
    }

    public final void c(com.amazon.aps.iva.e6.f fVar, boolean z) {
        long j;
        int i = this.h;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.d[i - 1];
        }
        this.e = z;
        this.f = fVar;
        long[] jArr = fVar.b;
        this.d = jArr;
        long j2 = this.i;
        if (j2 != -9223372036854775807L) {
            b(j2);
        } else if (j != -9223372036854775807L) {
            this.h = g0.b(jArr, j, false);
        }
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final boolean g() {
        return true;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
        boolean z;
        int i2 = this.h;
        if (i2 == this.d.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.e) {
            fVar.b = 4;
            return -4;
        } else if ((i & 2) == 0 && this.g) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.h = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] a = this.c.a(this.f.a[i2]);
                fVar.m(a.length);
                fVar.d.put(a);
            }
            fVar.f = this.d[i2];
            fVar.b = 1;
            return -4;
        } else {
            g0Var.c = this.b;
            this.g = true;
            return -5;
        }
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final int o(long j) {
        int max = Math.max(this.h, g0.b(this.d, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final void a() throws IOException {
    }
}
