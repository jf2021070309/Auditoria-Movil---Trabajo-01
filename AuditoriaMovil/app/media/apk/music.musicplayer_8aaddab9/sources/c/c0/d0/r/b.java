package c.c0.d0.r;

import androidx.work.impl.WorkDatabase;
import c.c0.d0.s.p;
import c.c0.d0.s.r;
/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ WorkDatabase a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1479b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f1480c;

    public b(c cVar, WorkDatabase workDatabase, String str) {
        this.f1480c = cVar;
        this.a = workDatabase;
        this.f1479b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        p i2 = ((r) this.a.q()).i(this.f1479b);
        if (i2 == null || !i2.b()) {
            return;
        }
        synchronized (this.f1480c.f1484e) {
            this.f1480c.f1487h.put(this.f1479b, i2);
            this.f1480c.f1488i.add(i2);
            c cVar = this.f1480c;
            cVar.f1489j.b(cVar.f1488i);
        }
    }
}
