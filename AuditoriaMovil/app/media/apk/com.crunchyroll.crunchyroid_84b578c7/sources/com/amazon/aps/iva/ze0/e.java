package com.amazon.aps.iva.ze0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Mutex.kt */
/* loaded from: classes4.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Object obj) {
        super(1);
        this.h = dVar;
        this.i = obj;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        this.h.d(this.i);
        return q.a;
    }
}
