package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
import c.c0.y;
/* loaded from: classes.dex */
public class l implements Runnable {
    public static final String a = c.c0.r.e("StopWorkRunnable");

    /* renamed from: b  reason: collision with root package name */
    public final c.c0.d0.l f1546b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1547c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1548d;

    public l(c.c0.d0.l lVar, String str, boolean z) {
        this.f1546b = lVar;
        this.f1547c = str;
        this.f1548d = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean containsKey;
        boolean j2;
        c.c0.d0.l lVar = this.f1546b;
        WorkDatabase workDatabase = lVar.f1372f;
        c.c0.d0.d dVar = lVar.f1375i;
        c.c0.d0.s.q q = workDatabase.q();
        workDatabase.c();
        try {
            String str = this.f1547c;
            synchronized (dVar.f1347l) {
                containsKey = dVar.f1342g.containsKey(str);
            }
            if (this.f1548d) {
                j2 = this.f1546b.f1375i.i(this.f1547c);
            } else {
                if (!containsKey) {
                    c.c0.d0.s.r rVar = (c.c0.d0.s.r) q;
                    if (rVar.f(this.f1547c) == y.RUNNING) {
                        rVar.p(y.ENQUEUED, this.f1547c);
                    }
                }
                j2 = this.f1546b.f1375i.j(this.f1547c);
            }
            c.c0.r.c().a(a, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f1547c, Boolean.valueOf(j2)), new Throwable[0]);
            workDatabase.k();
        } finally {
            workDatabase.g();
        }
    }
}
