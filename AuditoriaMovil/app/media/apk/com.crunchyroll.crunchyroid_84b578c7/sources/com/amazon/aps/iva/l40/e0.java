package com.amazon.aps.iva.l40;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "exception");
        boolean z = th2 instanceof a;
        v vVar = this.h;
        if (z) {
            v.q6(vVar).closeScreen();
        } else {
            v.q6(vVar).D9(new d0(vVar));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
