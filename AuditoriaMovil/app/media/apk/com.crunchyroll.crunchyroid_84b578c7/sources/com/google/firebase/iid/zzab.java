package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzab {
    private static zzab zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzac zzd = new zzac(this);
    private int zze = 1;

    private zzab(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized zzab zza(Context context) {
        zzab zzabVar;
        synchronized (zzab.class) {
            if (zza == null) {
                zza = new zzab(context, com.google.android.gms.internal.firebase_messaging.zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), com.google.android.gms.internal.firebase_messaging.zzf.zzb));
            }
            zzabVar = zza;
        }
        return zzabVar;
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzap(zza(), 1, bundle));
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzak(zza(), 2, bundle));
    }

    private final synchronized <T> Task<T> zza(zzan<T> zzanVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(zzanVar).length() + 9);
        }
        if (!this.zzd.zza((zzan<?>) zzanVar)) {
            zzac zzacVar = new zzac(this);
            this.zzd = zzacVar;
            zzacVar.zza((zzan<?>) zzanVar);
        }
        return zzanVar.zzb.getTask();
    }

    private final synchronized int zza() {
        int i;
        i = this.zze;
        this.zze = i + 1;
        return i;
    }
}
