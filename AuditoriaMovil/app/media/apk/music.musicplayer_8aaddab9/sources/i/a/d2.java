package i.a;

import h.m.f;
/* loaded from: classes2.dex */
public final class d2 implements f.a, f.b<d2> {
    public static final d2 a = new d2();

    @Override // h.m.f
    public <R> R fold(R r, h.o.b.p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0201a.a(this, r, pVar);
    }

    @Override // h.m.f.a, h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0201a.b(this, bVar);
    }

    @Override // h.m.f.a
    public f.b<?> getKey() {
        return this;
    }

    @Override // h.m.f
    public h.m.f minusKey(f.b<?> bVar) {
        return f.a.C0201a.c(this, bVar);
    }

    @Override // h.m.f
    public h.m.f plus(h.m.f fVar) {
        return f.a.C0201a.d(this, fVar);
    }
}
