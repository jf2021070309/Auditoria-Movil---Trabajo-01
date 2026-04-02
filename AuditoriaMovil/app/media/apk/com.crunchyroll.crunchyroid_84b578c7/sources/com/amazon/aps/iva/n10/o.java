package com.amazon.aps.iva.n10;

import com.amazon.aps.iva.n10.j;
import com.ellation.crunchyroll.presentation.browse.BrowseAllFragment;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
/* compiled from: GenreFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class o extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.p10.a, com.amazon.aps.iva.kb0.q> {
    public o(Object obj) {
        super(1, obj, j.class, "showBrowseAll", "showBrowseAll(Lcom/ellation/crunchyroll/presentation/genres/genre/carousel/SubgenreCarouselDataModel;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.p10.a aVar) {
        com.amazon.aps.iva.p10.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "p0");
        j jVar = (j) this.receiver;
        j.a aVar3 = j.q;
        androidx.fragment.app.h requireActivity = jVar.requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity");
        com.amazon.aps.iva.fc0.l<?> lVar = j.r[0];
        com.amazon.aps.iva.zz.a.C.getClass();
        com.amazon.aps.iva.zz.a aVar4 = new com.amazon.aps.iva.zz.a();
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = com.amazon.aps.iva.zz.a.D;
        com.amazon.aps.iva.fc0.l<?> lVar2 = lVarArr[1];
        aVar4.y.b(aVar4, lVar2, (com.amazon.aps.iva.l10.a) jVar.c.getValue(jVar, lVar));
        aVar4.z.b(aVar4, lVarArr[2], aVar2.d);
        aVar4.k.b(aVar4, BrowseAllFragment.w[8], aVar2.e);
        ((BrowseBottomBarActivity) requireActivity).ni(aVar4, null);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
