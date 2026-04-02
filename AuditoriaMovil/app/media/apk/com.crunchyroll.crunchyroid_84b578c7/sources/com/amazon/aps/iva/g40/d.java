package com.amazon.aps.iva.g40;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PremiumMembershipViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.rs.g, LiveData<com.amazon.aps.iva.ez.g<a>>> {
    public final /* synthetic */ com.amazon.aps.iva.rs.f h;
    public final /* synthetic */ String i;
    public final /* synthetic */ g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.rs.f fVar, g gVar, String str) {
        super(1);
        this.h = fVar;
        this.i = str;
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<a>> invoke(com.amazon.aps.iva.rs.g gVar) {
        com.amazon.aps.iva.rs.g gVar2 = gVar;
        j.f(gVar2, "connectionStatus");
        return z.G(new c(gVar2, this.h, this.i, this.j, null));
    }
}
