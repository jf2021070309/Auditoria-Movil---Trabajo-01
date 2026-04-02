package c.c0.d0.t;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
/* loaded from: classes.dex */
public class n implements Runnable {
    public static final String a = c.c0.r.e("WorkForegroundRunnable");

    /* renamed from: b  reason: collision with root package name */
    public final c.c0.d0.t.s.c<Void> f1550b = new c.c0.d0.t.s.c<>();

    /* renamed from: c  reason: collision with root package name */
    public final Context f1551c;

    /* renamed from: d  reason: collision with root package name */
    public final c.c0.d0.s.p f1552d;

    /* renamed from: e  reason: collision with root package name */
    public final ListenableWorker f1553e;

    /* renamed from: f  reason: collision with root package name */
    public final c.c0.j f1554f;

    /* renamed from: g  reason: collision with root package name */
    public final c.c0.d0.t.t.a f1555g;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ c.c0.d0.t.s.c a;

        public a(c.c0.d0.t.s.c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.l(n.this.f1553e.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ c.c0.d0.t.s.c a;

        public b(c.c0.d0.t.s.c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.c0.i iVar = (c.c0.i) this.a.get();
                if (iVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", n.this.f1552d.f1508c));
                }
                c.c0.r.c().a(n.a, String.format("Updating notification for %s", n.this.f1552d.f1508c), new Throwable[0]);
                n.this.f1553e.setRunInForeground(true);
                n nVar = n.this;
                nVar.f1550b.l(((o) nVar.f1554f).a(nVar.f1551c, nVar.f1553e.getId(), iVar));
            } catch (Throwable th) {
                n.this.f1550b.k(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public n(Context context, c.c0.d0.s.p pVar, ListenableWorker listenableWorker, c.c0.j jVar, c.c0.d0.t.t.a aVar) {
        this.f1551c = context;
        this.f1552d = pVar;
        this.f1553e = listenableWorker;
        this.f1554f = jVar;
        this.f1555g = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f1552d.q || c.i.a.L()) {
            this.f1550b.j(null);
            return;
        }
        c.c0.d0.t.s.c cVar = new c.c0.d0.t.s.c();
        ((c.c0.d0.t.t.b) this.f1555g).f1596c.execute(new a(cVar));
        cVar.a(new b(cVar), ((c.c0.d0.t.t.b) this.f1555g).f1596c);
    }
}
