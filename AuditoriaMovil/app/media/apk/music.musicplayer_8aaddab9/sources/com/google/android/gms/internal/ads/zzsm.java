package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public abstract class zzsm {
    private zzox zzb;
    private zznx zzc;
    private zzsh zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzsf zza = new zzsf();
    private zzsk zzj = new zzsk();

    public void zza(boolean z) {
        int i2;
        if (z) {
            this.zzj = new zzsk();
            this.zzf = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.zzh = i2;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract long zzb(zzamf zzamfVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzamf zzamfVar, long j2, zzsk zzskVar) throws IOException;

    public final void zze(zznx zznxVar, zzox zzoxVar) {
        this.zzc = zznxVar;
        this.zzb = zzoxVar;
        zza(true);
    }

    public final void zzf(long j2, long j3) {
        this.zza.zza();
        if (j2 == 0) {
            zza(!this.zzl);
        } else if (this.zzh != 0) {
            long zzi = zzi(j3);
            this.zze = zzi;
            zzsh zzshVar = this.zzd;
            int i2 = zzamq.zza;
            zzshVar.zzf(zzi);
            this.zzh = 2;
        }
    }

    public final int zzg(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzb);
        int i2 = zzamq.zza;
        int i3 = this.zzh;
        if (i3 == 0) {
            while (this.zza.zzb(zznvVar)) {
                this.zzk = zznvVar.zzn() - this.zzf;
                if (!zzc(this.zza.zzd(), this.zzf, this.zzj)) {
                    zzafv zzafvVar = this.zzj.zza;
                    this.zzi = zzafvVar.zzz;
                    if (!this.zzm) {
                        this.zzb.zzs(zzafvVar);
                        this.zzm = true;
                    }
                    zzsh zzshVar = this.zzj.zzb;
                    if (zzshVar != null) {
                        this.zzd = zzshVar;
                    } else if (zznvVar.zzo() == -1) {
                        this.zzd = new zzsl(null);
                    } else {
                        zzsg zzc = this.zza.zzc();
                        this.zzd = new zzsa(this, this.zzf, zznvVar.zzo(), zzc.zzd + zzc.zze, zzc.zzb, (zzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zze();
                    return 0;
                }
                this.zzf = zznvVar.zzn();
            }
            this.zzh = 3;
            return -1;
        } else if (i3 == 1) {
            ((zznp) zznvVar).zzd((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i3 != 2) {
            return -1;
        } else {
            long zze = this.zzd.zze(zznvVar);
            if (zze >= 0) {
                zzoqVar.zza = zze;
                return 1;
            }
            if (zze < -1) {
                zzj(-(zze + 2));
            }
            if (!this.zzl) {
                zzot zzg = this.zzd.zzg();
                zzakt.zze(zzg);
                this.zzc.zzD(zzg);
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zznvVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzamf zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j2 = this.zzg;
                if (j2 + zzb >= this.zze) {
                    long zzh = zzh(j2);
                    zzov.zzb(this.zzb, zzd, zzd.zze());
                    this.zzb.zzv(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
            return 0;
        }
    }

    public final long zzh(long j2) {
        return (j2 * 1000000) / this.zzi;
    }

    public final long zzi(long j2) {
        return (this.zzi * j2) / 1000000;
    }

    public void zzj(long j2) {
        this.zzg = j2;
    }
}
