package com.amazon.aps.iva.y10;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.r10.n;
import com.amazon.aps.iva.yw.d0;
import java.util.List;
/* compiled from: MyListsFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.ry.b {
    public final List<com.amazon.aps.iva.wy.e> a;

    public i() {
        com.ellation.crunchyroll.presentation.watchlist.a.w.getClass();
        n.w.getClass();
        com.amazon.aps.iva.i10.a.x.getClass();
        com.amazon.aps.iva.i10.a aVar = new com.amazon.aps.iva.i10.a();
        aVar.d.b(aVar, com.amazon.aps.iva.i10.a.y[0], Boolean.FALSE);
        this.a = f1.K(new com.ellation.crunchyroll.presentation.watchlist.a(), ((d0) com.ellation.crunchyroll.application.e.a()).g.a(), new n(), aVar);
    }

    public final int a() {
        int i = 0;
        for (com.amazon.aps.iva.wy.e eVar : this.a) {
            if (!(eVar instanceof com.amazon.aps.iva.i10.a)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.ry.b
    public final List<com.amazon.aps.iva.wy.e> p() {
        return this.a;
    }
}
