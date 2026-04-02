package i.a;
/* loaded from: classes2.dex */
public final class c2<T> extends i.a.i2.o<T> {

    /* renamed from: d  reason: collision with root package name */
    public h.m.f f8971d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8972e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c2(h.m.f r3, h.m.d<? super T> r4) {
        /*
            r2 = this;
            i.a.d2 r0 = i.a.d2.a
            h.m.f$a r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            h.m.f r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.c2.<init>(h.m.f, h.m.d):void");
    }

    @Override // i.a.i2.o, i.a.c
    public void c0(Object obj) {
        h.m.f fVar = this.f8971d;
        if (fVar != null) {
            i.a.i2.s.a(fVar, this.f8972e);
            this.f8971d = null;
            this.f8972e = null;
        }
        Object i0 = e.j.d.w.i0(obj, this.f9079c);
        h.m.d<T> dVar = this.f9079c;
        h.m.f context = dVar.getContext();
        Object b2 = i.a.i2.s.b(context, null);
        c2<?> b3 = b2 != i.a.i2.s.a ? a0.b(dVar, context, b2) : null;
        try {
            this.f9079c.resumeWith(i0);
        } finally {
            if (b3 == null || b3.g0()) {
                i.a.i2.s.a(context, b2);
            }
        }
    }

    public final boolean g0() {
        if (this.f8971d == null) {
            return false;
        }
        this.f8971d = null;
        this.f8972e = null;
        return true;
    }
}
