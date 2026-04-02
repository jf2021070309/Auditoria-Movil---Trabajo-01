package com.bytedance.sdk.openadsdk.ge;

import com.bytedance.sdk.openadsdk.api.ge;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class dr {
    private static volatile dr ge;
    private volatile ThreadPoolExecutor dr = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0101dr(), new RejectedExecutionHandler() { // from class: com.bytedance.sdk.openadsdk.ge.dr.1
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            ge.g("TTThreadManager", "TTThreadManager rejectedExecution:  ");
        }
    });

    public static dr dr() {
        if (ge == null) {
            synchronized (dr.class) {
                ge = new dr();
            }
        }
        return ge;
    }

    public dr() {
        this.dr.allowCoreThreadTimeOut(true);
    }

    public void dr(Runnable runnable) {
        if (runnable != null) {
            try {
                this.dr.execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.ge.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0101dr implements ThreadFactory {
        private final ThreadGroup dr;
        private final AtomicInteger ge;
        private final String o;

        ThreadFactoryC0101dr() {
            this("csj_g_pl_mgr");
        }

        ThreadFactoryC0101dr(String str) {
            this.ge = new AtomicInteger(1);
            this.dr = new ThreadGroup("csj_g_pl_mgr");
            this.o = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.dr;
            Thread thread = new Thread(threadGroup, runnable, this.o + this.ge.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }
}
