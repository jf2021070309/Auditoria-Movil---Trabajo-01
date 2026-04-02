package e.d.b.e.a.g;
/* loaded from: classes2.dex */
public final class n<ResultT> {
    public final r<ResultT> a = new r<>();

    public final void a(Exception exc) {
        r<ResultT> rVar = this.a;
        synchronized (rVar.a) {
            if (rVar.f7034c) {
                return;
            }
            rVar.f7034c = true;
            rVar.f7036e = exc;
            rVar.f7033b.b(rVar);
        }
    }

    public final void b(ResultT resultt) {
        r<ResultT> rVar = this.a;
        synchronized (rVar.a) {
            if (rVar.f7034c) {
                return;
            }
            rVar.f7034c = true;
            rVar.f7035d = resultt;
            rVar.f7033b.b(rVar);
        }
    }
}
