package e.d.b.e.a.e;

import android.os.RemoteException;
import e.d.b.e.a.c.f;
import e.d.b.e.a.g.n;
/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f7015b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f7016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, n nVar, n nVar2) {
        super(nVar);
        this.f7016c = eVar;
        this.f7015b = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            e eVar = this.f7016c;
            eVar.f7019b.f7010l.o(eVar.f7020c, e.d.b.e.a.b.b.a(), new d(this.f7016c, this.f7015b));
        } catch (RemoteException e2) {
            e.a.c(e2, "error requesting in-app review for %s", this.f7016c.f7020c);
            this.f7015b.a(new RuntimeException(e2));
        }
    }
}
