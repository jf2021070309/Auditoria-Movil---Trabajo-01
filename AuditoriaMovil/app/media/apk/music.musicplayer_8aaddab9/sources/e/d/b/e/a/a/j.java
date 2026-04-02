package e.d.b.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
public class j<T> extends e.d.b.e.a.c.l0 {
    public final e.d.b.e.a.g.n<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f6821b;

    public j(o oVar, e.d.b.e.a.g.n<T> nVar) {
        this.f6821b = oVar;
        this.a = nVar;
    }

    public j(o oVar, e.d.b.e.a.g.n nVar, byte[] bArr) {
        this.f6821b = oVar;
        this.a = nVar;
    }

    public j(o oVar, e.d.b.e.a.g.n nVar, char[] cArr) {
        this.f6821b = oVar;
        this.a = nVar;
    }

    public j(o oVar, e.d.b.e.a.g.n nVar, int[] iArr) {
        this.f6821b = oVar;
        this.a = nVar;
    }

    @Override // e.d.b.e.a.c.m0
    public void a(List<Bundle> list) {
        this.f6821b.f6876e.a();
        o.a.a(4, "onGetSessionStates", new Object[0]);
    }

    @Override // e.d.b.e.a.c.m0
    public void b(Bundle bundle) {
        this.f6821b.f6876e.a();
        int i2 = bundle.getInt("error_code");
        o.a.a(6, "onError(%d)", new Object[]{Integer.valueOf(i2)});
        this.a.a(new a(i2));
    }

    @Override // e.d.b.e.a.c.m0
    public void c(Bundle bundle, Bundle bundle2) {
        this.f6821b.f6877f.a();
        o.a.a(4, "onKeepAlive(%b)", new Object[]{Boolean.valueOf(bundle.getBoolean("keep_alive"))});
    }

    @Override // e.d.b.e.a.c.m0
    public void f0(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f6821b.f6876e.a();
        o.a.a(4, "onGetChunkFileDescriptor", new Object[0]);
    }
}
