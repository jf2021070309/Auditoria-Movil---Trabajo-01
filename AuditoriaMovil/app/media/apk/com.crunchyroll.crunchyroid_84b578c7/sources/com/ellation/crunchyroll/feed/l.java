package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.vx.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.nz.a>, q> {
    public final /* synthetic */ HomeFeedScreenView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(HomeFeedScreenView homeFeedScreenView) {
        super(1);
        this.h = homeFeedScreenView;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.nz.a> list) {
        List<? extends com.amazon.aps.iva.nz.a> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        a aVar = this.h.i;
        if (aVar != null) {
            HomeFeedPresenterImpl homeFeedPresenterImpl = (HomeFeedPresenterImpl) aVar.n;
            homeFeedPresenterImpl.getClass();
            if (homeFeedPresenterImpl.getView().isResumed()) {
                x xVar = homeFeedPresenterImpl.b;
                xVar.Q6();
                xVar.Z7();
                List<? extends com.amazon.aps.iva.nz.a> list3 = list2;
                ArrayList arrayList = new ArrayList(r.Y(list3));
                for (com.amazon.aps.iva.nz.a aVar2 : list3) {
                    arrayList.add(aVar2.b);
                }
                xVar.U1(arrayList);
            }
            return q.a;
        }
        com.amazon.aps.iva.yb0.j.m("feedModule");
        throw null;
    }
}
