package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122.b;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class e {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final PriorityBlockingQueue<Runnable> d;
    private static final PriorityBlockingQueue<Runnable> e;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        int i = (availableProcessors / 2) + 1;
        if (i < 4) {
            i = 4;
        }
        b = i;
        int i2 = (availableProcessors / 2) + 1;
        c = i2 >= 4 ? i2 : 4;
        d = new PriorityBlockingQueue<>();
        e = new PriorityBlockingQueue<>();
    }

    public static ThreadPoolExecutor a() {
        int i = b;
        return new ThreadPoolExecutor(i, i, 1L, TimeUnit.SECONDS, d, new d(b.a.NORMAL, "tt-api-thread-"));
    }

    public static ScheduledExecutorService b() {
        return Executors.newSingleThreadScheduledExecutor(new d(b.a.LOW, "tt-delay-thread-"));
    }

    public static ThreadPoolExecutor c() {
        int i = c;
        return new ThreadPoolExecutor(i, i, 1L, TimeUnit.SECONDS, e, new d(b.a.NORMAL, "tt-default-thread-"));
    }
}
