package c.c0.d0.p.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import c.c0.d0.e;
import c.c0.d0.l;
import c.c0.d0.q.d;
import c.c0.d0.s.p;
import c.c0.d0.t.i;
import c.c0.d0.t.k;
import c.c0.r;
import c.c0.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements e, c.c0.d0.q.c, c.c0.d0.b {
    public static final String a = r.e("GreedyScheduler");

    /* renamed from: b  reason: collision with root package name */
    public final Context f1407b;

    /* renamed from: c  reason: collision with root package name */
    public final l f1408c;

    /* renamed from: d  reason: collision with root package name */
    public final d f1409d;

    /* renamed from: f  reason: collision with root package name */
    public b f1411f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1412g;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f1414i;

    /* renamed from: e  reason: collision with root package name */
    public final Set<p> f1410e = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public final Object f1413h = new Object();

    public c(Context context, c.c0.c cVar, c.c0.d0.t.t.a aVar, l lVar) {
        this.f1407b = context;
        this.f1408c = lVar;
        this.f1409d = new d(context, aVar, this);
        this.f1411f = new b(this, cVar.f1320e);
    }

    @Override // c.c0.d0.e
    public void a(p... pVarArr) {
        if (this.f1414i == null) {
            this.f1414i = Boolean.valueOf(i.a(this.f1407b, this.f1408c.f1371e));
        }
        if (!this.f1414i.booleanValue()) {
            r.c().d(a, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f1412g) {
            this.f1408c.f1375i.a(this);
            this.f1412g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a2 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f1507b == y.ENQUEUED) {
                if (currentTimeMillis < a2) {
                    b bVar = this.f1411f;
                    if (bVar != null) {
                        Runnable remove = bVar.f1406d.remove(pVar.a);
                        if (remove != null) {
                            bVar.f1405c.a.removeCallbacks(remove);
                        }
                        a aVar = new a(bVar, pVar);
                        bVar.f1406d.put(pVar.a, aVar);
                        bVar.f1405c.a.postDelayed(aVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && pVar.f1515j.f1326d) {
                        r.c().a(a, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i2 < 24 || !pVar.f1515j.a()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.a);
                    } else {
                        r.c().a(a, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    r.c().a(a, String.format("Starting work for %s", pVar.a), new Throwable[0]);
                    l lVar = this.f1408c;
                    ((c.c0.d0.t.t.b) lVar.f1373g).a.execute(new k(lVar, pVar.a, null));
                }
            }
        }
        synchronized (this.f1413h) {
            if (!hashSet.isEmpty()) {
                r.c().a(a, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f1410e.addAll(hashSet);
                this.f1409d.b(this.f1410e);
            }
        }
    }

    @Override // c.c0.d0.q.c
    public void b(List<String> list) {
        for (String str : list) {
            r.c().a(a, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f1408c.g(str);
        }
    }

    @Override // c.c0.d0.e
    public boolean c() {
        return false;
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        synchronized (this.f1413h) {
            Iterator<p> it = this.f1410e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.a.equals(str)) {
                    r.c().a(a, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f1410e.remove(next);
                    this.f1409d.b(this.f1410e);
                    break;
                }
            }
        }
    }

    @Override // c.c0.d0.e
    public void e(String str) {
        Runnable remove;
        if (this.f1414i == null) {
            this.f1414i = Boolean.valueOf(i.a(this.f1407b, this.f1408c.f1371e));
        }
        if (!this.f1414i.booleanValue()) {
            r.c().d(a, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f1412g) {
            this.f1408c.f1375i.a(this);
            this.f1412g = true;
        }
        r.c().a(a, String.format("Cancelling work ID %s", str), new Throwable[0]);
        b bVar = this.f1411f;
        if (bVar != null && (remove = bVar.f1406d.remove(str)) != null) {
            bVar.f1405c.a.removeCallbacks(remove);
        }
        this.f1408c.g(str);
    }

    @Override // c.c0.d0.q.c
    public void f(List<String> list) {
        for (String str : list) {
            r.c().a(a, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            l lVar = this.f1408c;
            ((c.c0.d0.t.t.b) lVar.f1373g).a.execute(new k(lVar, str, null));
        }
    }
}
