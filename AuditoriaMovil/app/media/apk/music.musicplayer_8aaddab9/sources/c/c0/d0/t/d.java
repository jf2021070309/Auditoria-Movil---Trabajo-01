package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
import c.c0.u;
import c.c0.y;
import java.util.LinkedList;
/* loaded from: classes.dex */
public abstract class d implements Runnable {
    public final c.c0.d0.c a = new c.c0.d0.c();

    public void a(c.c0.d0.l lVar, String str) {
        boolean z;
        WorkDatabase workDatabase = lVar.f1372f;
        c.c0.d0.s.q q = workDatabase.q();
        c.c0.d0.s.b l2 = workDatabase.l();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            c.c0.d0.s.r rVar = (c.c0.d0.s.r) q;
            y f2 = rVar.f(str2);
            if (f2 != y.SUCCEEDED && f2 != y.FAILED) {
                rVar.p(y.CANCELLED, str2);
            }
            linkedList.addAll(((c.c0.d0.s.c) l2).a(str2));
        }
        c.c0.d0.d dVar = lVar.f1375i;
        synchronized (dVar.f1347l) {
            c.c0.r.c().a(c.c0.d0.d.a, String.format("Processor cancelling %s", str), new Throwable[0]);
            dVar.f1345j.add(str);
            c.c0.d0.o remove = dVar.f1342g.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = dVar.f1343h.remove(str);
            }
            c.c0.d0.d.b(str, remove);
            if (z) {
                dVar.h();
            }
        }
        for (c.c0.d0.e eVar : lVar.f1374h) {
            eVar.e(str);
        }
    }

    public void b(c.c0.d0.l lVar) {
        c.c0.d0.f.a(lVar.f1371e, lVar.f1372f, lVar.f1374h);
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            c();
            this.a.a(u.a);
        } catch (Throwable th) {
            this.a.a(new u.b.a(th));
        }
    }
}
