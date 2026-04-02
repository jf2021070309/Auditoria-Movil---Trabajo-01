package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzaho {
    public static final zzadw<zzaho> zzj = zzahn.zza;
    public final Object zza;
    public final int zzb;
    public final zzagk zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    public zzaho(Object obj, int i2, zzagk zzagkVar, Object obj2, int i3, long j2, long j3, int i4, int i5) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = zzagkVar;
        this.zzd = obj2;
        this.zze = i3;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = i4;
        this.zzi = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaho.class == obj.getClass()) {
            zzaho zzahoVar = (zzaho) obj;
            if (this.zzb == zzahoVar.zzb && this.zze == zzahoVar.zze && this.zzf == zzahoVar.zzf && this.zzg == zzahoVar.zzg && this.zzh == zzahoVar.zzh && this.zzi == zzahoVar.zzi && zzflt.zza(this.zza, zzahoVar.zza) && zzflt.zza(this.zzd, zzahoVar.zzd) && zzflt.zza(this.zzc, zzahoVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Integer.valueOf(this.zzb), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
