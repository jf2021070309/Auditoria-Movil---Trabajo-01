package com.amazon.aps.iva.l40;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.sv.f2;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.qz.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.qz.a aVar) {
        com.amazon.aps.iva.n00.a aVar2;
        List<com.amazon.aps.iva.f00.a> list;
        boolean z;
        com.amazon.aps.iva.hg.g gVar;
        Episode episode;
        String str;
        com.amazon.aps.iva.hg.g gVar2;
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.g> aVar3;
        g.c a;
        com.amazon.aps.iva.qz.a aVar4 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar4, "showPageListModel");
        v vVar = this.h;
        v.q6(vVar).w3();
        j1 j1Var = vVar.c;
        com.amazon.aps.iva.ez.g gVar3 = (com.amazon.aps.iva.ez.g) j1Var.C7().d();
        com.amazon.aps.iva.hg.c cVar = null;
        if (gVar3 != null && (a = gVar3.a()) != null) {
            aVar2 = (com.amazon.aps.iva.n00.a) a.a;
        } else {
            aVar2 = null;
        }
        boolean z2 = vVar.b;
        List<com.amazon.aps.iva.f00.a> list2 = aVar4.b;
        if (z2 && aVar2 != null) {
            list = com.amazon.aps.iva.lb0.x.M0(list2, new com.amazon.aps.iva.f00.y(aVar2));
        } else {
            list = list2;
        }
        com.amazon.aps.iva.e00.a aVar5 = aVar4.a;
        vVar.getView().ia(list, new w(aVar5, vVar), new z0(vVar));
        if (z2) {
            List<PlayableAsset> list3 = aVar5.a;
            com.amazon.aps.iva.yb0.j.f(list3, "assets");
            Map<String, Playhead> map = aVar5.b;
            com.amazon.aps.iva.yb0.j.f(map, "playheads");
            if (list3.isEmpty()) {
                gVar = null;
            } else {
                String parentId = ((PlayableAsset) com.amazon.aps.iva.lb0.x.t0(list3)).getParentId();
                Object v0 = com.amazon.aps.iva.lb0.x.v0(list3);
                if (v0 instanceof Episode) {
                    episode = (Episode) v0;
                } else {
                    episode = null;
                }
                if (episode != null) {
                    str = episode.getSeasonId();
                } else {
                    str = null;
                }
                gVar = new com.amazon.aps.iva.hg.g(parentId, str, list3, map);
            }
            f2<com.amazon.aps.iva.vv.a> f2Var = vVar.o;
            if (f2Var != null && (aVar3 = f2Var.b) != null) {
                gVar2 = aVar3.invoke();
            } else {
                gVar2 = null;
            }
            if (!com.amazon.aps.iva.yb0.j.a(gVar, gVar2)) {
                f2<com.amazon.aps.iva.vv.a> f2Var2 = vVar.o;
                BulkDownloadsManager bulkDownloadsManager = vVar.i;
                if (f2Var2 != null) {
                    bulkDownloadsManager.removeEventListener(f2Var2);
                }
                if (gVar != null) {
                    com.amazon.aps.iva.yb0.j.f(list2, "<this>");
                    com.amazon.aps.iva.f00.b bVar = (com.amazon.aps.iva.f00.b) com.amazon.aps.iva.lb0.x.v0(com.amazon.aps.iva.e4.l1.C(list2));
                    if (bVar != null) {
                        cVar = bVar.b;
                    }
                    f2<com.amazon.aps.iva.vv.a> N3 = bulkDownloadsManager.N3(cVar, gVar, new a1(j1Var));
                    vVar.o = N3;
                    bulkDownloadsManager.addEventListener(N3);
                }
            }
        }
        List<PlayableAsset> list4 = aVar5.a;
        boolean z3 = true;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Playhead playhead = aVar5.b.get(((PlayableAsset) it.next()).getId());
                if (playhead != null && playhead.isCompleted()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z3 = false;
                    break;
                }
            }
        }
        List<PlayableAsset> list5 = aVar5.a;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list5));
        for (PlayableAsset playableAsset : list5) {
            arrayList.add(playableAsset.getId());
        }
        vVar.getView().j9(vVar.m.a(new t(arrayList, z3)));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
