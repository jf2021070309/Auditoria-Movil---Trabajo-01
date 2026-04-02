package com.amazon.aps.iva.ur;

import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DDSpan.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.fb0.b, com.amazon.aps.iva.as.a {
    public final b b;
    public final long d;
    public volatile WeakReference<a> f;
    public final AtomicLong e = new AtomicLong();
    public final long c = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());

    public a(b bVar, d dVar) {
        this.b = bVar;
        e eVar = bVar.b;
        eVar.getClass();
        this.d = Math.max(0L, System.nanoTime() - eVar.e) + eVar.d;
        e eVar2 = bVar.b;
        BigInteger bigInteger = eVar2.c;
        if (bigInteger != null && bigInteger.equals(bVar.d)) {
            AtomicReference<WeakReference<a>> atomicReference = eVar2.j;
            WeakReference<a> weakReference = new WeakReference<>(this);
            while (!atomicReference.compareAndSet(null, weakReference) && atomicReference.get() == null) {
            }
            synchronized (this) {
                if (this.f == null) {
                    this.f = new WeakReference<>(this, eVar2.f);
                    eVar2.g.add(this.f);
                    eVar2.h.incrementAndGet();
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.as.a
    public final void a() {
        this.b.b.e(this, false);
    }

    @Override // com.amazon.aps.iva.fb0.b
    public final com.amazon.aps.iva.fb0.b b(String str, String str2) {
        this.b.i(str2, str);
        return this;
    }

    @Override // com.amazon.aps.iva.fb0.b
    public final com.amazon.aps.iva.fb0.c c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.fb0.b
    public final com.amazon.aps.iva.fb0.b d(Integer num) {
        this.b.i(num, "http.status_code");
        return this;
    }

    @Override // com.amazon.aps.iva.as.a
    public final a e(String str) {
        this.b.i = str;
        return this;
    }

    @Override // com.amazon.aps.iva.as.a
    public final a f() {
        this.b.k = true;
        return this;
    }

    @Override // com.amazon.aps.iva.fb0.b
    public final void finish() {
        long j = this.d;
        if (j > 0) {
            e eVar = this.b.b;
            eVar.getClass();
            g((Math.max(0L, System.nanoTime() - eVar.e) + eVar.d) - j);
            return;
        }
        g(TimeUnit.MICROSECONDS.toNanos(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - this.c));
    }

    public final void g(long j) {
        BigInteger bigInteger;
        AtomicLong atomicLong = this.e;
        if (atomicLong.compareAndSet(0L, Math.max(1L, j))) {
            b bVar = this.b;
            e eVar = bVar.b;
            eVar.getClass();
            if (atomicLong.get() != 0 && (bigInteger = eVar.c) != null && bigInteger.equals(bVar.d)) {
                if (!eVar.k.get()) {
                    eVar.addFirst(this);
                }
                eVar.e(this, true);
            }
        }
    }

    public final Map<String, Object> h() {
        Map<String, Object> unmodifiableMap;
        b bVar = this.b;
        synchronized (bVar) {
            unmodifiableMap = Collections.unmodifiableMap(bVar.g);
        }
        return unmodifiableMap;
    }

    public final String toString() {
        return this.b.toString() + ", duration_ns=" + this.e;
    }
}
