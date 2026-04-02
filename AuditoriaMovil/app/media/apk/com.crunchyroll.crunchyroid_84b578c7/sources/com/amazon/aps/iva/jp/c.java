package com.amazon.aps.iva.jp;

import android.content.Context;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.aq.i;
import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.google.android.gms.cast.CredentialsData;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Datadog.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final long b = System.nanoTime();
    public static int c = Integer.MAX_VALUE;
    public static boolean d;

    static {
        com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.a;
    }

    public static void a(String str) {
        com.amazon.aps.iva.lp.a.k.d(new com.amazon.aps.iva.eq.b(str, null, null, a0.b));
    }

    public static void b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.amazon.aps.iva.x90.c cVar;
        AtomicBoolean atomicBoolean = a;
        if (atomicBoolean.get()) {
            com.amazon.aps.iva.jq.a.f.i();
            com.amazon.aps.iva.lr.a.f.i();
            com.amazon.aps.iva.tq.c.f.i();
            com.amazon.aps.iva.fq.b.f.i();
            AtomicBoolean atomicBoolean2 = com.amazon.aps.iva.lp.a.d;
            if (atomicBoolean2.get()) {
                Context context = com.amazon.aps.iva.lp.a.e.get();
                if (context != null) {
                    com.amazon.aps.iva.lp.a.g.a(context);
                    com.amazon.aps.iva.lp.a.h.a(context);
                }
                com.amazon.aps.iva.lp.a.e.clear();
                com.amazon.aps.iva.lp.a.j.b();
                try {
                    cVar = com.amazon.aps.iva.lp.a.m;
                } catch (IllegalStateException e) {
                    com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.a, "Trying to shut down Kronos when it is already not running", e, 4);
                }
                if (cVar != null) {
                    cVar.shutdown();
                    com.amazon.aps.iva.lp.a.n = "";
                    com.amazon.aps.iva.lp.a.o = "";
                    com.amazon.aps.iva.lp.a.p = new j();
                    com.amazon.aps.iva.lp.a.q = "";
                    com.amazon.aps.iva.lp.a.r = CredentialsData.CREDENTIALS_TYPE_ANDROID;
                    com.amazon.aps.iva.lp.a.t = null;
                    com.amazon.aps.iva.lp.a.u = true;
                    com.amazon.aps.iva.lp.a.w = "";
                    com.amazon.aps.iva.lp.a.x = "";
                    com.amazon.aps.iva.lp.a.f = new com.amazon.aps.iva.l9.a((List) z.b);
                    com.amazon.aps.iva.lp.a.g = new com.amazon.aps.iva.ff0.b();
                    com.amazon.aps.iva.lp.a.h = new k();
                    com.amazon.aps.iva.lp.a.i = new com.amazon.aps.iva.cq.b();
                    com.amazon.aps.iva.lp.a.j = new com.amazon.aps.iva.ff0.b();
                    com.amazon.aps.iva.lp.a.k = new k0();
                    com.amazon.aps.iva.lp.a.D = new i();
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = com.amazon.aps.iva.lp.a.A;
                    if (scheduledThreadPoolExecutor2 != null) {
                        scheduledThreadPoolExecutor2.shutdownNow();
                        com.amazon.aps.iva.lp.a.c().shutdownNow();
                        try {
                            try {
                                scheduledThreadPoolExecutor = com.amazon.aps.iva.lp.a.A;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } catch (SecurityException e2) {
                            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.a, "Thread was unable to set its own interrupted state", e2, 4);
                        }
                        if (scheduledThreadPoolExecutor != null) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            scheduledThreadPoolExecutor.awaitTermination(1L, timeUnit);
                            com.amazon.aps.iva.lp.a.c().awaitTermination(1L, timeUnit);
                            atomicBoolean2.set(false);
                            com.amazon.aps.iva.lp.a.z = new com.amazon.aps.iva.n1.c();
                            com.amazon.aps.iva.lp.a.j = new com.amazon.aps.iva.ff0.b();
                        } else {
                            com.amazon.aps.iva.yb0.j.m("uploadExecutorService");
                            throw null;
                        }
                    } else {
                        com.amazon.aps.iva.yb0.j.m("uploadExecutorService");
                        throw null;
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("kronosClock");
                    throw null;
                }
            }
            com.amazon.aps.iva.rr.b.f.i();
            com.amazon.aps.iva.sr.a.f.i();
            d = false;
            atomicBoolean.set(false);
        }
    }
}
