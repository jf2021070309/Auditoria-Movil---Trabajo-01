package com.kwad.sdk.utils;

import com.kwad.sdk.core.threads.GlobalThreadPools;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class g {
    private static volatile Executor aIg;
    private static volatile ScheduledExecutorService aIh;

    public static void execute(Runnable runnable) {
        if (aIg == null) {
            synchronized (g.class) {
                if (aIg == null) {
                    aIg = GlobalThreadPools.CY();
                }
            }
        }
        aIg.execute(runnable);
    }

    public static void schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        if (aIh == null) {
            synchronized (g.class) {
                if (aIh == null) {
                    aIh = GlobalThreadPools.CZ();
                }
            }
        }
        aIh.schedule(runnable, j, timeUnit);
    }
}
