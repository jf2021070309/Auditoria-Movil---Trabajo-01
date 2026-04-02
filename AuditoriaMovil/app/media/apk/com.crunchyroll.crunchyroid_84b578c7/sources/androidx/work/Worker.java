package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.amazon.aps.iva.v9.c;
import com.google.common.util.concurrent.ListenableFuture;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    c<ListenableWorker.a> mFuture;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.mFuture.h(worker.doWork());
            } catch (Throwable th) {
                worker.mFuture.i(th);
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
    public final ListenableFuture<ListenableWorker.a> startWork() {
        this.mFuture = new c<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
