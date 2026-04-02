package e.d.b.e.a.g;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class g<ResultT> implements l<ResultT> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7023b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final a<ResultT> f7024c;

    public g(Executor executor, a<ResultT> aVar) {
        this.a = executor;
        this.f7024c = aVar;
    }

    @Override // e.d.b.e.a.g.l
    public final void a(r<ResultT> rVar) {
        synchronized (this.f7023b) {
            if (this.f7024c == null) {
                return;
            }
            this.a.execute(new f(this, rVar));
        }
    }
}
