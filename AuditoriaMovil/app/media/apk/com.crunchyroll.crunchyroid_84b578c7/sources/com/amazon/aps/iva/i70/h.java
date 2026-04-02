package com.amazon.aps.iva.i70;
/* compiled from: DrawableStateHandlerPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<i> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(iVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(iVar, "view");
    }

    public final void q6(int[] iArr) {
        if (getView().getState() == k.VALID) {
            getView().id(iArr, g.STATE_VALID.getAttributes());
        }
        if (getView().getState() == k.ERROR) {
            getView().id(iArr, g.STATE_ERROR.getAttributes());
        }
        if (getView().m6()) {
            getView().id(iArr, g.STATE_FOCUSED.getAttributes());
        }
    }
}
