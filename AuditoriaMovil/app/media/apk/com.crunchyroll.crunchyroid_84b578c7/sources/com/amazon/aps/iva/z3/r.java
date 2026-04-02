package com.amazon.aps.iva.z3;
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q<Object> qVar) {
        super(1);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            this.h.h.setValue(new j(th2));
        }
        Object obj = q.l;
        q<Object> qVar = this.h;
        synchronized (obj) {
            q.k.remove(qVar.c().getAbsolutePath());
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
