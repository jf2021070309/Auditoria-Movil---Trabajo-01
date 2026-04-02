package com.amazon.aps.iva.rj;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AdsHelper.kt */
/* loaded from: classes.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.c, com.amazon.aps.iva.nk.c> {
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z) {
        super(1);
        this.h = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nk.c invoke(com.amazon.aps.iva.nk.c cVar) {
        com.amazon.aps.iva.nk.a aVar;
        com.amazon.aps.iva.nk.c cVar2 = cVar;
        j.f(cVar2, "$this$set");
        boolean z = this.h;
        if (!z) {
            aVar = null;
        } else {
            aVar = cVar2.c;
        }
        return com.amazon.aps.iva.nk.c.a(cVar2, z, aVar, null, null, 12);
    }
}
