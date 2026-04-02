package i.a.h2;
/* loaded from: classes2.dex */
public final class q extends i.a.h2.w.d<o<?>> {
    public long a = -1;

    /* renamed from: b  reason: collision with root package name */
    public h.m.d<? super h.k> f9036b;

    @Override // i.a.h2.w.d
    public boolean a(o<?> oVar) {
        o<?> oVar2 = oVar;
        if (this.a >= 0) {
            return false;
        }
        long j2 = oVar2.f9023h;
        if (j2 < oVar2.f9024i) {
            oVar2.f9024i = j2;
        }
        this.a = j2;
        return true;
    }

    @Override // i.a.h2.w.d
    public h.m.d[] b(o<?> oVar) {
        long j2 = this.a;
        this.a = -1L;
        this.f9036b = null;
        return oVar.t(j2);
    }
}
