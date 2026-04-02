package com.amazon.aps.iva.mq;

import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: DatadogLogHandler.kt */
/* loaded from: classes2.dex */
public final class c implements e {
    public final com.amazon.aps.iva.kq.b b;
    public final com.amazon.aps.iva.sp.c<com.amazon.aps.iva.pq.a> c;
    public final boolean d;
    public final boolean e;
    public final com.amazon.aps.iva.zp.b f;
    public final int g;

    public c(com.amazon.aps.iva.kq.b bVar, com.amazon.aps.iva.sp.c cVar, boolean z, boolean z2, com.amazon.aps.iva.zp.a aVar, int i) {
        this.b = bVar;
        this.c = cVar;
        this.d = z;
        this.e = z2;
        this.f = aVar;
        this.g = i;
    }

    @Override // com.amazon.aps.iva.mq.e
    public final void e(int i, String str, Throwable th, LinkedHashMap linkedHashMap, CopyOnWriteArraySet copyOnWriteArraySet, Long l) {
        long longValue;
        j.f(str, "message");
        j.f(copyOnWriteArraySet, "tags");
        if (i < this.g) {
            return;
        }
        if (l == null) {
            longValue = System.currentTimeMillis();
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        if (this.f.a()) {
            this.c.b(com.amazon.aps.iva.kq.b.a(this.b, i, str, th, linkedHashMap, copyOnWriteArraySet, j, null, this.d, this.e, null, null, 1600));
        }
        if (i >= 6) {
            com.amazon.aps.iva.sq.c.c.r(str, com.amazon.aps.iva.sq.e.LOGGER, th, linkedHashMap);
        }
    }
}
