package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzain {
    public static final zzadw<zzain> zzg = zzaim.zza;
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    private zzd zzh = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzain.class.equals(obj.getClass())) {
            zzain zzainVar = (zzain) obj;
            if (zzamq.zzc(this.zza, zzainVar.zza) && zzamq.zzc(this.zzb, zzainVar.zzb) && this.zzc == zzainVar.zzc && this.zzd == zzainVar.zzd && this.zzf == zzainVar.zzf && zzamq.zzc(this.zzh, zzainVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzb;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i2 = this.zzc;
        long j2 = this.zzd;
        return this.zzh.hashCode() + ((((((((hashCode + hashCode2) * 31) + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final zzain zza(Object obj, Object obj2, int i2, long j2, long j3, zzd zzdVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = 0;
        this.zzd = j2;
        this.zze = 0L;
        this.zzh = zzdVar;
        this.zzf = z;
        return this;
    }

    public final long zzb(int i2) {
        long j2 = this.zzh.zza(i2).zza;
        return 0L;
    }

    public final int zzc(int i2) {
        return this.zzh.zza(i2).zza(-1);
    }

    public final int zzd(int i2, int i3) {
        return this.zzh.zza(i2).zza(i3);
    }

    public final int zze(long j2) {
        return -1;
    }

    public final int zzf(long j2) {
        long j3 = this.zzd;
        if (j2 == Long.MIN_VALUE || j3 == -9223372036854775807L) {
            return -1;
        }
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        return -1;
    }

    public final int zzg(int i2) {
        return this.zzh.zza(i2).zzb;
    }

    public final long zzh(int i2, int i3) {
        zzc zza = this.zzh.zza(i2);
        if (zza.zzb != -1) {
            return zza.zze[i3];
        }
        return -9223372036854775807L;
    }

    public final long zzi() {
        long j2 = this.zzh.zzb;
        return 0L;
    }

    public final boolean zzj(int i2) {
        boolean z = this.zzh.zza(i2).zzg;
        return false;
    }

    public final long zzk(int i2) {
        long j2 = this.zzh.zza(i2).zzf;
        return 0L;
    }
}
