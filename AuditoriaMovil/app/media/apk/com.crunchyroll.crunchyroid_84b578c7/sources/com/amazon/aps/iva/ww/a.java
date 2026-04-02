package com.amazon.aps.iva.ww;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ExponentialBackoffExecutor.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<Long, q> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Long l) {
        Thread.sleep(l.longValue());
        return q.a;
    }
}
