package com.amazon.aps.iva.g40;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct;
/* compiled from: PremiumMembershipViewModel.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends SubscriptionProduct>, LiveData<com.amazon.aps.iva.ez.g<a>>> {
    public final /* synthetic */ g h;
    public final /* synthetic */ com.amazon.aps.iva.rs.f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, com.amazon.aps.iva.rs.f fVar) {
        super(1);
        this.h = gVar;
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final LiveData<com.amazon.aps.iva.ez.g<a>> invoke(com.amazon.aps.iva.ez.g<? extends SubscriptionProduct> gVar) {
        com.amazon.aps.iva.ez.g<? extends SubscriptionProduct> gVar2 = gVar;
        j.f(gVar2, "subscriptionProduct");
        if (gVar2 instanceof g.b) {
            return new v(new g.b(null));
        }
        if (gVar2 instanceof g.a) {
            return new v(new g.a(null, ((g.a) gVar2).a));
        }
        if (gVar2 instanceof g.c) {
            String sku = ((SubscriptionProduct) ((g.c) gVar2).a).getSku();
            g gVar3 = this.h;
            gVar3.getClass();
            com.amazon.aps.iva.rs.f fVar = this.i;
            return d0.c(fVar.c(), new d(fVar, gVar3, sku));
        }
        throw new h();
    }
}
