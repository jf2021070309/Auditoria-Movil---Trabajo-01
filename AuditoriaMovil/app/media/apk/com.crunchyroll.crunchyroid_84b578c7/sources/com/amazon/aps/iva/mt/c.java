package com.amazon.aps.iva.mt;

import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.kb0.q;
/* compiled from: ContinueWatchingCarousel.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ com.amazon.aps.iva.yx.g i;
    public final /* synthetic */ com.amazon.aps.iva.fs.b j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, com.amazon.aps.iva.yx.g gVar, com.amazon.aps.iva.fs.b bVar, int i) {
        super(0);
        this.h = iVar;
        this.i = gVar;
        this.j = bVar;
        this.k = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        i iVar = this.h;
        iVar.k.a(this.i, this.j, a.C0423a.a(com.amazon.aps.iva.js.k.CARD, iVar.getPositionOfFeed$home_feed_release(), this.k, null, null, 56));
        return q.a;
    }
}
