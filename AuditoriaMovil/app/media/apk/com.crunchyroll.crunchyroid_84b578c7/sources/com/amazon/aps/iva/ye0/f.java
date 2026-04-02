package com.amazon.aps.iva.ye0;

import com.amazon.aps.iva.se0.b1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public class f extends b1 {
    public final a c;

    public f(int i, int i2, long j) {
        this.c = new a(i, i2, "DefaultDispatcher", j);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.i;
        this.c.c(runnable, k.f, false);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void y(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.i;
        this.c.c(runnable, k.f, true);
    }
}
