package com.amazon.aps.iva.k9;

import java.util.concurrent.CancellationException;
/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l<Object> lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        l<Object> lVar = this.h;
        if (th2 == null) {
            if (!lVar.c.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            lVar.c.cancel(true);
        } else {
            com.amazon.aps.iva.v9.c<Object> cVar = lVar.c;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            cVar.i(th2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
