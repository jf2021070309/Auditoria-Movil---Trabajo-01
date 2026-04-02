package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.amazon.aps.iva.k9.g;
import com.amazon.aps.iva.k9.h;
import com.amazon.aps.iva.k9.s;
import com.amazon.aps.iva.k9.x;
import com.amazon.aps.iva.u9.o;
import com.amazon.aps.iva.u9.p;
import com.amazon.aps.iva.u9.q;
import com.amazon.aps.iva.u9.r;
import com.amazon.aps.iva.v9.c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0060a extends a {
            public final androidx.work.b a = androidx.work.b.b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0060a.class == obj.getClass()) {
                    return this.a.equals(((C0060a) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0060a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && b.class == obj.getClass()) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final androidx.work.b a;

            public c() {
                this(androidx.work.b.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.a.equals(((c) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public c(androidx.work.b bVar) {
                this.a = bVar;
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public ListenableFuture<g> getForegroundInfoAsync() {
        c cVar = new c();
        cVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final b getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public com.amazon.aps.iva.w9.a getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    public x getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture<Void> setForegroundAsync(g gVar) {
        this.mRunInForeground = true;
        h hVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        p pVar = (p) hVar;
        pVar.getClass();
        c cVar = new c();
        ((com.amazon.aps.iva.w9.b) pVar.a).a(new o(pVar, cVar, id, gVar, applicationContext));
        return cVar;
    }

    public ListenableFuture<Void> setProgressAsync(b bVar) {
        s sVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        r rVar = (r) sVar;
        rVar.getClass();
        c cVar = new c();
        ((com.amazon.aps.iva.w9.b) rVar.b).a(new q(rVar, id, bVar, cVar));
        return cVar;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
