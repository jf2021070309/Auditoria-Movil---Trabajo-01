package com.amazon.aps.iva.te0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes4.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ f h;
    public final /* synthetic */ Runnable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(1);
        this.h = fVar;
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        this.h.c.removeCallbacks(this.i);
        return q.a;
    }
}
