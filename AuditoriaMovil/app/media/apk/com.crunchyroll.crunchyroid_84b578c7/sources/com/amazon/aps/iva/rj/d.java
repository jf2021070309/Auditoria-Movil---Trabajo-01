package com.amazon.aps.iva.rj;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: AdsHelper.kt */
/* loaded from: classes.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
    public final /* synthetic */ List<Long> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<Long> list) {
        super(1);
        this.h = list;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
        com.amazon.aps.iva.nk.c cVar2 = cVar;
        j.f(cVar2, "$this$set");
        return com.amazon.aps.iva.nk.c.a(cVar2, false, null, this.h, null, 11);
    }
}
