package e.j.d.c0;

import android.content.SharedPreferences;
import android.os.RemoteException;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class y implements e.a.b.a.c {
    public final /* synthetic */ e.a.b.a.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f8792b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i.a.j<String> f8793c;

    /* JADX WARN: Multi-variable type inference failed */
    public y(e.a.b.a.a aVar, z zVar, i.a.j<? super String> jVar) {
        this.a = aVar;
        this.f8792b = zVar;
        this.f8793c = jVar;
    }

    @Override // e.a.b.a.c
    public void a(int i2) {
        String str = "";
        try {
            if (i2 == 0) {
                String string = this.a.a().a.getString("install_referrer");
                e.j.d.i iVar = this.f8792b.f8794b;
                h.o.c.j.d(string, "referrer");
                Objects.requireNonNull(iVar);
                h.o.c.j.e(string, "value");
                SharedPreferences.Editor edit = iVar.a.edit();
                edit.putString("install_referrer", string);
                edit.apply();
                n.a.a.b("PremiumHelper").a(h.o.c.j.i("Install referrer: ", string), new Object[0]);
                if (this.f8793c.a()) {
                    this.f8793c.resumeWith(string);
                }
            } else if (this.f8793c.a()) {
                this.f8793c.resumeWith("");
            }
            try {
                e.a.b.a.b bVar = (e.a.b.a.b) this.a;
                bVar.a = 3;
                str = null;
                if (bVar.f5029d != null) {
                    c.t.m.x("InstallReferrerClient", "Unbinding from service.");
                    bVar.f5027b.unbindService(bVar.f5029d);
                    bVar.f5029d = null;
                }
                bVar.f5028c = null;
            } catch (Throwable unused) {
            }
        } catch (RemoteException unused2) {
            if (this.f8793c.a()) {
                this.f8793c.resumeWith(str);
            }
        }
    }

    @Override // e.a.b.a.c
    public void b() {
    }
}
