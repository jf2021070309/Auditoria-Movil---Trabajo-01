package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.zzao;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzx implements Runnable {
    private static final Object zzf = new Object();
    private static Boolean zzg;
    private static Boolean zzh;
    private final Context zza;
    private final zzao zzb;
    private final PowerManager.WakeLock zzc;
    private final zzu zzd;
    private final long zze;

    public zzx(zzu zzuVar, Context context, zzao zzaoVar, long j) {
        this.zzd = zzuVar;
        this.zza = context;
        this.zze = j;
        this.zzb = zzaoVar;
        this.zzc = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean zza(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (zzf) {
            Boolean bool = zzg;
            if (bool == null) {
                booleanValue = zza(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            zzg = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzb() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.zza.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzc() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (zza(this.zza)) {
            this.zzc.acquire(zzd.zza);
        }
        try {
            try {
                this.zzd.zza(true);
                if (!this.zzb.zza()) {
                    this.zzd.zza(false);
                    if (zza(this.zza)) {
                        try {
                            this.zzc.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                } else if (zzb(this.zza) && !zzb()) {
                    zzw zzwVar = new zzw(this, this);
                    if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    zzwVar.zza.zza.registerReceiver(zzwVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (zza(this.zza)) {
                        try {
                            this.zzc.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } else {
                    if (this.zzd.zzb()) {
                        this.zzd.zza(false);
                    } else {
                        this.zzd.zza(this.zze);
                    }
                    if (zza(this.zza)) {
                        try {
                            this.zzc.release();
                        } catch (RuntimeException unused3) {
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to sync topics. Won't retry sync. ".concat(valueOf);
                }
                this.zzd.zza(false);
                if (zza(this.zza)) {
                    try {
                        this.zzc.release();
                    } catch (RuntimeException unused4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (zza(this.zza)) {
                try {
                    this.zzc.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }

    private static boolean zzb(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (zzf) {
            Boolean bool = zzh;
            if (bool == null) {
                booleanValue = zza(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            zzh = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean zza(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            new StringBuilder(e.a(str, 142));
        }
        return z;
    }
}
