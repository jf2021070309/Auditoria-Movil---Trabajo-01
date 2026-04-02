package com.kwad.framework.filedownloader.f;

import com.kwad.sdk.service.ServiceProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b {
    private static volatile ThreadPoolExecutor aeR;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        private static final AtomicInteger aeS = new AtomicInteger(1);
        private final String namePrefix;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final ThreadGroup group = Thread.currentThread().getThreadGroup();

        a(String str) {
            this.namePrefix = f.bt(str);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.group;
            Thread thread = new Thread(threadGroup, runnable, "ksad-" + this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    @Deprecated
    public static ThreadPoolExecutor a(int i, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        if (vN()) {
            return vO();
        }
        com.kwad.sdk.core.threads.a.b bVar = new com.kwad.sdk.core.threads.a.b(i, i, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new a(str));
        com.kwad.sdk.core.threads.c.a(bVar, "ksad-" + str);
        bVar.allowCoreThreadTimeOut(true);
        return bVar;
    }

    @Deprecated
    public static ThreadPoolExecutor bm(String str) {
        if (vN()) {
            return vO();
        }
        com.kwad.sdk.core.threads.a.b bVar = new com.kwad.sdk.core.threads.a.b(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new SynchronousQueue(), new a(str));
        com.kwad.sdk.core.threads.c.a(bVar, "ksad-" + str);
        return bVar;
    }

    @Deprecated
    public static ThreadPoolExecutor j(int i, String str) {
        return vN() ? vO() : a(i, new LinkedBlockingQueue(), str);
    }

    private static boolean vN() {
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar != null) {
            return fVar.vN();
        }
        return false;
    }

    private static ThreadPoolExecutor vO() {
        if (aeR == null) {
            synchronized (b.class) {
                if (aeR == null) {
                    com.kwad.sdk.core.threads.a.b bVar = new com.kwad.sdk.core.threads.a.b(5, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(""));
                    aeR = bVar;
                    com.kwad.sdk.core.threads.c.a(bVar, "ksad-filedownload-default");
                }
            }
        }
        return aeR;
    }
}
