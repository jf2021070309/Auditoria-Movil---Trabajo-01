package com.kwad.sdk.utils.a;

import com.kwad.sdk.utils.a.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class d {
    static volatile Executor aLA;
    static ExecutorService aLB = Executors.newSingleThreadExecutor();
    static c.d aLz;

    private d() {
    }

    public static void a(c.d dVar) {
        aLz = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor getExecutor() {
        if (aLA == null) {
            synchronized (d.class) {
                if (aLA == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    aLA = threadPoolExecutor;
                }
            }
        }
        return aLA;
    }

    public static void setExecutor(Executor executor) {
        if (executor != null) {
            aLA = executor;
        }
    }
}
