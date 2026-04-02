package com.amazon.aps.iva.ni;

import java.util.List;
/* compiled from: WatchMusicPresenter.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.ci.h>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(1);
        this.h = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.ci.h> list) {
        q view;
        q view2;
        List<? extends com.amazon.aps.iva.ci.h> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "musicItems");
        k kVar = this.h;
        view = kVar.getView();
        view.sh();
        view2 = kVar.getView();
        view2.R(list2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
