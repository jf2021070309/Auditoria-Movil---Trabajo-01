package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ExecutorServiceUtil {
    private static final ThreadFactory THREAD_FACTORY = new a();

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public final ThreadFactory a = Executors.defaultThreadFactory();

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f2933b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.newThread(runnable);
            if (!newThread.isDaemon()) {
                newThread.setDaemon(true);
            }
            StringBuilder y = e.a.d.a.a.y("logback-");
            y.append(this.f2933b.getAndIncrement());
            newThread.setName(y.toString());
            return newThread;
        }
    }

    public static ExecutorService newExecutorService() {
        return new ThreadPoolExecutor(CoreConstants.CORE_POOL_SIZE, 32, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), THREAD_FACTORY);
    }

    public static ScheduledExecutorService newScheduledExecutorService() {
        return new ScheduledThreadPoolExecutor(2, THREAD_FACTORY);
    }

    public static void shutdown(ExecutorService executorService) {
        executorService.shutdownNow();
    }
}
