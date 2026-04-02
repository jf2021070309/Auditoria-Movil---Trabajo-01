package i.a.i2;

import e.j.d.w;
/* loaded from: classes2.dex */
public class o<T> extends i.a.c<T> implements h.m.i.a.d {

    /* renamed from: c  reason: collision with root package name */
    public final h.m.d<T> f9079c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(h.m.f fVar, h.m.d<? super T> dVar) {
        super(fVar, true, true);
        this.f9079c = dVar;
    }

    @Override // i.a.l1
    public final boolean F() {
        return true;
    }

    @Override // i.a.l1
    public void c(Object obj) {
        f.b(w.P(this.f9079c), w.i0(obj, this.f9079c), null, 2);
    }

    @Override // i.a.c
    public void c0(Object obj) {
        h.m.d<T> dVar = this.f9079c;
        dVar.resumeWith(w.i0(obj, dVar));
    }

    @Override // h.m.i.a.d
    public final h.m.i.a.d getCallerFrame() {
        h.m.d<T> dVar = this.f9079c;
        if (dVar instanceof h.m.i.a.d) {
            return (h.m.i.a.d) dVar;
        }
        return null;
    }
}
