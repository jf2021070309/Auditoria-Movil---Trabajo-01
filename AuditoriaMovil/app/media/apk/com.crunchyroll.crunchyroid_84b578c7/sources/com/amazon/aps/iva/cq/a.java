package com.amazon.aps.iva.cq;

import java.util.concurrent.TimeUnit;
/* compiled from: KronosTimeProvider.kt */
/* loaded from: classes2.dex */
public final class a implements c {
    public final com.amazon.aps.iva.x90.a b;

    public a(com.amazon.aps.iva.x90.c cVar) {
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.cq.c
    public final long c() {
        return this.b.a() - System.currentTimeMillis();
    }

    @Override // com.amazon.aps.iva.cq.c
    public final long i() {
        return TimeUnit.MILLISECONDS.toNanos(c());
    }
}
