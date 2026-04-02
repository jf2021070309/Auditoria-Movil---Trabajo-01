package com.amazon.aps.iva.st;

import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.k50.n;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.ws.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: WatchlistCardClickHandler.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final n a;
    public final h b;
    public final com.amazon.aps.iva.ws.d c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jt.a> d;

    public b(n nVar, h hVar, f fVar, com.amazon.aps.iva.c60.a aVar) {
        this.a = nVar;
        this.b = hVar;
        this.c = fVar;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.st.a
    public final void a(k kVar) {
        j.f(kVar, "watchlistItem");
        boolean z = kVar.f;
        Panel panel = kVar.g;
        if (z) {
            this.b.t(panel);
        } else {
            this.a.a(com.amazon.aps.iva.gr.n.z(kVar.getPlayheadSec()), panel, kVar.c);
        }
        d.b.a(this.c, kVar.g, this.d.invoke(), null, Boolean.valueOf(kVar.d), Boolean.TRUE, 4);
    }
}
