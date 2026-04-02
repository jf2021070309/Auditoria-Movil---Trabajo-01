package com.amazon.aps.iva.j30;

import androidx.lifecycle.LiveData;
import java.util.List;
/* compiled from: UpsellV2ViewModel.kt */
/* loaded from: classes2.dex */
public final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>, LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.n20.f>>>> {
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var) {
        super(1);
        this.h = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.n20.f>>> invoke(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar) {
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "value");
        return com.amazon.aps.iva.e.z.G(new c0(gVar2, this.h, null));
    }
}
