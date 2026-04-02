package com.amazon.aps.iva.t20;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.z;
import java.util.List;
/* compiled from: ManageMembershipViewModel.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>, LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.n20.f>>>> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar) {
        super(1);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.n20.f>>> invoke(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar) {
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "value");
        return z.G(new s(gVar2, this.h, null));
    }
}
