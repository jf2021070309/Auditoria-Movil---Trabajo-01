package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import java.util.List;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public interface u extends com.amazon.aps.iva.wy.k, com.amazon.aps.iva.ys.d {

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static v a(boolean z, j1 j1Var, p pVar, com.amazon.aps.iva.i50.c cVar, String str, com.amazon.aps.iva.rv.e eVar, com.ellation.crunchyroll.application.d dVar, BulkDownloadsManager bulkDownloadsManager, com.amazon.aps.iva.n60.c cVar2, com.amazon.aps.iva.gn.c cVar3, com.amazon.aps.iva.x50.u uVar, f1 f1Var, com.amazon.aps.iva.oh.g gVar, i1 i1Var) {
            com.amazon.aps.iva.yb0.j.f(dVar, "appLifecycle");
            com.amazon.aps.iva.yb0.j.f(bulkDownloadsManager, "bulkDownloadsManager");
            com.amazon.aps.iva.yb0.j.f(cVar3, "shareComponent");
            com.amazon.aps.iva.yb0.j.f(gVar, "markAsWatchedToggleViewModel");
            return new v(z, j1Var, pVar, cVar, str, eVar, dVar, bulkDownloadsManager, cVar2, cVar3, uVar, f1Var, gVar, i1Var);
        }
    }

    void F4();

    void O(com.amazon.aps.iva.a70.b bVar);

    void R4(Season season);

    void S();

    void Y3();

    void b2(List<String> list);

    void c0();

    void n(com.amazon.aps.iva.oh.a aVar, String str);

    void p(com.amazon.aps.iva.gn.a aVar);

    void s0();

    void v3();

    void x5();
}
