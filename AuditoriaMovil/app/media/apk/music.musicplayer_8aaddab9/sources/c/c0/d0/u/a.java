package c.c0.d0.u;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* loaded from: classes.dex */
public class a implements Runnable {
    public final /* synthetic */ e.d.c.a.a.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f1597b;

    public a(ConstraintTrackingWorker constraintTrackingWorker, e.d.c.a.a.a aVar) {
        this.f1597b = constraintTrackingWorker;
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f1597b.f679c) {
            if (this.f1597b.f680d) {
                this.f1597b.c();
            } else {
                this.f1597b.f681e.l(this.a);
            }
        }
    }
}
