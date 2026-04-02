package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c.c0.f;
import c.c0.u;
import java.util.HashSet;
import java.util.Objects;
/* loaded from: classes.dex */
public class e implements Runnable {
    public static final String a = c.c0.r.e("EnqueueRunnable");

    /* renamed from: b  reason: collision with root package name */
    public final c.c0.d0.g f1538b;

    /* renamed from: c  reason: collision with root package name */
    public final c.c0.d0.c f1539c = new c.c0.d0.c();

    public e(c.c0.d0.g gVar) {
        this.f1538b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d  */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(c.c0.d0.g r22) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c0.d0.t.e.a(c.c0.d0.g):boolean");
    }

    public static void b(c.c0.d0.s.p pVar) {
        c.c0.d dVar = pVar.f1515j;
        String str = pVar.f1508c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (dVar.f1327e || dVar.f1328f) {
            f.a aVar = new f.a();
            aVar.c(pVar.f1510e.f1600c);
            aVar.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f1508c = ConstraintTrackingWorker.class.getName();
            pVar.f1510e = aVar.a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            c.c0.d0.g gVar = this.f1538b;
            Objects.requireNonNull(gVar);
            if (c.c0.d0.g.b(gVar, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f1538b));
            }
            WorkDatabase workDatabase = this.f1538b.f1350b.f1372f;
            workDatabase.c();
            boolean a2 = a(this.f1538b);
            workDatabase.k();
            workDatabase.g();
            if (a2) {
                g.a(this.f1538b.f1350b.f1370d, RescheduleReceiver.class, true);
                c.c0.d0.l lVar = this.f1538b.f1350b;
                c.c0.d0.f.a(lVar.f1371e, lVar.f1372f, lVar.f1374h);
            }
            this.f1539c.a(u.a);
        } catch (Throwable th) {
            this.f1539c.a(new u.b.a(th));
        }
    }
}
