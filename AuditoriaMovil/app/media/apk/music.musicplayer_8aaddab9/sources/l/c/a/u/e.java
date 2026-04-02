package l.c.a.u;

import l.c.a.p;
import l.c.a.w.n;
/* loaded from: classes2.dex */
public class e extends l.c.a.v.c {
    public final /* synthetic */ l.c.a.t.b a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.c.a.w.e f9792b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.c.a.t.h f9793c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f9794d;

    public e(l.c.a.t.b bVar, l.c.a.w.e eVar, l.c.a.t.h hVar, p pVar) {
        this.a = bVar;
        this.f9792b = eVar;
        this.f9793c = hVar;
        this.f9794d = pVar;
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        return (this.a == null || !iVar.isDateBased()) ? this.f9792b.getLong(iVar) : this.a.getLong(iVar);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return (this.a == null || !iVar.isDateBased()) ? this.f9792b.isSupported(iVar) : this.a.isSupported(iVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        return kVar == l.c.a.w.j.f9809b ? (R) this.f9793c : kVar == l.c.a.w.j.a ? (R) this.f9794d : kVar == l.c.a.w.j.f9810c ? (R) this.f9792b.query(kVar) : kVar.a(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public n range(l.c.a.w.i iVar) {
        return (this.a == null || !iVar.isDateBased()) ? this.f9792b.range(iVar) : this.a.range(iVar);
    }
}
