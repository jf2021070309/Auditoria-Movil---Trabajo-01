package com.amazon.aps.iva.d30;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: CrPlusSubscriptionProductsViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.rs.g, LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>>> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> invoke(com.amazon.aps.iva.rs.g gVar) {
        com.amazon.aps.iva.rs.g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "connectionStatus");
        v vVar = new v();
        this.h.P8(gVar2);
        return vVar;
    }
}
