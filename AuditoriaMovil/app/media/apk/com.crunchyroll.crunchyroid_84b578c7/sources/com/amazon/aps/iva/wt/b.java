package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.es.u;
import com.amazon.aps.iva.es.v;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CommentActionAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.ff.b b;

    public b(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ff.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "currentAssetProvider");
        this.a = aVar;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.wt.a
    public final void a(x xVar) {
        com.amazon.aps.iva.es.i vVar;
        com.amazon.aps.iva.ks.c cVar = new com.amazon.aps.iva.ks.c(xVar.b, xVar.c, xVar.f, xVar.l);
        PlayableAsset d = this.b.getCurrentAsset().d();
        String str = (d == null || (str = d.getParentId()) == null) ? "" : "";
        if (xVar.q) {
            vVar = new u(cVar, str);
        } else {
            vVar = new v(cVar, str);
        }
        this.a.e(vVar);
    }
}
