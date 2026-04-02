package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import c.c0.d0.t.s.a;
import c.c0.f;
import c.c0.g;
import c.c0.i;
import c.c0.o;
import c.c0.q;
import e.j.d.w;
import h.k;
import h.m.d;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.p;
import h.o.c.j;
import i.a.c0;
import i.a.e0;
import i.a.o0;
import i.a.u;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final c0 coroutineContext;
    private final c.c0.d0.t.s.c<ListenableWorker.a> future;
    private final u job;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().f1578e instanceof a.c) {
                w.n(CoroutineWorker.this.getJob$work_runtime_ktx_release(), null, 1, null);
            }
        }
    }

    @e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends h implements p<e0, d<? super k>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f638b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o<i> f639c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f640d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o<i> oVar, CoroutineWorker coroutineWorker, d<? super b> dVar) {
            super(2, dVar);
            this.f639c = oVar;
            this.f640d = coroutineWorker;
        }

        @Override // h.m.i.a.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new b(this.f639c, this.f640d, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, d<? super k> dVar) {
            return new b(this.f639c, this.f640d, dVar).invokeSuspend(k.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            o<i> oVar;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.f638b;
            if (i2 == 0) {
                w.E0(obj);
                o<i> oVar2 = this.f639c;
                CoroutineWorker coroutineWorker = this.f640d;
                this.a = oVar2;
                this.f638b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == aVar) {
                    return aVar;
                }
                oVar = oVar2;
                obj = foregroundInfo;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oVar = (o) this.a;
                w.E0(obj);
            }
            oVar.f1603b.j(obj);
            return k.a;
        }
    }

    @e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends h implements p<e0, d<? super k>, Object> {
        public int a;

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new c(dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, d<? super k> dVar) {
            return new c(dVar).invokeSuspend(k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            try {
                if (i2 == 0) {
                    w.E0(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.a = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().j((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().k(th);
            }
            return k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.e(context, "appContext");
        j.e(workerParameters, "params");
        this.job = w.c(null, 1, null);
        c.c0.d0.t.s.c<ListenableWorker.a> cVar = new c.c0.d0.t.s.c<>();
        j.d(cVar, "create()");
        this.future = cVar;
        cVar.a(new a(), ((c.c0.d0.t.t.b) getTaskExecutor()).a);
        this.coroutineContext = o0.a;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d<? super ListenableWorker.a> dVar);

    public c0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d<? super i> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final e.d.c.a.a.a<i> getForegroundInfoAsync() {
        u c2 = w.c(null, 1, null);
        e0 b2 = w.b(getCoroutineContext().plus(c2));
        o oVar = new o(c2, null, 2);
        w.Y(b2, null, null, new b(oVar, this, null), 3, null);
        return oVar;
    }

    public final c.c0.d0.t.s.c<ListenableWorker.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final u getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(i iVar, d<? super k> dVar) {
        Object obj;
        e.d.c.a.a.a<Void> foregroundAsync = setForegroundAsync(iVar);
        j.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } else {
            i.a.k kVar = new i.a.k(w.P(dVar), 1);
            kVar.p();
            foregroundAsync.a(new c.c0.p(kVar, foregroundAsync), g.INSTANCE);
            kVar.r(new q(foregroundAsync));
            obj = kVar.o();
            if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                j.e(dVar, "frame");
            }
        }
        return obj == h.m.h.a.COROUTINE_SUSPENDED ? obj : k.a;
    }

    public final Object setProgress(f fVar, d<? super k> dVar) {
        Object obj;
        e.d.c.a.a.a<Void> progressAsync = setProgressAsync(fVar);
        j.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } else {
            i.a.k kVar = new i.a.k(w.P(dVar), 1);
            kVar.p();
            progressAsync.a(new c.c0.p(kVar, progressAsync), g.INSTANCE);
            kVar.r(new q(progressAsync));
            obj = kVar.o();
            if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                j.e(dVar, "frame");
            }
        }
        return obj == h.m.h.a.COROUTINE_SUSPENDED ? obj : k.a;
    }

    @Override // androidx.work.ListenableWorker
    public final e.d.c.a.a.a<ListenableWorker.a> startWork() {
        w.Y(w.b(getCoroutineContext().plus(this.job)), null, null, new c(null), 3, null);
        return this.future;
    }
}
