package c.c0.d0.t;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class r {
    public static final String a = c.c0.r.e("WorkTimer");

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f1569b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f1570c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, c> f1571d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, b> f1572e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f1573f;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public int a = 0;

        public a(r rVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder y = e.a.d.a.a.y("WorkManager-WorkTimer-thread-");
            y.append(this.a);
            newThread.setName(y.toString());
            this.a++;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public final r a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1574b;

        public c(r rVar, String str) {
            this.a = rVar;
            this.f1574b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.f1573f) {
                if (this.a.f1571d.remove(this.f1574b) != null) {
                    b remove = this.a.f1572e.remove(this.f1574b);
                    if (remove != null) {
                        remove.a(this.f1574b);
                    }
                } else {
                    c.c0.r.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f1574b), new Throwable[0]);
                }
            }
        }
    }

    public r() {
        a aVar = new a(this);
        this.f1569b = aVar;
        this.f1571d = new HashMap();
        this.f1572e = new HashMap();
        this.f1573f = new Object();
        this.f1570c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a(String str, long j2, b bVar) {
        synchronized (this.f1573f) {
            c.c0.r.c().a(a, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f1571d.put(str, cVar);
            this.f1572e.put(str, bVar);
            this.f1570c.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void b(String str) {
        synchronized (this.f1573f) {
            if (this.f1571d.remove(str) != null) {
                c.c0.r.c().a(a, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f1572e.remove(str);
            }
        }
    }
}
