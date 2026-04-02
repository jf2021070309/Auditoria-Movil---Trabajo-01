package com.amazon.aps.iva.nn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CurrentFiltersPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.e, q> {
    public final /* synthetic */ b h;
    public final /* synthetic */ com.amazon.aps.iva.fs.b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, com.amazon.aps.iva.fs.b bVar2) {
        super(1);
        this.h = bVar;
        this.i = bVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.mn.e eVar) {
        com.amazon.aps.iva.mn.e eVar2 = eVar;
        j.f(eVar2, "filters");
        this.h.d.e(eVar2, this.i);
        return q.a;
    }
}
