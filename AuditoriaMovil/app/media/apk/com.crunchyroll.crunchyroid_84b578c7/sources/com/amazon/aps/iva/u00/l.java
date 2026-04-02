package com.amazon.aps.iva.u00;

import android.view.View;
import com.amazon.aps.iva.hg.c;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.u00.n;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import java.util.ArrayList;
/* compiled from: BulkDownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.f, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ com.amazon.aps.iva.hg.g i;
    public final /* synthetic */ com.amazon.aps.iva.hg.e j;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.hg.e eVar, DownloadButton downloadButton) {
        super(1);
        this.h = iVar;
        this.i = gVar;
        this.j = eVar;
        this.k = downloadButton;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.hg.f fVar) {
        Iterable iterable;
        boolean z;
        com.amazon.aps.iva.hg.f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "statusData");
        com.amazon.aps.iva.hg.c cVar = fVar2.b;
        boolean z2 = cVar instanceof c.h;
        i iVar = this.h;
        com.amazon.aps.iva.hg.d dVar = fVar2.c;
        if (z2) {
            if (dVar.a <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.v00.a aVar = iVar.c;
                com.amazon.aps.iva.hg.g gVar = this.i;
                aVar.u0(gVar, new k(iVar, gVar));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }
        m view = iVar.getView();
        if (com.amazon.aps.iva.yb0.j.a(cVar, c.h.a)) {
            iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.b(dVar), n.b.c(dVar)});
        } else {
            boolean a = com.amazon.aps.iva.yb0.j.a(cVar, c.f.a);
            com.amazon.aps.iva.hg.g gVar2 = fVar2.a;
            if (a) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.b(dVar), n.b.c(dVar), n.b.a(gVar2), n.d.e});
            } else if (cVar instanceof c.e) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.a(gVar2), n.d.e});
            } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.g.a)) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.b(dVar), n.b.c(dVar), n.b.a(gVar2), n.c.e});
            } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.d.a)) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.b(dVar), n.b.c(dVar), n.b.a(gVar2), n.c.e});
            } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.C0339c.a)) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.b(dVar), n.b.c(dVar), n.b.a(gVar2), n.c.e});
            } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.a.a)) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.b(dVar), n.b.c(dVar), n.d.e, n.b.a(gVar2), n.c.e});
            } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.b.a)) {
                iterable = com.amazon.aps.iva.lb0.o.O(new n[]{n.b.a(gVar2), n.c.e});
            } else {
                iterable = z.b;
            }
        }
        Iterable<n> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(r.Y(iterable2));
        for (n nVar : iterable2) {
            arrayList.add(new com.amazon.aps.iva.a70.a(nVar, null));
        }
        view.L5(fVar2, new com.amazon.aps.iva.a70.c<>(arrayList, iVar.d.a(this.j)), this.k);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
