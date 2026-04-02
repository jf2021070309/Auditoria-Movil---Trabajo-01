package com.amazon.aps.iva.ze0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        this.h.release();
        return q.a;
    }
}
