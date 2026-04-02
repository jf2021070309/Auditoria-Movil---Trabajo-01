package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.yb0.l;
/* compiled from: BatchFilePersistenceStrategy.kt */
/* loaded from: classes2.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.sp.c<Object>> {
    public final /* synthetic */ h<Object> h;
    public final /* synthetic */ com.amazon.aps.iva.sp.h<Object> i;
    public final /* synthetic */ com.amazon.aps.iva.iq.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h<Object> hVar, com.amazon.aps.iva.sp.h<Object> hVar2, com.amazon.aps.iva.iq.a aVar) {
        super(0);
        this.h = hVar;
        this.i = hVar2;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.sp.c<Object> invoke() {
        h<Object> hVar = this.h;
        return hVar.a(hVar.a, hVar.b, this.i, hVar.c, this.j);
    }
}
