package e.d.b.e.a.a;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class e extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6761b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f6762c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6763d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f6764e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6765f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ o f6766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, e.d.b.e.a.g.n nVar, int i2, String str, String str2, int i3, e.d.b.e.a.g.n nVar2) {
        super(nVar);
        this.f6766g = oVar;
        this.f6761b = i2;
        this.f6762c = str;
        this.f6763d = str2;
        this.f6764e = i3;
        this.f6765f = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            o oVar = this.f6766g;
            oVar.f6876e.f7010l.Y(oVar.f6874c, o.h(this.f6761b, this.f6762c, this.f6763d, this.f6764e), o.j(), new j(this.f6766g, this.f6765f, (char[]) null));
        } catch (RemoteException e2) {
            o.a.c(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
