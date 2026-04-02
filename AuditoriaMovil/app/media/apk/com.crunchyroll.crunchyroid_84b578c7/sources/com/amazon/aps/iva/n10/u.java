package com.amazon.aps.iva.n10;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: GenrePresenter.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends b>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends b> list) {
        List<? extends b> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, FirebaseAnalytics.Param.ITEMS);
        w wVar = this.h;
        w.q6(wVar).H();
        w.q6(wVar).X5(list2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
