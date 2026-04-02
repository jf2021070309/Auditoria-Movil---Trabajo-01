package c.c.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b extends c {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f1300b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f1301c;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);

        public a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // c.c.a.a.c
    public void a(Runnable runnable) {
        this.f1300b.execute(runnable);
    }

    @Override // c.c.a.a.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // c.c.a.a.c
    public void c(Runnable runnable) {
        if (this.f1301c == null) {
            synchronized (this.a) {
                if (this.f1301c == null) {
                    this.f1301c = d(Looper.getMainLooper());
                }
            }
        }
        this.f1301c.post(runnable);
    }
}
