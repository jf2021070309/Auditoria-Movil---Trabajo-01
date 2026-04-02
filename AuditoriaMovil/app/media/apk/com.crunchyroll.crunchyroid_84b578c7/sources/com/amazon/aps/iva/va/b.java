package com.amazon.aps.iva.va;

import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.g;
import com.amazon.aps.iva.wa.h;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ApsIvaExecutorServiceFactory.java */
/* loaded from: classes.dex */
public final class b {
    public static final String b = a.class.getSimpleName();
    public static b c;
    public h a;

    public static b c() {
        if (c == null) {
            c = new b();
        }
        return c;
    }

    public final void a() {
        h hVar = this.a;
        if (hVar != null) {
            if (!hVar.a.isShutdown()) {
                ScheduledExecutorService scheduledExecutorService = hVar.a;
                scheduledExecutorService.shutdown();
                try {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (!scheduledExecutorService.awaitTermination(5L, timeUnit)) {
                        scheduledExecutorService.shutdownNow();
                        if (!scheduledExecutorService.awaitTermination(5L, timeUnit)) {
                            LogUtils.e("g", "Error Terminating Flush Executor");
                        }
                    }
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                }
            }
            this.a = null;
        }
    }

    public final g b() {
        if (this.a == null) {
            try {
                this.a = new h();
            } catch (RuntimeException e) {
                LogUtils.e(b, e.getMessage());
            }
        }
        return this.a;
    }
}
