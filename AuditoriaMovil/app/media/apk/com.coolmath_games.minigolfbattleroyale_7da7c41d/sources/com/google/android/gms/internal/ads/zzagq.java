package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzagq {
    public final zzhf zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagq(zzhf zzhfVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzakt.zza(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzakt.zza(z5);
        this.zza = zzhfVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zzb == zzagqVar.zzb && this.zzc == zzagqVar.zzc && this.zzd == zzagqVar.zzd && this.zze == zzagqVar.zze && this.zzg == zzagqVar.zzg && this.zzh == zzagqVar.zzh && this.zzi == zzagqVar.zzi && zzamq.zzc(this.zza, zzagqVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzagq zza(long j) {
        return j == this.zzb ? this : new zzagq(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzagq zzb(long j) {
        return j == this.zzc ? this : new zzagq(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
