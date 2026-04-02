package c.c0.d0.q.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import c.c0.r;
/* loaded from: classes.dex */
public class e extends d<c.c0.d0.q.b> {

    /* renamed from: g  reason: collision with root package name */
    public static final String f1470g = r.e("NetworkStateTracker");

    /* renamed from: h  reason: collision with root package name */
    public final ConnectivityManager f1471h;

    /* renamed from: i  reason: collision with root package name */
    public b f1472i;

    /* renamed from: j  reason: collision with root package name */
    public a f1473j;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            r.c().a(e.f1470g, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            r.c().a(e.f1470g, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            r.c().a(e.f1470g, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, c.c0.d0.t.t.a aVar) {
        super(context, aVar);
        this.f1471h = (ConnectivityManager) this.f1465c.getSystemService("connectivity");
        if (g()) {
            this.f1472i = new b();
        } else {
            this.f1473j = new a();
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // c.c0.d0.q.f.d
    public c.c0.d0.q.b a() {
        return f();
    }

    @Override // c.c0.d0.q.f.d
    public void d() {
        if (!g()) {
            r.c().a(f1470g, "Registering broadcast receiver", new Throwable[0]);
            this.f1465c.registerReceiver(this.f1473j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            r.c().a(f1470g, "Registering network callback", new Throwable[0]);
            this.f1471h.registerDefaultNetworkCallback(this.f1472i);
        } catch (IllegalArgumentException | SecurityException e2) {
            r.c().b(f1470g, "Received exception while registering network callback", e2);
        }
    }

    @Override // c.c0.d0.q.f.d
    public void e() {
        if (!g()) {
            r.c().a(f1470g, "Unregistering broadcast receiver", new Throwable[0]);
            this.f1465c.unregisterReceiver(this.f1473j);
            return;
        }
        try {
            r.c().a(f1470g, "Unregistering network callback", new Throwable[0]);
            this.f1471h.unregisterNetworkCallback(this.f1472i);
        } catch (IllegalArgumentException | SecurityException e2) {
            r.c().b(f1470g, "Received exception while unregistering network callback", e2);
        }
    }

    public c.c0.d0.q.b f() {
        NetworkCapabilities networkCapabilities;
        boolean z;
        NetworkInfo activeNetworkInfo = this.f1471h.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.f1471h.getNetworkCapabilities(this.f1471h.getActiveNetwork());
            } catch (SecurityException e2) {
                r.c().b(f1470g, "Unable to validate active network", e2);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z = true;
                    boolean isActiveNetworkMetered = this.f1471h.isActiveNetworkMetered();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z2 = true;
                    }
                    return new c.c0.d0.q.b(z3, z, isActiveNetworkMetered, z2);
                }
            }
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.f1471h.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z2 = true;
        }
        return new c.c0.d0.q.b(z3, z, isActiveNetworkMetered2, z2);
    }
}
