package com.amazon.aps.iva.ad;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.amazon.aps.iva.ad.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class l {
    public static volatile l d;
    public final c a;
    public final HashSet b = new HashSet();
    public boolean c;

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public class a implements com.amazon.aps.iva.hd.g<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.hd.g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0112a {
        public b() {
        }

        @Override // com.amazon.aps.iva.ad.a.InterfaceC0112a
        public final void a(boolean z) {
            ArrayList arrayList;
            com.amazon.aps.iva.hd.l.a();
            synchronized (l.this) {
                arrayList = new ArrayList(l.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0112a) it.next()).a(z);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public static final class c {
        public boolean a;
        public final a.InterfaceC0112a b;
        public final com.amazon.aps.iva.hd.g<ConnectivityManager> c;
        public final a d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes.dex */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                com.amazon.aps.iva.hd.l.e().post(new m(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                com.amazon.aps.iva.hd.l.e().post(new m(this, false));
            }
        }

        public c(com.amazon.aps.iva.hd.f fVar, b bVar) {
            this.c = fVar;
            this.b = bVar;
        }
    }

    public l(Context context) {
        this.a = new c(new com.amazon.aps.iva.hd.f(new a(context)), new b());
    }

    public static l a(Context context) {
        if (d == null) {
            synchronized (l.class) {
                if (d == null) {
                    d = new l(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    public final void b() {
        boolean z;
        if (!this.c && !this.b.isEmpty()) {
            c cVar = this.a;
            com.amazon.aps.iva.hd.g<ConnectivityManager> gVar = cVar.c;
            boolean z2 = true;
            if (gVar.get().getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            cVar.a = z;
            try {
                gVar.get().registerDefaultNetworkCallback(cVar.d);
            } catch (RuntimeException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                z2 = false;
            }
            this.c = z2;
        }
    }
}
