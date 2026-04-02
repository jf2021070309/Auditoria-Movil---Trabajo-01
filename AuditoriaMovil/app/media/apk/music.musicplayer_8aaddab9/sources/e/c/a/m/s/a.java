package e.c.a.m.s;

import android.os.Process;
import e.c.a.m.s.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5586b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<e.c.a.m.k, b> f5587c;

    /* renamed from: d  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f5588d;

    /* renamed from: e  reason: collision with root package name */
    public q.a f5589e;

    /* renamed from: e.c.a.m.s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0113a implements ThreadFactory {

        /* renamed from: e.c.a.m.s.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0114a implements Runnable {
            public final /* synthetic */ Runnable a;

            public RunnableC0114a(ThreadFactoryC0113a threadFactoryC0113a, Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0114a(this, runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends WeakReference<q<?>> {
        public final e.c.a.m.k a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5590b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f5591c;

        public b(e.c.a.m.k kVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            w<?> wVar;
            Objects.requireNonNull(kVar, "Argument must not be null");
            this.a = kVar;
            if (qVar.a && z) {
                wVar = qVar.f5746c;
                Objects.requireNonNull(wVar, "Argument must not be null");
            } else {
                wVar = null;
            }
            this.f5591c = wVar;
            this.f5590b = qVar.a;
        }
    }

    public a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0113a());
        this.f5587c = new HashMap();
        this.f5588d = new ReferenceQueue<>();
        this.a = z;
        this.f5586b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new e.c.a.m.s.b(this));
    }

    public synchronized void a(e.c.a.m.k kVar, q<?> qVar) {
        b put = this.f5587c.put(kVar, new b(kVar, qVar, this.f5588d, this.a));
        if (put != null) {
            put.f5591c = null;
            put.clear();
        }
    }

    public void b(b bVar) {
        w<?> wVar;
        synchronized (this) {
            this.f5587c.remove(bVar.a);
            if (bVar.f5590b && (wVar = bVar.f5591c) != null) {
                this.f5589e.a(bVar.a, new q<>(wVar, true, false, bVar.a, this.f5589e));
            }
        }
    }
}
