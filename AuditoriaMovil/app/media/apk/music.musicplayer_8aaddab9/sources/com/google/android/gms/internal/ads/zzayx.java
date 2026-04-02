package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzayx {
    @GuardedBy("lock")
    private zzaym zza;
    @GuardedBy("lock")
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzayx(Context context) {
        this.zzc = context;
    }

    public static /* synthetic */ boolean zzc(zzayx zzayxVar, boolean z) {
        zzayxVar.zzb = true;
        return true;
    }

    public static /* synthetic */ void zzf(zzayx zzayxVar) {
        synchronized (zzayxVar.zzd) {
            zzaym zzaymVar = zzayxVar.zza;
            if (zzaymVar == null) {
                return;
            }
            zzaymVar.disconnect();
            zzayxVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future<zzayz> zze(zzayn zzaynVar) {
        zzayr zzayrVar = new zzayr(this);
        zzayv zzayvVar = new zzayv(this, zzaynVar, zzayrVar);
        zzayw zzaywVar = new zzayw(this, zzayrVar);
        synchronized (this.zzd) {
            zzaym zzaymVar = new zzaym(this.zzc, com.google.android.gms.ads.internal.zzt.zzq().zza(), zzayvVar, zzaywVar);
            this.zza = zzaymVar;
            zzaymVar.checkAvailabilityAndConnect();
        }
        return zzayrVar;
    }
}
