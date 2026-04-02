package e.d.b.e.a.a;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class i extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6816b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f6817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, e.d.b.e.a.g.n nVar, e.d.b.e.a.g.n nVar2) {
        super(nVar);
        this.f6817c = oVar;
        this.f6816b = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            o oVar = this.f6817c;
            oVar.f6877f.f7010l.U(oVar.f6874c, o.j(), new m(this.f6817c, this.f6816b));
        } catch (RemoteException e2) {
            o.a.c(e2, "keepAlive", new Object[0]);
        }
    }
}
