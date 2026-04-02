package e.h.g;

import android.os.Looper;
import e.h.g.j0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class j0<JobResult> {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f8312b = {1, 1, 2, 3, 5, 8, 13};
    public static final ExecutorService a = Executors.newCachedThreadPool(new a());

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static final AtomicInteger a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        public final ThreadGroup f8313b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8314c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f8315d = new AtomicInteger(1);

        public a() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f8313b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder y = e.a.d.a.a.y("ASyncJob-");
            y.append(a.getAndIncrement());
            y.append("-thread-");
            this.f8314c = y.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f8313b;
            Thread thread = new Thread(threadGroup, runnable, this.f8314c + this.f8315d.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public static void a(b bVar, int i2, int i3) {
        try {
            bVar.a();
        } catch (Throwable unused) {
            if (i3 < f8312b.length) {
                j1.n(f8312b[i3] * i2, new r0());
                a(bVar, i2, i3 + 1);
            }
        }
    }

    public static FutureTask b(final b bVar, ExecutorService executorService) {
        try {
            return (FutureTask) executorService.submit(new Runnable() { // from class: e.h.g.b
                @Override // java.lang.Runnable
                public final void run() {
                    j0.b.this.a();
                }
            });
        } catch (InternalError unused) {
            return null;
        }
    }

    public static void c(final b bVar) {
        try {
            a.execute(new Runnable() { // from class: e.h.g.c
                @Override // java.lang.Runnable
                public final void run() {
                    j0.b.this.a();
                }
            });
        } catch (InternalError | OutOfMemoryError unused) {
        }
    }

    public static void d(final b bVar) {
        try {
            a.execute(new Runnable() { // from class: e.h.g.d
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j0.b.this.a();
                    } catch (Throwable th) {
                        s1.l(th, true);
                    }
                }
            });
        } catch (InternalError | OutOfMemoryError unused) {
        }
    }

    public static void e(final b bVar, final int i2) {
        c(new b() { // from class: e.h.g.a
            @Override // e.h.g.j0.b
            public final void a() {
                j0.a(j0.b.this, i2, 0);
            }
        });
    }

    public static void f(b bVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c(bVar);
        } else {
            bVar.a();
        }
    }

    public static void g(b bVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d(bVar);
            return;
        }
        try {
            bVar.a();
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }

    public static void h(c cVar) {
        if (j1.f()) {
            cVar.a();
        } else {
            x0.a.post(new x(cVar));
        }
    }

    public static void i(final c cVar) {
        if (!j1.f()) {
            x0.a.post(new Runnable() { // from class: e.h.g.e
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j0.c.this.a();
                    } catch (Throwable th) {
                        s1.l(th, true);
                    }
                }
            });
            return;
        }
        try {
            cVar.a();
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }

    public static void j(c cVar, long j2) {
        x0.a.postDelayed(new x(cVar), j2);
    }
}
