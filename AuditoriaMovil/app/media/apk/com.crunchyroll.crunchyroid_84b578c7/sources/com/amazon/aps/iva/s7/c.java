package com.amazon.aps.iva.s7;

import com.amazon.aps.iva.q7.d;
import java.util.List;
/* compiled from: DvbSubtitle.java */
/* loaded from: classes.dex */
public final class c implements d {
    public final List<com.amazon.aps.iva.s5.a> b;

    public c(List<com.amazon.aps.iva.s5.a> list) {
        this.b = list;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        return -1;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        return this.b;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final long c(int i) {
        return 0L;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        return 1;
    }
}
