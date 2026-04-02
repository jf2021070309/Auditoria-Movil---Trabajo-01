package c.c0.d0.q.e;

import c.c0.d0.s.p;
import c.c0.r;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c<T> implements c.c0.d0.q.a<T> {
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f1455b;

    /* renamed from: c  reason: collision with root package name */
    public c.c0.d0.q.f.d<T> f1456c;

    /* renamed from: d  reason: collision with root package name */
    public a f1457d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(c.c0.d0.q.f.d<T> dVar) {
        this.f1456c = dVar;
    }

    @Override // c.c0.d0.q.a
    public void a(T t) {
        this.f1455b = t;
        e(this.f1457d, t);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t);

    public void d(Iterable<p> iterable) {
        this.a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.a.add(pVar.a);
            }
        }
        if (this.a.isEmpty()) {
            this.f1456c.b(this);
        } else {
            c.c0.d0.q.f.d<T> dVar = this.f1456c;
            synchronized (dVar.f1466d) {
                if (dVar.f1467e.add(this)) {
                    if (dVar.f1467e.size() == 1) {
                        dVar.f1468f = dVar.a();
                        r.c().a(c.c0.d0.q.f.d.a, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f1468f), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f1468f);
                }
            }
        }
        e(this.f1457d, this.f1455b);
    }

    public final void e(a aVar, T t) {
        if (this.a.isEmpty() || aVar == null) {
            return;
        }
        if (t == null || c(t)) {
            List<String> list = this.a;
            c.c0.d0.q.d dVar = (c.c0.d0.q.d) aVar;
            synchronized (dVar.f1454d) {
                c.c0.d0.q.c cVar = dVar.f1452b;
                if (cVar != null) {
                    cVar.b(list);
                }
            }
            return;
        }
        List<String> list2 = this.a;
        c.c0.d0.q.d dVar2 = (c.c0.d0.q.d) aVar;
        synchronized (dVar2.f1454d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (dVar2.a(str)) {
                    r.c().a(c.c0.d0.q.d.a, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c.c0.d0.q.c cVar2 = dVar2.f1452b;
            if (cVar2 != null) {
                cVar2.f(arrayList);
            }
        }
    }
}
