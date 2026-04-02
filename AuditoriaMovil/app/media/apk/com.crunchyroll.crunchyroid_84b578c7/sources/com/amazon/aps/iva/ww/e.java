package com.amazon.aps.iva.ww;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ExponentialBackoffSleepTimeProvider.kt */
/* loaded from: classes2.dex */
public final class e extends l implements p<Long, Long, Long> {
    public static final e h = new e();

    public e() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Long invoke(Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        return Long.valueOf(com.amazon.aps.iva.cc0.c.b.d(Math.min(longValue, longValue2), Math.max(longValue, longValue2)));
    }
}
