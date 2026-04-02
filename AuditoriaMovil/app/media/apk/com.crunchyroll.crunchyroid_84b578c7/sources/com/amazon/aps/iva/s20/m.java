package com.amazon.aps.iva.s20;
/* compiled from: UpgradePresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.h = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        boolean z;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "e");
        n nVar = this.h;
        n.q6(nVar).b();
        if (th2 instanceof com.amazon.aps.iva.d30.b) {
            nVar.getView().q5();
        } else if (th2 instanceof com.amazon.aps.iva.d30.c) {
            nVar.getView().H3();
        } else {
            if (th2 instanceof com.amazon.aps.iva.d30.a) {
                z = true;
            } else {
                z = th2 instanceof com.amazon.aps.iva.d30.k;
            }
            if (z) {
                nVar.getView().I(new l(nVar.b));
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
