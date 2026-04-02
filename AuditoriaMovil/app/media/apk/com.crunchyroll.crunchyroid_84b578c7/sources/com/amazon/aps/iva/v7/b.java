package com.amazon.aps.iva.v7;

import com.amazon.aps.iva.q7.d;
import com.amazon.aps.iva.t5.g0;
import java.util.Collections;
import java.util.List;
/* compiled from: SubripSubtitle.java */
/* loaded from: classes.dex */
public final class b implements d {
    public final com.amazon.aps.iva.s5.a[] b;
    public final long[] c;

    public b(com.amazon.aps.iva.s5.a[] aVarArr, long[] jArr) {
        this.b = aVarArr;
        this.c = jArr;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        long[] jArr = this.c;
        int b = g0.b(jArr, j, false);
        if (b >= jArr.length) {
            return -1;
        }
        return b;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        com.amazon.aps.iva.s5.a aVar;
        int f = g0.f(this.c, j, false);
        if (f != -1 && (aVar = this.b[f]) != com.amazon.aps.iva.s5.a.s) {
            return Collections.singletonList(aVar);
        }
        return Collections.emptyList();
    }

    @Override // com.amazon.aps.iva.q7.d
    public final long c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        long[] jArr = this.c;
        if (i >= jArr.length) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        return jArr[i];
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        return this.c.length;
    }
}
