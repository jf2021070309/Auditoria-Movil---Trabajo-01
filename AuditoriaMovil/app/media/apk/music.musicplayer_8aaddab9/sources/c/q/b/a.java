package c.q.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import c.i.j.f;
import c.q.b.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile a<D>.RunnableC0049a mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile a<D>.RunnableC0049a mTask;
    public long mUpdateThrottle;

    /* renamed from: c.q.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0049a extends c<Void, Void, D> implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final CountDownLatch f2486j = new CountDownLatch(1);

        /* renamed from: k  reason: collision with root package name */
        public boolean f2487k;

        public RunnableC0049a() {
        }

        @Override // c.q.b.c
        public Object a(Void[] voidArr) {
            return a.this.onLoadInBackground();
        }

        @Override // c.q.b.c
        public void b(D d2) {
            try {
                a.this.dispatchOnCancelled(this, d2);
            } finally {
                this.f2486j.countDown();
            }
        }

        @Override // c.q.b.c
        public void c(D d2) {
            try {
                a.this.dispatchOnLoadComplete(this, d2);
            } finally {
                this.f2486j.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2487k = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, c.f2490c);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(a<D>.RunnableC0049a runnableC0049a, D d2) {
        onCanceled(d2);
        if (this.mCancellingTask == runnableC0049a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.RunnableC0049a runnableC0049a, D d2) {
        if (this.mTask != runnableC0049a) {
            dispatchOnCancelled(runnableC0049a, d2);
        } else if (isAbandoned()) {
            onCanceled(d2);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d2);
        }
    }

    @Override // c.q.b.b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f2487k);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f2487k);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            f.b(this.mUpdateThrottle, printWriter, 0);
            printWriter.print(" mLastLoadCompleteTime=");
            long j2 = this.mLastLoadCompleteTime;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j2 == 0) {
                printWriter.print("--");
            } else {
                f.b(j2 - uptimeMillis, printWriter, 0);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f2487k) {
            this.mTask.f2487k = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f2487k = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        a<D>.RunnableC0049a runnableC0049a = this.mTask;
        Executor executor = this.mExecutor;
        if (runnableC0049a.f2494g == c.f.PENDING) {
            runnableC0049a.f2494g = c.f.RUNNING;
            runnableC0049a.f2492e.a = null;
            executor.execute(runnableC0049a.f2493f);
            return;
        }
        int ordinal = runnableC0049a.f2494g.ordinal();
        if (ordinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (ordinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // c.q.b.b
    public boolean onCancelLoad() {
        if (this.mTask != null) {
            if (!this.mStarted) {
                this.mContentChanged = true;
            }
            if (this.mCancellingTask != null) {
                if (this.mTask.f2487k) {
                    this.mTask.f2487k = false;
                    this.mHandler.removeCallbacks(this.mTask);
                }
                this.mTask = null;
                return false;
            } else if (this.mTask.f2487k) {
                this.mTask.f2487k = false;
                this.mHandler.removeCallbacks(this.mTask);
                this.mTask = null;
                return false;
            } else {
                a<D>.RunnableC0049a runnableC0049a = this.mTask;
                runnableC0049a.f2495h.set(true);
                boolean cancel = runnableC0049a.f2493f.cancel(false);
                if (cancel) {
                    this.mCancellingTask = this.mTask;
                    cancelLoadInBackground();
                }
                this.mTask = null;
                return cancel;
            }
        }
        return false;
    }

    public void onCanceled(D d2) {
    }

    @Override // c.q.b.b
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0049a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j2) {
        this.mUpdateThrottle = j2;
        if (j2 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.RunnableC0049a runnableC0049a = this.mTask;
        if (runnableC0049a != null) {
            try {
                runnableC0049a.f2486j.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
