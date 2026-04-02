package i.a;

import i.a.g1;
/* loaded from: classes2.dex */
public abstract class c<T> extends l1 implements g1, h.m.d<T>, e0 {

    /* renamed from: b  reason: collision with root package name */
    public final h.m.f f8970b;

    public c(h.m.f fVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            E((g1) fVar.get(g1.a.a));
        }
        this.f8970b = fVar.plus(this);
    }

    @Override // i.a.l1
    public final void D(Throwable th) {
        e.j.d.w.O(this.f8970b, th);
    }

    @Override // i.a.l1
    public String J() {
        boolean z = a0.a;
        return super.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.a.l1
    public final void O(Object obj) {
        if (!(obj instanceof w)) {
            f0(obj);
            return;
        }
        w wVar = (w) obj;
        e0(wVar.f9177b, wVar.a());
    }

    @Override // i.a.l1, i.a.g1
    public boolean a() {
        return super.a();
    }

    public void c0(Object obj) {
        c(obj);
    }

    public void e0(Throwable th, boolean z) {
    }

    public void f0(T t) {
    }

    @Override // i.a.e0
    public h.m.f g() {
        return this.f8970b;
    }

    @Override // h.m.d
    public final h.m.f getContext() {
        return this.f8970b;
    }

    @Override // i.a.l1
    public String k() {
        return h.o.c.j.i(getClass().getSimpleName(), " was cancelled");
    }

    @Override // h.m.d
    public final void resumeWith(Object obj) {
        Object H = H(e.j.d.w.I0(obj, null));
        if (H == m1.f9146b) {
            return;
        }
        c0(H);
    }
}
