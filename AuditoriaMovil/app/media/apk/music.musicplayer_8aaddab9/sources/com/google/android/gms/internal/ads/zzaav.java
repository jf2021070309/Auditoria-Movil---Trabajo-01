package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
/* loaded from: classes.dex */
public final class zzaav {
    private NetworkCapabilities zza;

    public zzaav(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new zzaau(this));
        } catch (RuntimeException unused) {
            synchronized (zzaav.class) {
                this.zza = null;
            }
        }
    }

    public static zzaav zzb(Context context) {
        if (context != null) {
            return new zzaav((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities zzc() {
        return this.zza;
    }

    public final long zzd() {
        synchronized (zzaav.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }
}
