package c.i.k;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class k {
    public final Runnable a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<n> f2188b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<n, a> f2189c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {
        public final c.p.j a;

        /* renamed from: b  reason: collision with root package name */
        public c.p.n f2190b;

        public a(c.p.j jVar, c.p.n nVar) {
            this.a = jVar;
            this.f2190b = nVar;
            jVar.a(nVar);
        }

        public void a() {
            this.a.b(this.f2190b);
            this.f2190b = null;
        }
    }

    public k(Runnable runnable) {
        this.a = runnable;
    }

    public void a(n nVar) {
        this.f2188b.remove(nVar);
        a remove = this.f2189c.remove(nVar);
        if (remove != null) {
            remove.a();
        }
        this.a.run();
    }
}
