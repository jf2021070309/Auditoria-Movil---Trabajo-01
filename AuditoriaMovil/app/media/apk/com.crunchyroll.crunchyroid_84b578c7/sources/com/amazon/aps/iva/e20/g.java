package com.amazon.aps.iva.e20;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
/* compiled from: MediaDetailsPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements f {
    public g(b bVar) {
        super(bVar, new j[0]);
    }

    @Override // com.amazon.aps.iva.e20.f
    public final void Q() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.e20.f
    public final void q() {
        getView().Z();
    }

    @Override // com.amazon.aps.iva.e20.f
    public final void x3(a aVar) {
        getView().setTitle(aVar.b);
        String str = aVar.c;
        if (m.b0(str)) {
            getView().g();
        } else {
            getView().setDescription(str);
            getView().r();
        }
        getView().y5(aVar.d);
    }
}
