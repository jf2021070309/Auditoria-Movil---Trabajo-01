package com.amazon.aps.iva.o0;
/* compiled from: Latch.kt */
/* loaded from: classes.dex */
public final class e1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f1 h;
    public final /* synthetic */ com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, com.amazon.aps.iva.se0.n nVar) {
        super(1);
        this.h = f1Var;
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        f1 f1Var = this.h;
        Object obj = f1Var.a;
        com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> mVar = this.i;
        synchronized (obj) {
            f1Var.b.remove(mVar);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
