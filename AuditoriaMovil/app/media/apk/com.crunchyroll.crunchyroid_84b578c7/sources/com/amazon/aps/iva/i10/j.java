package com.amazon.aps.iva.i10;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: DownloadsFragmentPresenter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.d10.i>, q> {
    public j(com.amazon.aps.iva.g10.b bVar) {
        super(1, bVar, com.amazon.aps.iva.g10.b.class, "onPanelsUpdate", "onPanelsUpdate(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.d10.i> list) {
        List<? extends com.amazon.aps.iva.d10.i> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "p0");
        ((com.amazon.aps.iva.g10.b) this.receiver).U0(list2);
        return q.a;
    }
}
