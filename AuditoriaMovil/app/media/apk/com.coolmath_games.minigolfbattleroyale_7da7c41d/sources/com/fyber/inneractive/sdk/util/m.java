package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class m {
    public static final Executor a;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final ThreadFactory c = new ThreadFactory() { // from class: com.fyber.inneractive.sdk.util.m.1
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "IAConcurrencyUtil#" + this.a.getAndIncrement());
        }
    };
    private static final RejectedExecutionHandler d = new RejectedExecutionHandler() { // from class: com.fyber.inneractive.sdk.util.m.2
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IAlog.b("rejectedExecution received for - %s", runnable);
        }
    };

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), c, d);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = threadPoolExecutor;
    }

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }

    public static Handler a() {
        return b;
    }
}
