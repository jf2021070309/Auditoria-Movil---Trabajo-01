package e.d.d.m.j.j;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class m {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public Task<Void> f7189b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f7190c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f7191d = new ThreadLocal<>();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f7191d.set(Boolean.TRUE);
        }
    }

    public m(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    public void a() {
        if (!Boolean.TRUE.equals(this.f7191d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public <T> Task<T> b(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f7190c) {
            task = (Task<T>) this.f7189b.continueWith(this.a, new o(this, callable));
            this.f7189b = task.continueWith(this.a, new p(this));
        }
        return task;
    }

    public <T> Task<T> c(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f7190c) {
            task = (Task<T>) this.f7189b.continueWithTask(this.a, new o(this, callable));
            this.f7189b = task.continueWith(this.a, new p(this));
        }
        return task;
    }
}
