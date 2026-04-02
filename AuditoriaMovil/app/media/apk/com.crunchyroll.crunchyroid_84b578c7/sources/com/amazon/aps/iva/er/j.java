package com.amazon.aps.iva.er;

import com.amazon.aps.iva.xq.k;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: VitalReaderRunnable.kt */
/* loaded from: classes2.dex */
public final class j implements Runnable {
    public final i b;
    public final h c;
    public final ScheduledExecutorService d;
    public final long e;

    public j(i iVar, g gVar, ScheduledExecutorService scheduledExecutorService, long j) {
        com.amazon.aps.iva.yb0.j.f(gVar, "observer");
        com.amazon.aps.iva.yb0.j.f(scheduledExecutorService, "executor");
        this.b = iVar;
        this.c = gVar;
        this.d = scheduledExecutorService;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double a;
        if (com.amazon.aps.iva.sq.c.a().h == k.a.FOREGROUND && (a = this.b.a()) != null) {
            this.c.b(a.doubleValue());
        }
        com.amazon.aps.iva.aq.k.C(this.d, "Vitals monitoring", this.e, TimeUnit.MILLISECONDS, this);
    }
}
