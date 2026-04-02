package e.d.b.e.a.g;
/* loaded from: classes2.dex */
public final class h implements Runnable {
    public final /* synthetic */ r a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f7025b;

    public h(i iVar, r rVar) {
        this.f7025b = iVar;
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        synchronized (this.f7025b.f7026b) {
            b bVar = this.f7025b.f7027c;
            if (bVar != null) {
                r rVar = this.a;
                synchronized (rVar.a) {
                    exc = rVar.f7036e;
                }
                bVar.onFailure(exc);
            }
        }
    }
}
