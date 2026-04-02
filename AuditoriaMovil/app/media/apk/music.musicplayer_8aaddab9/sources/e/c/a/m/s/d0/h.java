package e.c.a.m.s.d0;

import e.c.a.m.s.d0.i;
import e.c.a.m.s.l;
import e.c.a.m.s.w;
/* loaded from: classes.dex */
public class h extends e.c.a.s.g<e.c.a.m.k, w<?>> implements i {

    /* renamed from: d  reason: collision with root package name */
    public i.a f5644d;

    public h(long j2) {
        super(j2);
    }

    @Override // e.c.a.s.g
    public int b(w<?> wVar) {
        w<?> wVar2 = wVar;
        if (wVar2 == null) {
            return 1;
        }
        return wVar2.getSize();
    }

    @Override // e.c.a.s.g
    public void c(e.c.a.m.k kVar, w<?> wVar) {
        w<?> wVar2 = wVar;
        i.a aVar = this.f5644d;
        if (aVar == null || wVar2 == null) {
            return;
        }
        ((l) aVar).f5705f.a(wVar2, true);
    }
}
