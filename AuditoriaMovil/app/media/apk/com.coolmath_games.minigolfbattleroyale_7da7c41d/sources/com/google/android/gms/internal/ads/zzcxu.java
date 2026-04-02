package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcxu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfsm<zzcxn> zzc;
    private volatile boolean zzd = true;

    public zzcxu(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfsm<zzcxn> zzfsmVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfsmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(final zzcxu zzcxuVar, List list, final zzfrz zzfrzVar) {
        if (list == null || list.isEmpty()) {
            zzcxuVar.zza.execute(new Runnable(zzfrzVar) { // from class: com.google.android.gms.internal.ads.zzcxo
                private final zzfrz zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzfrzVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(new zzdym(3));
                }
            });
            return;
        }
        zzfsm zza = zzfsd.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final zzfsm zzfsmVar = (zzfsm) it.next();
            zza = zzfsd.zzi(zzfsd.zzg(zza, Throwable.class, new zzfrk(zzfrzVar) { // from class: com.google.android.gms.internal.ads.zzcxp
                private final zzfrz zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzfrzVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    this.zza.zza((Throwable) obj);
                    return zzfsd.zza(null);
                }
            }, zzcxuVar.zza), new zzfrk(zzcxuVar, zzfrzVar, zzfsmVar) { // from class: com.google.android.gms.internal.ads.zzcxq
                private final zzcxu zza;
                private final zzfrz zzb;
                private final zzfsm zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzcxuVar;
                    this.zzb = zzfrzVar;
                    this.zzc = zzfsmVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zzf(this.zzb, this.zzc, (zzcxg) obj);
                }
            }, zzcxuVar.zza);
        }
        zzfsd.zzp(zza, new zzcxt(zzcxuVar, zzfrzVar), zzcxuVar.zza);
    }

    public final void zza(zzfrz<zzcxg> zzfrzVar) {
        zzfsd.zzp(this.zzc, new zzcxs(this, zzfrzVar), this.zza);
    }

    public final boolean zzc() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzd = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzf(zzfrz zzfrzVar, zzfsm zzfsmVar, zzcxg zzcxgVar) throws Exception {
        if (zzcxgVar != null) {
            zzfrzVar.zzb(zzcxgVar);
        }
        return zzfsd.zzh(zzfsmVar, zzblj.zzb.zze().longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }
}
