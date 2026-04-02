package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c.c0.d0.l;
import c.c0.d0.q.c;
import c.c0.d0.q.d;
import c.c0.d0.s.p;
import c.c0.r;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String a = r.e("ConstraintTrkngWrkr");

    /* renamed from: b  reason: collision with root package name */
    public WorkerParameters f678b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f679c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f680d;

    /* renamed from: e  reason: collision with root package name */
    public c.c0.d0.t.s.c<ListenableWorker.a> f681e;

    /* renamed from: f  reason: collision with root package name */
    public ListenableWorker f682f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b2 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b2)) {
                r.c().b(ConstraintTrackingWorker.a, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.a();
                return;
            }
            ListenableWorker a = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b2, constraintTrackingWorker.f678b);
            constraintTrackingWorker.f682f = a;
            if (a == null) {
                r.c().a(ConstraintTrackingWorker.a, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.a();
                return;
            }
            p i2 = ((c.c0.d0.s.r) l.c(constraintTrackingWorker.getApplicationContext()).f1372f.q()).i(constraintTrackingWorker.getId().toString());
            if (i2 == null) {
                constraintTrackingWorker.a();
                return;
            }
            d dVar = new d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.b(Collections.singletonList(i2));
            if (!dVar.a(constraintTrackingWorker.getId().toString())) {
                r.c().a(ConstraintTrackingWorker.a, String.format("Constraints not met for delegate %s. Requesting retry.", b2), new Throwable[0]);
                constraintTrackingWorker.c();
                return;
            }
            r.c().a(ConstraintTrackingWorker.a, String.format("Constraints met for delegate %s", b2), new Throwable[0]);
            try {
                e.d.c.a.a.a<ListenableWorker.a> startWork = constraintTrackingWorker.f682f.startWork();
                startWork.a(new c.c0.d0.u.a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
            } catch (Throwable th) {
                r c2 = r.c();
                String str = ConstraintTrackingWorker.a;
                c2.a(str, String.format("Delegated worker %s threw exception in startWork.", b2), th);
                synchronized (constraintTrackingWorker.f679c) {
                    if (constraintTrackingWorker.f680d) {
                        r.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.c();
                    } else {
                        constraintTrackingWorker.a();
                    }
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f678b = workerParameters;
        this.f679c = new Object();
        this.f680d = false;
        this.f681e = new c.c0.d0.t.s.c<>();
    }

    public void a() {
        this.f681e.j(new ListenableWorker.a.C0003a());
    }

    @Override // c.c0.d0.q.c
    public void b(List<String> list) {
        r.c().a(a, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f679c) {
            this.f680d = true;
        }
    }

    public void c() {
        this.f681e.j(new ListenableWorker.a.b());
    }

    @Override // c.c0.d0.q.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public c.c0.d0.t.t.a getTaskExecutor() {
        return l.c(getApplicationContext()).f1373g;
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f682f;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f682f;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f682f.stop();
    }

    @Override // androidx.work.ListenableWorker
    public e.d.c.a.a.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f681e;
    }
}
