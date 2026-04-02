package com.amazon.aps.iva.b50;

import android.view.View;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.nt.o;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: WatchlistCardMenuProvider.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.n70.d<t> {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.f50.e, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.fs.b> d;

    public h(com.ellation.crunchyroll.presentation.watchlist.b bVar, com.ellation.crunchyroll.presentation.watchlist.c cVar, com.ellation.crunchyroll.presentation.watchlist.d dVar, com.ellation.crunchyroll.presentation.watchlist.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "toAnalyticsView");
        this.a = bVar;
        this.b = cVar;
        this.c = dVar;
        this.d = eVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(t tVar) {
        com.amazon.aps.iva.a70.b bVar;
        t tVar2 = tVar;
        com.amazon.aps.iva.yb0.j.f(tVar2, "data");
        com.amazon.aps.iva.n70.b bVar2 = new com.amazon.aps.iva.n70.b(o.b.e, new e(this, tVar2));
        com.amazon.aps.iva.x50.t resourceType = tVar2.a.g.getResourceType();
        com.amazon.aps.iva.yb0.j.f(resourceType, "<this>");
        int i = com.amazon.aps.iva.nt.h.a[resourceType.ordinal()];
        if (i != 1 && i != 2) {
            bVar = com.amazon.aps.iva.nt.l.e;
        } else {
            bVar = com.amazon.aps.iva.nt.g.e;
        }
        return f1.K(bVar2, new com.amazon.aps.iva.n70.b(bVar, new f(this, tVar2)), new com.amazon.aps.iva.n70.b(com.amazon.aps.iva.nt.m.e, new g(this, tVar2)));
    }
}
