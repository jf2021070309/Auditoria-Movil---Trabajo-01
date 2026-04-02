package com.amazon.aps.iva.ww;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ExponentialBackoffSleepTimeProvider.kt */
/* loaded from: classes2.dex */
public final class f implements g {
    public final long a;
    public final long b;
    public final p<Long, Long, Long> c;
    public final AtomicLong d;

    public f(int i) {
        e eVar = e.h;
        j.f(eVar, "nextLong");
        this.a = 32000L;
        this.b = 500L;
        this.c = eVar;
        this.d = new AtomicLong(0L);
    }

    @Override // com.amazon.aps.iva.ww.g
    public final void a() {
        this.d.set(0L);
    }

    @Override // com.amazon.aps.iva.ww.g
    public final void b() {
        AtomicLong atomicLong = this.d;
        atomicLong.set(Math.min(this.a, this.c.invoke(Long.valueOf(this.b), Long.valueOf(atomicLong.get() * 3)).longValue()));
    }

    @Override // com.amazon.aps.iva.ww.g
    public final long c() {
        return this.d.get();
    }
}
