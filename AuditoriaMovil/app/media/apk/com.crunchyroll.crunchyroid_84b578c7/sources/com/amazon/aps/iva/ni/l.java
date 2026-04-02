package com.amazon.aps.iva.ni;

import java.util.List;
/* compiled from: WatchMusicPresenter.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.ci.h>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.ci.h> list) {
        q view;
        view = this.h.getView();
        view.b7();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
