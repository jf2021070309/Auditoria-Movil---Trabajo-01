package com.amazon.aps.iva.jy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SeriesCarouselItemDelegate.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ Panel i;
    public final /* synthetic */ com.amazon.aps.iva.jt.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.jt.a aVar, e eVar, Panel panel) {
        super(0);
        this.h = eVar;
        this.i = panel;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.b.a(this.i, this.j);
        return q.a;
    }
}
