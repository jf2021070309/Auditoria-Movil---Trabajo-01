package com.amazon.aps.iva.kv;

import com.amazon.aps.iva.hv.n;
import com.amazon.aps.iva.j8.m;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.search.SearchResponse;
import java.util.List;
/* compiled from: CrunchylistSearchDataSource.kt */
/* loaded from: classes2.dex */
public final class b extends m<com.amazon.aps.iva.iv.b> {
    public final p<Integer, com.amazon.aps.iva.ob0.d<? super SearchResponse>, Object> c;
    public final e d;
    public int e;

    public b(n nVar, e eVar) {
        this.c = nVar;
        this.d = eVar;
        this.e = eVar.c;
    }

    @Override // com.amazon.aps.iva.j8.m
    public final void g(m.d dVar, m.c cVar) {
        List<com.amazon.aps.iva.iv.b> list = this.d.a;
        cVar.a(0, Math.min(this.e, list.size()), list);
    }

    @Override // com.amazon.aps.iva.j8.m
    public final void h(m.g gVar, m.f fVar) {
        boolean z;
        if (this.e <= gVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i.e(h.b, new a(this, gVar, fVar, null));
        } else {
            fVar.a(z.b);
        }
    }
}
