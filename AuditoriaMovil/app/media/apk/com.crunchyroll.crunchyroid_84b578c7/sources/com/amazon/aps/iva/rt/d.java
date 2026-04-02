package com.amazon.aps.iva.rt;

import com.amazon.aps.iva.ws.d;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SmallFeedEpisodeCardClickHandler.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final Panel a;
    public final com.amazon.aps.iva.k50.e b;
    public final com.amazon.aps.iva.ws.d c;
    public final com.amazon.aps.iva.jt.a d;

    public d(Panel panel, com.amazon.aps.iva.k50.e eVar, com.amazon.aps.iva.ws.d dVar, com.amazon.aps.iva.jt.a aVar) {
        this.a = panel;
        this.b = eVar;
        this.c = dVar;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.rt.c
    public final void a() {
        this.b.d(this.a);
        d.b.a(this.c, this.a, this.d, null, null, null, 28);
    }
}
