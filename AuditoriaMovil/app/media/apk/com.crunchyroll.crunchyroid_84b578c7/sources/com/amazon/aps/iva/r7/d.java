package com.amazon.aps.iva.r7;

import java.util.Collections;
import java.util.List;
/* compiled from: CeaSubtitle.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.q7.d {
    public final List<com.amazon.aps.iva.s5.a> b;

    public d(List<com.amazon.aps.iva.s5.a> list) {
        this.b = list;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        if (j >= 0) {
            return this.b;
        }
        return Collections.emptyList();
    }

    @Override // com.amazon.aps.iva.q7.d
    public final long c(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        return 0L;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        return 1;
    }
}
