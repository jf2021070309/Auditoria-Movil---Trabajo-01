package m;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class r<T> implements d<T> {
    public final /* synthetic */ i.a.j a;

    public r(i.a.j jVar) {
        this.a = jVar;
    }

    @Override // m.d
    public void a(b<T> bVar, Throwable th) {
        h.o.c.j.f(bVar, "call");
        h.o.c.j.f(th, "t");
        this.a.resumeWith(e.j.d.w.y(th));
    }

    @Override // m.d
    public void b(b<T> bVar, a0<T> a0Var) {
        h.o.c.j.f(bVar, "call");
        h.o.c.j.f(a0Var, "response");
        this.a.resumeWith(a0Var);
    }
}
