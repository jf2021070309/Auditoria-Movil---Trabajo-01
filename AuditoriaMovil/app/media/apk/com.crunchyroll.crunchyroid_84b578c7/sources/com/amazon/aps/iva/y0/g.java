package com.amazon.aps.iva.y0;

import java.util.Set;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class g implements e {
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Set<? extends Object>, h, com.amazon.aps.iva.kb0.q> a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.amazon.aps.iva.xb0.p<? super Set<? extends Object>, ? super h, com.amazon.aps.iva.kb0.q> pVar) {
        this.a = pVar;
    }

    @Override // com.amazon.aps.iva.y0.e
    public final void dispose() {
        com.amazon.aps.iva.xb0.p<Set<? extends Object>, h, com.amazon.aps.iva.kb0.q> pVar = this.a;
        synchronized (m.c) {
            m.h.remove(pVar);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }
}
