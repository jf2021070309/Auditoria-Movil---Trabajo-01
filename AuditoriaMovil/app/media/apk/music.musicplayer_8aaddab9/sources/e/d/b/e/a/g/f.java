package e.d.b.e.a.g;
/* loaded from: classes2.dex */
public final class f implements Runnable {
    public final /* synthetic */ r a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f7022b;

    public f(g gVar, r rVar) {
        this.f7022b = gVar;
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7022b.f7023b) {
            a<ResultT> aVar = this.f7022b.f7024c;
            if (aVar != 0) {
                aVar.a(this.a);
            }
        }
    }
}
