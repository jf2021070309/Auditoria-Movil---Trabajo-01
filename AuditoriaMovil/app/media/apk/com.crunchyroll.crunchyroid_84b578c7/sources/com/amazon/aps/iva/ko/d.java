package com.amazon.aps.iva.ko;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import java.util.List;
/* compiled from: UserMigrationViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<List<Benefit>>, LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.co.j>>> {
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.co.j>> invoke(com.amazon.aps.iva.ez.g<List<Benefit>> gVar) {
        com.amazon.aps.iva.ez.g<List<Benefit>> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "benefitResource");
        return z.G(new c(gVar2, this.h, null));
    }
}
