package com.amazon.aps.iva.d50;

import com.amazon.aps.iva.b50.n;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.yb0.j;
/* compiled from: FavoriteTogglePresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> {
    public final com.amazon.aps.iva.h50.a b;
    public final n c;
    public k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.amazon.aps.iva.h50.a aVar, n nVar) {
        super(dVar, aVar, nVar);
        j.f(dVar, "view");
        this.b = aVar;
        this.c = nVar;
    }

    public final k q6() {
        k kVar = this.d;
        if (kVar != null) {
            return kVar;
        }
        j.m("watchlistItem");
        throw null;
    }
}
