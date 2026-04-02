package com.amazon.aps.iva.t10;

import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.r10.b0;
import com.amazon.aps.iva.r10.j0;
import com.amazon.aps.iva.r10.m0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: HistoryDataSourceFactory.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public static final c a = new c();
    public static final h.f b = new h.f(20, 20, false, 20);

    @Override // com.amazon.aps.iva.t10.b
    public final h a(m0.a aVar, d dVar, g0 g0Var, b0 b0Var, m0.b bVar, m0.c cVar, m0.d dVar2, j0 j0Var) {
        j.f(j0Var, "selectionMode");
        h.d dVar3 = new h.d(new a(aVar, dVar, g0Var, bVar, cVar, dVar2, j0Var), b);
        dVar3.d = com.amazon.aps.iva.vu.a.a;
        dVar3.c = com.amazon.aps.iva.vu.a.b;
        dVar3.e = b0Var;
        return dVar3.a();
    }
}
