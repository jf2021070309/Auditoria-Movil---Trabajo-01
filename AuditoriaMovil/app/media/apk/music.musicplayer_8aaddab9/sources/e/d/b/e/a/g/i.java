package e.d.b.e.a.g;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class i<ResultT> implements l<ResultT> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7026b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final b f7027c;

    public i(Executor executor, b bVar) {
        this.a = executor;
        this.f7027c = bVar;
    }

    @Override // e.d.b.e.a.g.l
    public final void a(r<ResultT> rVar) {
        if (rVar.e()) {
            return;
        }
        synchronized (this.f7026b) {
            if (this.f7027c == null) {
                return;
            }
            this.a.execute(new h(this, rVar));
        }
    }
}
