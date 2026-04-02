package com.amazon.aps.iva.m20;
/* compiled from: UpsellCarouselPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(hVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "view");
    }

    @Override // com.amazon.aps.iva.m20.f
    public final void i4(int i) {
        getView().smoothScrollToPosition(i);
    }
}
