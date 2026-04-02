package e.d.b.e.a.g;
/* loaded from: classes2.dex */
public final class j implements Runnable {
    public final /* synthetic */ r a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f7028b;

    public j(k kVar, r rVar) {
        this.f7028b = kVar;
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7028b.f7029b) {
            c<? super ResultT> cVar = this.f7028b.f7030c;
            if (cVar != 0) {
                cVar.onSuccess(this.a.d());
            }
        }
    }
}
