package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzbh implements ServiceConnection {
    private final Context zza;
    private final Intent zzb;
    private final ScheduledExecutorService zzc;
    private final Queue<zzbg> zzd;
    private zzbc zze;
    private boolean zzf;

    public zzbh(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private final void zzb() {
        while (!this.zzd.isEmpty()) {
            this.zzd.poll().zzb();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            new StringBuilder(String.valueOf(componentName).length() + 20);
        }
        this.zzf = false;
        if (!(iBinder instanceof zzbc)) {
            new StringBuilder(String.valueOf(iBinder).length() + 28);
            zzb();
            return;
        }
        this.zze = (zzbc) iBinder;
        zza();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            new StringBuilder(String.valueOf(componentName).length() + 23);
        }
        zza();
    }

    public final synchronized Task<Void> zza(Intent intent) {
        final zzbg zzbgVar;
        Log.isLoggable("FirebaseInstanceId", 3);
        zzbgVar = new zzbg(intent);
        ScheduledExecutorService scheduledExecutorService = this.zzc;
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(zzbgVar) { // from class: com.google.firebase.iid.zzbj
            private final zzbg zza;

            {
                this.zza = zzbgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
        zzbgVar.zza().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener(schedule) { // from class: com.google.firebase.iid.zzbi
            private final ScheduledFuture zza;

            {
                this.zza = schedule;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.cancel(false);
            }
        });
        this.zzd.add(zzbgVar);
        zza();
        return zzbgVar.zza();
    }

    private zzbh(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = new ArrayDeque();
        this.zzf = false;
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = new Intent(str).setPackage(applicationContext.getPackageName());
        this.zzc = scheduledExecutorService;
    }

    private final synchronized void zza() {
        Log.isLoggable("FirebaseInstanceId", 3);
        while (!this.zzd.isEmpty()) {
            Log.isLoggable("FirebaseInstanceId", 3);
            zzbc zzbcVar = this.zze;
            if (zzbcVar != null && zzbcVar.isBinderAlive()) {
                Log.isLoggable("FirebaseInstanceId", 3);
                this.zze.zza(this.zzd.poll());
            } else {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z = this.zzf;
                }
                if (!this.zzf) {
                    this.zzf = true;
                    try {
                        if (ConnectionTracker.getInstance().bindService(this.zza, this.zzb, this, 65)) {
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.zzf = false;
                    zzb();
                }
                return;
            }
        }
    }
}
