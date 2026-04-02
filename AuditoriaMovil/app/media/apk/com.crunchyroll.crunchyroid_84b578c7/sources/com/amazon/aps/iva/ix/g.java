package com.amazon.aps.iva.ix;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: HomeFeedFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.nz.a>, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<com.amazon.aps.iva.nz.a>, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.ellation.crunchyroll.feed.l lVar) {
        super(1);
        this.h = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.nz.a> list) {
        List<? extends com.amazon.aps.iva.nz.a> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        this.h.invoke(list2);
        return q.a;
    }
}
