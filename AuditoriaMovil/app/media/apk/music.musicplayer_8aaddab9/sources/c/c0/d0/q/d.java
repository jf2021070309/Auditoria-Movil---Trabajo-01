package c.c0.d0.q;

import android.content.Context;
import c.c0.d0.q.e.c;
import c.c0.d0.q.e.e;
import c.c0.d0.q.e.f;
import c.c0.d0.q.e.g;
import c.c0.d0.q.e.h;
import c.c0.d0.s.p;
import c.c0.r;
/* loaded from: classes.dex */
public class d implements c.a {
    public static final String a = r.e("WorkConstraintsTracker");

    /* renamed from: b  reason: collision with root package name */
    public final c f1452b;

    /* renamed from: c  reason: collision with root package name */
    public final c.c0.d0.q.e.c<?>[] f1453c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1454d;

    public d(Context context, c.c0.d0.t.t.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1452b = cVar;
        this.f1453c = new c.c0.d0.q.e.c[]{new c.c0.d0.q.e.a(applicationContext, aVar), new c.c0.d0.q.e.b(applicationContext, aVar), new h(applicationContext, aVar), new c.c0.d0.q.e.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f1454d = new Object();
    }

    public boolean a(String str) {
        c.c0.d0.q.e.c<?>[] cVarArr;
        synchronized (this.f1454d) {
            for (c.c0.d0.q.e.c<?> cVar : this.f1453c) {
                Object obj = cVar.f1455b;
                if (obj != null && cVar.c(obj) && cVar.a.contains(str)) {
                    r.c().a(a, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(Iterable<p> iterable) {
        c.c0.d0.q.e.c<?>[] cVarArr;
        c.c0.d0.q.e.c<?>[] cVarArr2;
        synchronized (this.f1454d) {
            for (c.c0.d0.q.e.c<?> cVar : this.f1453c) {
                if (cVar.f1457d != null) {
                    cVar.f1457d = null;
                    cVar.e(null, cVar.f1455b);
                }
            }
            for (c.c0.d0.q.e.c<?> cVar2 : this.f1453c) {
                cVar2.d(iterable);
            }
            for (c.c0.d0.q.e.c<?> cVar3 : this.f1453c) {
                if (cVar3.f1457d != this) {
                    cVar3.f1457d = this;
                    cVar3.e(this, cVar3.f1455b);
                }
            }
        }
    }

    public void c() {
        c.c0.d0.q.e.c<?>[] cVarArr;
        synchronized (this.f1454d) {
            for (c.c0.d0.q.e.c<?> cVar : this.f1453c) {
                if (!cVar.a.isEmpty()) {
                    cVar.a.clear();
                    cVar.f1456c.b(cVar);
                }
            }
        }
    }
}
