package com.amazon.aps.iva.dd;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.nc.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestFutureTarget.java */
/* loaded from: classes.dex */
public final class f<R> implements Future, com.amazon.aps.iva.ed.h, g<R> {
    public final int b = Integer.MIN_VALUE;
    public final int c = Integer.MIN_VALUE;
    public R d;
    public d e;
    public boolean f;
    public boolean g;
    public boolean h;
    public r i;

    /* compiled from: RequestFutureTarget.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    @Override // com.amazon.aps.iva.dd.g
    public final synchronized void a(r rVar, com.amazon.aps.iva.ed.h hVar) {
        this.h = true;
        this.i = rVar;
        notifyAll();
    }

    @Override // com.amazon.aps.iva.dd.g
    public final synchronized boolean b(R r, Object obj, com.amazon.aps.iva.ed.h<R> hVar, com.amazon.aps.iva.kc.a aVar, boolean z) {
        this.g = true;
        this.d = r;
        notifyAll();
        return false;
    }

    public final synchronized R c(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        if (!isDone()) {
            char[] cArr = l.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (!this.f) {
            if (!this.h) {
                if (this.g) {
                    return this.d;
                }
                if (l == null) {
                    wait(0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.h) {
                        if (!this.f) {
                            if (this.g) {
                                return this.d;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.i);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.i);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f = true;
            notifyAll();
            d dVar = null;
            if (z) {
                d dVar2 = this.e;
                this.e = null;
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws InterruptedException, ExecutionException {
        try {
            return c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.amazon.aps.iva.ed.h
    public final synchronized d getRequest() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void getSize(com.amazon.aps.iva.ed.g gVar) {
        gVar.b(this.b, this.c);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.f && !this.g) {
            if (!this.h) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // com.amazon.aps.iva.ed.h
    public final synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final synchronized void onResourceReady(R r, com.amazon.aps.iva.fd.d<? super R> dVar) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final synchronized void setRequest(d dVar) {
        this.e = dVar;
    }

    public final String toString() {
        d dVar;
        String str;
        String c = defpackage.b.c(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            dVar = null;
            if (this.f) {
                str = "CANCELLED";
            } else if (this.h) {
                str = "FAILURE";
            } else if (this.g) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dVar = this.e;
            }
        }
        if (dVar != null) {
            return c + str + ", request=[" + dVar + "]]";
        }
        return q.b(c, str, "]");
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return c(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onDestroy() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStart() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStop() {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void removeCallback(com.amazon.aps.iva.ed.g gVar) {
    }
}
