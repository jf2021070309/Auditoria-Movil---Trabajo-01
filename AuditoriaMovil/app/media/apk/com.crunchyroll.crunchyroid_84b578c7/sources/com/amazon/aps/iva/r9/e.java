package com.amazon.aps.iva.r9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.amazon.aps.iva.k9.m;
/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public final class e extends d<com.amazon.aps.iva.p9.b> {
    public static final /* synthetic */ int i = 0;
    public final ConnectivityManager g;
    public final a h;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            m c = m.c();
            int i = e.i;
            String.format("Network capabilities changed: %s", networkCapabilities);
            c.a(new Throwable[0]);
            e eVar = e.this;
            eVar.b(eVar.e());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            m c = m.c();
            int i = e.i;
            c.a(new Throwable[0]);
            e eVar = e.this;
            eVar.b(eVar.e());
        }
    }

    static {
        m.e("NetworkStateTracker");
    }

    public e(Context context, com.amazon.aps.iva.w9.a aVar) {
        super(context, aVar);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.h = new a();
    }

    @Override // com.amazon.aps.iva.r9.d
    public final com.amazon.aps.iva.p9.b a() {
        return e();
    }

    @Override // com.amazon.aps.iva.r9.d
    public final void c() {
        try {
            m.c().a(new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            m.c().b(e);
        }
    }

    @Override // com.amazon.aps.iva.r9.d
    public final void d() {
        try {
            m.c().a(new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            m.c().b(e);
        }
    }

    public final com.amazon.aps.iva.p9.b e() {
        boolean z;
        boolean z2;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            m.c().b(e);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z2 = true;
                boolean a2 = com.amazon.aps.iva.j3.a.a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z3 = false;
                }
                return new com.amazon.aps.iva.p9.b(z, z2, a2, z3);
            }
        }
        z2 = false;
        boolean a22 = com.amazon.aps.iva.j3.a.a(connectivityManager);
        if (activeNetworkInfo != null) {
        }
        z3 = false;
        return new com.amazon.aps.iva.p9.b(z, z2, a22, z3);
    }
}
