package com.amazon.aps.iva.cb;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
/* compiled from: InstallReferrerClientImpl.java */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.ab.a {
    public int a = 0;
    public final Context b;
    public IGetInstallReferrerService c;
    public ServiceConnectionC0167a d;

    /* compiled from: InstallReferrerClientImpl.java */
    /* renamed from: com.amazon.aps.iva.cb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class ServiceConnectionC0167a implements ServiceConnection {
        public final b b;

        public ServiceConnectionC0167a(com.amazon.aps.iva.pa0.b bVar) {
            this.b = bVar;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.isLoggable("InstallReferrerClient", 2);
            IGetInstallReferrerService b = IGetInstallReferrerService.Stub.b(iBinder);
            a aVar = a.this;
            aVar.c = b;
            aVar.a = 2;
            ((com.amazon.aps.iva.pa0.b) this.b).c(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.isLoggable("InstallReferrerClient", 5);
            a aVar = a.this;
            aVar.c = null;
            aVar.a = 0;
            a aVar2 = (a) ((com.amazon.aps.iva.pa0.b) this.b).a;
            aVar2.a = 3;
            if (aVar2.d != null) {
                Log.isLoggable("InstallReferrerClient", 2);
                aVar2.b.unbindService(aVar2.d);
                aVar2.d = null;
            }
            aVar2.c = null;
        }
    }

    public a(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // com.amazon.aps.iva.ab.a
    public final boolean k() {
        if (this.a == 2 && this.c != null && this.d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.amazon.aps.iva.pa0.b r11) {
        /*
            r10 = this;
            boolean r0 = r10.k()
            r1 = 2
            r2 = 0
            java.lang.String r3 = "InstallReferrerClient"
            if (r0 == 0) goto L11
            android.util.Log.isLoggable(r3, r1)
            r11.c(r2)
            return
        L11:
            int r0 = r10.a
            r4 = 3
            r5 = 1
            r6 = 5
            if (r0 != r5) goto L1f
            android.util.Log.isLoggable(r3, r6)
            r11.c(r4)
            return
        L1f:
            if (r0 != r4) goto L28
            android.util.Log.isLoggable(r3, r6)
            r11.c(r4)
            return
        L28:
            android.util.Log.isLoggable(r3, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r7 = "com.android.vending"
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r4.<init>(r7, r8)
            r0.setComponent(r4)
            android.content.Context r4 = r10.b
            android.content.pm.PackageManager r8 = r4.getPackageManager()
            java.util.List r8 = r8.queryIntentServices(r0, r2)
            if (r8 == 0) goto Lae
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Lae
            java.lang.Object r8 = r8.get(r2)
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            android.content.pm.ServiceInfo r8 = r8.serviceInfo
            if (r8 == 0) goto Lae
            java.lang.String r9 = r8.packageName
            java.lang.String r8 = r8.name
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto La5
            if (r8 == 0) goto La5
            android.content.pm.PackageManager r8 = r4.getPackageManager()
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r7 = r8.getPackageInfo(r7, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            int r7 = r7.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            r8 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r7 < r8) goto L79
            r7 = r5
            goto L7a
        L79:
            r7 = r2
        L7a:
            if (r7 == 0) goto La5
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r0)
            com.amazon.aps.iva.cb.a$a r0 = new com.amazon.aps.iva.cb.a$a
            r0.<init>(r11)
            r10.d = r0
            boolean r0 = r4.bindService(r7, r0, r5)     // Catch: java.lang.SecurityException -> L9b
            if (r0 == 0) goto L92
            android.util.Log.isLoggable(r3, r1)
            return
        L92:
            android.util.Log.isLoggable(r3, r6)
            r10.a = r2
            r11.c(r5)
            return
        L9b:
            android.util.Log.isLoggable(r3, r6)
            r10.a = r2
            r0 = 4
            r11.c(r0)
            return
        La5:
            android.util.Log.isLoggable(r3, r6)
            r10.a = r2
            r11.c(r1)
            return
        Lae:
            r10.a = r2
            android.util.Log.isLoggable(r3, r1)
            r11.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cb.a.s(com.amazon.aps.iva.pa0.b):void");
    }
}
