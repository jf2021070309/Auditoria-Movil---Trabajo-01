package com.amazon.aps.iva.s20;

import androidx.lifecycle.LiveData;
import java.util.List;
/* compiled from: UpgradeViewModel.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>, LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.n20.f>>>> {
    public final /* synthetic */ z h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(1);
        this.h = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.n20.f>>> invoke(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar) {
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "value");
        return com.amazon.aps.iva.e.z.G(new x(gVar2, this.h, null));
    }
}
