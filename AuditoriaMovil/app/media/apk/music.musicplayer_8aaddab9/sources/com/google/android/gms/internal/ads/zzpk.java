package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileUtil;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzpk implements zznu {
    public static final zzoa zza = zzpj.zza;
    private final byte[] zzb;
    private final zzamf zzc;
    private final zzob zzd;
    private zznx zze;
    private zzox zzf;
    private int zzg;
    private zzaiv zzh;
    private zzoh zzi;
    private int zzj;
    private int zzk;
    private zzpi zzl;
    private int zzm;
    private long zzn;

    public zzpk() {
        this(0);
    }

    public zzpk(int i2) {
        this.zzb = new byte[42];
        this.zzc = new zzamf(new byte[FileUtil.BUF_SIZE], 0);
        this.zzd = new zzob();
        this.zzg = 0;
    }

    private final long zze(zzamf zzamfVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzg = zzamfVar.zzg();
        while (zzg <= zzamfVar.zze() - 16) {
            zzamfVar.zzh(zzg);
            if (zzoc.zza(zzamfVar, this.zzi, this.zzk, this.zzd)) {
                zzamfVar.zzh(zzg);
                return this.zzd.zza;
            }
            zzg++;
        }
        if (!z) {
            zzamfVar.zzh(zzg);
            return -1L;
        }
        while (zzg <= zzamfVar.zze() - this.zzj) {
            zzamfVar.zzh(zzg);
            try {
                z2 = zzoc.zza(zzamfVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzamfVar.zzg() <= zzamfVar.zze() && z2) {
                zzamfVar.zzh(zzg);
                return this.zzd.zza;
            }
            zzg++;
        }
        zzamfVar.zzh(zzamfVar.zze());
        return -1L;
    }

    private final void zzf() {
        long j2 = this.zzn;
        zzoh zzohVar = this.zzi;
        int i2 = zzamq.zza;
        this.zzf.zzv((j2 * 1000000) / zzohVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        zzoe.zza(zznvVar, false);
        zzamf zzamfVar = new zzamf(4);
        ((zznp) zznvVar).zzh(zzamfVar.zzi(), 0, 4, false);
        return zzamfVar.zzt() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zze = zznxVar;
        this.zzf = zznxVar.zzB(0, 1);
        zznxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        boolean zzg;
        zzoh zzohVar;
        zzot zzosVar;
        boolean z;
        int i2 = this.zzg;
        if (i2 == 0) {
            zznvVar.zzl();
            long zzm = zznvVar.zzm();
            zzaiv zza2 = zzoe.zza(zznvVar, true);
            ((zznp) zznvVar).zzd((int) (zznvVar.zzm() - zzm), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i2 == 1) {
            ((zznp) zznvVar).zzh(this.zzb, 0, 42, false);
            zznvVar.zzl();
            this.zzg = 2;
            return 0;
        } else if (i2 == 2) {
            zzamf zzamfVar = new zzamf(4);
            ((zznp) zznvVar).zza(zzamfVar.zzi(), 0, 4, false);
            if (zzamfVar.zzt() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzaha.zzb("Failed to read FLAC stream marker.", null);
        } else if (i2 == 3) {
            zzod zzodVar = new zzod(this.zzi);
            do {
                zznvVar.zzl();
                zzame zzameVar = new zzame(new byte[4], 4);
                zznp zznpVar = (zznp) zznvVar;
                zznpVar.zzh(zzameVar.zza, 0, 4, false);
                zzg = zzameVar.zzg();
                int zzh = zzameVar.zzh(7);
                int zzh2 = zzameVar.zzh(24) + 4;
                if (zzh == 0) {
                    byte[] bArr = new byte[38];
                    zznpVar.zza(bArr, 0, 38, false);
                    zzodVar.zza = new zzoh(bArr, 4);
                } else {
                    zzoh zzohVar2 = zzodVar.zza;
                    if (zzohVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzh == 3) {
                        zzamf zzamfVar2 = new zzamf(zzh2);
                        zznpVar.zza(zzamfVar2.zzi(), 0, zzh2, false);
                        zzodVar.zza = zzohVar2.zze(zzoe.zzb(zzamfVar2));
                    } else if (zzh == 4) {
                        zzamf zzamfVar3 = new zzamf(zzh2);
                        zznpVar.zza(zzamfVar3.zzi(), 0, zzh2, false);
                        zzamfVar3.zzk(4);
                        zzodVar.zza = zzohVar2.zzf(Arrays.asList(zzpc.zzb(zzamfVar3, false, false).zzb));
                    } else if (zzh == 6) {
                        zzamf zzamfVar4 = new zzamf(zzh2);
                        zznpVar.zza(zzamfVar4.zzi(), 0, zzh2, false);
                        zzamfVar4.zzk(4);
                        int zzv = zzamfVar4.zzv();
                        String zzE = zzamfVar4.zzE(zzamfVar4.zzv(), zzfll.zza);
                        String zzE2 = zzamfVar4.zzE(zzamfVar4.zzv(), zzfll.zzc);
                        int zzv2 = zzamfVar4.zzv();
                        int zzv3 = zzamfVar4.zzv();
                        int zzv4 = zzamfVar4.zzv();
                        int zzv5 = zzamfVar4.zzv();
                        int zzv6 = zzamfVar4.zzv();
                        byte[] bArr2 = new byte[zzv6];
                        zzamfVar4.zzm(bArr2, 0, zzv6);
                        zzodVar.zza = zzohVar2.zzg(Collections.singletonList(new zzajc(zzv, zzE, zzE2, zzv2, zzv3, zzv4, zzv5, bArr2)));
                    } else {
                        zznpVar.zzd(zzh2, false);
                    }
                }
                zzohVar = zzodVar.zza;
                int i3 = zzamq.zza;
                this.zzi = zzohVar;
            } while (!zzg);
            Objects.requireNonNull(zzohVar);
            this.zzj = Math.max(zzohVar.zzc, 6);
            this.zzf.zzs(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i2 == 4) {
            zznvVar.zzl();
            zzamf zzamfVar5 = new zzamf(2);
            ((zznp) zznvVar).zzh(zzamfVar5.zzi(), 0, 2, false);
            int zzo = zzamfVar5.zzo();
            if ((zzo >> 2) != 16382) {
                zznvVar.zzl();
                throw zzaha.zzb("First frame does not start with sync code.", null);
            }
            zznvVar.zzl();
            this.zzk = zzo;
            zznx zznxVar = this.zze;
            int i4 = zzamq.zza;
            long zzn = zznvVar.zzn();
            long zzo2 = zznvVar.zzo();
            zzoh zzohVar3 = this.zzi;
            Objects.requireNonNull(zzohVar3);
            if (zzohVar3.zzk != null) {
                zzosVar = new zzof(zzohVar3, zzn);
            } else if (zzo2 == -1 || zzohVar3.zzj <= 0) {
                zzosVar = new zzos(zzohVar3.zza(), 0L);
            } else {
                zzpi zzpiVar = new zzpi(zzohVar3, this.zzk, zzn, zzo2);
                this.zzl = zzpiVar;
                zzosVar = zzpiVar.zza();
            }
            zznxVar.zzD(zzosVar);
            this.zzg = 5;
            return 0;
        } else {
            Objects.requireNonNull(this.zzf);
            Objects.requireNonNull(this.zzi);
            zzpi zzpiVar2 = this.zzl;
            if (zzpiVar2 == null || !zzpiVar2.zzc()) {
                if (this.zzn == -1) {
                    this.zzn = zzoc.zzb(zznvVar, this.zzi);
                    return 0;
                }
                int zze = this.zzc.zze();
                if (zze < 32768) {
                    int zzg2 = zznvVar.zzg(this.zzc.zzi(), zze, FileUtil.BUF_SIZE - zze);
                    z = zzg2 == -1;
                    if (!z) {
                        this.zzc.zzf(zze + zzg2);
                    } else if (this.zzc.zzd() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                int zzg3 = this.zzc.zzg();
                int i5 = this.zzm;
                int i6 = this.zzj;
                if (i5 < i6) {
                    zzamf zzamfVar6 = this.zzc;
                    zzamfVar6.zzk(Math.min(i6 - i5, zzamfVar6.zzd()));
                }
                long zze2 = zze(this.zzc, z);
                int zzg4 = this.zzc.zzg() - zzg3;
                this.zzc.zzh(zzg3);
                zzov.zzb(this.zzf, this.zzc, zzg4);
                this.zzm += zzg4;
                if (zze2 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze2;
                }
                if (this.zzc.zzd() >= 16) {
                    return 0;
                }
                int zzd = this.zzc.zzd();
                System.arraycopy(this.zzc.zzi(), this.zzc.zzg(), this.zzc.zzi(), 0, zzd);
                this.zzc.zzh(0);
                this.zzc.zzf(zzd);
                return 0;
            }
            return this.zzl.zzd(zznvVar, zzoqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        if (j2 == 0) {
            this.zzg = 0;
        } else {
            zzpi zzpiVar = this.zzl;
            if (zzpiVar != null) {
                zzpiVar.zzb(j3);
            }
        }
        this.zzn = j3 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zza(0);
    }
}
