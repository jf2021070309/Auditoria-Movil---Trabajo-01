package com.amazon.aps.iva.o20;

import com.amazon.aps.iva.wy.j;
/* compiled from: TierPerkPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<d> {
    public final c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, c cVar) {
        super(dVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(dVar, "view");
        com.amazon.aps.iva.yb0.j.f(cVar, "model");
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        c cVar = this.b;
        getView().setDescription(cVar.b);
        if (cVar.a) {
            getView().J4();
        } else {
            getView().g7();
        }
    }
}
