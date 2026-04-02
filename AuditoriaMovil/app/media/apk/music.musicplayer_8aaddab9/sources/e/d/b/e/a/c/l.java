package e.d.b.e.a.c;

import android.os.IBinder;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class l extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f6997b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f6998c;

    public l(n nVar, IBinder iBinder) {
        this.f6998c = nVar;
        this.f6997b = iBinder;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        o oVar = this.f6998c.a;
        oVar.f7010l = (T) oVar.f7006h.a(this.f6997b);
        o oVar2 = this.f6998c.a;
        oVar2.f7001c.a(4, "linkToDeath", new Object[0]);
        try {
            oVar2.f7010l.asBinder().linkToDeath(oVar2.f7008j, 0);
        } catch (RemoteException e2) {
            oVar2.f7001c.c(e2, "linkToDeath failed", new Object[0]);
        }
        o oVar3 = this.f6998c.a;
        oVar3.f7004f = false;
        for (f fVar : oVar3.f7003e) {
            fVar.run();
        }
        this.f6998c.a.f7003e.clear();
    }
}
