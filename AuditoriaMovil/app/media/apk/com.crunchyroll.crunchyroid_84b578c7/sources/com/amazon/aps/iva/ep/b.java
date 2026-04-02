package com.amazon.aps.iva.ep;

import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.t;
import com.crunchyroll.watchscreen.screen.loading.WatchScreenLoadingLayout;
/* compiled from: WatchScreenLoadingPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<d> implements a {
    public b(WatchScreenLoadingLayout watchScreenLoadingLayout) {
        super(watchScreenLoadingLayout, new j[0]);
    }

    @Override // com.amazon.aps.iva.ep.a
    public final void S2(c cVar) {
        getView().wa();
        if (cVar.a == t.SERIES) {
            getView().p5();
        }
    }
}
