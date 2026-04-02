package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.d10.k;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DownloadedPanelsInteractor.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.wy.i implements k {
    public final InternalDownloadsManager b;
    public final BulkDownloadsManager c;
    public final com.amazon.aps.iva.wu.a d;
    public final EventDispatcher.EventDispatcherImpl e;
    public final com.amazon.aps.iva.kb0.m f;

    public p(InternalDownloadsManager internalDownloadsManager, BulkDownloadsManager bulkDownloadsManager) {
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        com.amazon.aps.iva.yb0.j.f(bulkDownloadsManager, "bulkDownloadsManager");
        this.b = internalDownloadsManager;
        this.c = bulkDownloadsManager;
        this.d = bVar;
        this.e = new EventDispatcher.EventDispatcherImpl();
        this.f = com.amazon.aps.iva.kb0.f.b(new o(this));
    }

    @Override // com.amazon.aps.iva.d10.k
    public final void A(k.a aVar) {
        if (aVar != null) {
            EventDispatcher.EventDispatcherImpl eventDispatcherImpl = this.e;
            eventDispatcherImpl.removeEventListener(aVar);
            if (eventDispatcherImpl.getListenerCount() == 0) {
                this.b.removeEventListener((q) this.f.getValue());
            }
        }
    }

    @Override // com.amazon.aps.iva.d10.k
    public final k.a L0(com.amazon.aps.iva.i10.j jVar, com.amazon.aps.iva.i10.k kVar) {
        com.amazon.aps.iva.kb0.m mVar = this.f;
        this.b.addEventListener((q) mVar.getValue());
        k.a aVar = new k.a(jVar, kVar);
        this.e.addEventListener(aVar);
        ((q) mVar.getValue()).c();
        return aVar;
    }

    @Override // com.amazon.aps.iva.d10.k
    public final void p0(List<i> list) {
        List<i> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (i iVar : list2) {
            arrayList.add(new com.amazon.aps.iva.hg.b(iVar.b()));
        }
        this.c.G8(arrayList);
    }
}
