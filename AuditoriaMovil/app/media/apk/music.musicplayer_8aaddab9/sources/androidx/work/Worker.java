package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import c.c0.d0.t.s.c;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public c<ListenableWorker.a> mFuture;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.j(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.k(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final e.d.c.a.a.a<ListenableWorker.a> startWork() {
        this.mFuture = new c<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
