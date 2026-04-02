package i.a;
/* loaded from: classes2.dex */
public final class o1 extends v1 {

    /* renamed from: c  reason: collision with root package name */
    public final h.m.d<h.k> f9156c;

    public o1(h.m.f fVar, h.o.b.p<? super e0, ? super h.m.d<? super h.k>, ? extends Object> pVar) {
        super(fVar, false);
        this.f9156c = e.j.d.w.x(pVar, this, this);
    }

    @Override // i.a.l1
    public void R() {
        try {
            i.a.i2.f.b(e.j.d.w.P(this.f9156c), h.k.a, null, 2);
        } catch (Throwable th) {
            e.j.d.w.d(this, th);
            throw null;
        }
    }
}
