package com.google.android.gms.internal.pal;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzcz {
    private NetworkCapabilities zza;

    public zzcz(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzcy(this));
            } catch (RuntimeException unused) {
                synchronized (zzcz.class) {
                    this.zza = null;
                }
            }
        }
    }

    public final NetworkCapabilities zza() {
        return this.zza;
    }
}
