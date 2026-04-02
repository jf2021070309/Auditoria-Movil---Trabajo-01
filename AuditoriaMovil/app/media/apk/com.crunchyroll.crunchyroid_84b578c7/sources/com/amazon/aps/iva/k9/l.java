package com.amazon.aps.iva.k9;

import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.m1;
import com.amazon.aps.iva.v9.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class l<R> implements ListenableFuture<R> {
    public final j1 b;
    public final com.amazon.aps.iva.v9.c<R> c;

    public l(m1 m1Var) {
        com.amazon.aps.iva.v9.c<R> cVar = new com.amazon.aps.iva.v9.c<>();
        this.b = m1Var;
        this.c = cVar;
        m1Var.s0(new k(this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.b instanceof a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
