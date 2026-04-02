package i.a;
/* loaded from: classes2.dex */
public final class u1<T> extends k1 {

    /* renamed from: e  reason: collision with root package name */
    public final k<T> f9172e;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(k<? super T> kVar) {
        this.f9172e = kVar;
    }

    @Override // h.o.b.l
    public /* bridge */ /* synthetic */ h.k invoke(Throwable th) {
        o(th);
        return h.k.a;
    }

    @Override // i.a.y
    public void o(Throwable th) {
        Object A = p().A();
        if (A instanceof w) {
            this.f9172e.resumeWith(e.j.d.w.y(((w) A).f9177b));
        } else {
            this.f9172e.resumeWith(m1.a(A));
        }
    }
}
