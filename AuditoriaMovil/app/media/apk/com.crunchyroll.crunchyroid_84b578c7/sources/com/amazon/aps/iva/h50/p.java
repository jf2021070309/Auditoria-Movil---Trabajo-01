package com.amazon.aps.iva.h50;
/* compiled from: WatchlistItemTogglePresenterImpl.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;
    public final /* synthetic */ u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g gVar, u uVar) {
        super(1);
        this.h = gVar;
        this.i = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar) {
        com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
        v vVar = this.h;
        gVar2.c(new m(vVar));
        u uVar = this.i;
        gVar2.e(new n(vVar, uVar));
        gVar2.b(new o(vVar, uVar));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
