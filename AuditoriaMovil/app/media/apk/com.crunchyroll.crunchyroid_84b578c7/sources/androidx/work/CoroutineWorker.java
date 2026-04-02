package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.k9.g;
import com.amazon.aps.iva.k9.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.m1;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.v9.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    public final m1 b;
    public final com.amazon.aps.iva.v9.c<ListenableWorker.a> c;
    public final com.amazon.aps.iva.ye0.c d;

    /* compiled from: CoroutineWorker.kt */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.c.b instanceof a.b) {
                CoroutineWorker.this.b.a(null);
            }
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<g0, d<? super q>, Object> {
        public l h;
        public int i;
        public final /* synthetic */ l<g> j;
        public final /* synthetic */ CoroutineWorker k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l<g> lVar, CoroutineWorker coroutineWorker, d<? super b> dVar) {
            super(2, dVar);
            this.j = lVar;
            this.k = coroutineWorker;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new b(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    l lVar = this.h;
                    x.i0(obj);
                    lVar.c.h(obj);
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
            this.h = this.j;
            this.i = 1;
            this.k.getClass();
            throw new IllegalStateException("Not implemented");
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends i implements p<g0, d<? super q>, Object> {
        public int h;

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new c(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    this.h = 1;
                    obj = coroutineWorker.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                coroutineWorker.c.h((ListenableWorker.a) obj);
            } catch (Throwable th) {
                coroutineWorker.c.i(th);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.f(context, "appContext");
        j.f(workerParameters, "params");
        this.b = com.amazon.aps.iva.a60.b.f();
        com.amazon.aps.iva.v9.c<ListenableWorker.a> cVar = new com.amazon.aps.iva.v9.c<>();
        this.c = cVar;
        cVar.addListener(new a(), ((com.amazon.aps.iva.w9.b) getTaskExecutor()).a);
        this.d = r0.a;
    }

    public abstract Object a(d<? super ListenableWorker.a> dVar);

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<g> getForegroundInfoAsync() {
        m1 f = com.amazon.aps.iva.a60.b.f();
        com.amazon.aps.iva.xe0.d i = z.i(this.d.plus(f));
        l lVar = new l(f);
        com.amazon.aps.iva.se0.i.d(i, null, null, new b(lVar, this, null), 3);
        return lVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.c.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.a> startWork() {
        com.amazon.aps.iva.se0.i.d(z.i(this.d.plus(this.b)), null, null, new c(null), 3);
        return this.c;
    }
}
