package com.google.android.gms.ads.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
/* loaded from: classes.dex */
public final class zzo extends ConnectivityManager.NetworkCallback {
    public zzo(zzs zzsVar) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (zzs.class) {
            boolean unused = zzs.zzd = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzs.class) {
            boolean unused = zzs.zzd = false;
        }
    }
}
