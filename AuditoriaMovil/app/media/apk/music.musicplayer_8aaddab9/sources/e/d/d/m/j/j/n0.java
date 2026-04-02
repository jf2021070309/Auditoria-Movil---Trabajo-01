package e.d.d.m.j.j;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class n0 {
    public static final ExecutorService a = c.i.g.h.a("awaitEvenIfOnMainThread task continuation executor");

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ Callable a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource f7192b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: e.d.d.m.j.j.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0149a<T> implements Continuation<T, Void> {
            public C0149a() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Void then(Task task) throws Exception {
                if (task.isSuccessful()) {
                    a.this.f7192b.setResult(task.getResult());
                    return null;
                }
                a.this.f7192b.setException(task.getException());
                return null;
            }
        }

        public a(Callable callable, TaskCompletionSource taskCompletionSource) {
            this.a = callable;
            this.f7192b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((Task) this.a.call()).continueWith(new C0149a());
            } catch (Exception e2) {
                this.f7192b.setException(e2);
            }
        }
    }

    public static <T> T a(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(a, new Continuation() { // from class: e.d.d.m.j.j.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                countDownLatch.countDown();
                return null;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static <T> Task<T> b(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new a(callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
