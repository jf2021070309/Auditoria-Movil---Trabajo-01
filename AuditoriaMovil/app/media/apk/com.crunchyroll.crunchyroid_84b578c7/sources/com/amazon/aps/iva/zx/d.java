package com.amazon.aps.iva.zx;

import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.zx.a;
/* compiled from: FeedCarouselPresenter.kt */
/* loaded from: classes2.dex */
public final class d<T extends a> extends com.amazon.aps.iva.wy.b<e<T>> implements c<T> {
    public d(b bVar) {
        super(bVar, new j[0]);
    }

    @Override // com.amazon.aps.iva.zx.c
    public final void k1(int i, com.amazon.aps.iva.xx.j jVar) {
        String str = jVar.d;
        if (str == null) {
            getView().p();
        } else {
            getView().setTitle(str);
            getView().x2();
        }
        getView().R1(i, jVar.e);
    }
}
