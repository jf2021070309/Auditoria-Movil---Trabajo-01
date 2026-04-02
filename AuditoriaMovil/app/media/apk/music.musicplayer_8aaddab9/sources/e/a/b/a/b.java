package e.a.b.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.t.m;
import e.d.b.c.a.a;
/* loaded from: classes.dex */
public class b extends e.a.b.a.a {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5027b;

    /* renamed from: c  reason: collision with root package name */
    public e.d.b.c.a.a f5028c;

    /* renamed from: d  reason: collision with root package name */
    public ServiceConnection f5029d;

    /* renamed from: e.a.b.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class ServiceConnectionC0103b implements ServiceConnection {
        public final c a;

        public ServiceConnectionC0103b(c cVar, a aVar) {
            if (cVar == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.a = cVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e.d.b.c.a.a c0138a;
            m.x("InstallReferrerClient", "Install Referrer service connected.");
            b bVar = b.this;
            int i2 = a.AbstractBinderC0137a.a;
            if (iBinder == null) {
                c0138a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0138a = queryLocalInterface instanceof e.d.b.c.a.a ? (e.d.b.c.a.a) queryLocalInterface : new a.AbstractBinderC0137a.C0138a(iBinder);
            }
            bVar.f5028c = c0138a;
            b.this.a = 2;
            this.a.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            m.y("InstallReferrerClient", "Install Referrer service disconnected.");
            b bVar = b.this;
            bVar.f5028c = null;
            bVar.a = 0;
            this.a.b();
        }
    }

    public b(Context context) {
        this.f5027b = context.getApplicationContext();
    }

    @Override // e.a.b.a.a
    public d a() throws RemoteException {
        if (b()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f5027b.getPackageName());
            try {
                return new d(this.f5028c.S(bundle));
            } catch (RemoteException e2) {
                m.y("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw e2;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    public boolean b() {
        return (this.a != 2 || this.f5028c == null || this.f5029d == null) ? false : true;
    }
}
