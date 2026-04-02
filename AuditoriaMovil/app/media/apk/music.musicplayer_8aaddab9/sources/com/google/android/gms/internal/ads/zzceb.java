package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* loaded from: classes.dex */
public final class zzceb {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcfa zzc;

    public zzceb(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcfa zzcfaVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcfaVar;
    }

    public final void zza(int i2, long j2) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzak)).booleanValue()) {
            return;
        }
        if (j2 - this.zzb.zzE() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzal)).booleanValue()) {
            this.zzb.zzD(i2);
            this.zzb.zzF(j2);
        } else {
            this.zzb.zzD(-1);
            this.zzb.zzF(j2);
        }
        zzb();
    }

    public final void zzb() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzal)).booleanValue()) {
            this.zzc.zza();
        }
    }
}
