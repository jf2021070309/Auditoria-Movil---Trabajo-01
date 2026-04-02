package c.c0;
/* loaded from: classes.dex */
public final class q extends h.o.c.k implements h.o.b.l<Throwable, h.k> {
    public final /* synthetic */ e.d.c.a.a.a<R> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e.d.c.a.a.a<R> aVar) {
        super(1);
        this.a = aVar;
    }

    @Override // h.o.b.l
    public h.k invoke(Throwable th) {
        this.a.cancel(false);
        return h.k.a;
    }
}
