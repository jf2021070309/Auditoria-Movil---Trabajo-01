package e.d.b.e.a.a;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class h extends e.d.b.e.a.c.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6800b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f6801c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6802d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f6803e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e.d.b.e.a.g.n f6804f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ o f6805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, e.d.b.e.a.g.n nVar, int i2, String str, String str2, int i3, e.d.b.e.a.g.n nVar2) {
        super(nVar);
        this.f6805g = oVar;
        this.f6800b = i2;
        this.f6801c = str;
        this.f6802d = str2;
        this.f6803e = i3;
        this.f6804f = nVar2;
    }

    @Override // e.d.b.e.a.c.f
    public final void a() {
        try {
            o oVar = this.f6805g;
            oVar.f6876e.f7010l.A0(oVar.f6874c, o.h(this.f6800b, this.f6801c, this.f6802d, this.f6803e), o.j(), new k(this.f6805g, this.f6804f));
        } catch (RemoteException e2) {
            o.a.a(6, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{this.f6801c, this.f6802d, Integer.valueOf(this.f6803e), Integer.valueOf(this.f6800b)});
            this.f6804f.a(new RuntimeException(e2));
        }
    }
}
