package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import c.c0.c0;
import c.c0.d0.t.o;
import c.c0.d0.t.p;
import c.c0.d0.t.q;
import c.c0.d0.t.s.c;
import c.c0.d0.t.t.b;
import c.c0.f;
import c.c0.i;
import c.c0.w;
import java.util.List;
import java.util.Objects;
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
        public static final class C0003a extends a {
            public final f a = f.f1599b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0003a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0003a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (C0003a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder y = e.a.d.a.a.y("Failure {mOutputData=");
                y.append(this.a);
                y.append('}');
                return y.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final f a;

            public c() {
                this.a = f.f1599b;
            }

            public c(f fVar) {
                this.a = fVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder y = e.a.d.a.a.y("Success {mOutputData=");
                y.append(this.a);
                y.append('}');
                return y.toString();
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f646f;
    }

    public e.d.c.a.a.a<i> getForegroundInfoAsync() {
        c cVar = new c();
        cVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final f getInputData() {
        return this.mWorkerParams.f642b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f644d.f652c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f645e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f643c;
    }

    public c.c0.d0.t.t.a getTaskExecutor() {
        return this.mWorkerParams.f647g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f644d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f644d.f651b;
    }

    public c0 getWorkerFactory() {
        return this.mWorkerParams.f648h;
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

    public void onStopped() {
    }

    public final e.d.c.a.a.a<Void> setForegroundAsync(i iVar) {
        this.mRunInForeground = true;
        return ((o) this.mWorkerParams.f650j).a(getApplicationContext(), getId(), iVar);
    }

    public e.d.c.a.a.a<Void> setProgressAsync(f fVar) {
        w wVar = this.mWorkerParams.f649i;
        getApplicationContext();
        UUID id = getId();
        q qVar = (q) wVar;
        Objects.requireNonNull(qVar);
        c cVar = new c();
        c.c0.d0.t.t.a aVar = qVar.f1568c;
        ((b) aVar).a.execute(new p(qVar, id, fVar, cVar));
        return cVar;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract e.d.c.a.a.a<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
