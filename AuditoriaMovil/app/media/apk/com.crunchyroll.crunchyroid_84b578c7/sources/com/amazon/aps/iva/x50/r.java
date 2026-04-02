package com.amazon.aps.iva.x50;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
/* compiled from: NetworkUtil.kt */
/* loaded from: classes2.dex */
public final class r implements q {
    public final ConnectivityManager a;

    public r(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.a = (ConnectivityManager) systemService;
    }

    @Override // com.amazon.aps.iva.x50.q
    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.x50.q
    public final boolean b() {
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasTransport(0)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x50.q
    public final boolean c() {
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }
}
