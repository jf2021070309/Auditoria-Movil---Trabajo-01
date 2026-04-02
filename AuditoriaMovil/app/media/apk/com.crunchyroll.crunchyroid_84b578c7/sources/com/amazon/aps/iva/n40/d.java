package com.amazon.aps.iva.n40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n40.c;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.showpage.downloading.syncedtoolbar.SyncedToolbarLayout;
/* compiled from: SyncedToolbarPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> {
    public final com.amazon.aps.iva.kg.c b;
    public final com.amazon.aps.iva.n40.a c;

    /* compiled from: SyncedToolbarPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<com.amazon.aps.iva.kg.a, q> {
        public a(Object obj) {
            super(1, obj, d.class, "bindDetails", "bindDetails(Lcom/crunchyroll/downloading/detailsmonitor/DownloadingDetails;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.kg.a aVar) {
            c cVar;
            com.amazon.aps.iva.kg.a aVar2 = aVar;
            j.f(aVar2, "p0");
            d dVar = (d) this.receiver;
            dVar.getClass();
            if (aVar2.c == t.SERIES) {
                cVar = c.b.d;
            } else {
                cVar = c.a.d;
            }
            dVar.getView().setSyncedToolbarTitle(cVar.a);
            dVar.getView().setBottomPadding(cVar.c);
            int i = cVar.b;
            int i2 = aVar2.a;
            com.amazon.aps.iva.n40.a aVar3 = dVar.c;
            dVar.getView().setSyncedVideosCount(aVar3.b(i, i2));
            dVar.getView().setSyncedVideosSize(aVar3.a(aVar2.b));
            dVar.getView().xb();
            return q.a;
        }
    }

    public d(com.amazon.aps.iva.kg.c cVar, b bVar, SyncedToolbarLayout syncedToolbarLayout) {
        super(syncedToolbarLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = cVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        a aVar = new a(this);
        this.b.a(getView(), aVar);
    }
}
