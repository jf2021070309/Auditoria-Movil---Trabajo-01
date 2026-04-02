package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.p9.c;
import com.amazon.aps.iva.p9.d;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.r;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final /* synthetic */ int g = 0;
    public final WorkerParameters b;
    public final Object c;
    public volatile boolean d;
    public final com.amazon.aps.iva.v9.c<ListenableWorker.a> e;
    public ListenableWorker f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.getInputData().a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                m c = m.c();
                int i = ConstraintTrackingWorker.g;
                c.b(new Throwable[0]);
                constraintTrackingWorker.e.h(new ListenableWorker.a.C0060a());
                return;
            }
            ListenableWorker a = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.b);
            constraintTrackingWorker.f = a;
            if (a == null) {
                m c2 = m.c();
                int i2 = ConstraintTrackingWorker.g;
                c2.a(new Throwable[0]);
                constraintTrackingWorker.e.h(new ListenableWorker.a.C0060a());
                return;
            }
            p i3 = ((r) k.c(constraintTrackingWorker.getApplicationContext()).c.n()).i(constraintTrackingWorker.getId().toString());
            if (i3 == null) {
                constraintTrackingWorker.e.h(new ListenableWorker.a.C0060a());
                return;
            }
            d dVar = new d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.b(Collections.singletonList(i3));
            if (dVar.a(constraintTrackingWorker.getId().toString())) {
                m c3 = m.c();
                int i4 = ConstraintTrackingWorker.g;
                String.format("Constraints met for delegate %s", str);
                c3.a(new Throwable[0]);
                try {
                    ListenableFuture<ListenableWorker.a> startWork = constraintTrackingWorker.f.startWork();
                    startWork.addListener(new com.amazon.aps.iva.x9.a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    m c4 = m.c();
                    int i5 = ConstraintTrackingWorker.g;
                    String.format("Delegated worker %s threw exception in startWork.", str);
                    c4.a(th);
                    synchronized (constraintTrackingWorker.c) {
                        if (constraintTrackingWorker.d) {
                            m.c().a(new Throwable[0]);
                            constraintTrackingWorker.e.h(new ListenableWorker.a.b());
                        } else {
                            constraintTrackingWorker.e.h(new ListenableWorker.a.C0060a());
                        }
                        return;
                    }
                }
            }
            m c5 = m.c();
            int i6 = ConstraintTrackingWorker.g;
            String.format("Constraints not met for delegate %s. Requesting retry.", str);
            c5.a(new Throwable[0]);
            constraintTrackingWorker.e.h(new ListenableWorker.a.b());
        }
    }

    static {
        m.e("ConstraintTrkngWrkr");
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = workerParameters;
        this.c = new Object();
        this.d = false;
        this.e = new com.amazon.aps.iva.v9.c<>();
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void c(ArrayList arrayList) {
        m c = m.c();
        String.format("Constraints changed for %s", arrayList);
        c.a(new Throwable[0]);
        synchronized (this.c) {
            this.d = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final com.amazon.aps.iva.w9.a getTaskExecutor() {
        return k.c(getApplicationContext()).d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.e;
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void g(List<String> list) {
    }
}
