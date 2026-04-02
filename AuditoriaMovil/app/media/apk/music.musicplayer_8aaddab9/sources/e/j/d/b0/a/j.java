package e.j.d.b0.a;

import e.j.d.b0.a.a;
/* loaded from: classes2.dex */
public final class j extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ a.EnumC0186a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f8558b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b.c.l f8559c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h.o.b.a<h.k> f8560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a.EnumC0186a enumC0186a, a aVar, c.b.c.l lVar, h.o.b.a<h.k> aVar2) {
        super(0);
        this.a = enumC0186a;
        this.f8558b = aVar;
        this.f8559c = lVar;
        this.f8560d = aVar2;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        e.j.d.k.a.a().f8813j.i(this.a);
        e.j.d.b0.c.g gVar = this.f8558b.a;
        c.b.c.l lVar = this.f8559c;
        gVar.d(lVar, new i(lVar, this.f8560d));
        return h.k.a;
    }
}
