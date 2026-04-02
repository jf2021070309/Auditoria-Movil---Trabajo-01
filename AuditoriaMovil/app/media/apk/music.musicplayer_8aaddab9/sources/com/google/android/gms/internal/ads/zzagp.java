package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzagp {
    public final zzhe zza;
    public final Object zzb;
    public final zziu[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzagq zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzahw[] zzi;
    private final zzjz zzj;
    private final zzagz zzk;
    private zzagp zzl;
    private zzs zzm;
    private zzka zzn;
    private long zzo;

    public zzagp(zzahw[] zzahwVarArr, long j2, zzjz zzjzVar, zzko zzkoVar, zzagz zzagzVar, zzagq zzagqVar, zzka zzkaVar, byte[] bArr) {
        this.zzi = zzahwVarArr;
        this.zzo = j2;
        this.zzj = zzjzVar;
        this.zzk = zzagzVar;
        zzhf zzhfVar = zzagqVar.zza;
        this.zzb = zzhfVar.zza;
        this.zzf = zzagqVar;
        this.zzm = zzs.zza;
        this.zzn = zzkaVar;
        this.zzc = new zziu[2];
        this.zzh = new boolean[2];
        long j3 = zzagqVar.zzb;
        long j4 = zzagqVar.zzd;
        zzhe zzo = zzagzVar.zzo(zzhfVar, zzkoVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zzgm(zzo, true, 0L, j4) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzka zzkaVar = this.zzn;
            if (i2 >= zzkaVar.zza) {
                return;
            }
            zzkaVar.zza(i2);
            zzjg zzjgVar = this.zzn.zzd[i2];
            i2++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzka zzkaVar = this.zzn;
            if (i2 >= zzkaVar.zza) {
                return;
            }
            zzkaVar.zza(i2);
            zzjg zzjgVar = this.zzn.zzd[i2];
            i2++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza() {
        return this.zzo;
    }

    public final void zzb(long j2) {
        this.zzo = 0L;
    }

    public final long zzc() {
        return this.zzf.zzb + this.zzo;
    }

    public final boolean zzd() {
        return this.zzd && (!this.zze || this.zza.zzh() == Long.MIN_VALUE);
    }

    public final long zze() {
        if (this.zzd) {
            long zzh = this.zze ? this.zza.zzh() : Long.MIN_VALUE;
            return zzh == Long.MIN_VALUE ? this.zzf.zze : zzh;
        }
        return this.zzf.zzb;
    }

    public final long zzf() {
        if (this.zzd) {
            return this.zza.zzk();
        }
        return 0L;
    }

    public final void zzg(float f2, zzaiq zzaiqVar) throws zzaeg {
        this.zzd = true;
        this.zzm = this.zza.zzd();
        zzka zzj = zzj(f2, zzaiqVar);
        zzagq zzagqVar = this.zzf;
        long j2 = zzagqVar.zzb;
        long j3 = zzagqVar.zze;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long zzk = zzk(zzj, j2, false);
        long j4 = this.zzo;
        zzagq zzagqVar2 = this.zzf;
        this.zzo = (zzagqVar2.zzb - zzk) + j4;
        this.zzf = zzagqVar2.zza(zzk);
    }

    public final void zzh(long j2) {
        zzakt.zzd(zzu());
        if (this.zzd) {
            this.zza.zzf(j2 - this.zzo);
        }
    }

    public final void zzi(long j2) {
        zzakt.zzd(zzu());
        this.zza.zzl(j2 - this.zzo);
    }

    public final zzka zzj(float f2, zzaiq zzaiqVar) throws zzaeg {
        zzjg[] zzjgVarArr;
        zzka zzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzaiqVar);
        for (zzjg zzjgVar : zzj.zzd) {
        }
        return zzj;
    }

    public final long zzk(zzka zzkaVar, long j2, boolean z) {
        return zzl(zzkaVar, j2, false, new boolean[2]);
    }

    public final long zzl(zzka zzkaVar, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= zzkaVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzkaVar.zzb(this.zzn, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            zzahw[] zzahwVarArr = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzahwVarArr[i3].zzac();
            i3++;
        }
        zzt();
        this.zzn = zzkaVar;
        zzs();
        long zzq = this.zza.zzq(zzkaVar.zzd, this.zzh, this.zzc, zArr, j2);
        int i4 = 0;
        while (true) {
            zzahw[] zzahwVarArr2 = this.zzi;
            if (i4 >= 2) {
                break;
            }
            zzahwVarArr2[i4].zzac();
            i4++;
        }
        this.zze = false;
        int i5 = 0;
        while (true) {
            zziu[] zziuVarArr = this.zzc;
            if (i5 >= 2) {
                return zzq;
            }
            if (zziuVarArr[i5] != null) {
                zzakt.zzd(zzkaVar.zza(i5));
                this.zzi[i5].zzac();
                this.zze = true;
            } else {
                zzakt.zzd(zzkaVar.zzd[i5] == null);
            }
            i5++;
        }
    }

    public final void zzm() {
        zzt();
        zzagz zzagzVar = this.zzk;
        zzhe zzheVar = this.zza;
        try {
            if (zzheVar instanceof zzgm) {
                zzagzVar.zzf(((zzgm) zzheVar).zza);
            } else {
                zzagzVar.zzf(zzheVar);
            }
        } catch (RuntimeException e2) {
            zzaln.zzb("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void zzn(zzagp zzagpVar) {
        if (zzagpVar == this.zzl) {
            return;
        }
        zzt();
        this.zzl = zzagpVar;
        zzs();
    }

    public final zzagp zzo() {
        return this.zzl;
    }

    public final zzs zzp() {
        return this.zzm;
    }

    public final zzka zzq() {
        return this.zzn;
    }

    public final void zzr() {
        zzhe zzheVar = this.zza;
        if (zzheVar instanceof zzgm) {
            long j2 = this.zzf.zzd;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((zzgm) zzheVar).zza(0L, j2);
        }
    }
}
