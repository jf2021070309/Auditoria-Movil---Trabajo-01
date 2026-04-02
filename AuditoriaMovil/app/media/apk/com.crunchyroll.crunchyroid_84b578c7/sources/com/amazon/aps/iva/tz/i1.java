package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.m;
import java.util.List;
/* compiled from: EmptyBrowseAllDataSource.kt */
/* loaded from: classes2.dex */
public final class i1 extends com.amazon.aps.iva.j8.m<com.amazon.aps.iva.uz.h> {
    public final List<com.amazon.aps.iva.uz.h> c;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(List<? extends com.amazon.aps.iva.uz.h> list) {
        com.amazon.aps.iva.yb0.j.f(list, "emptyCards");
        this.c = list;
    }

    @Override // com.amazon.aps.iva.j8.m
    public final void g(m.d dVar, m.c cVar) {
        List<com.amazon.aps.iva.uz.h> list = this.c;
        cVar.a(0, list.size(), list);
    }

    @Override // com.amazon.aps.iva.j8.m
    public final void h(m.g gVar, m.f fVar) {
    }
}
