package e.d.b.e.a.a;

import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f6750b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6751c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f6752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, e.d.b.e.a.g.n nVar, Map map, e.d.b.e.a.g.n nVar2) {
        super(nVar);
        this.f6752d = oVar;
        this.f6750b = map;
        this.f6751c = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            o oVar = this.f6752d;
            oVar.f6876e.f7010l.e0(oVar.f6874c, o.g(this.f6750b), new l(this.f6752d, this.f6751c));
        } catch (RemoteException e2) {
            o.a.c(e2, "syncPacks", new Object[0]);
            this.f6751c.a(new RuntimeException(e2));
        }
    }
}
