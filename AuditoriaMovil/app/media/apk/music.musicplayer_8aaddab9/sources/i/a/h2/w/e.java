package i.a.h2.w;

import h.m.f;
import h.o.b.p;
/* loaded from: classes2.dex */
public final class e implements f.a {
    public static final a a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f9052b;

    /* loaded from: classes2.dex */
    public static final class a implements f.b<e> {
        public a(h.o.c.f fVar) {
        }
    }

    public e(Throwable th) {
        this.f9052b = th;
    }

    @Override // h.m.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0201a.a(this, r, pVar);
    }

    @Override // h.m.f.a, h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0201a.b(this, bVar);
    }

    @Override // h.m.f.a
    public f.b<?> getKey() {
        return a;
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
