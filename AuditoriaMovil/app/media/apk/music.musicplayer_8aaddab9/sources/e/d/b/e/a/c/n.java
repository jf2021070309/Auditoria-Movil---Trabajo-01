package e.d.b.e.a.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes2.dex */
public final class n implements ServiceConnection {
    public final /* synthetic */ o a;

    public /* synthetic */ n(o oVar) {
        this.a = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.f7001c.a(4, "ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        this.a.c(new l(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.f7001c.a(4, "ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
        this.a.c(new m(this));
    }
}
