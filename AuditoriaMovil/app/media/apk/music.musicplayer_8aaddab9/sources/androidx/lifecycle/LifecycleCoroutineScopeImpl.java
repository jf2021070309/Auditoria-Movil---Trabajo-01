package androidx.lifecycle;

import c.p.j;
import c.p.k;
import c.p.n;
import c.p.p;
import c.p.r;
import e.j.d.w;
import h.m.f;
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends k implements n {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final f f446b;

    public LifecycleCoroutineScopeImpl(j jVar, f fVar) {
        h.o.c.j.e(jVar, "lifecycle");
        h.o.c.j.e(fVar, "coroutineContext");
        this.a = jVar;
        this.f446b = fVar;
        if (((r) jVar).f2467c == j.b.DESTROYED) {
            w.m(fVar, null, 1, null);
        }
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        h.o.c.j.e(pVar, "source");
        h.o.c.j.e(aVar, "event");
        if (((r) this.a).f2467c.compareTo(j.b.DESTROYED) <= 0) {
            r rVar = (r) this.a;
            rVar.d("removeObserver");
            rVar.f2466b.e(this);
            w.m(this.f446b, null, 1, null);
        }
    }

    @Override // i.a.e0
    public f g() {
        return this.f446b;
    }

    @Override // c.p.k
    public j i() {
        return this.a;
    }
}
