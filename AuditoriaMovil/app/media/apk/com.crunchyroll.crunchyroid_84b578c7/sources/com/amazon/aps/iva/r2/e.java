package com.amazon.aps.iva.r2;

import com.amazon.aps.iva.r2.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class e<T> implements ListenableFuture<T> {
    public final WeakReference<b<T>> b;
    public final a c = new a();

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.r2.a<T> {
        public a() {
        }

        @Override // com.amazon.aps.iva.r2.a
        public final String e() {
            b<T> bVar = e.this.b.get();
            if (bVar == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            return "tag=[" + bVar.a + "]";
        }
    }

    public e(b<T> bVar) {
        this.b = new WeakReference<>(bVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        b<T> bVar = this.b.get();
        boolean cancel = this.c.cancel(z);
        if (cancel && bVar != null) {
            bVar.a = null;
            bVar.b = null;
            bVar.c.g(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws InterruptedException, ExecutionException {
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

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.c.get(j, timeUnit);
    }
}
