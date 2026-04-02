package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.z3.q;
import java.util.concurrent.CancellationException;
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<q.a<Object>, Throwable, com.amazon.aps.iva.kb0.q> {
    public static final s h = new s();

    public s() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(q.a<Object> aVar, Throwable th) {
        q.a<Object> aVar2 = aVar;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(aVar2, "msg");
        if (aVar2 instanceof q.a.b) {
            q.a.b bVar = (q.a.b) aVar2;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            bVar.b.F(th2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
