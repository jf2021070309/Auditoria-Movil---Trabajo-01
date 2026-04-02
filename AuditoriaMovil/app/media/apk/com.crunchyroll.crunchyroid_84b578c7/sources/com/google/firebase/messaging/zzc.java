package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.aps.iva.c3.q;
import com.amazon.aps.iva.c3.s;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
final class zzc {
    private final Executor zza;
    private final Context zzb;
    private final zzr zzc;

    public zzc(Context context, zzr zzrVar, Executor executor) {
        this.zza = executor;
        this.zzb = context;
        this.zzc = zzrVar;
    }

    public final boolean zza() {
        boolean z;
        IconCompat iconCompat;
        if (this.zzc.zzb("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.zzb.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.zzb.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        zzo zza = zzo.zza(this.zzc.zza("gcm.n.image"));
        if (zza != null) {
            zza.zza(this.zza);
        }
        zza zza2 = zzb.zza(this.zzb, this.zzc);
        s sVar = zza2.zza;
        if (zza != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(zza.zza(), 5L, TimeUnit.SECONDS);
                sVar.g(bitmap);
                q qVar = new q();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                qVar.a = iconCompat;
                qVar.b = null;
                qVar.c = true;
                sVar.h(qVar);
            } catch (InterruptedException unused) {
                zza.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                new StringBuilder(String.valueOf(e.getCause()).length() + 26);
            } catch (TimeoutException unused2) {
                zza.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.zzb.getSystemService("notification")).notify(zza2.zzb, 0, zza2.zza.b());
        return true;
    }
}
