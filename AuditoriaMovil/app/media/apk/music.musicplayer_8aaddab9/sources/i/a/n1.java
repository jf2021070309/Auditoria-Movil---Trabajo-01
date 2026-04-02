package i.a;
/* loaded from: classes2.dex */
public final class n1<T> extends k0<T> {

    /* renamed from: c  reason: collision with root package name */
    public final h.m.d<h.k> f9154c;

    public n1(h.m.f fVar, h.o.b.p<? super e0, ? super h.m.d<? super T>, ? extends Object> pVar) {
        super(fVar, false);
        this.f9154c = e.j.d.w.x(pVar, this, this);
    }

    @Override // i.a.l1
    public void R() {
        try {
            i.a.i2.f.b(e.j.d.w.P(this.f9154c), h.k.a, null, 2);
        } catch (Throwable th) {
            e.j.d.w.d(this, th);
            throw null;
        }
    }
}
