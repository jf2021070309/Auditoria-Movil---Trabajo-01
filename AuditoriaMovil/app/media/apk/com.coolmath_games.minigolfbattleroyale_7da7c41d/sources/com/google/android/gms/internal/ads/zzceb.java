package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzceb {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcfa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzceb(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcfa zzcfaVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcfaVar;
    }

    public final void zza(int i, long j) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzak)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzE() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzal)).booleanValue()) {
            this.zzb.zzD(-1);
            this.zzb.zzF(j);
        } else {
            this.zzb.zzD(i);
            this.zzb.zzF(j);
        }
        zzb();
    }

    public final void zzb() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzal)).booleanValue()) {
            this.zzc.zza();
        }
    }
}
