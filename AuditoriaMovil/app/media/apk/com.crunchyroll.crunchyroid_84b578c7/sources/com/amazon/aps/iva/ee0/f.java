package com.amazon.aps.iva.ee0;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes4.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ b1 h;
    public final /* synthetic */ com.amazon.aps.iva.he0.n i;
    public final /* synthetic */ com.amazon.aps.iva.he0.i j;
    public final /* synthetic */ com.amazon.aps.iva.he0.i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b1 b1Var, com.amazon.aps.iva.he0.n nVar, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2) {
        super(0);
        this.h = b1Var;
        this.i = nVar;
        this.j = iVar;
        this.k = iVar2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(e.h(this.h, this.i.j(this.j), this.k));
    }
}
