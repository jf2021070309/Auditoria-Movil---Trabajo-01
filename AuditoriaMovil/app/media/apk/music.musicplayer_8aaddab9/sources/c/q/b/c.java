package c.q.b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {
    public static final ThreadFactory a;

    /* renamed from: b  reason: collision with root package name */
    public static final BlockingQueue<Runnable> f2489b;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f2490c;

    /* renamed from: d  reason: collision with root package name */
    public static e f2491d;

    /* renamed from: e  reason: collision with root package name */
    public final g<Params, Result> f2492e;

    /* renamed from: f  reason: collision with root package name */
    public final FutureTask<Result> f2493f;

    /* renamed from: g  reason: collision with root package name */
    public volatile f f2494g = f.PENDING;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f2495h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f2496i = new AtomicBoolean();

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder y = e.a.d.a.a.y("ModernAsyncTask #");
            y.append(this.a.getAndIncrement());
            return new Thread(runnable, y.toString());
        }
    }

    /* loaded from: classes.dex */
    public class b extends g<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            c.this.f2496i.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.a(this.a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: c.q.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0051c extends FutureTask<Result> {
        public C0051c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                Result result = get();
                c cVar = c.this;
                if (cVar.f2496i.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                c cVar2 = c.this;
                if (cVar2.f2496i.get()) {
                    return;
                }
                cVar2.d(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d<Data> {
        public final c a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f2498b;

        public d(c cVar, Data... dataArr) {
            this.a = cVar;
            this.f2498b = dataArr;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                Objects.requireNonNull(dVar.a);
                return;
            }
            c cVar = dVar.a;
            Object obj = dVar.f2498b[0];
            if (cVar.f2495h.get()) {
                cVar.b(obj);
            } else {
                cVar.c(obj);
            }
            cVar.f2494g = f.FINISHED;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public static abstract class g<Params, Result> implements Callable<Result> {
        public Params[] a;
    }

    static {
        a aVar = new a();
        a = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f2489b = linkedBlockingQueue;
        f2490c = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    public c() {
        b bVar = new b();
        this.f2492e = bVar;
        this.f2493f = new C0051c(bVar);
    }

    public abstract Result a(Params... paramsArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public Result d(Result result) {
        e eVar;
        synchronized (c.class) {
            if (f2491d == null) {
                f2491d = new e();
            }
            eVar = f2491d;
        }
        eVar.obtainMessage(1, new d(this, result)).sendToTarget();
        return result;
    }
}
