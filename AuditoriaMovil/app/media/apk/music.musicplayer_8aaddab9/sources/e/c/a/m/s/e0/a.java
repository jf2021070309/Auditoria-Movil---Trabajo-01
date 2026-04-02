package e.c.a.m.s.e0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class a implements ExecutorService {
    public static final long a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b  reason: collision with root package name */
    public static volatile int f5656b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f5657c;

    /* renamed from: e.c.a.m.s.e0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0116a implements ThreadFactory {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5658b;

        /* renamed from: c  reason: collision with root package name */
        public int f5659c;

        /* renamed from: e.c.a.m.s.e0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0117a extends Thread {
            public C0117a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0116a.this.f5658b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(ThreadFactoryC0116a.this);
                    ((b.C0118a) b.f5660b).a(th);
                }
            }
        }

        public ThreadFactoryC0116a(String str, b bVar, boolean z) {
            this.a = str;
            this.f5658b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0117a c0117a;
            c0117a = new C0117a(runnable, "glide-" + this.a + "-thread-" + this.f5659c);
            this.f5659c = this.f5659c + 1;
            return c0117a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final b a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f5660b;

        /* renamed from: e.c.a.m.s.e0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0118a implements b {
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0118a c0118a = new C0118a();
            a = c0118a;
            f5660b = c0118a;
        }
    }

    public a(ExecutorService executorService) {
        this.f5657c = executorService;
    }

    public static int a() {
        if (f5656b == 0) {
            f5656b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f5656b;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f5657c.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5657c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f5657c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f5657c.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f5657c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f5657c.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f5657c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f5657c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f5657c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f5657c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f5657c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f5657c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f5657c.submit(callable);
    }

    public String toString() {
        return this.f5657c.toString();
    }
}
