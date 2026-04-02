package com.amazon.aps.iva.ae0;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes4.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.de0.j<? extends com.amazon.aps.iva.sd0.g<?>>> {
    public final /* synthetic */ x h;
    public final /* synthetic */ com.amazon.aps.iva.id0.m i;
    public final /* synthetic */ com.amazon.aps.iva.ce0.n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x xVar, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ce0.n nVar) {
        super(0);
        this.h = xVar;
        this.i = mVar;
        this.j = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.de0.j<? extends com.amazon.aps.iva.sd0.g<?>> invoke() {
        x xVar = this.h;
        return xVar.a.a.a.b(new z(xVar, this.i, this.j));
    }
}
