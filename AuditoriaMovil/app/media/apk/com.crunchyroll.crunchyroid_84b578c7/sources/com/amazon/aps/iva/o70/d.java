package com.amazon.aps.iva.o70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.l;
/* compiled from: SnapRecyclerViewScrollListenerPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<b> implements e {
    public final boolean b;
    public int c;
    public l<? super Integer, q> d;
    public com.amazon.aps.iva.xb0.q<? super Float, ? super Integer, ? super Integer, q> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, boolean z) {
        super(bVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.b = z;
    }

    @Override // com.amazon.aps.iva.o70.e
    public final void X3(com.amazon.aps.iva.m20.a aVar) {
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.o70.e
    public final void f4(com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.a aVar) {
        this.d = aVar;
    }

    public final int q6() {
        return getView().X9() - (getView().sa() * this.c);
    }

    public final int r6() {
        return (int) Math.ceil(Math.abs(q6() / getView().sa()));
    }
}
