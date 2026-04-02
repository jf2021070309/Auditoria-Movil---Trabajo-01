package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
/* compiled from: NodeChain.kt */
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f.b, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.p0.f<f.b> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.amazon.aps.iva.p0.f<f.b> fVar) {
        super(1);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(f.b bVar) {
        f.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "it");
        this.h.b(bVar2);
        return Boolean.TRUE;
    }
}
