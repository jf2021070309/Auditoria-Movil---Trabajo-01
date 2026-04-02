package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.d10.l;
import com.ellation.crunchyroll.downloading.e0;
import java.util.List;
/* compiled from: AsyncDownloadPanelFetcher.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<i>, com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, l.b.a aVar) {
        super(1);
        this.h = fVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends e0> list) {
        List<? extends e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        f fVar = this.h;
        com.amazon.aps.iva.se0.i.d(fVar.c, fVar.d.a(), null, new c(fVar, list2, this.i, null), 2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
