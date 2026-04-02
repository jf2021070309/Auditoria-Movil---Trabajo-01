package com.amazon.aps.iva.ic0;

import java.util.Comparator;
/* loaded from: classes4.dex */
public final class r implements Comparator {
    public final com.amazon.aps.iva.xb0.p b;

    public r(v vVar) {
        this.b = vVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.amazon.aps.iva.xb0.p pVar = this.b;
        com.amazon.aps.iva.yb0.j.f(pVar, "$tmp0");
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }
}
