package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: LazyListMeasuredItemProvider.kt */
/* loaded from: classes.dex */
public abstract class d0 {
    public final p a;
    public final com.amazon.aps.iva.f0.v b;
    public final long c;

    public d0(long j, boolean z, p pVar, com.amazon.aps.iva.f0.v vVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(vVar, "measureScope");
        this.a = pVar;
        this.b = vVar;
        if (z) {
            i = com.amazon.aps.iva.o2.a.h(j);
        } else {
            i = Integer.MAX_VALUE;
        }
        this.c = com.amazon.aps.iva.o2.b.b(i, z ? Integer.MAX_VALUE : com.amazon.aps.iva.o2.a.g(j), 5);
    }

    public abstract c0 a(int i, Object obj, Object obj2, List<? extends u0> list);

    public final c0 b(int i) {
        p pVar = this.a;
        return a(i, pVar.getKey(i), pVar.c(i), this.b.O(i, this.c));
    }
}
