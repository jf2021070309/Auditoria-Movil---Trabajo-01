package c.c0.d0;

import c.c0.r;
/* loaded from: classes.dex */
public class m implements Runnable {
    public final /* synthetic */ e.d.c.a.a.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.c0.d0.t.s.c f1379b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f1380c;

    public m(o oVar, e.d.c.a.a.a aVar, c.c0.d0.t.s.c cVar) {
        this.f1380c = oVar;
        this.a = aVar;
        this.f1379b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.get();
            r.c().a(o.a, String.format("Starting work for %s", this.f1380c.f1387f.f1508c), new Throwable[0]);
            o oVar = this.f1380c;
            oVar.s = oVar.f1388g.startWork();
            this.f1379b.l(this.f1380c.s);
        } catch (Throwable th) {
            this.f1379b.k(th);
        }
    }
}
