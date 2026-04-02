package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzbb implements Runnable {
    private final long zza;
    private final PowerManager.WakeLock zzb;
    private final FirebaseInstanceId zzc;

    @VisibleForTesting
    public zzbb(FirebaseInstanceId firebaseInstanceId, long j) {
        this.zzc = firebaseInstanceId;
        this.zza = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) zza().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.zzb = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @VisibleForTesting
    private final boolean zzc() throws IOException {
        zzay zzb = this.zzc.zzb();
        boolean z = true;
        if (!this.zzc.zza(zzb)) {
            return true;
        }
        try {
            String zzc = this.zzc.zzc();
            if (zzc == null) {
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            if ((zzb == null || !zzc.equals(zzb.zza)) && FirebaseApp.DEFAULT_APP_NAME.equals(this.zzc.zza().getName())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.zzc.zza().getName());
                    if (valueOf.length() != 0) {
                        "Invoking onNewToken for app: ".concat(valueOf);
                    }
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", zzc);
                Context zza = zza();
                Intent intent2 = new Intent(zza, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                zza.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                new StringBuilder(String.valueOf(e.getMessage()).length() + 52);
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (zzaw.zza().zza(zza())) {
            this.zzb.acquire();
        }
        try {
            try {
                this.zzc.zza(true);
                if (!this.zzc.zzf()) {
                    this.zzc.zza(false);
                    if (zzaw.zza().zza(zza())) {
                        this.zzb.release();
                    }
                } else if (zzaw.zza().zzb(zza()) && !zzb()) {
                    new zzba(this).zza();
                    if (zzaw.zza().zza(zza())) {
                        this.zzb.release();
                    }
                } else {
                    if (zzc()) {
                        this.zzc.zza(false);
                    } else {
                        this.zzc.zza(this.zza);
                    }
                    if (zzaw.zza().zza(zza())) {
                        this.zzb.release();
                    }
                }
            } catch (IOException e) {
                new StringBuilder(String.valueOf(e.getMessage()).length() + 93);
                this.zzc.zza(false);
                if (zzaw.zza().zza(zza())) {
                    this.zzb.release();
                }
            }
        } catch (Throwable th) {
            if (zzaw.zza().zza(zza())) {
                this.zzb.release();
            }
            throw th;
        }
    }

    public final Context zza() {
        return this.zzc.zza().getApplicationContext();
    }

    public final boolean zzb() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
