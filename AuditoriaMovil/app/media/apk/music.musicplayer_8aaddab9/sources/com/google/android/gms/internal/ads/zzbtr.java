package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes.dex */
public final class zzbtr extends zzchs<zzbsn> {
    private final com.google.android.gms.ads.internal.util.zzbe<zzbsn> zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbtr(com.google.android.gms.ads.internal.util.zzbe<zzbsn> zzbeVar) {
        this.zzb = zzbeVar;
    }

    public final zzbtm zza() {
        zzbtm zzbtmVar = new zzbtm(this);
        synchronized (this.zza) {
            zzf(new zzbtn(this, zzbtmVar), new zzbto(this, zzbtmVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        return zzbtmVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
    }

    public final void zzc() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
    }

    public final void zzd() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzf(new zzbtq(this), new zzcho());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }
}
