package com.amazon.aps.iva.di;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: FeaturedMusicPresenter.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.ei.i>, q> {
    public i(m mVar) {
        super(1, mVar, m.class, "showMusicData", "showMusicData(Ljava/util/List;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.ei.i> list) {
        List<? extends com.amazon.aps.iva.ei.i> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "p0");
        ((m) this.receiver).Qc(list2);
        return q.a;
    }
}
