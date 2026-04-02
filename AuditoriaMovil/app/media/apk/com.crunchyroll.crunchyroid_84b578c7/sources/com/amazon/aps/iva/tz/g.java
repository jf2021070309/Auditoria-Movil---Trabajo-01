package com.amazon.aps.iva.tz;

import java.util.List;
/* compiled from: BrowseAllDataSource.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i, int i2, f fVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
        super(0);
        this.h = fVar;
        this.i = i;
        this.j = i2;
        this.k = lVar;
        this.l = lVar2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.i(this.i, this.j, this.k, this.l);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
