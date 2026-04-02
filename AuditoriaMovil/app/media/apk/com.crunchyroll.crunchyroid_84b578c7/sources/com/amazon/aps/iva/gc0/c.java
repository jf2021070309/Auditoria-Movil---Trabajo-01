package com.amazon.aps.iva.gc0;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: KClasses.kt */
/* loaded from: classes4.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fc0.d<?>, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.fc0.d<?> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.fc0.d<?> dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.fc0.d<?> dVar) {
        return Boolean.valueOf(j.a(dVar, this.h));
    }
}
