package c.c0.d0.p.a;

import c.c0.d0.s.p;
import c.c0.r;
/* loaded from: classes.dex */
public class a implements Runnable {
    public final /* synthetic */ p a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f1403b;

    public a(b bVar, p pVar) {
        this.f1403b = bVar;
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r.c().a(b.a, String.format("Scheduling work %s", this.a.a), new Throwable[0]);
        this.f1403b.f1404b.a(this.a);
    }
}
