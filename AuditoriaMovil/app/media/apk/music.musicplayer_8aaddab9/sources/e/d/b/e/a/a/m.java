package e.d.b.e.a.a;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class m extends j<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f6847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, e.d.b.e.a.g.n<Void> nVar) {
        super(oVar, nVar);
        this.f6847c = oVar;
    }

    @Override // e.d.b.e.a.a.j, e.d.b.e.a.c.m0
    public final void c(Bundle bundle, Bundle bundle2) {
        super.c(bundle, bundle2);
        if (!this.f6847c.f6878g.compareAndSet(true, false)) {
            o.a.a(5, "Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f6847c.a();
        }
    }
}
