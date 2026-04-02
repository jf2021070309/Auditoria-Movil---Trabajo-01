package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzsk();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzamf zzamfVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zznx zznxVar, zzox zzoxVar) {
        this.zzc = zznxVar;
        this.zzb = zzoxVar;
        zza(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
        } else if (this.zzh != 0) {
            long zzi = zzi(j2);
            this.zze = zzi;
            zzsh zzshVar = this.zzd;
            int i = zzamq.zza;
            zzshVar.zzf(zzi);
            this.zzh = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzg(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzb);
        int i = zzamq.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
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
        } else if (i2 == 1) {
            ((zznp) zznvVar).zzd((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
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
            if (this.zzk > 0 || this.zza.zzb(zznvVar)) {
                this.zzk = 0L;
                zzamf zzd = this.zza.zzd();
                long zzb = zzb(zzd);
                if (zzb >= 0) {
                    long j = this.zzg;
                    if (j + zzb >= this.zze) {
                        long zzh = zzh(j);
                        zzov.zzb(this.zzb, zzd, zzd.zze());
                        this.zzb.zzv(zzh, 1, zzd.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zzb;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzj(long j) {
        this.zzg = j;
    }
}
