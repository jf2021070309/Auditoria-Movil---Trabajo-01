package com.amazon.aps.iva.hp;

import com.amazon.aps.iva.mt.n;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.wy.j;
import com.crunchyroll.watchscreen.screen.summary.WatchScreenSummaryLayout;
/* compiled from: WatchScreenSummaryPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<d> implements a {
    public final n b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;

    public b(WatchScreenSummaryLayout watchScreenSummaryLayout, o oVar, com.amazon.aps.iva.xb0.a aVar) {
        super(watchScreenSummaryLayout, new j[0]);
        this.b = oVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.hp.a
    public final void q() {
        getView().Z();
    }

    @Override // com.amazon.aps.iva.hp.a
    public final void z4(c cVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(cVar, "summary");
        getView().setShowTitle(cVar.b);
        getView().setAssetTitle(this.b.a(cVar.a));
        d view = getView();
        String str = cVar.c;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view.g();
        } else {
            view.setDescription(str);
            view.r();
        }
        if (this.c.invoke().booleanValue()) {
            getView().setParentalControls(cVar);
        }
        getView().X1(cVar.e);
    }
}
