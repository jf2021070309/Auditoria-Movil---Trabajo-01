package com.amazon.aps.iva.qt;

import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SmallFeedCardClickHandler.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final d a;
    public final h b;

    public b(d dVar, h hVar) {
        this.a = dVar;
        this.b = hVar;
    }

    @Override // com.amazon.aps.iva.qt.a
    public final void a(Panel panel, com.amazon.aps.iva.jt.a aVar) {
        j.f(panel, "panel");
        j.f(aVar, "feedAnalyticsData");
        this.b.t(panel);
        d.b.a(this.a, panel, aVar, null, null, null, 28);
    }
}
