package com.amazon.aps.iva.f20;

import android.content.Context;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrPlusSubscriptionModule.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.rs.f> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(0);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.rs.f invoke() {
        Context context = this.h;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.rs.a aVar = new com.amazon.aps.iva.rs.a(context);
        c cVar = c.h;
        com.amazon.aps.iva.yb0.j.f(cVar, "isIntroOfferEnabled");
        return new com.amazon.aps.iva.rs.d(aVar, cVar, new com.amazon.aps.iva.bo.e());
    }
}
