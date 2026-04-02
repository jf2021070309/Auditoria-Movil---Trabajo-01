package com.kwad.sdk.core.threads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class GlobalThreadPools {
    private static String TAG;
    private static final int avi;
    private static final int avj;
    private static final int avk;
    private static Map<String, WeakReference<ExecutorService>> avl;
    private static Map<String, Integer> avm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.threads.GlobalThreadPools$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] avn;

        static {
            int[] iArr = new int[ParamType.values().length];
            avn = iArr;
            try {
                iArr[ParamType.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                avn[ParamType.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                avn[ParamType.KEEP_ALIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum ParamType {
        CORE,
        MAX,
        KEEP_ALIVE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        ExecutorService Dd();
    }

    /* loaded from: classes.dex */
    static class b implements a {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        public final ExecutorService Dd() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("httpIO", ParamType.CORE, GlobalThreadPools.avj), GlobalThreadPools.a("httpIO", ParamType.MAX, GlobalThreadPools.avk), GlobalThreadPools.a("httpIO", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "diskAndHttp"));
        }
    }

    /* loaded from: classes.dex */
    static class c implements a {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        public final ExecutorService Dd() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("imageLoaderDistributor", ParamType.CORE, 0), GlobalThreadPools.a("imageLoaderDistributor", ParamType.MAX, 10), GlobalThreadPools.a("imageLoaderDistributor", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new SynchronousQueue(), new d(5, "uil-pool-d-"), new ThreadPoolExecutor.DiscardPolicy());
        }
    }

    /* loaded from: classes.dex */
    public static class d implements ThreadFactory {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private final String namePrefix;
        private final int threadPriority;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final ThreadGroup group = Thread.currentThread().getThreadGroup();

        public d(int i, String str) {
            this.threadPriority = i;
            this.namePrefix = "ksad-" + str + poolNumber.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.group;
            Thread thread = new Thread(threadGroup, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.threadPriority);
            return thread;
        }
    }

    /* loaded from: classes.dex */
    static class e implements a {
        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        public final ExecutorService Dd() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("ksImageLoaderTask", ParamType.CORE, 3), GlobalThreadPools.a("ksImageLoaderTask", ParamType.MAX, 3), GlobalThreadPools.a("ksImageLoaderTask", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "uil-pool-"));
        }
    }

    /* loaded from: classes.dex */
    static class f implements a {
        private f() {
        }

        /* synthetic */ f(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        public final ExecutorService Dd() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("lruDiskCache", ParamType.CORE, 0), GlobalThreadPools.a("lruDiskCache", ParamType.MAX, 1), GlobalThreadPools.a("lruDiskCache", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "lruDiskCache"));
        }
    }

    /* loaded from: classes.dex */
    static class g implements a {
        private g() {
        }

        /* synthetic */ g(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        public final ExecutorService Dd() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("report", ParamType.CORE, 1), GlobalThreadPools.a("report", ParamType.MAX, 1), GlobalThreadPools.a("report", ParamType.KEEP_ALIVE, 0), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(3, "report-"));
        }
    }

    /* loaded from: classes.dex */
    static class h implements a {
        private h() {
        }

        /* synthetic */ h(byte b) {
            this();
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        public final ExecutorService Dd() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("videoCache", ParamType.CORE, 3), GlobalThreadPools.a("videoCache", ParamType.MAX, 3), GlobalThreadPools.a("videoCache", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "videoCache"));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        avi = availableProcessors;
        int i = availableProcessors > 0 ? availableProcessors + 4 : 9;
        avj = i;
        avk = i;
        TAG = "GlobalThreadPools";
        avl = new ConcurrentHashMap();
        avm = new ConcurrentHashMap();
    }

    public static void CO() {
        for (String str : avl.keySet()) {
            if (avl.get(str).get() instanceof ThreadPoolExecutor) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) avl.get(str).get();
                int corePoolSize = threadPoolExecutor.getCorePoolSize();
                int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
                int a2 = a(str, ParamType.CORE, corePoolSize);
                int a3 = a(str, ParamType.MAX, maximumPoolSize);
                threadPoolExecutor.setKeepAliveTime(a(str, ParamType.KEEP_ALIVE, (int) threadPoolExecutor.getKeepAliveTime(TimeUnit.SECONDS)), TimeUnit.SECONDS);
                if (corePoolSize != a2 || maximumPoolSize != a3) {
                    if (corePoolSize <= a3) {
                        threadPoolExecutor.setMaximumPoolSize(a3);
                        threadPoolExecutor.setCorePoolSize(a2);
                    } else if (a2 <= maximumPoolSize) {
                        threadPoolExecutor.setCorePoolSize(a2);
                        threadPoolExecutor.setMaximumPoolSize(a3);
                    }
                }
            }
        }
    }

    public static ExecutorService CP() {
        return a("lruDiskCache", new f((byte) 0));
    }

    public static synchronized ExecutorService CQ() {
        ExecutorService a2;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forKsImageLoaderTask");
            a2 = a("ksImageLoaderTask", new e((byte) 0));
        }
        return a2;
    }

    public static synchronized ExecutorService CR() {
        ExecutorService a2;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forKsImageLoaderCachedImages");
            a2 = a("ksImageLoaderTask", new e((byte) 0));
        }
        return a2;
    }

    public static ExecutorService CS() {
        com.kwad.sdk.core.e.c.d(TAG, "forKsImageLoaderTaskDistributor");
        return a("imageLoaderDistributor", new c((byte) 0));
    }

    public static synchronized ExecutorService CT() {
        ExecutorService a2;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forBaseBatchReporter");
            a2 = a("report", new g((byte) 0));
        }
        return a2;
    }

    public static synchronized ExecutorService CU() {
        ExecutorService a2;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forAdReportManager");
            a2 = a("report", new g((byte) 0));
        }
        return a2;
    }

    public static ExecutorService CV() {
        com.kwad.sdk.core.e.c.d(TAG, "forBaseNetwork");
        return a("httpIO", new b((byte) 0));
    }

    public static ExecutorService CW() {
        com.kwad.sdk.core.e.c.d(TAG, "forHttpCacheServer");
        return a("videoCache", new h((byte) 0));
    }

    public static ExecutorService CX() {
        com.kwad.sdk.core.e.c.d(TAG, "forAppStatusHelper");
        return new com.kwad.sdk.core.threads.a.b(a("lruDiskCache", ParamType.CORE, 1), a("lruDiskCache", ParamType.MAX, 1), a("lruDiskCache", ParamType.KEEP_ALIVE, 0), TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.kwad.sdk.core.threads.GlobalThreadPools.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "ksad-ashelper");
                thread.setPriority(3);
                return thread;
            }
        });
    }

    public static ExecutorService CY() {
        com.kwad.sdk.core.e.c.d(TAG, "forAsync");
        return a("async", new a() { // from class: com.kwad.sdk.core.threads.GlobalThreadPools.2
            @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
            public final ExecutorService Dd() {
                return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("async", ParamType.CORE, 3), GlobalThreadPools.a("async", ParamType.MAX, 3), GlobalThreadPools.a("async", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "async"));
            }
        });
    }

    public static ScheduledExecutorService CZ() {
        com.kwad.sdk.core.e.c.d(TAG, "forAsyncSchedule");
        ExecutorService a2 = a("async-schedule", new a() { // from class: com.kwad.sdk.core.threads.GlobalThreadPools.3
            @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
            public final ExecutorService Dd() {
                return new com.kwad.sdk.core.threads.a.a(1, new d(5, "async-schedule"));
            }
        });
        return a2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) a2 : new com.kwad.sdk.core.threads.a.a(1, new d(5, "async-schedule"));
    }

    public static Set<String> Da() {
        return avl.keySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(String str, ParamType paramType, int i) {
        StringBuilder sb;
        String str2;
        int i2 = AnonymousClass4.avn[paramType.ordinal()];
        if (i2 == 1) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_core";
        } else if (i2 == 2) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_max";
        } else if (i2 != 3) {
            return i;
        } else {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_keep_alive";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        return (!avm.containsKey(sb2) || avm.get(sb2) == null) ? i : avm.get(sb2).intValue();
    }

    private static ExecutorService a(String str, a aVar) {
        WeakReference<ExecutorService> weakReference = avl.get(str);
        if (weakReference == null || weakReference.get() == null) {
            ExecutorService Dd = aVar.Dd();
            avl.put(str, new WeakReference<>(Dd));
            return Dd;
        }
        return weakReference.get();
    }

    public static ExecutorService dF(String str) {
        if (!avl.containsKey(str) || avl.get(str) == null) {
            return null;
        }
        return avl.get(str).get();
    }

    public static void n(String str, int i) {
        avm.put(str, Integer.valueOf(i));
    }
}
