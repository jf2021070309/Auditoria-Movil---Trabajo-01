package com.amazon.aps.iva.bv;

import com.amazon.aps.iva.wy.j;
/* compiled from: AddToCrunchylistButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements a {
    public d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
    }

    @Override // com.amazon.aps.iva.bv.a
    public final void h() {
        c view = getView();
        d dVar = this.b;
        if (dVar != null) {
            view.oe(dVar);
        } else {
            com.amazon.aps.iva.yb0.j.m("input");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.bv.a
    public final void n0(boolean z, d dVar) {
        this.b = dVar;
        if (z) {
            getView().show();
        } else {
            getView().hide();
        }
    }
}
