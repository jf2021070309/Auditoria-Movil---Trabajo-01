package com.amazon.aps.iva.yu;
/* compiled from: AddToCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(1);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        u view;
        u view2;
        u view3;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        q qVar = this.h;
        view = qVar.getView();
        view.i();
        view2 = qVar.getView();
        view2.o();
        view3 = qVar.getView();
        view3.k0(new o(qVar));
        qVar.d.a(th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
