package com.amazon.aps.iva.b60;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.xx.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WatchlistCarouselPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements d {
    public final com.amazon.aps.iva.e60.c b;
    public final com.amazon.aps.iva.k50.o c;

    public g(com.amazon.aps.iva.e60.d dVar, com.amazon.aps.iva.k50.o oVar, c cVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = dVar;
        this.c = oVar;
    }

    @Override // com.amazon.aps.iva.b60.a
    public final void S3() {
        this.c.a();
    }

    @Override // com.amazon.aps.iva.b60.d
    public final void Y4(g.c.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "item");
        List<k> list = bVar.j;
        ArrayList Z0 = x.Z0(list);
        getView().setTitle(bVar.d);
        if (bVar.k) {
            Z0.add(p.a);
        }
        getView().setContent(Z0);
        this.b.a(list, new e(this, Z0), f.h);
    }

    @Override // com.amazon.aps.iva.b60.d
    public final void b5(int i) {
        if (i == 0) {
            getView().Y0(0);
        }
    }

    @Override // com.amazon.aps.iva.b60.d
    public final void g4() {
        getView().Y0(0);
    }
}
