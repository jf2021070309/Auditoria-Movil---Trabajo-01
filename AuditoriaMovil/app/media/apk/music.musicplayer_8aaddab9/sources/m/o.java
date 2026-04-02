package m;
/* loaded from: classes2.dex */
public final class o extends h.o.c.k implements h.o.b.l<Throwable, h.k> {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar) {
        super(1);
        this.a = bVar;
    }

    @Override // h.o.b.l
    public h.k invoke(Throwable th) {
        this.a.cancel();
        return h.k.a;
    }
}
