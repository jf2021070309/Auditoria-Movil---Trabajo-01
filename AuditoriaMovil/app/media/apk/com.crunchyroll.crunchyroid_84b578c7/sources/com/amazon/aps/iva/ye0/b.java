package com.amazon.aps.iva.ye0;

import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.se0.b1;
import com.amazon.aps.iva.xe0.t;
import java.util.concurrent.Executor;
/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public final class b extends b1 implements Executor {
    public static final b c = new b();
    public static final com.amazon.aps.iva.xe0.f d;

    static {
        l lVar = l.c;
        int i = t.a;
        if (64 >= i) {
            i = 64;
        }
        boolean z = false;
        int H = com.amazon.aps.iva.dg.b.H("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (H >= 1) {
            z = true;
        }
        if (z) {
            d = new com.amazon.aps.iva.xe0.f(lVar, H);
            return;
        }
        throw new IllegalArgumentException(c0.a("Expected positive parallelism level, but got ", H).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x(com.amazon.aps.iva.ob0.h.b, runnable);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        d.x(gVar, runnable);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void y(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        d.y(gVar, runnable);
    }
}
