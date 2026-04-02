package c.c0;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ i.a.j<R> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.d.c.a.a.a<R> f1604b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(i.a.j<? super R> jVar, e.d.c.a.a.a<R> aVar) {
        this.a = jVar;
        this.f1604b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.resumeWith(this.f1604b.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.a.P(cause);
            } else {
                this.a.resumeWith(e.j.d.w.y(cause));
            }
        }
    }
}
