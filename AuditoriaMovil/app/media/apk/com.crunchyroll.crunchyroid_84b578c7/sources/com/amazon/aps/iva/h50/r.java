package com.amazon.aps.iva.h50;
/* compiled from: WatchlistItemTogglePresenterImpl.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;
    public final /* synthetic */ u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, u uVar) {
        super(1);
        this.h = vVar;
        this.i = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        this.h.showSnackbar(com.amazon.aps.iva.f60.n.b);
        u uVar = this.i;
        uVar.d.d(uVar.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
