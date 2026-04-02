package i.a;
/* loaded from: classes2.dex */
public final class n extends i1 {

    /* renamed from: e  reason: collision with root package name */
    public final k<?> f9152e;

    public n(k<?> kVar) {
        this.f9152e = kVar;
    }

    @Override // h.o.b.l
    public /* bridge */ /* synthetic */ h.k invoke(Throwable th) {
        o(th);
        return h.k.a;
    }

    @Override // i.a.y
    public void o(Throwable th) {
        k<?> kVar = this.f9152e;
        Throwable n2 = kVar.n(p());
        if (!kVar.u() ? false : ((i.a.i2.e) kVar.f9093f).i(n2)) {
            return;
        }
        kVar.P(n2);
        kVar.l();
    }
}
