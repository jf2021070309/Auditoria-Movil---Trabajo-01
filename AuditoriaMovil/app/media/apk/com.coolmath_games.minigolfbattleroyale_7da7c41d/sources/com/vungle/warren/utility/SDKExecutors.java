package com.vungle.warren.utility;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class SDKExecutors implements Executors {
    private static final ThreadPoolExecutor API_EXECUTOR;
    private static final ExecutorService BACKGROUND_EXECUTOR;
    private static final ExecutorService IO_EXECUTOR;
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 1;
    private static final ExecutorService JOB_EXECUTOR;
    private static final ExecutorService LOGGER_EXECUTOR;
    private static int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final ExecutorService TASK_EXECUTOR;
    private static final ExecutorService UI_EXECUTOR;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;

    static {
        AbstractExecutorService abstractExecutorService = new AbstractExecutorService() { // from class: com.vungle.warren.utility.SDKExecutors.1
            private final Handler UIHandler = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.ExecutorService
            public boolean awaitTermination(long j, TimeUnit timeUnit) {
                return false;
            }

            @Override // java.util.concurrent.ExecutorService
            public boolean isShutdown() {
                return false;
            }

            @Override // java.util.concurrent.ExecutorService
            public boolean isTerminated() {
                return false;
            }

            @Override // java.util.concurrent.ExecutorService
            public void shutdown() {
            }

            @Override // java.util.concurrent.ExecutorService
            public List<Runnable> shutdownNow() {
                return null;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.UIHandler.post(runnable);
            }
        };
        int i = NUMBER_OF_CORES;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 1L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new NamedThreadFactory("vng_jr"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("vng_io"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("vng_logger"));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("vng_background"));
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("vng_api"));
        threadPoolExecutor5.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(1, 20, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new NamedThreadFactory("vng_task"));
        UI_EXECUTOR = abstractExecutorService;
        JOB_EXECUTOR = threadPoolExecutor;
        IO_EXECUTOR = threadPoolExecutor2;
        BACKGROUND_EXECUTOR = threadPoolExecutor4;
        API_EXECUTOR = threadPoolExecutor5;
        LOGGER_EXECUTOR = threadPoolExecutor3;
        TASK_EXECUTOR = threadPoolExecutor6;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getUIExecutor() {
        return UI_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getBackgroundExecutor() {
        return BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getIOExecutor() {
        return IO_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getJobExecutor() {
        return JOB_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getApiExecutor() {
        return API_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getLoggerExecutor() {
        return LOGGER_EXECUTOR;
    }

    @Override // com.vungle.warren.utility.Executors
    public ExecutorService getTaskExecutor() {
        return TASK_EXECUTOR;
    }

    /* loaded from: classes2.dex */
    private static class NamedThreadFactory implements ThreadFactory {
        private final String name;
        private ThreadFactory threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        private AtomicInteger atomicInteger = new AtomicInteger(0);

        public NamedThreadFactory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.threadFactory.newThread(runnable);
            newThread.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
            return newThread;
        }
    }
}
