package com.amazon.aps.iva.d10;

import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: AsyncDownloadPanelFetcher.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ f i;
    public final /* synthetic */ Panel j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.xb0.l<? super i, com.amazon.aps.iva.kb0.q> lVar, f fVar, Panel panel) {
        super(1);
        this.h = lVar;
        this.i = fVar;
        this.j = panel;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends e0> list) {
        List<? extends e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "localVideos");
        this.h.invoke(this.i.b.invoke(this.j, list2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
