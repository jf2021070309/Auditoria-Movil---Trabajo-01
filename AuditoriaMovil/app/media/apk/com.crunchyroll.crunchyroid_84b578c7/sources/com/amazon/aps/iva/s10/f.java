package com.amazon.aps.iva.s10;

import com.amazon.aps.iva.kb0.q;
/* compiled from: HistoryAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ com.amazon.aps.iva.r10.l i;
    public final /* synthetic */ com.amazon.aps.iva.z70.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, com.amazon.aps.iva.r10.l lVar, com.amazon.aps.iva.z70.a aVar) {
        super(0);
        this.h = iVar;
        this.i = lVar;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.b.invoke(this.i, Integer.valueOf(this.j.getBindingAdapterPosition()));
        return q.a;
    }
}
