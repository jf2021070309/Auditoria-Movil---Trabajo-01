package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.m2;
import java.util.concurrent.CancellationException;
/* compiled from: Recomposer.kt */
/* loaded from: classes.dex */
public final class n2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ m2 h;
    public final /* synthetic */ Throwable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(m2 m2Var, Throwable th) {
        super(1);
        this.h = m2Var;
        this.i = th;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        m2 m2Var = this.h;
        Object obj = m2Var.b;
        Throwable th3 = this.i;
        synchronized (obj) {
            if (th3 != null) {
                if (th2 != null) {
                    if (!(!(th2 instanceof CancellationException))) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        com.amazon.aps.iva.aq.k.f(th3, th2);
                    }
                }
            } else {
                th3 = null;
            }
            m2Var.d = th3;
            m2Var.r.setValue(m2.d.ShutDown);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
