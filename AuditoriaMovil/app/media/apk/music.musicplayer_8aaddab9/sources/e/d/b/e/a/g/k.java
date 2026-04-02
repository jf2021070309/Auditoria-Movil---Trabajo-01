package e.d.b.e.a.g;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class k<ResultT> implements l<ResultT> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7029b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final c<? super ResultT> f7030c;

    public k(Executor executor, c<? super ResultT> cVar) {
        this.a = executor;
        this.f7030c = cVar;
    }

    @Override // e.d.b.e.a.g.l
    public final void a(r<ResultT> rVar) {
        if (rVar.e()) {
            synchronized (this.f7029b) {
                if (this.f7030c == null) {
                    return;
                }
                this.a.execute(new j(this, rVar));
            }
        }
    }
}
