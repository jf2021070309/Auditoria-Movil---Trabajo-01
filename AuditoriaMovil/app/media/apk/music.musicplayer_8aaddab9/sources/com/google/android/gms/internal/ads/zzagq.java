package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzagq {
    public final zzhf zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzagq(zzhf zzhfVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzakt.zza(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzakt.zza(z5);
        this.zza = zzhfVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagq.class == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zzb == zzagqVar.zzb && this.zzc == zzagqVar.zzc && this.zzd == zzagqVar.zzd && this.zze == zzagqVar.zze && this.zzg == zzagqVar.zzg && this.zzh == zzagqVar.zzh && this.zzi == zzagqVar.zzi && zzamq.zzc(this.zza, zzagqVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzagq zza(long j2) {
        return j2 == this.zzb ? this : new zzagq(this.zza, j2, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzagq zzb(long j2) {
        return j2 == this.zzc ? this : new zzagq(this.zza, this.zzb, j2, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
