package com.amazon.aps.iva.cj;
/* compiled from: PlayerImpl.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jl.a> {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(0);
        this.h = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.jl.a invoke() {
        s sVar = this.h;
        if (com.amazon.aps.iva.yb0.j.a(sVar.q.d(), Boolean.TRUE)) {
            return sVar.k();
        }
        return com.amazon.aps.iva.jl.e.b;
    }
}
