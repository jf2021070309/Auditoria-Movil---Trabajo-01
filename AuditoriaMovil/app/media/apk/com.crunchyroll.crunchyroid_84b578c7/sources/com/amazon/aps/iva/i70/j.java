package com.amazon.aps.iva.i70;
/* compiled from: InputPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.wy.b<l> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(lVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(lVar, "view");
    }

    public final void q6(k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newState");
        if (kVar != getView().getState()) {
            getView().setState(kVar);
            getView().refreshDrawableState();
        }
    }
}
