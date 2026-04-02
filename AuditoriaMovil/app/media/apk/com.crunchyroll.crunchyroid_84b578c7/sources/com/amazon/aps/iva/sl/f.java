package com.amazon.aps.iva.sl;

import com.amazon.aps.iva.ve0.u0;
import java.util.List;
/* compiled from: QualitiesProvider.kt */
/* loaded from: classes2.dex */
public final class f implements a {
    public final c b;
    public final e c;

    public f(u0 u0Var) {
        this.b = new c(com.amazon.aps.iva.dg.b.m(new b(u0Var)));
        this.c = new e(com.amazon.aps.iva.dg.b.m(new d(u0Var)));
    }

    @Override // com.amazon.aps.iva.sl.a
    public final com.amazon.aps.iva.ve0.f<g> p() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.sl.a
    public final com.amazon.aps.iva.ve0.f<List<g>> s0() {
        return this.c;
    }
}
