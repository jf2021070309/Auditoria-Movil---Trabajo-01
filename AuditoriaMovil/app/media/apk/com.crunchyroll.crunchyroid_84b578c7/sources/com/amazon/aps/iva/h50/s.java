package com.amazon.aps.iva.h50;
/* compiled from: WatchlistItemTogglePresenterImpl.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;
    public final /* synthetic */ u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, u uVar) {
        super(1);
        this.h = vVar;
        this.i = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        v vVar = this.h;
        vVar.wg();
        u uVar = this.i;
        vVar.showSnackbar(new com.amazon.aps.iva.f60.o(uVar.b.getTitle()));
        uVar.d.k(uVar.b, th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
