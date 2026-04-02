package e.d.b.e.a.c;
/* loaded from: classes2.dex */
public final class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f6996b;

    public i(o oVar) {
        this.f6996b = oVar;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        o oVar = this.f6996b;
        if (oVar.f7010l != 0) {
            oVar.f7001c.a(4, "Unbind from service.", new Object[0]);
            o oVar2 = this.f6996b;
            oVar2.f7000b.unbindService(oVar2.f7009k);
            o oVar3 = this.f6996b;
            oVar3.f7004f = false;
            oVar3.f7010l = null;
            oVar3.f7009k = null;
        }
    }
}
