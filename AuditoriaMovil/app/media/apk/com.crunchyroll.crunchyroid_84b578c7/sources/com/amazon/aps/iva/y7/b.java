package com.amazon.aps.iva.y7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: Mp4WebvttSubtitle.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.q7.d {
    public final List<com.amazon.aps.iva.s5.a> b;

    public b(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
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
