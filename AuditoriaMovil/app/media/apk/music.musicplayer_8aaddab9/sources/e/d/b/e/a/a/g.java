package e.d.b.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class g extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6790b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6791c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f6792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, e.d.b.e.a.g.n nVar, int i2, e.d.b.e.a.g.n nVar2) {
        super(nVar);
        this.f6792d = oVar;
        this.f6790b = i2;
        this.f6791c = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            o oVar = this.f6792d;
            String str = oVar.f6874c;
            int i2 = this.f6790b;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            oVar.f6876e.f7010l.t0(str, bundle, o.j(), new j(this.f6792d, this.f6791c, (int[]) null));
        } catch (RemoteException e2) {
            o.a.c(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
