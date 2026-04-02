package e.d.b.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class f extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6776b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f6777c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6778d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f6779e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f6780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, e.d.b.e.a.g.n nVar, int i2, String str, e.d.b.e.a.g.n nVar2, int i3) {
        super(nVar);
        this.f6780f = oVar;
        this.f6776b = i2;
        this.f6777c = str;
        this.f6778d = nVar2;
        this.f6779e = i3;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            o oVar = this.f6780f;
            String str = oVar.f6874c;
            int i2 = this.f6776b;
            String str2 = this.f6777c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            bundle.putString("module_name", str2);
            oVar.f6876e.f7010l.h0(str, bundle, o.j(), new n(this.f6780f, this.f6778d, this.f6776b, this.f6777c, this.f6779e));
        } catch (RemoteException e2) {
            o.a.c(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
