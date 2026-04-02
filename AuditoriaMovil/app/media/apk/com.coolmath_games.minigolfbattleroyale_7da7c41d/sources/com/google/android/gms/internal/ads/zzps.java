package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzps implements zznu {
    private zznx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzakn zzg;
    private zznv zzh;
    private zzpv zzi;
    private zzrp zzj;
    private final zzamf zza = new zzamf(6);
    private long zzf = -1;

    private final int zze(zznv zznvVar) throws IOException {
        this.zza.zza(2);
        ((zznp) zznvVar).zzh(this.zza.zzi(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzaiu[0]);
        zznx zznxVar = this.zzb;
        if (zznxVar != null) {
            zznxVar.zzC();
            this.zzb.zzD(new zzos(-9223372036854775807L, 0L));
            this.zzc = 6;
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        if (zze(zznvVar) != 65496) {
            return false;
        }
        int zze = zze(zznvVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zza(2);
            zznp zznpVar = (zznp) zznvVar;
            zznpVar.zzh(this.zza.zzi(), 0, 2, false);
            zznpVar.zzj(this.zza.zzo() - 2, false);
            zze = zze(zznvVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zznp zznpVar2 = (zznp) zznvVar;
            zznpVar2.zzj(2, false);
            this.zza.zza(6);
            zznpVar2.zzh(this.zza.zzi(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        String zzG;
        zzpu zza;
        long j;
        int i = this.zzc;
        if (i == 0) {
            this.zza.zza(2);
            ((zznp) zznvVar).zza(this.zza.zzi(), 0, 2, false);
            int zzo = this.zza.zzo();
            this.zzd = zzo;
            if (zzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzf();
                }
            } else if ((zzo < 65488 || zzo > 65497) && zzo != 65281) {
                this.zzc = 1;
            }
            return 0;
        } else if (i == 1) {
            this.zza.zza(2);
            ((zznp) zznvVar).zza(this.zza.zzi(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        } else {
            zzakn zzaknVar = null;
            if (i == 2) {
                if (this.zzd == 65505) {
                    zzamf zzamfVar = new zzamf(this.zze);
                    ((zznp) zznvVar).zza(zzamfVar.zzi(), 0, this.zze, false);
                    if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzamfVar.zzG((char) 0)) && (zzG = zzamfVar.zzG((char) 0)) != null) {
                        long zzo2 = zznvVar.zzo();
                        if (zzo2 != -1 && (zza = zzpy.zza(zzG)) != null && zza.zzb.size() >= 2) {
                            long j2 = -1;
                            long j3 = -1;
                            long j4 = -1;
                            long j5 = -1;
                            boolean z = false;
                            for (int size = zza.zzb.size() - 1; size >= 0; size--) {
                                zzpt zzptVar = zza.zzb.get(size);
                                z |= "video/mp4".equals(zzptVar.zza);
                                if (size == 0) {
                                    zzo2 -= zzptVar.zzd;
                                    j = 0;
                                } else {
                                    j = zzo2 - zzptVar.zzc;
                                }
                                long j6 = zzo2;
                                zzo2 = j;
                                if (z && zzo2 != j6) {
                                    j5 = j6 - zzo2;
                                    j4 = zzo2;
                                    z = false;
                                }
                                if (size == 0) {
                                    j3 = j6;
                                }
                                if (size == 0) {
                                    j2 = zzo2;
                                }
                            }
                            zzaknVar = (j4 == -1 || j5 == -1 || j2 == -1 || j3 == -1) ? null : new zzakn(j2, j3, zza.zza, j4, j5);
                        }
                        this.zzg = zzaknVar;
                        if (zzaknVar != null) {
                            this.zzf = zzaknVar.zzd;
                        }
                    }
                } else {
                    ((zznp) zznvVar).zzd(this.zze, false);
                }
                this.zzc = 0;
                return 0;
            } else if (i == 4) {
                long zzn = zznvVar.zzn();
                long j7 = this.zzf;
                if (zzn != j7) {
                    zzoqVar.zza = j7;
                    return 1;
                }
                if (!zznvVar.zzh(this.zza.zzi(), 0, 1, true)) {
                    zzf();
                } else {
                    zznvVar.zzl();
                    if (this.zzj == null) {
                        this.zzj = new zzrp(0);
                    }
                    zzpv zzpvVar = new zzpv(zznvVar, this.zzf);
                    this.zzi = zzpvVar;
                    if (this.zzj.zza(zzpvVar)) {
                        zzrp zzrpVar = this.zzj;
                        long j8 = this.zzf;
                        zznx zznxVar = this.zzb;
                        if (zznxVar != null) {
                            zzrpVar.zzb(new zzpx(j8, zznxVar));
                            zzaiu[] zzaiuVarArr = new zzaiu[1];
                            zzakn zzaknVar2 = this.zzg;
                            if (zzaknVar2 != null) {
                                zzaiuVarArr[0] = zzaknVar2;
                                zzg(zzaiuVarArr);
                                this.zzc = 5;
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        zzf();
                    }
                }
                return 0;
            } else {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zznvVar != this.zzh) {
                    this.zzh = zznvVar;
                    this.zzi = new zzpv(zznvVar, this.zzf);
                }
                zzrp zzrpVar2 = this.zzj;
                if (zzrpVar2 != null) {
                    int zzc = zzrpVar2.zzc(this.zzi, zzoqVar);
                    if (zzc == 1) {
                        zzoqVar.zza += this.zzf;
                    }
                    return zzc;
                }
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzrp zzrpVar = this.zzj;
            if (zzrpVar != null) {
                zzrpVar.zzd(j, j2);
                return;
            }
            throw null;
        }
    }

    private final void zzg(zzaiu... zzaiuVarArr) {
        zznx zznxVar = this.zzb;
        if (zznxVar != null) {
            zzox zzB = zznxVar.zzB(1024, 4);
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzM("image/jpeg");
            zzaftVar.zzL(new zzaiv(zzaiuVarArr));
            zzB.zzs(zzaftVar.zzah());
            return;
        }
        throw null;
    }
}
