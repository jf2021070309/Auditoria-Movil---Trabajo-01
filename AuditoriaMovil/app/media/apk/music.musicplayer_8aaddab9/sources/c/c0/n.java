package c.c0;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class n extends h.o.c.k implements h.o.b.l<Throwable, h.k> {
    public final /* synthetic */ o<R> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o<R> oVar) {
        super(1);
        this.a = oVar;
    }

    @Override // h.o.b.l
    public h.k invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 == null) {
            if (!this.a.f1603b.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            this.a.f1603b.cancel(true);
        } else {
            c.c0.d0.t.s.c<R> cVar = this.a.f1603b;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            cVar.k(th2);
        }
        return h.k.a;
    }
}
