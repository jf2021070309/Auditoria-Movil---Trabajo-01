package com.amazon.aps.iva.m6;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.n6.c;
import com.amazon.aps.iva.t5.g0;
import java.util.HashMap;
import java.util.List;
/* compiled from: DownloadService.java */
/* loaded from: classes.dex */
public abstract class n extends Service {
    public static final HashMap<Class<? extends n>, a> j = new HashMap<>();
    public final String b = null;
    public final int c = 0;
    public final int d = 0;
    public a e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* compiled from: DownloadService.java */
    /* loaded from: classes.dex */
    public static final class a implements i.c {
        public final Context b;
        public final i c;
        public final boolean d;
        public final com.amazon.aps.iva.n6.d e;
        public final Class<? extends n> f;
        public n g;
        public com.amazon.aps.iva.n6.b h;

        public a() {
            throw null;
        }

        public a(Context context, i iVar, boolean z, com.amazon.aps.iva.n6.a aVar, Class cls) {
            this.b = context;
            this.c = iVar;
            this.d = z;
            this.e = aVar;
            this.f = cls;
            iVar.e.add(this);
            i();
        }

        @Override // com.amazon.aps.iva.m6.i.c
        public final void a(i iVar, c cVar, Exception exc) {
            boolean z;
            n nVar = this.g;
            boolean z2 = false;
            if (nVar != null) {
                nVar.getClass();
            }
            n nVar2 = this.g;
            if (nVar2 != null && !nVar2.i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i = cVar.b;
                HashMap<Class<? extends n>, a> hashMap = n.j;
                if (i == 2 || i == 5 || i == 7) {
                    z2 = true;
                }
                if (z2) {
                    com.amazon.aps.iva.t5.p.g();
                    h();
                }
            }
        }

        @Override // com.amazon.aps.iva.m6.i.c
        public final void b(i iVar, boolean z) {
            boolean z2;
            if (!z && !iVar.i) {
                n nVar = this.g;
                if (nVar != null && !nVar.i) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    List<c> list = iVar.m;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).b == 0) {
                            h();
                            return;
                        }
                    }
                }
            }
        }

        @Override // com.amazon.aps.iva.m6.i.c
        public final void c() {
            i();
        }

        @Override // com.amazon.aps.iva.m6.i.c
        public final void d(i iVar) {
            n nVar = this.g;
            if (nVar != null) {
                n.a(nVar, iVar.m);
            }
        }

        @Override // com.amazon.aps.iva.m6.i.c
        public final void e() {
            n nVar = this.g;
            if (nVar != null) {
                HashMap<Class<? extends n>, a> hashMap = n.j;
                nVar.b();
            }
        }

        @Override // com.amazon.aps.iva.m6.i.c
        public final void f(i iVar, c cVar) {
            n nVar = this.g;
            if (nVar != null) {
                nVar.getClass();
            }
        }

        public final void g() {
            com.amazon.aps.iva.n6.b bVar = new com.amazon.aps.iva.n6.b(0);
            if (!g0.a(this.h, bVar)) {
                this.e.cancel();
                this.h = bVar;
            }
        }

        public final void h() {
            boolean z = this.d;
            Class<? extends n> cls = this.f;
            Context context = this.b;
            if (z) {
                try {
                    HashMap<Class<? extends n>, a> hashMap = n.j;
                    Intent action = new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                    if (g0.a >= 26) {
                        context.startForegroundService(action);
                    } else {
                        context.startService(action);
                    }
                    return;
                } catch (IllegalStateException unused) {
                    com.amazon.aps.iva.t5.p.g();
                    return;
                }
            }
            try {
                HashMap<Class<? extends n>, a> hashMap2 = n.j;
                context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused2) {
                com.amazon.aps.iva.t5.p.g();
            }
        }

        public final boolean i() {
            i iVar = this.c;
            boolean z = iVar.l;
            com.amazon.aps.iva.n6.d dVar = this.e;
            if (dVar == null) {
                return !z;
            }
            if (!z) {
                g();
                return true;
            }
            com.amazon.aps.iva.n6.b bVar = iVar.n.c;
            if (!dVar.b(bVar).equals(bVar)) {
                g();
                return false;
            } else if (!(!g0.a(this.h, bVar))) {
                return true;
            } else {
                if (dVar.a(bVar, this.b.getPackageName())) {
                    this.h = bVar;
                    return true;
                }
                com.amazon.aps.iva.t5.p.g();
                g();
                return false;
            }
        }
    }

    /* compiled from: DownloadService.java */
    /* loaded from: classes.dex */
    public final class b {
        public final void a() {
            throw null;
        }
    }

    public static void a(n nVar, List list) {
        nVar.getClass();
    }

    public final void b() {
        a aVar = this.e;
        aVar.getClass();
        if (!aVar.i()) {
            return;
        }
        if (g0.a < 28 && this.h) {
            stopSelf();
            this.i = true;
            return;
        }
        this.i |= stopSelfResult(this.f);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public final void onCreate() {
        String str = this.b;
        if (str != null && g0.a >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(this.c), 2);
            int i = this.d;
            if (i != 0) {
                notificationChannel.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends n>, a> hashMap = j;
        a aVar = (a) hashMap.get(cls);
        boolean z = true;
        if (aVar == null) {
            int i2 = g0.a;
            i c = com.amazon.aps.iva.dw.a.a.c();
            c.c(false);
            aVar = new a(getApplicationContext(), c, false, null, cls);
            hashMap.put(cls, aVar);
        }
        this.e = aVar;
        if (aVar.g != null) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        aVar.g = this;
        if (aVar.c.h) {
            g0.n(null).postAtFrontOfQueue(new com.amazon.aps.iva.c6.f(2, aVar, this));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a aVar = this.e;
        aVar.getClass();
        boolean z = false;
        if (aVar.g == this) {
            z = true;
        }
        com.amazon.aps.iva.cq.b.C(z);
        aVar.g = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        char c;
        boolean z;
        this.f = i2;
        boolean z2 = false;
        this.h = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            boolean z3 = this.g;
            if (!intent.getBooleanExtra("foreground", false) && !"androidx.media3.exoplayer.downloadService.action.RESTART".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            this.g = z3 | z;
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        a aVar = this.e;
        aVar.getClass();
        switch (str.hashCode()) {
            case -2068303304:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1192305801:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -659421309:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.RESTART")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -238450692:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.INIT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 32678949:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 464223742:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 829812082:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 845668953:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1746253622:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        i iVar = aVar.c;
        switch (c) {
            case 0:
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    com.amazon.aps.iva.t5.p.c();
                    break;
                } else {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    iVar.f++;
                    iVar.c.obtainMessage(3, intExtra, 0, str2).sendToTarget();
                    break;
                }
            case 1:
                if (str2 == null) {
                    com.amazon.aps.iva.t5.p.c();
                    break;
                } else {
                    iVar.f++;
                    iVar.c.obtainMessage(7, str2).sendToTarget();
                    break;
                }
            case 2:
            case 3:
                break;
            case 4:
                iVar.c(false);
                break;
            case 5:
                iVar.f++;
                iVar.c.obtainMessage(8).sendToTarget();
                break;
            case 6:
                intent.getClass();
                m mVar = (m) intent.getParcelableExtra("download_request");
                if (mVar == null) {
                    com.amazon.aps.iva.t5.p.c();
                    break;
                } else {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    iVar.f++;
                    iVar.c.obtainMessage(6, intExtra2, 0, mVar).sendToTarget();
                    break;
                }
            case 7:
                intent.getClass();
                com.amazon.aps.iva.n6.b bVar = (com.amazon.aps.iva.n6.b) intent.getParcelableExtra("requirements");
                if (bVar == null) {
                    com.amazon.aps.iva.t5.p.c();
                    break;
                } else if (!bVar.equals(iVar.n.c)) {
                    com.amazon.aps.iva.n6.c cVar = iVar.n;
                    c.a aVar2 = cVar.e;
                    aVar2.getClass();
                    Context context = cVar.a;
                    context.unregisterReceiver(aVar2);
                    cVar.e = null;
                    if (g0.a >= 24 && cVar.g != null) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        connectivityManager.getClass();
                        c.C0531c c0531c = cVar.g;
                        c0531c.getClass();
                        connectivityManager.unregisterNetworkCallback(c0531c);
                        cVar.g = null;
                    }
                    com.amazon.aps.iva.n6.c cVar2 = new com.amazon.aps.iva.n6.c(iVar.a, iVar.d, bVar);
                    iVar.n = cVar2;
                    iVar.b(iVar.n, cVar2.b());
                    break;
                }
                break;
            case '\b':
                iVar.c(true);
                break;
            default:
                "Ignored unrecognized action: ".concat(str);
                com.amazon.aps.iva.t5.p.c();
                break;
        }
        if (g0.a >= 26) {
            boolean z4 = this.g;
        }
        this.i = false;
        if (iVar.g == 0 && iVar.f == 0) {
            z2 = true;
        }
        if (z2) {
            b();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.h = true;
    }
}
