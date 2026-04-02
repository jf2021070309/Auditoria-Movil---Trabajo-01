package com.amazon.aps.iva.ae0;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes4.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.sd0.g<?>> {
    public final /* synthetic */ x h;
    public final /* synthetic */ com.amazon.aps.iva.id0.m i;
    public final /* synthetic */ com.amazon.aps.iva.ce0.n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x xVar, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ce0.n nVar) {
        super(0);
        this.h = xVar;
        this.i = mVar;
        this.j = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.sd0.g<?> invoke() {
        x xVar = this.h;
        e0 a = xVar.a(xVar.a.c);
        com.amazon.aps.iva.yb0.j.c(a);
        d<com.amazon.aps.iva.pc0.c, com.amazon.aps.iva.sd0.g<?>> dVar = xVar.a.a.e;
        com.amazon.aps.iva.ee0.e0 returnType = this.j.getReturnType();
        com.amazon.aps.iva.yb0.j.e(returnType, "property.returnType");
        return dVar.e(a, this.i, returnType);
    }
}
