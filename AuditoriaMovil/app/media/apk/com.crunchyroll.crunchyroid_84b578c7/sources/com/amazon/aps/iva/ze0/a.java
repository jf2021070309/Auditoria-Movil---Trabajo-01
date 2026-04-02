package com.amazon.aps.iva.ze0;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.se0.k;
import com.amazon.aps.iva.xe0.q;
/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public final class a extends k {
    public final j b;
    public final int c;

    public a(j jVar, int i) {
        this.b = jVar;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.se0.l
    public final void a(Throwable th) {
        j jVar = this.b;
        jVar.getClass();
        jVar.e.set(this.c, i.e);
        if (q.d.incrementAndGet(jVar) == i.f && !jVar.c()) {
            jVar.d();
        }
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        a(th);
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelSemaphoreAcquisitionHandler[");
        sb.append(this.b);
        sb.append(", ");
        return b2.b(sb, this.c, ']');
    }
}
