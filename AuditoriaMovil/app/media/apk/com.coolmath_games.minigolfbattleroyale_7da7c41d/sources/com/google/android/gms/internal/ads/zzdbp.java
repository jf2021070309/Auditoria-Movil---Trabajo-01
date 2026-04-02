package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdbp extends zzdgm<zzdbg> implements zzdbg {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture<?> zzc;
    private boolean zzd;
    private final boolean zze;

    public zzdbp(zzdbo zzdboVar, Set<zzdih<zzdbg>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        this.zze = ((Boolean) zzbet.zzc().zzc(zzbjl.zzgX)).booleanValue();
        zzi(zzdboVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza(final zzbcz zzbczVar) {
        zzk(new zzdgl(zzbczVar) { // from class: com.google.android.gms.internal.ads.zzdbh
            private final zzbcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbczVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzdbg) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzb(final zzdkm zzdkmVar) {
        if (this.zze) {
            if (this.zzd) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
        zzk(new zzdgl(zzdkmVar) { // from class: com.google.android.gms.internal.ads.zzdbi
            private final zzdkm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzdkmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzdbg) obj).zzb(this.zza);
            }
        });
    }

    public final synchronized void zzc() {
        if (this.zze) {
            ScheduledFuture<?> scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzd() {
        zzk(zzdbj.zza);
    }

    public final void zze() {
        if (this.zze) {
            this.zzc = this.zzb.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdbk
                private final zzdbp zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            }, ((Integer) zzbet.zzc().zzc(zzbjl.zzgY)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.zze.zzf("Timeout waiting for show call succeed to be called.");
            zzb(new zzdkm("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
