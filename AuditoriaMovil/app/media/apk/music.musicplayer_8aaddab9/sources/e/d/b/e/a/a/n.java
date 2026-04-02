package e.d.b.e.a.a;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class n extends j<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final int f6864c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6865d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6866e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f6867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, e.d.b.e.a.g.n<Void> nVar, int i2, String str, int i3) {
        super(oVar, nVar);
        this.f6867f = oVar;
        this.f6864c = i2;
        this.f6865d = str;
        this.f6866e = i3;
    }

    @Override // e.d.b.e.a.a.j, e.d.b.e.a.c.m0
    public final void b(Bundle bundle) {
        this.f6867f.f6876e.a();
        o.a.a(6, "onError(%d), retrying notifyModuleCompleted...", new Object[]{Integer.valueOf(bundle.getInt("error_code"))});
        int i2 = this.f6866e;
        if (i2 > 0) {
            this.f6867f.f(this.f6864c, this.f6865d, i2 - 1);
        }
    }
}
