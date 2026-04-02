package com.amazon.aps.iva.ee0;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes4.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e0> {
    public final /* synthetic */ com.amazon.aps.iva.fe0.f h;
    public final /* synthetic */ i0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.amazon.aps.iva.fe0.f fVar, i0 i0Var) {
        super(0);
        this.h = fVar;
        this.i = i0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final e0 invoke() {
        return this.h.w(this.i.d.invoke());
    }
}
