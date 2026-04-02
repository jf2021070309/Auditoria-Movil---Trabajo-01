package e.d.b.e.a.c;
/* loaded from: classes2.dex */
public final class m extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f6999b;

    public m(n nVar) {
        this.f6999b = nVar;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        o oVar = this.f6999b.a;
        oVar.f7001c.a(4, "unlinkToDeath", new Object[0]);
        oVar.f7010l.asBinder().unlinkToDeath(oVar.f7008j, 0);
        o oVar2 = this.f6999b.a;
        oVar2.f7010l = null;
        oVar2.f7004f = false;
    }
}
