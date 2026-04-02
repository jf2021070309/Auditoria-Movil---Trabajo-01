package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes.dex */
public final class zzahd {
    private static final zzhf zzt = new zzhf(new Object());
    public final zzaiq zza;
    public final zzhf zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzaeg zzf;
    public final boolean zzg;
    public final zzs zzh;
    public final zzka zzi;
    public final List<zzaiv> zzj;
    public final zzhf zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzahf zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzahd(zzaiq zzaiqVar, zzhf zzhfVar, long j2, long j3, int i2, zzaeg zzaegVar, boolean z, zzs zzsVar, zzka zzkaVar, List<zzaiv> list, zzhf zzhfVar2, boolean z2, int i3, zzahf zzahfVar, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.zza = zzaiqVar;
        this.zzb = zzhfVar;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = i2;
        this.zzf = zzaegVar;
        this.zzg = z;
        this.zzh = zzsVar;
        this.zzi = zzkaVar;
        this.zzj = list;
        this.zzk = zzhfVar2;
        this.zzl = z2;
        this.zzm = i3;
        this.zzn = zzahfVar;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzo = z3;
        this.zzp = z4;
    }

    public static zzahd zza(zzka zzkaVar) {
        zzaiq zzaiqVar = zzaiq.zzc;
        zzhf zzhfVar = zzt;
        return new zzahd(zzaiqVar, zzhfVar, -9223372036854775807L, 0L, 1, null, false, zzs.zza, zzkaVar, zzfoj.zzi(), zzhfVar, false, 0, zzahf.zza, 0L, 0L, 0L, false, false);
    }

    public static zzhf zzb() {
        return zzt;
    }

    public final zzahd zzc(zzhf zzhfVar, long j2, long j3, long j4, long j5, zzs zzsVar, zzka zzkaVar, List<zzaiv> list) {
        return new zzahd(this.zza, zzhfVar, j3, j4, this.zze, this.zzf, this.zzg, zzsVar, zzkaVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j5, j2, this.zzo, this.zzp);
    }

    public final zzahd zzd(zzaiq zzaiqVar) {
        return new zzahd(zzaiqVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzahd zze(int i2) {
        return new zzahd(this.zza, this.zzb, this.zzc, this.zzd, i2, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzahd zzf(zzaeg zzaegVar) {
        return new zzahd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzaegVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzahd zzg(zzhf zzhfVar) {
        return new zzahd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzhfVar, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzahd zzh(boolean z, int i2) {
        return new zzahd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i2, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzahd zzi(boolean z) {
        return new zzahd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z, this.zzp);
    }
}
