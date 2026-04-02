package com.amazon.aps.iva.hn;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.es.k;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.us.s;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ShareAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a;

    public b(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.hn.a
    public final void a(Panel panel) {
        j.f(panel, "panel");
        this.a.e(new k(w.w(panel)));
    }

    @Override // com.amazon.aps.iva.hn.a
    public final void b(ContentContainer contentContainer) {
        l lVar = w.e;
        if (lVar != null) {
            this.a.e(new k(new e(s.a(contentContainer.getChannelId(), lVar), s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480)));
            return;
        }
        j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.hn.a
    public final void c(PlayableAsset playableAsset) {
        this.a.e(new k(w.d.b(playableAsset)));
    }

    @Override // com.amazon.aps.iva.hn.a
    public final void d(e eVar) {
        this.a.e(new k(eVar));
    }
}
