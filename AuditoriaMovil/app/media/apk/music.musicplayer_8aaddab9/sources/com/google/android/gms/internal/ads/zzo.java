package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzo {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzo(zzo zzoVar) {
        this.zza = zzoVar.zza;
        this.zzb = zzoVar.zzb;
        this.zzc = zzoVar.zzc;
        this.zzd = zzoVar.zzd;
        this.zze = zzoVar.zze;
    }

    public zzo(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    private zzo(Object obj, int i2, int i3, long j2, int i4) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = i4;
    }

    public zzo(Object obj, long j2) {
        this(obj, -1, -1, -1L, -1);
    }

    public zzo(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzo) {
            zzo zzoVar = (zzo) obj;
            return this.zza.equals(zzoVar.zza) && this.zzb == zzoVar.zzb && this.zzc == zzoVar.zzc && this.zzd == zzoVar.zzd && this.zze == zzoVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzo zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzo(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }
}
